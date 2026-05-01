package pe.upc.pawfectcaremicroservices.iam_service.interfaces.rest.transform;

import pe.upc.pawfectcaremicroservices.iam_service.domain.model.commands.SignUpCommand;
import pe.upc.pawfectcaremicroservices.iam_service.interfaces.rest.resources.SignUpRequest;

public class SignUpCommandFromResourceAssembler {
    public static SignUpCommand toCommandFromResource(SignUpRequest request) {
        return new SignUpCommand(
                request.getUsername(),
                request.getPassword(),
                request.getRole(),
                request.getFullName(),
                request.getEmail(),
                request.getDni()
        );
    }
}
