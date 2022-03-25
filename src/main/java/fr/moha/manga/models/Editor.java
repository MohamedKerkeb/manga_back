package fr.moha.manga.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
//@Data
//@NoArgsConstructor
@Table(name = "editor")
public class Editor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String link;

//     @OneToMany(
//             mappedBy = "editor"
//     )
////    @JsonIgnoreProperties("manga")
//     @JsonBackReference
//     private List<Manga> mangaList = new ArrayList<>();

    public Editor(String name, String link) {
        this.name = name;
        this.link = link;
    }

    public Editor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

//    public List<Manga> getMangaList() {
//        return mangaList;
//    }
//
//    public void setMangaList(List<Manga> mangaList) {
//        this.mangaList = mangaList;
//    }
}
