package com.example.springboot.dto;

public class CLTDTO {
    private long id;
    private String description;
    private String type;

    public CLTDTO(long id,
                        String description,
                        String type )
    {this.id=id;
        this.description=description;
        this.type=type;         }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
