package org.DoctorReservationSystem.domain;

import java.sql.Date;

public class Doctor extends User{
    private String specialization;

    public Doctor(int id, String firstName, String lastName, Date date, String email, String phone, String password, String specialization) {
        super(id, firstName, lastName, date, email, phone, password);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
