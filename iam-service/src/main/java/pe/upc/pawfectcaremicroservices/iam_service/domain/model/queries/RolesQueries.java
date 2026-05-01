package pe.upc.pawfectcaremicroservices.iam_service.domain.model.queries;

import pe.upc.pawfectcaremicroservices.iam_service.domain.model.valueobjects.Roles;

public class RolesQueries {
    public record GetAllRolesQuery() { }
    public record GetRoleByNameQuery(Roles name) { }
}
