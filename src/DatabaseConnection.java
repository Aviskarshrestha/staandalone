import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DatabaseConnection {
    public static void main(String[] args) {
        String jdbcurl = "jdbc:mysql://localhost:3306/testdb";
        String dbUser = "root";
        String dbpassword = "Avishkar@2004";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(jdbcurl, dbUser, dbpassword);
            System.out.println("Connection Established");
            String insertSQL = "insert into user(name,email) values(?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
            preparedStatement.setString(1, "diego");
            preparedStatement.setString(1, "diego@fifa.com");

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }
            String selectSQL = "SELECT * FROM users";
            PreparedStatement selectStatement = connection.prepareStatement(selectSQL);
            ResultSet resultSet = selectStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");

                System.out.println("User ID: " + id + ", Name: " + name + ", Email: " + email);
            }


        } catch (Exception e) {
            System.out.println("An error occurred while connecting to the database.");
            e.printStackTrace();

        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }

        }
    }
}