package org.DoctorReservationSystem.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static String url = "jdbc:mysql://localhost:3306/doctorreservationdatabase";
    private static String username = "root";
    private static String password = "A231051mmed";

    public static Connection connect()throws SQLException {
        return DriverManager.getConnection(url,username,password);
    }

    public static Connection connect(String url, String username, String password) throws SQLException{
        return DriverManager.getConnection(url,username,password);
    }
}
