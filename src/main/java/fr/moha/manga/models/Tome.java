package fr.moha.manga.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.*;
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
    @Temporal(TemporalType.DATE)
    private Date date_release;


    @ManyToMany(
            mappedBy = "tomeList"
    )
    @JsonBackReference
    private List<User> userList = new ArrayList<>();

    private int mangaId;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "manga_id")
//    @JsonIgnoreProperties({"titleEn", "titleJp", "cover","synopsis","year","endDate","author","typeList","editor","tomeList"})
//    private Manga manga;
    //@JsonManagedReference
    // @JsonBackReference
    //@JsonIgnore
    //@JsonProperty(value = "manga_id")




    public Tome(int number, int nop, String cover, Date date_release, int mangaId ) {
        this.number = number;
        this.nop = nop;
        this.cover = cover;
        this.date_release = date_release;
        //this.manga = manga; Manga manga
        this.mangaId = mangaId;
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

    public int getMangaId() {
        return mangaId;
    }

    public void setMangaId(int mangaId) {
        this.mangaId = mangaId;
    }

//    public void setManga(Manga manga) {
//        this.manga = manga;
//    }
//
//    public Manga getManga() {
//        return manga;
//    }

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
