package fr.moha.manga.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    private Integer year;


    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    @JoinColumn(name = "manga_id")
    @JsonIgnoreProperties({"titleEn", "titleJp","synopsis","year","endDate","author","typeList","editor","tomeList"})
    private List<Tome> tomeList = new ArrayList<>();
    //@JsonBackReference

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
    //@JsonIgnoreProperties("author")

    @ManyToMany(
            mappedBy = "mangaList"
    )
    private List<Type> typeList = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "editor_id")
    // @JsonManagedReference
    private Editor editor;


    public Manga(String titleEn, String titleJp, String cover, String synopsis, Integer year, List<Tome> tomeList, Author author, List<Type> typeList, Editor editor) {
        this.titleEn = titleEn;
        this.titleJp = titleJp;
        this.cover = cover;
        this.synopsis = synopsis;
        this.year = year;
        this.tomeList = tomeList;
        this.author = author;
        this.typeList = typeList;
        this.editor = editor;
    }

    public Manga(String titleEn, String titleJp, String cover, String synopsis, Integer year, Author author, Editor editor) {
        this.titleEn = titleEn;
        this.titleJp = titleJp;
        this.cover = cover;
        this.synopsis = synopsis;
        this.year = year;
        this.author = author;
        this.editor = editor;
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

    public List<Tome> getTomeList() {
        return tomeList;
    }

    public void setTomeList(List<Tome> tomeList) {
        this.tomeList = tomeList;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Type> getTypeList() {
        return typeList;
    }

    public void setTypeList(List<Type> typeList) {
        this.typeList = typeList;
    }

    public Editor getEditor() {
        return editor;
    }

    public void setEditor(Editor editor) {
        this.editor = editor;
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
