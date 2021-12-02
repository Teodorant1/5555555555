package com.example.springboot.model;


import com.example.springboot.dto.employeeChecklistDTO;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="employeechecklist")
public class employeeChecklist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;



    //this is a foreign key
    @OneToOne
    @JoinColumn(name = "id")
    private employee employee;

    @Column(name = "isChecked", nullable = false)
    private String isChecked;

    @Column(name = "description", nullable = false)
    private String description;



    //this is a foreign key
    @OneToOne
    @JoinColumn(name = "cltid")
    private CLT  CLT;

    @Column(name = "timedropdown", nullable = false)
    private String timedropdown;

   public   employeeChecklist(){}
   public employeeChecklist(employeeChecklistDTO dto ) {
        this.id=dto.getId();
        this.isChecked = dto.getIsChecked();
        this.description =dto.getDescription();
        this.timedropdown =dto.getTimedropdown();
    }

    public employeeChecklist(long id, employee employee, String isChecked, String description, CLT CLT, String timedropdown) {
        this.id = id;
        this.isChecked =    isChecked;
        this.description =  description;
        this.timedropdown = timedropdown;
        this.employee = employee;
        this.CLT= CLT;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public com.example.springboot.model.employee getEmployee() {
        return employee;
    }

    public void setEmployee(com.example.springboot.model.employee employee) {
        this.employee = employee;
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

    public CLT getCLT() {
        return CLT;
    }

    public void setCLT(com.example.springboot.model.CLT CLT) {
        this.CLT = CLT;
    }

    public String getTimedropdown() {
        return timedropdown;
    }

    public void setTimedropdown(String timedropdown) {
        this.timedropdown = timedropdown;
    }




}
