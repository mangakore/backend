package br.com.mangakore.mangakorebackend.api.manga;

public enum MangaFormatEnum {
    FORMAT_1("13,5 x 20,5 cm");

    private final String description;

    MangaFormatEnum(String description) {
        this.description = description;
    }
}
