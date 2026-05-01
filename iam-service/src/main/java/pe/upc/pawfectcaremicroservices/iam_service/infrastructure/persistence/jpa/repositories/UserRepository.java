package pe.upc.pawfectcaremicroservices.iam_service.infrastructure.persistence.jpa.repositories;

import pe.upc.pawfectcaremicroservices.iam_service.domain.model.aggregates.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findByUsername(String username);
    void save(User user);
    boolean existsByEmail(String email);
    boolean existsByDni(String dni);
    Optional<User> findByEmail(String email);
}