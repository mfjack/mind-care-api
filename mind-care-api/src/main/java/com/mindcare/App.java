package com.mindcare;

import com.mindcare.model.Psychologist;

public class App {
    public static void main(String[] args) {
        Psychologist psychologist = new Psychologist(
                "Jéssica Mindas",
                "jessica@jessica.com",
                "123456",
                "22 997823207",
                "CRP 06/123456",
                "Psicóloga Clínica",
                "Especialista em TCC",
                50,
                150.0);

        System.out.println("Name: " + psychologist.getName());
        System.out.println("License: " + psychologist.getLicenseNumber());
        System.out.println("Specialty: " + psychologist.getSpecialty());
        System.out.println("Bio: " + psychologist.getBio());
        System.out.println("Session Duration: " + psychologist.getSessionDuration() + " min");
        System.out.println("Session Price: R$ " + psychologist.getSessionPrice());
    }
}
