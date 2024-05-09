package org.DoctorReservationSystem.domain;

import java.sql.Timestamp;
import java.util.Date;

public class Reservation {
    private int reservationId;
    private Patient patient;
    private Doctor doctor;
    private Clinic clinic;
    private Timestamp ReservationDateAndTime;
    private String Reason;


    public Reservation(int reservationId, Patient patient, Doctor doctor, Clinic clinic, Timestamp reservationDateAndTime, String reason) {
        this.reservationId = reservationId;
        this.patient = patient;
        this.doctor = doctor;
        this.clinic = clinic;
        ReservationDateAndTime = reservationDateAndTime;
        Reason = reason;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

    public Timestamp getReservationDateAndTime() {
        return ReservationDateAndTime;
    }

    public void setReservationDateAndTime(Timestamp reservationDateAndTime) {
        ReservationDateAndTime = reservationDateAndTime;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }
}
