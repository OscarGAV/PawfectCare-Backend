package pe.upc.pawfectcaremicroservices.iam_service.interfaces.rest.resources;

import lombok.Getter;
import lombok.Setter;

/**
 * Sign-up request resource for regular users.
 */
@Getter
@Setter
public class SignUpRequest {
    private String username;
    private String password;
    private String role;
    private String fullName;
    private String email;
    private String dni;
}