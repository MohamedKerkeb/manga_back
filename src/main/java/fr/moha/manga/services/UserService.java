package fr.moha.manga.services;

import fr.moha.manga.models.Avatar;
import fr.moha.manga.models.Tome;
import fr.moha.manga.models.User;
import fr.moha.manga.repositories.AvatarRepository;
import fr.moha.manga.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TomeService tomeService;
    @Autowired
    AvatarRepository avatarRepository;

    // private User user;

    /* ######################################################################### */
    /* Gestion du User */
    /* ######################################################################### */

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
            System.out.println(currentUser);
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
            Avatar avatar = user.getAvatar();
            if(avatar != null ) {
                currentUser.setAvatar(avatarRepository.getById(avatar.getIdAvatar()));
            }
            Date dob = user.getDob();
            if(dob != null ) {
                currentUser.setDob(dob);
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

    /* ################################################################################## */
     /* Gestion des tomes */
     /* ################################################################################ */

    /**
     * Tomes de l'user
     * @param user
     * @return
     */
    public ArrayList<Tome> getTomeOfUser(User user){
        try{
            return new ArrayList<Tome>(user.getTomeList());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }


    /**
     * Ajouter un tome dans la bibliothèque
     * @param user_id
     * @param tome_id
     */
    public void addTomeInLibrary(Long user_id,int tome_id ) {
        User user = this.findUserById(user_id);
        Tome tome = tomeService.getTomeById(tome_id);
        if(!this.hasTome(user, tome)) {
            user.addTome(tome);
            userRepository.save(user);
        }
    }


    public Boolean hasTome(User user, Tome tome) {
        for( Tome tomeUser: user.getTomeList()) {
            if(tomeUser.getId() == tome.getId()) return true;
        }
        return false;
    }
}
