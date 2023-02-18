package br.com.mangakore.mangakorebackend.api.manga;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manga")
public class MangaResource {

    @Autowired
    private MangaService mangaService;

    @GetMapping("/{id}")
    public ResponseEntity<Manga> findById(@PathVariable Long id){
        return ResponseEntity.ok(mangaService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Manga> insert(@RequestBody @Valid Manga newManga){
        return ResponseEntity.ok(mangaService.insert(newManga));
    }

    @GetMapping
    public ResponseEntity<List<Manga>> findAll(){
        return ResponseEntity.ok(mangaService.findAll());
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        mangaService.deleteById(id);
    }

}
