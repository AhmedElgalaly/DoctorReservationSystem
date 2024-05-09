package org.DoctorReservationSystem.dao;

import org.DoctorReservationSystem.domain.Patient;
import org.DoctorReservationSystem.exceptions.DoctorReservationException;
import org.DoctorReservationSystem.sql.Database;

import java.sql.*;
import java.util.ArrayList;

public class PatientDaoImp implements PatientDao {

    @Override
    public Patient getById(int id) throws DoctorReservationException {

        Patient patient = null;
        String sql = "SELECT * From User\n" +
                "JOIN Patient ON User.UserId = Patient.PatientID\n" +
                "WHERE UserID = ?";

        try (Connection connection = Database.connect();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setInt(1,id);

            ResultSet result = stmt.executeQuery();

            result.next();

                patient = new Patient(
                        result.getInt("UserID"),
                        result.getString("FirstName"),
                        result.getString("LastName"),
                        result.getDate("DOB"),
                        result.getString("Email"),
                        result.getString("Phone"),
                        result.getString("Password"),
                        result.getString("Illness")
                );

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

        return patient;
    }

    @Override
    public void add(Patient item) throws DoctorReservationException {
        String addInUser = "INSERT INTO User (FirstName, LastName, DOB, Email, Phone, Password)\n" +
                "VALUES \n" +
                "    (?, ?, ?, ?, ?, ?)";

        String addInPatient = "INSERT INTO Patient (PatientID, Illness)\n" +
                "VALUES \n" +
                "    (?, ?)";

        try(Connection connection = Database.connect();
            PreparedStatement stmt = connection.prepareStatement(addInUser,Statement.RETURN_GENERATED_KEYS);
            PreparedStatement stmt1 = connection.prepareStatement(addInPatient)){

            stmt.setString(1,item.getFirstName());
            stmt.setString(2,item.getLastName());
            stmt.setDate(3,item.getDate());
            stmt.setString(4,item.getEmail());
            stmt.setString(5,item.getPhone());
            stmt.setString(6,item.getPassword());

            stmt.executeUpdate();

            ResultSet result = stmt.getGeneratedKeys();

            result.next();
            stmt1.setInt(1,result.getInt(1));
            stmt1.setString(2,item.getIllness());

            stmt1.executeUpdate();

        }catch (SQLException sqle){
            sqle.printStackTrace();
        }

    }


    @Override
    public void update(Patient item) throws DoctorReservationException {
        String updateUser = "UPDATE User\n" +
                "SET FirstName = ?,\n" +
                "LastName = ?,\n" +
                "DOB = ?,\n" +
                "Email = ?,\n" +
                "Phone = ?,\n" +
                "Password = ?\n" +
                "WHERE UserID = ?";

        String updatePatient = "UPDATE Patient\n" +
                "SET Illness = ?\n" +
                "WHERE PatientID = ?";


        try (Connection connection = Database.connect();
             PreparedStatement stmt = connection.prepareStatement(updateUser);
             PreparedStatement stmt1 = connection.prepareStatement(updatePatient)) {
            stmt.setString(1, item.getFirstName());
            stmt.setString(2, item.getLastName());
            stmt.setDate(3, item.getDate());
            stmt.setString(4, item.getEmail());
            stmt.setString(5, item.getPhone());
            stmt.setString(6, item.getPassword());
            stmt.setInt(7, item.getId());

            stmt1.setString(1, item.getIllness());
            stmt1.setInt(2, item.getId());

            stmt.executeUpdate();
            stmt1.executeUpdate();




        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    @Override
    public void delete(int id) throws DoctorReservationException {
        String removeFromUser = "DELETE FROM User\n" +
                "WHERE UserID = ?";

        String removeFromPatient = "DELETE FROM Patient\n" +
                "WHERE PatientID = ?";

        try (Connection connection = Database.connect();
             PreparedStatement stmt = connection.prepareStatement(removeFromUser);
             PreparedStatement stmt1 = connection.prepareStatement(removeFromPatient)) {

            stmt.setInt(1, id);
            stmt1.setInt(1, id);

            stmt.executeUpdate();
            stmt1.executeUpdate();

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    @Override
    public int getByName(String name) {
        return 0;
    }

    @Override
    public ArrayList<Patient> fetchPatients() {
        ArrayList<Patient> patients = null;

        try (Connection connection = Database.connect();
             Statement stmt = connection.createStatement()) {
            String sql = "SELECT * From User\n" +
                    "JOIN Patient ON User.UserId = Patient.PatientID;";

            ResultSet result = stmt.executeQuery(sql);
            patients = new ArrayList<>();

            while (result.next()) {
                patients.add(new Patient(
                        result.getInt("UserID"),
                        result.getString("FirstName"),
                        result.getString("LastName"),
                        result.getDate("DOB"),
                        result.getString("Email"),
                        result.getString("Phone"),
                        result.getString("Password"),
                        result.getString("Illness")
                ));
            }

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return patients;
    }
}
