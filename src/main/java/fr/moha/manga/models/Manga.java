package fr.moha.manga.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.*;

@Entity
//@Data
//@NoArgsConstructor
@Table(name = "manga")
public class Manga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manga_id")
    private int id;
    @Column(name = "title")
    private String titleEn;
    @Column(name = "title_original")
    private String titleJp;
    private String cover;
    @Column(columnDefinition = "TEXT")
    private String synopsis;
    @Column(name = "year")
    private int year;


//    @OneToMany(
//            cascade = CascadeType.ALL,
//            orphanRemoval = true,
//            fetch = FetchType.EAGER
//    )
//    @JoinColumn(name = "manga_id")
//    @JsonIgnoreProperties({"titleEn", "titleJp","synopsis","year","endDate","authorId","typeList","editorId","tomeList"})
//    private List<Tome> tomeList = new ArrayList<>();
    //@JsonBackReference

//    @ManyToOne(
//            cascade = CascadeType.ALL,
//            fetch = FetchType.LAZY
//    )
//    @JoinColumn(name = "authorId_id")
//    private AuthorId authorId;
    //@JsonIgnoreProperties("authorId")
    private int authorId;

    @ManyToMany(
            mappedBy = "mangaList"
    )
    private List<Type> typeList = new ArrayList<>();

//    @ManyToOne
//    @JoinColumn(name = "editorId_id")
    // @JsonManagedReference
//    private EditorId editorId;
    private int editorId;


    public Manga(String titleEn, String titleJp, String cover, String synopsis, Integer year,  int authorId, List<Type> typeList, int editorId) {
        this.titleEn = titleEn;
        this.titleJp = titleJp;
        this.cover = cover;
        this.synopsis = synopsis;
        this.year = year;
//        this.tomeList = tomeList; List<Tome> tomeList,
        this.authorId = authorId;
        this.typeList = typeList;
        this.editorId = editorId;
    }

    public Manga(String titleEn, String titleJp, String cover, String synopsis, Integer year, int authorId, int editorId) {
        this.titleEn = titleEn;
        this.titleJp = titleJp;
        this.cover = cover;
        this.synopsis = synopsis;
        this.year = year;
        this.authorId = authorId;
        this.editorId = editorId;
    }

    public Manga() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitleEn() {
        return titleEn;
    }

    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn;
    }

    public String getTitleJp() {
        return titleJp;
    }

    public void setTitleJp(String titleJp) {
        this.titleJp = titleJp;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

//    public List<Tome> getTomeList() {
//        return tomeList;
//    }
//
//    public void setTomeList(List<Tome> tomeList) {
//        this.tomeList = tomeList;
//    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public List<Type> getTypeList() {
        return typeList;
    }

    public void setTypeList(List<Type> typeList) {
        this.typeList = typeList;
    }

    public int getEditorId() {
        return editorId;
    }

    public void setEditorId(int editorId) {
        this.editorId = editorId;
    }




    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", titleEn='" + titleEn + '\'' +
                ", titleJp='" + titleJp + '\'' +
                ", cover='" + cover + '\'' +
                ", synopsis='" + synopsis + '\'' +
                '}';
    }
}
