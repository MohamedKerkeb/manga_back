package fr.moha.manga.controllers;


import fr.moha.manga.models.User;
import fr.moha.manga.repositories.UserRepository;
import fr.moha.manga.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")


    /**
     * Create -add a new user
     * @param user
     * @return user object saved
     */
    @PostMapping("/add")
    private ResponseEntity<User> registerNewUser(@Validated @RequestBody User user) {
        User newUser = userService.addNewUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }


    /**
     * Read - get all users
     * @return
     */
    @GetMapping("/all")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Iterable<User>> findAllUser() {
        Iterable<User> users = userService.getAllUser();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    /**
     * Read - Get one user
     * @param id the id of user
     * @return An user object full filled
     */
    @GetMapping("/{user_id}")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public ResponseEntity<User> getUserById(@PathVariable("user_id") final Long id) {
        Optional<User> user = userService.findUserById(id);
        if(user.isPresent()) {
            return ResponseEntity.ok().body(user.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{user_id}")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public ResponseEntity<User> updateUser(@PathVariable final Long id, @RequestBody User user) {
        User updateUser = userService.updateUser(id, user);
        return new ResponseEntity<>(updateUser,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{user_id}")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public ResponseEntity<?> deleteUser(@PathVariable("user_id") final Long user_id) {
        userService.deleteUserById(user_id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
