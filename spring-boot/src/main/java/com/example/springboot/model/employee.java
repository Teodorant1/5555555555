package com.example.springboot.model;


import com.example.springboot.dto.employeeDTO;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class employee {
    public employee(){}
    public employee(long id, String firstname, String lastname, String email, long SSNUMBER, long phonenumber, String education) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.SSNUMBER = SSNUMBER;
        this.phonenumber = phonenumber;
        this.education = education;
    }
    public employee(employeeDTO dto) {
        this.id = dto.getId();
        this.firstname =dto.getFirstname();
        this.lastname =dto.getLastname();
        this.email = dto.getEmail();
        this.SSNUMBER = dto.getSSNUMBER();
        this.education = dto.getEducation();
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first name", nullable = false)
    private String firstname;
    @Column(name = "lastname", nullable = false)
    private String lastname;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "SSNUMBER", nullable = false)
    private long SSNUMBER;

    @Column(name = "phonenumber", nullable = false)
    private long phonenumber;
    @Column(name = "education", nullable = false)
    private String education;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getSSNUMBER() {
        return SSNUMBER;
    }

    public void setSSNUMBER(long SSNUMBER) {
        this.SSNUMBER = SSNUMBER;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

}
