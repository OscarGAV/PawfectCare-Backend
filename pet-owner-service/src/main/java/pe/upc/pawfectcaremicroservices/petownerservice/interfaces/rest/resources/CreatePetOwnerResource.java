package pe.upc.pawfectcaremicroservices.petownerservice.interfaces.rest.resources;

public record CreatePetOwnerResource(
        Long userId,
        String phoneNumber) {
}
