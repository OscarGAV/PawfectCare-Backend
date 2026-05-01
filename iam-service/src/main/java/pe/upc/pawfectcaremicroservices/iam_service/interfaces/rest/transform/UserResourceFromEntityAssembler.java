package pe.upc.pawfectcaremicroservices.iam_service.interfaces.rest.transform;

import pe.upc.pawfectcaremicroservices.iam_service.domain.model.aggregates.User;
import pe.upc.pawfectcaremicroservices.iam_service.interfaces.rest.resources.UserResource;

import java.util.stream.Collectors;

public class UserResourceFromEntityAssembler {
    public static UserResource toResourceFromEntity(User user) {
        UserResource resource = new UserResource();
        resource.setId(user.getId());
        resource.setUsername(user.getUsername());
        resource.setFullName(user.getFullName());
        resource.setEmail(user.getEmail());
        resource.setDni(user.getDni());
        resource.setRoles(
                user.getRoles().stream()
                        .map(r -> r.getName().name())
                        .collect(Collectors.toSet())
        );
        return resource;
    }
}
