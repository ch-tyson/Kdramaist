package dev.ch_tys.kdramas;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KdramaRepository extends MongoRepository<Kdrama, ObjectId> {
    
}
