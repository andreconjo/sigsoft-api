package com.andreconjo.sigsoft.Repository;

import com.andreconjo.sigsoft.Model.Scene;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SceneRepository extends MongoRepository<Scene, String> {
}
