package com.example.tcs.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class CandidateDetails {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;
    String name;
    String email;
    String phoneNumber;
    String technology;
    int age;
    String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CandidateDetails(String name, String email, String phoneNumber, String technology, int age) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.technology = technology;
        this.age = age;
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
        return phoneNumber;
    }

    public CandidateDetails() {
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
