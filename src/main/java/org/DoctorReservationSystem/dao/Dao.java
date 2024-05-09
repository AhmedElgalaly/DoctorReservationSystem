package org.DoctorReservationSystem.dao;

import org.DoctorReservationSystem.exceptions.DoctorReservationException;

public interface Dao<T>{

    T getById(int id) throws DoctorReservationException;


    void add(T item) throws DoctorReservationException;

    void update(T item) throws DoctorReservationException;


    void delete(int id) throws DoctorReservationException;
}
