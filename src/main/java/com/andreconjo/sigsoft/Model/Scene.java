package com.andreconjo.sigsoft.Model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Generated;
import java.util.List;

@Document("Scene")
public class Scene {

    @Id
    private String id;
    private String alias;
    private Integer centerX;
    private Integer centerY;
    private Integer scale;
    private List<Node> nodes;
    private List<Link> links;
    private List<String> conflicts;

    public Scene() {
    }

    public Scene(String id, String alias, Integer centerX, Integer centerY, Integer scale,
                 List<Node> nodes, List<Link> links, List<String> conflicts) {
        this.id = id;
        this.alias = alias;
        this.centerX = centerX;
        this.centerY = centerY;
        this.scale = scale;
        this.nodes = nodes;
        this.links = links;
        this.conflicts = conflicts;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Integer getCenterX() {
        return centerX;
    }

    public void setCenterX(Integer centerX) {
        this.centerX = centerX;
    }

    public Integer getCenterY() {
        return centerY;
    }

    public void setCenterY(Integer centerY) {
        this.centerY = centerY;
    }

    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public List<String> getConflicts() {
        return conflicts;
    }

    public void setConflicts(List<String> conflicts) {
        this.conflicts = conflicts;
    }
}
