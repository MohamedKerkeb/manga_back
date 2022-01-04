package fr.moha.manga.repositories;

import fr.moha.manga.models.Avatar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvatarRepository extends CrudRepository<Avatar, Integer> {
}
