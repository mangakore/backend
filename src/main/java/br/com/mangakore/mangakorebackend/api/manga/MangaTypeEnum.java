package br.com.mangakore.mangakorebackend.api.manga;

public enum MangaTypeEnum {
    MANGA("Mangá"),
    NOVEL("Novel"),
    DATABOOK("Databook"),
    ARTBOOK("Artbook");

    private final String description;

    MangaTypeEnum(String description) {
        this.description = description;
    }
}
