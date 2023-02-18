package br.com.mangakore.mangakorebackend.api.manga;

import br.com.mangakore.mangakorebackend.api.artist.Artist;
import br.com.mangakore.mangakorebackend.api.auditable_entity.AuditableEntity;
import br.com.mangakore.mangakorebackend.api.author.Author;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@Entity
@Table(name = "manga", schema = "public")
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class Manga extends AuditableEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String title;

    private String subtitle;

    @Column(name ="original_title")
    private String originalTitle;

    @Embedded
    private Author author;

    @Embedded
    private Artist artist;

    @Enumerated(EnumType.STRING)
    @Column(name = "manga_type_enum")
    private MangaTypeEnum mangaTypeEnum;

    @Enumerated(EnumType.STRING)
    @Column(name = "manga_demographic_enum")
    private MangaDemographicEnum mangaDemographicEnum;

    @Enumerated(EnumType.STRING)
    @Column(name = "manga_nationality_enum")
    private MangaNationalityEnum mangaNationalityEnum;

    @Enumerated(EnumType.STRING)
    @Column(name = "manga_category_enum")
    private MangaCategoryEnum mangaCategoryEnum;

    @Enumerated(EnumType.STRING)
    @Column(name = "manga_age_group_enum")
    private MangaAgeGroupEnum mangaAgeGroupEnum;

    @Enumerated(EnumType.STRING)
    @Column(name = "manga_status_enum")
    private MangaStatusEnum mangaStatusEnum;
}
