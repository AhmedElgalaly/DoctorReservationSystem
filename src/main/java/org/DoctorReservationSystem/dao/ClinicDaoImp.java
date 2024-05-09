package org.DoctorReservationSystem.dao;

import org.DoctorReservationSystem.domain.Clinic;
import org.DoctorReservationSystem.domain.Doctor;
import org.DoctorReservationSystem.exceptions.DoctorReservationException;
import org.DoctorReservationSystem.sql.Database;

import java.sql.*;
import java.util.ArrayList;

public class ClinicDaoImp implements ClinicDao{

    @Override
    public ArrayList<Clinic> fetchClinics() {
        ArrayList<Clinic> clinics = null;

        String getClinicsSQL = "SELECT * FROM Clinic";

        try(Connection connection = Database.connect();
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(getClinicsSQL)){

            clinics = new ArrayList<>();

            while(resultSet.next()){
                clinics.add(new Clinic(
                        resultSet.getInt("ClinicID"),
                        resultSet.getString("ClinicName"),
                        resultSet.getString("Location"),
                        resultSet.getString("Contact")
                ));
            }


        }catch (SQLException sqle){
            sqle.printStackTrace();
        }
        return clinics;
    }

    @Override
    public ArrayList<Doctor> fetchClinicDoctors(Clinic clinic) {
        ArrayList<Doctor> doctors = null;

        String getDoctorsByClinicSQL = "SELECT UserID, FirstName, LastName, DOB, Email, Phone, Password, Specialization From User\n" +
                "JOIN Doctor ON User.UserID = Doctor.DoctorID\n" +
                "JOIN Clinic ON Doctor.ClinicID = Clinic.ClinicID\n" +
                "WHERE Clinic.ClinicID = ?";

        try(Connection connection = Database.connect();
            PreparedStatement stmt = connection.prepareStatement(getDoctorsByClinicSQL)){

            stmt.setInt(1,clinic.getClinicId());

            ResultSet result = stmt.executeQuery();
            doctors = new ArrayList<>();

            while (result.next()) {
                doctors.add(new Doctor(
                        result.getInt("UserID"),
                        result.getString("FirstName"),
                        result.getString("LastName"),
                        result.getDate("DOB"),
                        result.getString("Email"),
                        result.getString("Phone"),
                        result.getString("Password"),
                        result.getString("Specialization")
                ));
            }

        }catch (SQLException sqle){
            sqle.printStackTrace();
        }

        return doctors;
    }

    @Override
    public ArrayList<String> fetchSpecializations(Clinic clinic) {
        ArrayList<String> specializations = null;

        String getDoctorsByClinicSQL = "SELECT Specialization From User\n" +
                "JOIN Doctor ON User.UserID = Doctor.DoctorID\n" +
                "JOIN Clinic ON Doctor.ClinicID = Clinic.ClinicID\n" +
                "WHERE Clinic.ClinicID = ?";

        try(Connection connection = Database.connect();
            PreparedStatement stmt = connection.prepareStatement(getDoctorsByClinicSQL)){

            stmt.setInt(1,clinic.getClinicId());

            ResultSet result = stmt.executeQuery();
            specializations = new ArrayList<>();

            while (result.next()) {
                specializations.add(
                        result.getString("Specialization")
                );
            }

        }catch (SQLException sqle){
            sqle.printStackTrace();
        }

        return specializations;
    }

    @Override
    public Clinic getById(int id) throws DoctorReservationException {
        Clinic clinic = null;

        String getClincByIdSQL = "SELECT * From Clinic\n" +
                "WHERE Clinic.ClinicID = ?";

        try(Connection connection = Database.connect();
            PreparedStatement stmt = connection.prepareStatement(getClincByIdSQL)){

            stmt.setInt(1,id);

            ResultSet result = stmt.executeQuery();

            result.next();

                clinic = new Clinic(
                        result.getInt("ClinicID"),
                        result.getString("ClinicName"),
                        result.getString("Location"),
                        result.getString("Contact")
                );

        }catch (SQLException sqle){
            sqle.printStackTrace();
        }

        return clinic;
    }

    @Override
    public void add(Clinic item) throws DoctorReservationException {

    }

    @Override
    public void update(Clinic item) throws DoctorReservationException {

    }

    @Override
    public void delete(int id) throws DoctorReservationException {

    }
}
