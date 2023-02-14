package br.com.mangakore.mangakorebackend.api.manga;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MangaRepository extends JpaRepository<Manga, Long> {

}
