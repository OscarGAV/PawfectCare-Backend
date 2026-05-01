package pe.upc.pawfectcaremicroservices.iam_service.domain.model.commands;

public record SignUpCommand(String username, String password, String role,
                            String fullName, String email, String dni) {
}
