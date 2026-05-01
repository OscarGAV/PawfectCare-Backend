package pe.upc.pawfectcaremicroservices.iam_service.domain.model.aggregates;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import pe.upc.pawfectcaremicroservices.iam_service.domain.model.entities.Role;
import pe.upc.pawfectcaremicroservices.iam_service.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "username"))
@Getter
@Setter
@AllArgsConstructor
@Builder
public class User extends AuditableAbstractAggregateRoot<User> {

    @Getter
    @NotBlank
    @Column(nullable = false, unique = true)
    private String username;

    @Getter
    @Setter
    @NotBlank
    @Column(nullable = false)
    private String password;

    @Column()
    private String fullName;

    @Email
    @Getter
    @Size(max = 360)
    @Column(nullable = false, unique = true)
    private String email;

    @Size(max = 10)
    @Column(nullable = false, unique = true)
    private String dni;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles;

    public User() {
        this.roles = new HashSet<>();
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.roles = new HashSet<>();
    }

    public User(String username, String password, List<Role> ignoredRoles) {
        this(username, password);
        //addRoles(roles);
    }

    public User addRole(Role role) {
        this.roles.add(role);
        return this;
    }

    public User addRoles(List<Role> roles) {
        var validatedRoleSet = Role.validateRoleSet(roles);
        this.roles.addAll(validatedRoleSet);
        return this;
    }
}