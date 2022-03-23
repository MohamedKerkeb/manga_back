package fr.moha.manga.controllers;

import fr.moha.manga.models.Author;
import fr.moha.manga.models.Manga;
import fr.moha.manga.repositories.AuthorRepository;
import fr.moha.manga.services.MangaService;
import fr.moha.manga.services.TomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/manga")
public class MangaController {
    @Autowired
    private MangaService mangaService;
    @Autowired
    private AuthorRepository authorRepository;


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


    @PostMapping(value = "/add", consumes={"application/json"})
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Manga> createManga( @RequestBody Manga manga) {
        Author author = authorRepository.getById(manga.getAuthor().getId());
        System.out.println("author" + author.toString());
        Manga newManga = mangaService.addNewManga(manga);
       return new ResponseEntity<>(newManga, HttpStatus.CREATED);
    }

    @GetMapping("/{manga_id}")
    //@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public ResponseEntity<Manga> findMangaById(@PathVariable Integer manga_id) {
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
