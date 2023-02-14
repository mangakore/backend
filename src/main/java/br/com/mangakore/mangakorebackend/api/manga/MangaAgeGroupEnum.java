package br.com.mangakore.mangakorebackend.api.manga;

public enum MangaAgeGroupEnum {
    TWELVE("12 anos"),
    FOURTEEN("14 anos"),
    SIXTEEN("16 anos"),
    EIGHTEEN("18 anos"),
    FREE("Livre");

    private final String description;

    MangaAgeGroupEnum(String description) {
        this.description = description;
    }
}
