package com.example.springboot.dto;

import com.example.springboot.model.CLT;
import com.example.springboot.model.timeframe;

public class ItemCLTDTO {
    private long id;
    private String description;
    private CLT cltid;
    private timeframe timeframeid;
    private String active;
    public long getId() {
        return id;
    }

    public ItemCLTDTO(long id, String description, CLT cltid, timeframe timeframeid, String active) {
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
