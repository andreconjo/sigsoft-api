package com.andreconjo.sigsoft.Model.DTO;


public class NodeDTO {

    private Integer id;
    private Integer x;
    private Integer y;
    private String type;
    private boolean priority;
    private String label;
    private String topic;
    private String satisfact;

    public NodeDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
