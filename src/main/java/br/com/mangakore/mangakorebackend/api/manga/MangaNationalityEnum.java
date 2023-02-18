package br.com.mangakore.mangakorebackend.api.manga;

public enum MangaNationalityEnum {
    BRAZILIAN("Brasileiro"),
    CHINESE("Chinês"),
    COREAN("Coreano"),
    SPANISH("Espanhol"),
    FRENCH("Francês"),
    JAPONESE("Japonês"),
    UNITED_KINGDOM("Reino Unido");

    private final String description;

    MangaNationalityEnum(String description) {
        this.description = description;
    }
}
