package pe.upc.pawfectcaremicroservices.iam_service.domain.services;

import pe.upc.pawfectcaremicroservices.iam_service.domain.model.entities.Role;
import pe.upc.pawfectcaremicroservices.iam_service.domain.model.queries.RolesQueries;
import java.util.List;
import java.util.Optional;

public interface RoleQueryService {
    List<Role> handle(RolesQueries.GetAllRolesQuery query);
    Optional<Role> handle(RolesQueries.GetRoleByNameQuery query);
}
