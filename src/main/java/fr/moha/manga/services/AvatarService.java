package fr.moha.manga.services;

import fr.moha.manga.models.Avatar;
import fr.moha.manga.repositories.AvatarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AvatarService {

    @Autowired
    private AvatarRepository repository;

    public List<Avatar> getAllAvatar() {
        List<Avatar> avatars = new ArrayList<>();
        repository.findAll().forEach(avatars::add);
        return avatars;
    }

    public Optional<Avatar> findById(int id) {
        return repository.findById(id);
    }

}
