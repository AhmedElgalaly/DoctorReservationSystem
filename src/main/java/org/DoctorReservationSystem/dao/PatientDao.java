package org.DoctorReservationSystem.dao;

import org.DoctorReservationSystem.domain.Patient;

import java.util.ArrayList;

public interface PatientDao extends  Dao<Patient>{
    int getByName(String name);

    ArrayList<Patient> fetchPatients();


}
