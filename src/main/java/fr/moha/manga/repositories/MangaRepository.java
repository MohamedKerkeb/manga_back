package fr.moha.manga.repositories;

import fr.moha.manga.models.Manga;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MangaRepository extends CrudRepository<Manga, Integer> {

    @Query("SELECT m FROM Manga m WHERE m.titleEn = ?1")
    Optional<Manga> findByTitleEn(String title);
}
