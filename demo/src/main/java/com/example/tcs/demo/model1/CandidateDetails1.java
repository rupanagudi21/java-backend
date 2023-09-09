package com.example.tcs.demo.model1;

public class CandidateDetails1 {
    String name;
    String email;
    String PhoneNumber;
    String Technology;
    String password;
    int id;

    public CandidateDetails1(String name, String email, String phoneNumber, String technology, String password, int id) {
        this.name = name;
        this.email = email;
        PhoneNumber = phoneNumber;
        Technology = technology;
        this.password = password;
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getTechnology() {
        return Technology;
    }

    public void setTechnology(String technology) {
        Technology = technology;
    }
}
