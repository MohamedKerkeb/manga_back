package fr.moha.manga.controllers;

import fr.moha.manga.models.Manga;
import fr.moha.manga.services.MangaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/manga")
public class MangaController {
    @Autowired
    private MangaService mangaService;

    @GetMapping("/all")
    private Iterable<Manga> findAllManga() {
        return mangaService.getAllManga();
    }

//    @GetMapping("/search/{manga_title}")
//    public Iterable<Manga> getMangaByTitle(@PathVariable String manga_title) {
//        System.out.println("search");
//        return mangaService.getMangaByTitle(manga_title);
//    }

    @PostMapping("/add")
    private void createManga(@RequestBody Manga manga) {
        mangaService.addNewManga(manga);
    }



    @GetMapping("/{manga_id}")
    private Manga findMangaById(@PathVariable Integer manga_id) {
        Optional<Manga> manga =  mangaService.getMangaById(manga_id);
        if(manga.isPresent()) {
            return  manga.get();
        } else {
            return null;
        }
    }


    @DeleteMapping("/delete/{manga_id}")
    public void deleteManga(@PathVariable("manga_id") final Integer manga_id) {
        mangaService.deleteMangaById(manga_id);
    }
}
