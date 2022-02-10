package fr.moha.manga.services;

import fr.moha.manga.models.Tome;
import fr.moha.manga.models.User;
import fr.moha.manga.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // private User user;

    /**
     *  Return all User
     * @return
     */
    public Iterable<User> getAllUser() {
        Iterable<User> users = userRepository.findAll();
        return users;
    }

    /**
     * recuperer un user by id
     * @param id
     * @return un user
     */
    public User findUserById(Long id) {
        var optUser = userRepository.findById(id);
        try {

            return optUser.get();
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }


    /**
     * creation un user
     * @return
     */
    public User addNewUser(User user) {
        Optional<User> userOptional = userRepository.findUserByEmail(user.getEmail());
        if(userOptional.isPresent()) {
            throw new IllegalStateException("email exist");
        }
        userRepository.save(user);
        return user;
    }

    public ArrayList<Tome> getTomeOfUser(User user){
        try{
            return new ArrayList<Tome>(user.getTomeList());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /**
     *  Update user
     * @param id
     * @param user
     * @return
     */
    public User updateUser(Long id, User user) {
       //  User userRepo = userRepository.findById(user.getId());
        Optional<User>  u = userRepository.findById(id);
        if(u.isPresent()) {
            User currentUser = u.get();

            String username = user.getUsername();
            if( username != null ) {
                currentUser.setUsername(username);
            }
            String mail = user.getEmail();
            if(mail != null) {
                currentUser.setEmail(mail);
            }
            String password = user.getPassword();
            if(password != null ){
                currentUser.setPassword(password);
            }
            userRepository.save(currentUser);
        } else {
            throw new IllegalStateException("impossible update user");
        }
        return user;
    }

    /**
     * delete un user by id
     * @param id
     */
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

}
