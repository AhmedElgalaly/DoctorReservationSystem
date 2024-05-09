package org.DoctorReservationSystem.dao;

import org.DoctorReservationSystem.domain.Clinic;
import org.DoctorReservationSystem.domain.Doctor;

import java.util.ArrayList;

public interface DoctorDao extends Dao<Doctor> {

    int getByName(String Name);

    ArrayList<Doctor> fetchDoctors();

}
