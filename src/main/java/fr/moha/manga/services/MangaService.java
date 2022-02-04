package fr.moha.manga.services;

import fr.moha.manga.models.Manga;
import fr.moha.manga.repositories.MangaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MangaService {
    @Autowired
    private MangaRepository mangaRepository;

    public List<Manga> getAllManga() {
        List<Manga> mangas = new ArrayList<>();
        mangaRepository.findAll().forEach(mangas::add);
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

    public Manga addNewManga(Manga manga) {
        Optional<Manga> mangaOptional = mangaRepository.findByTitleEn(manga.getTitleEn());
        if(mangaOptional.isPresent()) {
            throw new IllegalStateException("manga exist");
        }
        mangaRepository.save(manga);
        return manga;
    }

    public Optional<Manga> getMangaByTitle(String manga_title) {
        Optional<Manga> mangas = mangaRepository.findByTitleEn(manga_title);
        return mangas;
    }
}
