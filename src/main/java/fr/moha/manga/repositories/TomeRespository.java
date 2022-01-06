package fr.moha.manga.repositories;

import fr.moha.manga.models.Tome;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.Optional;

@Repository
public interface TomeRespository extends CrudRepository<Tome, Integer> {

    @Query("SELECT t FROM Tome t WHERE t.date_release > ?1  ")
    Iterable<Tome> findByDate_release( Date date);

    //Optional<Tome> findByNumber(Integer number);
}