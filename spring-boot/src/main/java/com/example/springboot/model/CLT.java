package com.example.springboot.model;

import com.example.springboot.dto.CLTDTO;

import javax.persistence.*;


@Entity
@Table(name="CLT")
public class CLT {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "description", nullable = false)
    private String description;



    @Column(name = "type", nullable = false)
    private String type;
    public CLT(){}
    public CLT(long id, String description, String type) {
        this.id = id;
        this.description = description;
        this.type = type;
    }

    public CLT(CLTDTO ctldo) {
        this.id = ctldo.getId();
        this.description = ctldo.getDescription();
        this.type = ctldo.getType();
    }
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
