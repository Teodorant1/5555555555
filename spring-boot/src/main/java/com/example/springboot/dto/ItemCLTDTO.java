package com.example.springboot.dto;

import com.example.springboot.model.CLT;
import com.example.springboot.model.timeframe;

public class ItemCLTDTO {
    private long id;
    private String description;
    private long cltid;
    private long timeframeid;
    private String active;
    public long getId() {
        return id;
    }

    public ItemCLTDTO(long id, String description, long cltid, long timeframeid, String active) {
        this.id = id;
        this.description = description;
        this.cltid = cltid;
        this.timeframeid = timeframeid;
        this.active = active;
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

    public long getCltid() {
        return cltid;
    }

    public void setCltid(long cltid) {
        this.cltid = cltid;
    }

    public long getTimeframeid() {
        return timeframeid;
    }

    public void setTimeframeid(long timeframeid) {
        this.timeframeid = timeframeid;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
