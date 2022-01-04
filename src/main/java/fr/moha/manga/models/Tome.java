package fr.moha.manga.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
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

    @ManyToMany(
            mappedBy = "tomeList"
    )
    private List<User> userList = new ArrayList<>();


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "manga_id")
    private Manga manga;

    public void setManga(Manga manga) { 
        this.manga = manga;
    }

    public Manga getManga() {
        return manga;
    }


    public Tome(int number, int nop, String cover) {
        this.number = number;
        this.nop = nop;
        this.cover = cover;
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
