package org.DoctorReservationSystem.domain;

public class Clinic {
    private int clinicId;
    private String clinicName;
    private String location;
    private String contact;

    public Clinic(int clinicId, String clinicName, String location, String contact) {
        this.clinicId = clinicId;
        this.clinicName = clinicName;
        this.location = location;
        this.contact = contact;
    }

    public int getClinicId() {
        return clinicId;
    }

    public void setClinicId(int clinicId) {
        this.clinicId = clinicId;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return this.getClinicName();
    }
}
