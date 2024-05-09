package test.java;

import java.lang.String;
import java.sql.*;


public class DatabaseTest {
    private static final String url = "jdbc:mysql://localhost:3306/doctorreservationdatabase";
    private static final String username = "root";
    private static final String password = "A231051mmed";


    public static void CheckConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(url, username, password);

        String sql ="SELECT * FROM User";

        Statement stmt = connection.createStatement();



        ResultSet result =  stmt.executeQuery(sql);

        while(result.next()){
            System.out.printf("%d, %s, %s, %s, %s, %s, %s\n"
                    ,result.getInt("UserID")
                    ,result.getString("FirstName")
                    ,result.getString("LastName")
                    ,result.getDate("DOB").toString()
                    ,result.getString("Email")
                    ,result.getString("Phone")
                    ,result.getString("Password"));

        }

        System.out.println("Connected");

        connection.close();
    }

}
