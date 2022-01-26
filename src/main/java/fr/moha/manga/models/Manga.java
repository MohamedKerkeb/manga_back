package fr.moha.manga.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
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
    @Column(columnDefinition="TEXT")
    private String synopsis;
    @Column(name = "release_date")
    private Date releaseDate;
    @Column(name = "date_of_end")
    private Date endDate;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    @JoinColumn(name = "manga_id")
   //@JsonIgnore
    @JsonIgnoreProperties({"manga"})
    //@JsonManagedReference
    private List<Tome> tomeList = new ArrayList<>();


    @ManyToOne
    @JoinColumn
    @JsonIgnoreProperties("author")
    private Author author;

    @ManyToMany(
            mappedBy = "mangaList"
    )
    private List<Type> typeList = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "editor_id")
//   @JsonIgnoreProperties("editor")
    @JsonManagedReference
    private Editor editor ;


    public Manga(String titleEn, String titleJp, String cover, String synopsis, Date releaseDate, Date endDate) {
        this.titleEn = titleEn;
        this.titleJp = titleJp;
        this.cover = cover;
        this.synopsis = synopsis;
        this.releaseDate = releaseDate;
        this.endDate = endDate;
    }

    public Manga(int id, String titleEn, String titleJp, String cover, String synopsis, Date releaseDate, Date endDate, List<Tome> tomeList, Author author, List<Type> typeList, Editor editor) {
        this.id = id;
        this.titleEn = titleEn;
        this.titleJp = titleJp;
        this.cover = cover;
        this.synopsis = synopsis;
        this.releaseDate = releaseDate;
        this.endDate = endDate;
        this.tomeList = tomeList;
        this.author = author;
        this.typeList = typeList;
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

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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
                ", releaseDate=" + releaseDate +
                ", endDate=" + endDate +
                '}';
    }
}
