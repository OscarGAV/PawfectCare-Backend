package pe.upc.pawfectcaremicroservices.iam_service.interfaces.rest.resources;

/**
 * Sign-in request resource.
 */
public record SignInResource(String username, String password) {
}