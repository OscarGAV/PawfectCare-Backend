package pe.upc.pawfectcaremicroservices.veterinaryservice.interfaces.rest.resources;

import pe.upc.pawfectcaremicroservices.veterinaryservice.domain.model.valueobjects.VeterinarianSpeciality;

import java.time.LocalDateTime;

public record VeterinarianResource(
        Long id,
        Long userId,
        VeterinarianSpeciality specialization,
        LocalDateTime availableStartTime,
        LocalDateTime availableEndTime) {
}
