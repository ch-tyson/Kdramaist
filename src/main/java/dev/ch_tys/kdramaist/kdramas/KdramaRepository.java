package dev.ch_tys.kdramaist.kdramas;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KdramaRepository extends MongoRepository<Kdrama, ObjectId> {
    Optional<Kdrama> findKdramaByImdbId(String imdbId);
}