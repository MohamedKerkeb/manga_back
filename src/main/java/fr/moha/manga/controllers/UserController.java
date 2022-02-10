package fr.moha.manga.controllers;


import fr.moha.manga.dto.UserDto;
import fr.moha.manga.models.Tome;
import fr.moha.manga.models.User;
import fr.moha.manga.repositories.UserRepository;
import fr.moha.manga.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@Slf4j
@CrossOrigin("*")
@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    // @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")


    /**
     * Create -add a new user
     * @param user
     * @return user object saved
     */
//    @PostMapping("/add")
//    public ResponseEntity<User> registerNewUser(@Validated @RequestBody User user) {
//        User newUser = userService.addNewUser(user);
//        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
//    }

//    @PostMapping
//    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
//        User userRequest = modelMapper.map(userDto, User.class);
//
//        User user = userService.addNewUser(userRequest);
//
//        UserDto userReponse = modelMapper.map(user, UserDto.class);
//
//        return new ResponseEntity<UserDto>(userReponse, HttpStatus.CREATED);
//    }

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
//    @GetMapping("/{user_id}")
//    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
//    public ResponseEntity<User> getUserById(@PathVariable("user_id") final Long id) {
//
//        try {
//            User user = userService.findUserById(id);
//            return ResponseEntity.ok().body(user);
//        } catch (Exception e) {
//            log.error(e.getMessage());
//            return ResponseEntity.notFound().build();
//        }
//
//    }

    @GetMapping("/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public ResponseEntity<UserDto> getUserDto(@PathVariable(name = "id") Long id) {
        User user = userService.findUserById(id);

        UserDto userResponse = modelMapper.map(user, UserDto.class);

        return ResponseEntity.ok().body(userResponse);
    }

    /**
     * Get All tomes of one user
     * @param user_id
     * @return
     */
    @GetMapping(value = "/{user_id}/tomes")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public ResponseEntity<ArrayList<Tome>> getTomesOfUser(@PathVariable Long user_id) {
        try{
            User user = userService.findUserById(user_id);
            return ResponseEntity.ok().body(userService.getTomeOfUser(user));
        } catch (Exception exception) {
            log.error(String.valueOf(exception));
            return ResponseEntity.notFound().build();
        }
    }


    /**
     *  update user
     * @param id
     * @param user
     * @return
     */
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
