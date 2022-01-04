package fr.moha.manga.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
//@Data
//@NoArgsConstructor
@Table(name = "type")
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "type_id")
    private int id;
    private String type;

    @ManyToMany
    @JoinTable(
            name = "type_manga",
            joinColumns = @JoinColumn(name = "type_id"),
            inverseJoinColumns = @JoinColumn(name = "manga_id")
    )
    private List<Manga> mangaList = new ArrayList<>();

    public Type(String type, List<Manga> mangaList) {
        this.type = type;
        this.mangaList = mangaList;
    }

    public Type() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Manga> getMangaList() {
        return mangaList;
    }

    public void setMangaList(List<Manga> mangaList) {
        this.mangaList = mangaList;
    }

    public void addManga(Manga manga) {
        mangaList.add(manga);
        manga.getTypeList().add(this);
    }

    public void removeManga(Manga manga) {
        mangaList.remove(manga);
        manga.getTypeList().remove(this);
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", mangaList=" + mangaList +
                '}';
    }
}
