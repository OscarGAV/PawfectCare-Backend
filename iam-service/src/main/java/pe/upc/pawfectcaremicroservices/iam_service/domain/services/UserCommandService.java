package pe.upc.pawfectcaremicroservices.iam_service.domain.services;

import org.apache.commons.lang3.tuple.ImmutablePair;
import pe.upc.pawfectcaremicroservices.iam_service.domain.model.aggregates.User;
import pe.upc.pawfectcaremicroservices.iam_service.domain.model.commands.*;

import java.util.Optional;

public interface UserCommandService {
    Optional<ImmutablePair<User, String>> handle(SignInCommand command);
    Optional<User> handle(SignUpCommand command);
    boolean isEmailUnique(String email);
    boolean isPasswordValid(String password);
}