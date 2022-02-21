package fr.moha.manga.services;

import fr.moha.manga.models.Tome;
import fr.moha.manga.repositories.TomeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Optional;

@Service
public class TomeService {

    @Autowired
    private TomeRespository respository;

    public Iterable<Tome> getAllTome() {
        Iterable<Tome> tomes = respository.findAll();
        return tomes;
    }

    public Tome getTomeById(Integer id) {
        var optTome = respository.findById(id);

        return optTome.get();

    }

//    public void addNewTome(Tome tome) {
//        Optional<Tome> tomeOptional = respository.findByNumber(tome.getNumber());
//        if(tomeOptional.isPresent()) {
//            throw new IllegalStateException("Tome exists");
//        }
//        respository.save(tome);
//    }


    public Iterable<Tome> getTomeByDate() {
        Iterable<Tome> tomes = respository.findByDate_release(Date.valueOf("2021-11-01"));
        return tomes;
    }

    public  Iterable<Tome> getTomeByMangaId(int id) {
        Iterable<Tome> tomes = respository.findAllByMangaId(id);
        return tomes;
    }
}
