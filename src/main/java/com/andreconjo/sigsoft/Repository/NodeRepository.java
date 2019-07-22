package com.andreconjo.sigsoft.Repository;

import com.andreconjo.sigsoft.Model.Node;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeRepository extends MongoRepository<Node, Long> {

}
