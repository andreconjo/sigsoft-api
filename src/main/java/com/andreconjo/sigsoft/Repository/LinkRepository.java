package com.andreconjo.sigsoft.Repository;

import com.andreconjo.sigsoft.Model.Link;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepository extends MongoRepository<Link, Long> {

    Link findByFrom(Long id);

    Link findByTo(Long id);
}
