package dev.ch_tys.kdramaist.kdramas;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "kdramas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Kdrama {
    @Id
    private ObjectId _id;
    private String imdbId;
    private String name;
    private String releaseDate;
    private String trailer;
    private String poster;
    private List<String> backdrops;
    private List<String> genre;
    @DocumentReference
    private List<Review> reviews;

    public Kdrama(String imdbId, String name, String releaseDate, String trailer, String poster, List<String> backdrops, List<String> genre) {
        this.imdbId = imdbId;
        this.name = name;
        this.releaseDate = releaseDate;
        this.trailer = trailer;
        this.poster = poster;
        this.backdrops = backdrops;
        this.genre = genre;
    }
}
