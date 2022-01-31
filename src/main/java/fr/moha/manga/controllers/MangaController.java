package fr.moha.manga.controllers;

import fr.moha.manga.models.Manga;
import fr.moha.manga.services.MangaService;
import fr.moha.manga.services.TomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/manga")
public class MangaController {
    @Autowired
    private MangaService mangaService;


    @GetMapping("/all")
    // @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<Manga>> findAllManga() {
        //return mangaService.getAllManga();
        List<Manga> mangas = mangaService.getAllManga();
        if(mangas.isEmpty() || mangas == null ) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {

            return new ResponseEntity<>(mangas, HttpStatus.OK);
        }

    }

//    @GetMapping("/search/{title}")
//    public ResponseEntity<Manga> getByTitle(@PathVariable("title") String manga_title) {
//        System.out.println(manga_title);
//        Optional<Manga> manga = mangaService.getMangaByTitle(manga_title);
//        if(manga.isPresent()) {
//            return  ResponseEntity.ok().body(manga.get());
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }


    @PostMapping("/add")
    @PreAuthorize("hasRole('ADMIN')")
    private ResponseEntity<Manga> createManga(@Validated @RequestBody Manga manga) {
        Manga newManga = mangaService.addNewManga(manga);
       return new ResponseEntity<>(newManga, HttpStatus.CREATED);
    }

    @GetMapping("/{manga_id}")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    private ResponseEntity<Manga> findMangaById(@PathVariable Integer manga_id) {
        Optional<Manga> mangaOptional =  mangaService.getMangaById(manga_id);

        if(mangaOptional.isPresent()) {
            return  ResponseEntity.ok().body(mangaOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{manga_id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Manga> deleteManga(@PathVariable("manga_id") final Integer manga_id) {
        mangaService.deleteMangaById(manga_id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
