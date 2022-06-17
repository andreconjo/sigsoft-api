package com.andreconjo.sigsoft.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "Node")
public class Node {

    @Id
    private Long id;
    private Integer x;
    private Integer y;
    private String type;
    private boolean priority;
    private String label;
    private String topic;
    private String satisfact;

    public Node() {
    }

    public Node(Long id, Integer x, Integer y, String type, boolean priority, String label, String topic, String satisfact) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.type = type;
        this.priority = priority;
        this.label = label;
        this.topic = topic;
        this.satisfact = satisfact;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getSatisfact() {
        return satisfact;
    }

    public void setSatisfact(String satisfact) {
        this.satisfact = satisfact;
    }
}
