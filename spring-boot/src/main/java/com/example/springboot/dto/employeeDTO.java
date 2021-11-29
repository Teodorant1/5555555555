package com.example.springboot.dto;

public class employeeDTO {


    private long id;
    private String firstname;
    private String lastname;
    private String email;
    private long SSNUMBER;
    private long phonenumber;
    private String education;

    public employeeDTO(long id, String firstname, String lastname, String email, long SSNUMBER, long phonenumber, String education) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.SSNUMBER = SSNUMBER;
        this.phonenumber = phonenumber;
        this.education = education;
    }

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

    public void setSSNUMBER(int SSNUMBER) {
        this.SSNUMBER = SSNUMBER;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
