package org.DoctorReservationSystem.dao;

import org.DoctorReservationSystem.domain.Clinic;
import org.DoctorReservationSystem.domain.Doctor;

import java.util.ArrayList;

public interface ClinicDao extends Dao<Clinic> {
    ArrayList<Clinic> fetchClinics();

    //ArrayList<Doctor> fetchClinicDoctors();

    ArrayList<String> fetchSpecializations(Clinic clinic);

    ArrayList<Doctor> fetchClinicDoctors(Clinic clinic);
}
