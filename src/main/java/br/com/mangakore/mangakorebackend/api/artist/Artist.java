package br.com.mangakore.mangakorebackend.api.artist;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class Artist implements Serializable {

    @Column(name = "author_name")
    private Long name;
}
