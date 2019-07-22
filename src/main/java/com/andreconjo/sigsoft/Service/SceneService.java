package com.andreconjo.sigsoft.Service;

import com.andreconjo.sigsoft.Model.DTO.LinkDTO;
import com.andreconjo.sigsoft.Model.DTO.NodeDTO;
import com.andreconjo.sigsoft.Model.DTO.SceneDTO;
import com.andreconjo.sigsoft.Model.Link;
import com.andreconjo.sigsoft.Model.Node;
import com.andreconjo.sigsoft.Model.Scene;
import com.andreconjo.sigsoft.Repository.LinkRepository;
import com.andreconjo.sigsoft.Repository.SceneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SceneService {

    @Autowired
    SceneRepository sceneRepository;

    @Autowired
    NodeService nodeService;

    @Autowired
    LinkService linkService;

    public Scene save(Scene scene){

//        scene.setCenterX(sceneDTO.getCenterX());
//        scene.setCenterY(sceneDTO.getCenterY());
//        scene.setScale(sceneDTO.getScale());
//
//        List<Node> nodeList = new ArrayList<>();
//        sceneDTO.getNodes().stream().forEach(nodeDTO -> {
//           Node node = new Node();
//           node.setId(nodeDTO.getId());
//           node.setLabel(nodeDTO.getLabel());
//           node.setPriority(nodeDTO.isPriority());
//           node.setTopic(nodeDTO.getTopic());
//           node.setX(nodeDTO.getX());
//           node.setY(nodeDTO.getY());
//
//           nodeList.add(nodeService.save(node));
//        });
//
//        scene.setNodes(nodeList);
//
//        List<Link> links = new ArrayList<>();
//        sceneDTO.getLinks().stream().forEach(linkDTO -> {
//            Link link = new Link();
//            link.setId(linkDTO.getId());
//            link.setFrom(nodeService.getOne(linkDTO.getFrom()));
//            link.setTo(nodeService.getOne(linkDTO.getTo()));
//            link.setType(linkDTO.getType());
//
//            links.add(link);
//        });
//
//        scene.setLinks(links);


        System.out.println(scene.toString());
        return sceneRepository.save(scene);
    }

    public List<Scene> getAll() {
        return sceneRepository.findAll();
    }


    public Scene get(String id){
        return sceneRepository.findById(id).get();
    }
}
