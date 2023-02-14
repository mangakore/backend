package br.com.mangakore.mangakorebackend.api.manga;

public enum MangaCategoryEnum {
    DEFAULT_EDITION("Edição padrão"),
    SPECIAL_EDITION("Edição especial"),
    HARD_COVER_EDITION("Edição capa dura"),
    SINGLE_EDITION("Edição única"),
    MEIO_TANKO_EDITION("Edição meio-tanko");

    private final String description;

    MangaCategoryEnum(String description) {
        this.description = description;
    }
}
