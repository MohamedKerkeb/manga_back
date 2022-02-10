package fr.moha.manga.dto;

import fr.moha.manga.models.Erole;
import fr.moha.manga.models.Role;

import java.util.Date;

public class UserDto {

    private Long Id;
    private String username;
    private String email;
    private Erole role;
    private String avatar;
    private Date dob;

    public UserDto() {
    }

    public UserDto(String username) {
        this.username = username;
    }

    public UserDto(String username, Role role) {
        this.username = username;
        this.role = role.getName();
    }

    public UserDto(Long id, String username, String email, Role role, String avatar, Date dob) {
        Id = id;
        this.username = username;
        this.email = email;
        this.role = role.getName();
        this.avatar = avatar;
        this.dob = dob;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public Erole getRole() {
        return role;
    }

    public void setRole(Erole role) {
        this.role = role;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
