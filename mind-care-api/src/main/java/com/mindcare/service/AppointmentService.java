package com.mindcare.service;

import java.util.ArrayList;
import java.util.List;

import com.mindcare.model.Appointment;
import com.mindcare.model.Psychologist;

public class AppointmentService {
    private List<Appointment> appointments;

    public AppointmentService() {
        this.appointments = new ArrayList<>();
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("Consulta adicionada com sucesso.");
    }

    public void listAllAppointments() {
        for (Appointment appointment : appointments) {
            System.out.println(
                    appointment.getPatient().getName() + " a consulta agendada com " +
                            appointment.getPsychologist().getName() + " no dia " +
                            appointment.getDate() + " as " + appointment.getTime() +
                            " foi " + appointment.getStatus());
        }
    }

    public List<Appointment> findByPsychologist(Psychologist psychologist) {
        return appointments.stream()
                .filter(appointment -> appointment.getPsychologist().equals(psychologist))
                .toList();
    }
}
