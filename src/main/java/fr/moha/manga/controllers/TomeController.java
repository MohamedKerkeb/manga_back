package fr.moha.manga.controllers;

import fr.moha.manga.models.Tome;
import fr.moha.manga.services.TomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/tomes")
public class TomeController {
    @Autowired
    private TomeService tomeService;

    //
    //@RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(path = "/all")
    //@PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<Tome>> findAllTome() {
        List<Tome> tomes = tomeService.getAllTome();
        if(tomes.isEmpty() || tomes == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(tomes, HttpStatus.OK);
        }
    }
//    private Iterable<Tome> findAllTome() {
//        Iterable<Tome> tomes = tomeService.getAllTome();
//        if(tomes == null ) {
//            return
//        }
//        return tomes;
//    }

    @GetMapping(path = "/recents")
    //@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public Iterable<Tome> recentTomes() {
        System.out.println(tomeService.getTomeByDate());
        return tomeService.getTomeByDate();
    }

//    public ResponseEntity<Tome> findTomeById(@PathVariable int id) {
//
//    }

//    @GetMapping("/{manga_id}")
//    //@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
//    public Iterable<Tome> findByMangaId(@PathVariable int manga_id) {
//        Iterable<Tome> tomes = tomeService.getTomeByMangaId(manga_id);
//        return tomes;
//    }

//    private Tome findTomeByDate() {
//        return tomeService.getTomeByDate();
//    }

    @PostMapping("/add")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Tome> addTome(@RequestBody Tome tome ) {
        Tome newTome = tomeService.addNewTome(tome);
        return new ResponseEntity<>(newTome, HttpStatus.CREATED);
     }
}

