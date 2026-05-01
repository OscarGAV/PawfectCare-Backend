package pe.upc.pawfectcaremicroservices.petownerservice.domain.model.commands;

public record CreatePetOwnerCommand(Long userId, String phoneNumber) {
}
