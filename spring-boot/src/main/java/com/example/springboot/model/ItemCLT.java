package com.example.springboot.model;


import com.example.springboot.dto.ItemCLTDTO;

import javax.persistence.*;

@Entity
@Table(name = "ItemCLT")
public class ItemCLT {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "description", nullable = false)
    private String description;

    //this is a foreign key
    @ManyToOne
    @JoinTable(name = "CLT", joinColumns = @JoinColumn(name = "id", referencedColumnName = "id"))
    private CLT cltid;

    //this is a foreign key
    @ManyToOne
    @JoinTable(name = "timeframe", joinColumns = @JoinColumn(name = "id", referencedColumnName = "id"))
    private timeframe timeframeid;

    @Column(name = "active", nullable = false)
    private String active;

    public ItemCLT() {
    }

    public ItemCLT(ItemCLTDTO dto) {
        this.id = dto.getId();
        this.description = dto.getDescription();
        this.cltid = dto.getCltid();
        this.timeframeid = dto.getTimeframeid();
        this.active = dto.getActive();
    }

    public ItemCLT(long id, String description, CLT cltid, timeframe timeframeid, String active) {
        this.id = id;
        this.description = description;
        this.cltid = cltid;
        this.timeframeid = timeframeid;
        this.active = active;
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

    public CLT getCltid() {
        return cltid;
    }

    public void setCltid(CLT cltid) {
        this.cltid = cltid;
    }

    public timeframe getTimeframeid() {
        return timeframeid;
    }

    public void setTimeframeid(timeframe timeframeid) {
        this.timeframeid = timeframeid;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
