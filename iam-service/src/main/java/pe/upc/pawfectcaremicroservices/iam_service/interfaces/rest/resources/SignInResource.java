package pe.upc.pawfectcaremicroservices.iam_service.interfaces.rest.resources;

/**
 * Sign-in request resource.
 * Replaces the duplicate LoginRequest class, which served the same purpose.
 */
public record SignInResource(String userName, String password) {
}