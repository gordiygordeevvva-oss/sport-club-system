package com.example.sportclub.model;

public class Trainer {

    private Long id;
    private String fullName;
    private String specialization;
    private String phone;

    public Trainer(Long id, String fullName, String specialization, String phone) {
        this.id = id;
        this.fullName = fullName;
        this.specialization = specialization;
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public String getSpecialization() {
        return specialization;
    }
}
