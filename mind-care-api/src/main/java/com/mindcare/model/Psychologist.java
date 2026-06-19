package com.mindcare.model;

public class Psychologist extends User {
    private String licenseNumber;
    private String specialty;
    private String bio;
    private int sessionDuration;
    private double sessionPrice;

    public Psychologist(String name, String email, String password, String phone, String licenseNumber,
            String specialty, String bio, int sessionDuration, double sessionPrice) {
        super(name, email, password, phone);
        this.licenseNumber = licenseNumber;
        this.specialty = specialty;
        this.bio = bio;
        this.sessionDuration = sessionDuration;
        this.sessionPrice = sessionPrice;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getBio() {
        return bio;
    }

    public int getSessionDuration() {
        return sessionDuration;
    }

    public double getSessionPrice() {
        return sessionPrice;
    }
}
