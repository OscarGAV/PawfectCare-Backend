package pe.upc.pawfectcaremicroservices.iam_service.domain.model.queries;

public class UsersQueries {
    public record GetAllUsersQuery() {}
    public record GetUserByIdQuery(Long userId) {}
    public record GetUserByUserNameQuery(String username) {}
}