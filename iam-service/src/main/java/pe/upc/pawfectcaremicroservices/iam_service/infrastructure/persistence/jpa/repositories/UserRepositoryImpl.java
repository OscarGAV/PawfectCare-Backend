package pe.upc.pawfectcaremicroservices.iam_service.infrastructure.persistence.jpa.repositories;

import org.springframework.stereotype.Repository;
import pe.upc.pawfectcaremicroservices.iam_service.domain.model.aggregates.User;

import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private final JpaUserRepository jpaRepo;

    public UserRepositoryImpl(JpaUserRepository jpaRepo) {
        this.jpaRepo = jpaRepo;
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return jpaRepo.findByUsername(username);
    }

    @Override
    public void save(User user) {
        jpaRepo.save(user);
    }

    @Override
    public boolean existsByEmail(String email) {
        return jpaRepo.existsByEmail(email);
    }

    @Override
    public boolean existsByDni(String dni) {
        return jpaRepo.existsByDni(dni);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return jpaRepo.findByEmail(email);
    }
}