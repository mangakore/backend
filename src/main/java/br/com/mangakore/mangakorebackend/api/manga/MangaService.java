package br.com.mangakore.mangakorebackend.api.manga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MangaService {

    @Autowired
    private MangaRepository mangaRepository;

    public Manga findById(Long id) {
        return mangaRepository.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public Manga insert(Manga manga) {
        manga.setAuditUserId(1L);
        return mangaRepository.save(manga);
    }

    public List<Manga> findAll(){
        return mangaRepository.findAll();
    }

    public void deleteById(Long id){
        mangaRepository.deleteById(id);
    }

}
