package br.com.mangakore.mangakorebackend.api.user;


import br.com.mangakore.mangakorebackend.api.AuditableEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@Entity
@Table(name = "user", schema = "security")
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class User extends AuditableEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String username;

    @NotNull
    private String email;

    @NotNull
    private String password;

    @NotNull
    @Column(name = "full_name")
    private String fullName;
}
