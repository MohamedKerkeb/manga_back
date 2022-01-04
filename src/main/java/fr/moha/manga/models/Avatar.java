package fr.moha.manga.models;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
//@Data
//@Getter @Setter
//@NoArgsConstructor
@Table(name = "avatar")
public class Avatar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_avatar")
    private int idAvatar;
    private String link;

    public Avatar(String link) {
        this.link = link;
    }

    public Avatar() {
    }

    public int getIdAvatar() {
        return idAvatar;
    }

    public void setIdAvatar(int idAvatar) {
        this.idAvatar = idAvatar;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Avatar{" +
                "idAvatar=" + idAvatar +
                ", link='" + link + '\'' +
                '}';
    }
}
