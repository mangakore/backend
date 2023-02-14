package br.com.mangakore.mangakorebackend.api.author;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class Author implements Serializable {

    @Column(name = "author_name")
    private Long name;
}
