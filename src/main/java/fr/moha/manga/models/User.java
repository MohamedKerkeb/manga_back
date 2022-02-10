package fr.moha.manga.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;
import java.util.*;


@Entity
//@Data
//@Getter @Setter
//@NoArgsConstructor
@DynamicUpdate
@Table(name = "users")
public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    @Size(max = 120, min = 3)
    private String username;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    @Size(max = 120)
    private String password;
    @OneToOne
    @JoinColumn(name = "avatar_id")
    private Avatar avatar;
    @ManyToMany(
        fetch = FetchType.LAZY,
        cascade = {
                CascadeType.MERGE,CascadeType.PERSIST
        }
    )
    @JoinTable(
            name = "user_tome",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "tome_id")
    )

    @JsonManagedReference
    private List<Tome> tomeList = new ArrayList<>();

    @Column(name = "date_of_birth")
    private Date dob;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles = new HashSet<>();


    public User() {
    }

    public User(String username, String email, String password, Avatar avatar, List<Tome> tomeList, Date dob) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.avatar = avatar;
        this.tomeList = tomeList;
        this.dob = dob;
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;

    }

    public User(String username, Date dob, Avatar avatar, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.dob = dob;
        this.avatar = avatar;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public List<Tome> getTomeList() {
        return tomeList;
    }

    public void setTomeList(List<Tome> tomeList) {
        this.tomeList = tomeList;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public void addTome(Tome tome) { tomeList.add(tome);}
    public void removeTome(Tome tome) { tomeList.remove(tome);}
}
