package fr.moha.manga.controllers;

import fr.moha.manga.models.Tome;
import fr.moha.manga.services.TomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/tomes")
public class TomeController {
    @Autowired
    private TomeService tomeService;

    @GetMapping
    private Iterable<Tome> findAllTome() {
        return tomeService.getAllTome();
    }

    @GetMapping(path = "/recents")
    public Iterable<Tome> recentTomes() {
        System.out.println(tomeService.getTomeByDate());
        return tomeService.getTomeByDate();
    }

//    private Tome findTomeByDate() {
//        return tomeService.getTomeByDate();
//    }
}
