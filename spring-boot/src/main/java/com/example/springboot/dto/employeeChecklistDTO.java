package com.example.springboot.dto;


public class employeeChecklistDTO {



    private long id;
    private long employeeid;
    private String isChecked;
    private String description;
    private String timedropdown;
    private long cltid;

    public employeeChecklistDTO(long id, long employeeid, String isChecked, String description, String timedropdown, long clt) {
        this.id = id;
        this.employeeid = employeeid;
        this.isChecked = isChecked;
        this.description = description;
        this.timedropdown = timedropdown;
        this.cltid = clt;
    }
    public long getCltid() {
        return cltid;
    }

    public void setCltid(long cltid) {
        this.cltid = cltid;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(long employeeid) {
        this.employeeid = employeeid;
    }

    public String getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(String isChecked) {
        this.isChecked = isChecked;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public String getTimedropdown() {
        return timedropdown;
    }

    public void setTimedropdown(String timedropdown) {
        this.timedropdown = timedropdown;
    }
}
