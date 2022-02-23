package fr.moha.manga.controllers;


import fr.moha.manga.models.Avatar;
import fr.moha.manga.services.AvatarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/avatar")
public class AvatarController {

    @Autowired
    private AvatarService service;

    @GetMapping
    public ResponseEntity<List<Avatar>> findAllAvatar() {
        List<Avatar> avatars = service.getAllAvatar();
        if(avatars.isEmpty() || avatars == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else  {
            return new ResponseEntity<>(avatars, HttpStatus.OK);
        }
    }
}
