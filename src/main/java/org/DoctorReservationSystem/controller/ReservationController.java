package org.DoctorReservationSystem.controller;

import org.DoctorReservationSystem.dao.ReservationDaoImp;
import org.DoctorReservationSystem.domain.Doctor;
import org.DoctorReservationSystem.domain.Reservation;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ReservationController {
    public static boolean isAvailable(Timestamp date, Doctor doctor){
        ReservationDaoImp reservationDaoImp = new ReservationDaoImp();

        ArrayList<Reservation> reservations = reservationDaoImp.fetchReservations();

        if(reservations == null)
            return true;
        else{
            for(Reservation reservation: reservations){
                if(reservation.getReservationDateAndTime().toLocalDateTime().getYear() == date.toLocalDateTime().getYear() && date.toLocalDateTime().getYear() <= LocalDateTime.now().getYear())
                    if(reservation.getReservationDateAndTime().toLocalDateTime().getMonth().getValue() == date.toLocalDateTime().getMonth().getValue() && date.toLocalDateTime().getMonth().getValue() <= LocalDateTime.now().getMonth().getValue())
                        if(reservation.getReservationDateAndTime().toLocalDateTime().getDayOfMonth() == date.toLocalDateTime().getDayOfMonth() && date.toLocalDateTime().getDayOfMonth() <= LocalDateTime.now().getDayOfMonth())
                            if(reservation.getReservationDateAndTime().toLocalDateTime().getHour() == date.toLocalDateTime().getHour() && date.toLocalDateTime().getHour() <= LocalDateTime.now().getHour())
                                if(reservation.getDoctor().getId() == doctor.getId())
                                    return false;
            }
            return true;
        }
    }
}
