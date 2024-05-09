package org.DoctorReservationSystem.dao;

import org.DoctorReservationSystem.domain.Patient;
import org.DoctorReservationSystem.domain.Reservation;

import java.util.ArrayList;

public interface ReservationDao extends Dao<Reservation>{
    ArrayList<Reservation> fetchReservations();

    ArrayList<Reservation> fetchReservationForPatient(Patient patient);
}
