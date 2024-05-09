package org.DoctorReservationSystem.domain;

import java.sql.Date;

public class Patient extends User{
    private String illness;

    public Patient(int id, String firstName, String lastName, Date date, String email, String phone, String password, String illness) {
        super(id, firstName, lastName, date, email, phone, password);
        this.illness = illness;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }
}
