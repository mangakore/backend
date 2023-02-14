package br.com.mangakore.mangakorebackend.api.manga;

public enum MangaStatusEnum {
    PUBLISHING("Em publicação"),
    COMPLETED("Completo"),
    CANCELED("Cancelado");

    private final String description;

    MangaStatusEnum(String description) {
        this.description = description;
    }
}
