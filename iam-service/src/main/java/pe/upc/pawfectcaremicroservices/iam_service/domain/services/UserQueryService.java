package pe.upc.pawfectcaremicroservices.iam_service.domain.services;

import pe.upc.pawfectcaremicroservices.iam_service.domain.model.aggregates.User;
import pe.upc.pawfectcaremicroservices.iam_service.domain.model.queries.UsersQueries;

import java.util.List;
import java.util.Optional;

public interface UserQueryService {
    List<User> handle(UsersQueries.GetAllUsersQuery query);
    Optional<User> handle(UsersQueries.GetUserByIdQuery query);
    Optional<User> handle(UsersQueries.GetUserByUserNameQuery query);
}