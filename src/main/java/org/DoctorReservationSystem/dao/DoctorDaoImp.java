package org.DoctorReservationSystem.dao;

import org.DoctorReservationSystem.domain.Doctor;
import org.DoctorReservationSystem.domain.Patient;
import org.DoctorReservationSystem.exceptions.DoctorReservationException;
import org.DoctorReservationSystem.sql.Database;

import java.sql.*;
import java.util.ArrayList;

public class DoctorDaoImp implements DoctorDao{
    @Override
    public Doctor getById(int id) throws DoctorReservationException {
        Doctor doctor = null;

        String sql = "SELECT * From User\n" +
                "JOIN Doctor ON User.UserId = Doctor.DoctorID\n" +
                "WHERE UserID = ?";

        try (Connection connection = Database.connect();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1,id);

            ResultSet result = stmt.executeQuery();

            result.next();

            doctor = new Doctor(
                    result.getInt("UserID"),
                    result.getString("FirstName"),
                    result.getString("LastName"),
                    result.getDate("DOB"),
                    result.getString("Email"),
                    result.getString("Phone"),
                    result.getString("Password"),
                    result.getString("Specialization")
            );

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

        return doctor;
    }

    @Override
    public void add(Doctor item) throws DoctorReservationException {
        String addInUser = "INSERT INTO User (FirstName, LastName, DOB, Email, Phone, Password)\n" +
                "VALUES \n" +
                "    (?, ?, ?, ?, ?, ?)";

        String addInPatient = "INSERT INTO Doctor (DoctorID, Specialization)\n" +
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

            stmt1.setInt(1,result.getInt(1));
            stmt1.setString(2,item.getSpecialization());

            stmt1.executeUpdate();

        }catch (SQLException sqle){
            sqle.printStackTrace();
        }
    }

    @Override
    public void update(Doctor item) throws DoctorReservationException {
        String updateUser = "UPDATE User\n" +
                "SET FirstName = ?,\n" +
                "LastName = ?,\n" +
                "DOB = ?,\n" +
                "Email = ?,\n" +
                "Phone = ?,\n" +
                "Password = ?\n" +
                "WHERE UserID = ?";

        String updatePatient = "UPDATE Doctor\n" +
                "SET Specialization = ?\n" +
                "WHERE DoctorID = ?";


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

            stmt1.setString(1, item.getSpecialization());
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

        String removeFromPatient = "DELETE FROM Doctor\n" +
                "WHERE DoctorID = ?";

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
    public int getByName(String Name) {
        return 0;
    }

    @Override
    public ArrayList<Doctor> fetchDoctors() {
        ArrayList<Doctor> doctors = null;

        try (Connection connection = Database.connect();
             Statement stmt = connection.createStatement()) {
            String sql = "SELECT * From User\n" +
                    "JOIN Doctor ON User.UserId = Doctor.DoctorID;";

            ResultSet result = stmt.executeQuery(sql);
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

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return doctors;
    }
}
