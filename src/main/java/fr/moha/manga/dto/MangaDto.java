package fr.moha.manga.dto;

public class MangaDto {

    private String titleEn;
    private String titleJp;
    private String cover;
    private String synopsis;
    private int year;
    private int authorId;
    private int editorId;

    public MangaDto() {
    }

    public MangaDto( String titleEn, String titleJp, String cover, String synopsis, int year, int authorId, int editorId) {
        this.titleEn = titleEn;
        this.titleJp = titleJp;
        this.cover = cover;
        this.synopsis = synopsis;
        this.year = year;
        this.authorId = authorId;
        this.editorId = editorId;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getEditorId() {
        return editorId;
    }

    public void setEditorId(int editorId) {
        this.editorId = editorId;
    }
}
