package pe.upc.pawfectcaremicroservices.iam_service.interfaces.rest;


import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.upc.pawfectcaremicroservices.iam_service.domain.services.UserCommandService;
import pe.upc.pawfectcaremicroservices.iam_service.interfaces.rest.resources.*;
import pe.upc.pawfectcaremicroservices.iam_service.interfaces.rest.transform.*;

/**
 * AuthenticationController
 * <p>
 *     This controller is responsible for handling authentication requests.
 *     It exposes two endpoints:
 *     <ul>
 *         <li>POST /api/v1/auth/sign-in</li>
 *         <li>POST /api/v1/auth/sign-up</li>
 *     </ul>
 * </p>
 */
@RestController
@RequestMapping(value = "/api/v1/authentication", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Authentication", description = "Authentication Endpoints")
public class AuthenticationController {
    private final UserCommandService userCommandService;

    public AuthenticationController(UserCommandService userCommandService) {
        this.userCommandService = userCommandService;
    }

    /**
     * Handles the sign-in request.
     * @param signInResource the sign-in request body.
     * @return the authenticated user resource.
     */
    @PostMapping("/sign-in")
    public ResponseEntity<AuthenticatedGeneralUserResource> signIn(@RequestBody SignInResource signInResource) {

        var signInCommand = SignInCommandFromResourceAssembler.toCommandFromResource(signInResource);

        try {
            var user = userCommandService.handle(signInCommand);
            if (user.isPresent()) {
                var resource = AuthenticatedGeneralUserResourceFromEntityAssembler
                        .toResourceFromEntity(user.get().getLeft(), user.get().getRight());
                return ResponseEntity.ok(resource);
            }
        } catch (Exception e) {
            // Opcional: log si quieres ver por qué falló el login como user
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }

    /**
     * Handles the sign-up request.
     * @param request from RegisterRequest.
     * @return the created user resource.
     */
    @PostMapping("/sign-up")

    public ResponseEntity<UserResource> signUp(@RequestBody SignUpRequest request) {
        var signUpCommand = SignUpCommandFromResourceAssembler.toCommandFromResource(request);
        var user = userCommandService.handle(signUpCommand);
        if (user.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }
        var userResource = UserResourceFromEntityAssembler.toResourceFromEntity(user.get());
        return new ResponseEntity<>(userResource, HttpStatus.CREATED);

    }
}
