package com.andreconjo.sigsoft.Service;


import com.andreconjo.sigsoft.Model.Link;
import com.andreconjo.sigsoft.Repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkService {

    @Autowired
    LinkRepository linkRepository;

    public Link save(Link link) {
        return linkRepository.save(link);
    }

    public Link getOne(Long id) {
        return linkRepository.findById(id).get();
    }

    public Link findByTo(Long id) {
        return linkRepository.findByTo(id);
    }

    public Link findByFrom(Long id) {
        return linkRepository.findByTo(id);
    }
}
