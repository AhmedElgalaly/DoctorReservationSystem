package org.DoctorReservationSystem.dao;

import org.DoctorReservationSystem.domain.Patient;
import org.DoctorReservationSystem.domain.Reservation;
import org.DoctorReservationSystem.exceptions.DoctorReservationException;
import org.DoctorReservationSystem.sql.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

public class ReservationDaoImp implements ReservationDao{
    @Override
    public Reservation getById(int id) throws DoctorReservationException {
        Reservation reservation = null;

        String geReservationByIdSQL = "SELECT ReservationID, PatientID, DoctorID, ClinicID, ReservationDateTime, Reason \n" +
                "FROM Reservation \n" +
                "WHERE Reservation.ReservationID = ?";

        try(Connection connection = Database.connect();
            PreparedStatement stmt = connection.prepareStatement(geReservationByIdSQL)){

            stmt.setInt(1,id);

            PatientDaoImp patientDaoImp = new PatientDaoImp();
            DoctorDaoImp doctorDaoImp = new DoctorDaoImp();
            ClinicDaoImp clinicDaoImp = new ClinicDaoImp();

            ResultSet result = stmt.executeQuery();

            reservation = new Reservation(
                    result.getInt("ReservationID"),
                    patientDaoImp.getById(result.getInt("PatientID")),
                    doctorDaoImp.getById(result.getInt("DoctorID")),
                    clinicDaoImp.getById(result.getInt("ClinicID")),
                    result.getTimestamp("ReservationDateTime"),
                    result.getString("Reason")
            );

        }catch (SQLException sqle){
            sqle.printStackTrace();
        }

        return  reservation;
    }

    @Override
    public void add(Reservation item) throws DoctorReservationException {
        String sql = "INSERT INTO Reservation (PatientID, DoctorID, ClinicID, ReservationDateTime, Reason)\n" +
                "VALUES \n" +
                "    (?, ?, ?, ?, ?)";

        try(Connection connection = Database.connect();
            PreparedStatement stmt = connection.prepareStatement(sql)){

            stmt.setInt(1,item.getPatient().getId());
            stmt.setInt(2,item.getDoctor().getId());
            stmt.setInt(3,item.getClinic().getClinicId());
            stmt.setTimestamp(4,item.getReservationDateAndTime());
            stmt.setString(5,item.getReason());

            stmt.executeUpdate();
        }catch (SQLException sqle){
            sqle.printStackTrace();
        }

    }

    @Override
    public void update(Reservation item) throws DoctorReservationException {

    }

    @Override
    public void delete(int id) throws DoctorReservationException {
        String sql = "DELETE FROM Reservation\n" +
                "WHERE ReservationID = ?";

        try(Connection connection = Database.connect();
            PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setInt(1,id);
            stmt.executeUpdate();
        }catch (SQLException sqle){
            sqle.printStackTrace();
        }
    }

    @Override
    public ArrayList<Reservation> fetchReservations() {
        ArrayList<Reservation> reservations = null;

        String geReservationsSQL = "SELECT * \n" +
                "FROM Reservation";

        try(Connection connection = Database.connect();
            Statement stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery(geReservationsSQL);){

            PatientDaoImp patientDaoImp = new PatientDaoImp();
            DoctorDaoImp doctorDaoImp = new DoctorDaoImp();
            ClinicDaoImp clinicDaoImp = new ClinicDaoImp();

            reservations = new ArrayList<>();

            while (result.next()) {
                reservations.add(new Reservation(
                        result.getInt("ReservationID"),
                        patientDaoImp.getById(result.getInt("PatientID")),
                        doctorDaoImp.getById(result.getInt("DoctorID")),
                        clinicDaoImp.getById(result.getInt("ClinicID")),
                        result.getTimestamp("ReservationDateTime"),
                        result.getString("Reason")
                ));
            }

        }catch (SQLException sqle){
            sqle.printStackTrace();
        }

        return reservations;
    }

    @Override
    public ArrayList<Reservation> fetchReservationForPatient(Patient patient) {
        ArrayList<Reservation> reservations = null;

        String geReservationsSQL = "SELECT * \n" +
                "FROM Reservation\n" +
                "WHERE PatientID = ?";

        try(Connection connection = Database.connect();
            PreparedStatement stmt = connection.prepareStatement(geReservationsSQL)){

            stmt.setInt(1,patient.getId());

            ResultSet result = stmt.executeQuery();

            PatientDaoImp patientDaoImp = new PatientDaoImp();
            DoctorDaoImp doctorDaoImp = new DoctorDaoImp();
            ClinicDaoImp clinicDaoImp = new ClinicDaoImp();

            reservations = new ArrayList<>();

            while (result.next()) {
                reservations.add(new Reservation(
                        result.getInt("ReservationID"),
                        patientDaoImp.getById(result.getInt("PatientID")),
                        doctorDaoImp.getById(result.getInt("DoctorID")),
                        clinicDaoImp.getById(result.getInt("ClinicID")),
                        result.getTimestamp("ReservationDateTime"),
                        result.getString("Reason")
                ));
            }

        }catch (SQLException sqle){
            sqle.printStackTrace();
        }

        return reservations;
    }
}
