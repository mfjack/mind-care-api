package com.mindcare.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
    private Patient patient;
    private Psychologist psychologist;
    private LocalDate date;
    private LocalTime time;
    private AppointmentStatus status;

    public Appointment(Patient patient, Psychologist psychologist, LocalDate date, LocalTime time) {
        this.patient = patient;
        this.psychologist = psychologist;
        this.date = date;
        this.time = time;
        this.status = AppointmentStatus.SCHEDULED;
    }  

    public void cancel() {
        if (status == AppointmentStatus.CANCELLED) {
            System.out.println("Está consulta já está cancelada.");
        } else {
            status = AppointmentStatus.CANCELLED;
            System.out.println("Consulta cancelada com sucesso.");
        }
    }

    public void confirm() {
        if (status == AppointmentStatus.CANCELLED) {
            System.out.println("Não é possível confirmar uma consulta cancelada.");
        } else {
            status = AppointmentStatus.CONFIRMED;
            System.out.println("Consulta confirmada com sucesso.");
        }
    }

    public Patient getPatient() {
        return patient;
    }

    public Psychologist getPsychologist() {
        return psychologist;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public AppointmentStatus getStatus() {
        return status;
    }
}
