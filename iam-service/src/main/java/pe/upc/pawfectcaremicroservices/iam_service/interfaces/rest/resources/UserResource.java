package pe.upc.pawfectcaremicroservices.iam_service.interfaces.rest.resources;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter @Setter
public class UserResource {
    private Long id;
    private String username;
    private String fullName;
    private String email;
    private String dni;
    private Set<String> roles;
}