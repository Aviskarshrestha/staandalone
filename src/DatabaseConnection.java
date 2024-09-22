import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql .Statement;
public class DatabaseConnection{
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "Avishkar@2004";


    private static Connection connection;
    public static void main(String[] args) {
        try {
            // Open a connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the database!");

            // Example of executing a SQL query
            String sql = "INSERT INTO users (name, email) VALUES ('John Doe', 'johndoe@example.com')";
            Statement statement = connection.createStatement();
            int rowsInserted = statement.executeUpdate(sql);

            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the connection
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
}

