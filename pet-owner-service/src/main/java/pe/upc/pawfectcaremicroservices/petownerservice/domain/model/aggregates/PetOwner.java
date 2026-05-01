package pe.upc.pawfectcaremicroservices.petownerservice.domain.model.aggregates;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.util.Strings;
import pe.upc.pawfectcaremicroservices.petownerservice.domain.model.commands.CreatePetOwnerCommand;

@Getter
@Setter
@Entity
@Table(name = "pet_owners")
public class PetOwner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private String phoneNumber;

    public PetOwner() {
        this.phoneNumber = Strings.EMPTY;
    }

    public PetOwner(CreatePetOwnerCommand command) {
        this();
        this.userId = command.userId();
        this.phoneNumber = command.phoneNumber();
    }
    public PetOwner updateInformation(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
