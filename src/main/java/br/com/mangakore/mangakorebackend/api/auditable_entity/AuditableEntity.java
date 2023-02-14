package br.com.mangakore.mangakorebackend.api.auditable_entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public class AuditableEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "is_deleted")
    private Boolean isDeleted = false;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(name = "audit_user_id")
    private Long auditUserId;

    @JsonIgnore
    @Column(name = "cannot_remove")
    private Boolean cannotRemove = false;

    @PrePersist
    private void prePersist(){ createdAt = LocalDateTime.now(); }
}
