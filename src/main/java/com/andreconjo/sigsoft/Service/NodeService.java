package com.andreconjo.sigsoft.Service;

import com.andreconjo.sigsoft.Model.Node;
import com.andreconjo.sigsoft.Repository.NodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NodeService {

    @Autowired
    NodeRepository nodeRepository;

    public List<Node> saveAll(List<Node> nodes){
        return nodeRepository.saveAll(nodes);
    }

    public Node save(Node node){
        return nodeRepository.save(node);
    }

    public Node getOne(Long id, Long sceneId) {
        return nodeRepository.findById(id).get();
    }
}
