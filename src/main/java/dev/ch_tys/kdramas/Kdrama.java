package dev.ch_tys.kdramas;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "kdramas")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Kdrama {
    @Id
    private ObjectId id;
    private String imdbId;
    private String name;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> platform;
    private List<String> backdrops;
    private List<Review> reviewIDs;


}
