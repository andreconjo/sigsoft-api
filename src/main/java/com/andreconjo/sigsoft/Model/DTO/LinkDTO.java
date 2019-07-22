package com.andreconjo.sigsoft.Model.DTO;

public class LinkDTO {

    private Long id;
    private Long to;
    private Long from;
    private String type;

    public LinkDTO() {
    }

    public LinkDTO(Long id, Long to, Long from, String type) {
        this.id = id;
        this.to = to;
        this.from = from;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
