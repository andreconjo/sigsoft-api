package com.andreconjo.sigsoft.Model.DTO;

import java.util.List;

public class SceneDTO {

    private Long id;
    private Integer centerX;
    private Integer centerY;
    private Integer scale;
    private List<NodeDTO> nodes;
    private List<LinkDTO> links;

    public SceneDTO() {
    }

    public SceneDTO(Integer centerX, Integer centerY, Integer scale, List<NodeDTO> nodes, List<LinkDTO> links) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.scale = scale;
        this.nodes = nodes;
        this.links = links;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<NodeDTO> getNodes() {
        return nodes;
    }

    public void setNodes(List<NodeDTO> nodes) {
        this.nodes = nodes;
    }

    public List<LinkDTO> getLinks() {
        return links;
    }

    public void setLinks(List<LinkDTO> links) {
        this.links = links;
    }

    @Override
    public String toString() {
        return "SceneDTO{" +
                "id=" + id +
                ", centerX=" + centerX +
                ", centerY=" + centerY +
                ", scale=" + scale +
                ", nodes=" + nodes +
                ", links=" + links +
                '}';
    }
}
