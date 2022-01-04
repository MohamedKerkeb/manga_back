package fr.moha.manga.controllers;


import fr.moha.manga.models.User;
import fr.moha.manga.repositories.UserRepository;
import fr.moha.manga.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * Create -add a new user
     * @param user
     * @return user object saved
     */
    @PostMapping("/add")
    private void registerNewUser(@RequestBody User user) {
        userService.addNewUser(user);
    }


    /**
     * Read - get all users
     * @return
     */
    @GetMapping("/all")
    public Iterable<User> findAllUser() {
        return userService.getAllUser();
    }

    /**
     * Read - Get one user
     * @param id the id of user
     * @return An user object full filled
     */
    @GetMapping("/{user_id}")
    public User getUser(@PathVariable("user_id") final Integer id) {
        Optional<User> user = userService.getUserById(id);
        if(user.isPresent()) {
            return user.get();
        } else {
            return null;
        }
    }

    @PutMapping("/{user_id}")
    public void updateUser(@PathVariable("id") final Integer id, @RequestBody User user) {
        userService.updateUser(id, user);
    }

    @DeleteMapping("/delete/{user_id}")
    public void deleteUser(@PathVariable("user_id") final Integer user_id) {
        userService.deleteUserById(user_id);
    }
}
