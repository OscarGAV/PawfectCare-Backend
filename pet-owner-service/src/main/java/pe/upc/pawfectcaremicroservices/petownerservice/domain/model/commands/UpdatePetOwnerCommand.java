package pe.upc.pawfectcaremicroservices.petownerservice.domain.model.commands;

public record UpdatePetOwnerCommand(Long id, String phoneNumber) {
}
