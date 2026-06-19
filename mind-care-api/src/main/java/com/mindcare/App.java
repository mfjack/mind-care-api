package com.mindcare;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.mindcare.model.Appointment;
import com.mindcare.model.Patient;
import com.mindcare.model.Psychologist;
import com.mindcare.service.AppointmentService;

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

        Patient patient = new Patient(
                "Marlon",
                "jack@jack.com",
                "coxinha123",
                "22997823207");

        LocalDate date = LocalDate.of(2026, 6, 25);
        LocalTime time = LocalTime.of(14, 30);
        LocalDate date2 = LocalDate.of(2027, 6, 25);
        LocalTime time2 = LocalTime.of(14, 30);

        Appointment appointment = new Appointment(patient, psychologist, date, time);
        Appointment appointment2 = new Appointment(patient, psychologist, date2, time2);

        System.out.println("Status: " + appointment.getStatus());
        appointment.cancel();
        appointment.confirm();

        AppointmentService appointmentService = new AppointmentService();
        appointmentService.addAppointment(appointment);
        appointmentService.addAppointment(appointment2);
        appointmentService.listAllAppointments();

        List<Appointment> jessicaAppointments = appointmentService.findByPsychologist(psychologist);
        System.out.println("Consultas da Jéssica");

        for (Appointment a : jessicaAppointments) {
            System.out.println(a.getDate() + " as " + a.getTime());
        }

        List<Appointment> patientJessica = appointmentService.findByPatient(patient);
        System.out.println("Pacientes de Jéssica");

        for (Appointment a : patientJessica) {
            System.out.println(a.getPatient().getName());
        }

        patient.notify("Sua consulta foi confirmada!");
        psychologist.notify("Você tem uma nova consulta agendada!");

        appointmentService.notifyParticipants(appointment, "Fulano, sua consulta está marcada");
    }
}
