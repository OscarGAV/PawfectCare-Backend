package pe.upc.pawfectcaremicroservices.iam_service.application.internal.commandservices;


import org.apache.commons.lang3.tuple.ImmutablePair;
import org.springframework.stereotype.Service;
import pe.upc.pawfectcaremicroservices.iam_service.application.internal.outboundservices.hashing.HashingService;
import pe.upc.pawfectcaremicroservices.iam_service.application.internal.outboundservices.tokens.TokenService;
import pe.upc.pawfectcaremicroservices.iam_service.domain.model.aggregates.User;
import pe.upc.pawfectcaremicroservices.iam_service.domain.model.commands.*;
import pe.upc.pawfectcaremicroservices.iam_service.infrastructure.persistence.jpa.repositories.UserRepository;
import pe.upc.pawfectcaremicroservices.iam_service.domain.services.UserCommandService;
import pe.upc.pawfectcaremicroservices.iam_service.infrastructure.persistence.jpa.repositories.RoleRepository;

import java.util.HashSet;
import java.util.Optional;

import static org.hibernate.sql.ast.SqlTreeCreationLogger.LOGGER;

/**
 * User command service implementation
 * <p>
 *     This class implements the {@link UserCommandService} interface and provides the implementation for the
 *     {@link SignInCommand} and {@link SignUpCommand} commands.
 * </p>
 */
@Service
public class UserCommandServiceImpl implements UserCommandService {

    private final UserRepository userRepository;
    private final HashingService hashingService;
    private final TokenService tokenService;
    private final RoleRepository roleRepository;

    public UserCommandServiceImpl(
            UserRepository userRepository,
            HashingService hashingService,
            TokenService tokenService,
            RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.hashingService = hashingService;
        this.tokenService = tokenService;
        this.roleRepository = roleRepository;
    }

    /**
     * Handle the sign-in command
     * <p>
     *     This method handles the {@link SignInCommand} command and returns the user and the token.
     * </p>
     * @param command the sign-in command containing the username and password
     * @return and optional containing the user matching the username and the generated token
     * @throws RuntimeException if the user is not found or the password is invalid
     */
    @Override
    public Optional<ImmutablePair<User, String>> handle(SignInCommand command) {
        var user = userRepository.findByUsername(command.username());
        if (user.isEmpty())
        {
            LOGGER.warn("No se encontró al usuario con username: '{}'" + command.username());
            throw new RuntimeException("User not found");
        }
        if (hashingService.matches(command.password(), user.get().getPassword()))
            throw new RuntimeException("Invalid password");
        var token = tokenService.generateToken(user.get().getUsername());
        return Optional.of(ImmutablePair.of(user.get(), token));
    }

    /**
     * Handle the sign-up command
     * <p>
     *     This method handles the {@link SignUpCommand} command and returns the user.
     * </p>
     * @param command the sign-up command containing the username and password
     * @return the created user
     */
    @Override
    public Optional<User> handle(SignUpCommand command) {
        if (userRepository.existsByEmail(command.dni()))
            throw new RuntimeException("Email already registered");

        if (userRepository.existsByDni(command.dni()))
            throw new RuntimeException("DNI already registered");

        var userRoles = roleRepository.findAll().stream()
                .filter(role -> command.role().contains(role.getName().name()))
                .toList();

        var user = User.builder()
                .username(command.username())
                .password(hashingService.encode(command.password()))
                .fullName(command.fullName())
                .email(command.email())
                .dni(command.dni())
                .roles(new HashSet<>(userRoles))  // ← Asigna roles directamente
                .build();

        userRepository.save(user);
        return userRepository.findByUsername(command.username());
    }

    @Override
    public boolean isEmailUnique(String email) {
        return !userRepository.existsByEmail(email);
    }

    @Override
    public boolean isPasswordValid(String password) {
        return password != null && password.length() >= 6;
    }
}
