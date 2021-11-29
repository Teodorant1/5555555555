package com.example.springboot.dto;

import com.example.springboot.model.CLT;
import com.example.springboot.model.employee;

public class employeeChecklistDTO {


    private long id;
    private employee employeeid;
    private String isChecked;
    private String description;
    private String timedropdown;
    private CLT clt;

    public employeeChecklistDTO(long id, employee employeeid, String isChecked, String description, String timedropdown, CLT clt) {
        this.id = id;
        this.employeeid = employeeid;
        this.isChecked = isChecked;
        this.description = description;
        this.timedropdown = timedropdown;
        this.clt= clt;
    }
    public CLT getClt() {
        return clt;
    }

    public void setClt(CLT clt) {
        this.clt = clt;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public employee getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(employee employeeid) {
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
