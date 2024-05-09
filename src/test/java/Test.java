import java.sql.SQLException;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) {
        try {
            test.java.DatabaseTest.CheckConnection();

        } catch (SQLException e) {
            System.out.println("Database Not connected");
        }
    }
}
