package pe.upc.pawfectcaremicroservices.iam_service.interfaces.rest.transform;


import pe.upc.pawfectcaremicroservices.iam_service.domain.model.aggregates.User;
import pe.upc.pawfectcaremicroservices.iam_service.interfaces.rest.resources.AuthenticatedGeneralUserResource;

public class AuthenticatedGeneralUserResourceFromEntityAssembler {
    public static AuthenticatedGeneralUserResource toResourceFromEntity(User user, String token) {
        return new AuthenticatedGeneralUserResource(user.getId(), user.getUsername(), token);
    }
}
