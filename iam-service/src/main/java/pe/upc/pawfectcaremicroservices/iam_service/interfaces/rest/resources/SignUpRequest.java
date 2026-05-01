package pe.upc.pawfectcaremicroservices.iam_service.interfaces.rest.resources;

import lombok.Getter;
import lombok.Setter;

/**
 * Sign-up request resource for regular users.
 * Replaces the duplicate SignUpResource record, which served the same purpose.
 */
@Getter
@Setter
public class SignUpRequest {
    private String userName;
    private String password;
    private String role;
    private String fullName;
    private String phoneNumber;
    private String email;
    private String address;
}