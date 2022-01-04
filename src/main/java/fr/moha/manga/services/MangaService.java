package fr.moha.manga.services;

import fr.moha.manga.models.Manga;
import fr.moha.manga.repositories.MangaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MangaService {
    @Autowired
    private MangaRepository mangaRepository;

    public Iterable<Manga> getAllManga() {
        Iterable<Manga> mangas = mangaRepository.findAll();
        return mangas;
    }

    public Optional<Manga> getMangaById(Integer id) {
        return mangaRepository.findById(id);
    }

    public Manga createManga(Manga manga) {
        return mangaRepository.save(manga);
    }

    public void deleteMangaById(Integer id) {
        mangaRepository.deleteById(id);
    }

    public void addNewManga(Manga manga) {
        Optional<Manga> mangaOptional = mangaRepository.findByTitleEn(manga.getTitleEn());
        if(mangaOptional.isPresent()) {
            throw new IllegalStateException("manga exist");
        }
        mangaRepository.save(manga);
    }
}
