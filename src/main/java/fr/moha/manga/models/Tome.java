package fr.moha.manga.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

@Entity
//@Data
//@NoArgsConstructor
@Table(name = "tome")
public class Tome {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tome_id")
    private int id;
    private int number;
    @Column(name = "number_of_page")
    private int nop;
    private String cover;
    private Date date_release;


    @ManyToMany(
            mappedBy = "tomeList"
    )
    @JsonBackReference
    private List<User> userList = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "manga_id")
//    @JsonIgnore
    @JsonBackReference
    private Manga manga;


    public Tome(int number, int nop, String cover, Date date_release) {
        this.number = number;
        this.nop = nop;
        this.cover = cover;
        this.date_release = date_release;
    }

    public Tome() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNop() {
        return nop;
    }

    public void setNop(int nop) {
        this.nop = nop;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public Date getDate_release() {
        return date_release;
    }

    public void setDate_release(Date date_release) {
        this.date_release = date_release;
    }

    public void setManga(Manga manga) {
        this.manga = manga;
    }

    public Manga getManga() {
        return manga;
    }

    @Override
    public String toString() {
        return "Tome{" +
                "id=" + id +
                ", number=" + number +
                ", nop=" + nop +
                ", cover='" + cover + '\'' +
                '}';
    }
}
