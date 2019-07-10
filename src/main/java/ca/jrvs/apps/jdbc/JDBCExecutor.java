package ca.jrvs.apps.jdbc;

import java.net.ConnectException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.util.Properties;

public class JDBCExecutor {
    public static void main(String... args) {
        System.out.println("This is JDBC project");
        DatabaseConnectionManager dcm = new DatabaseConnectionManager("localhost",
               "hplussport","postgres","password");
        try{
            Connection connection = dcm.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select COUNT(*) FROM CUSTOMER");
            while(resultSet.next()) {
                System.out.println(resultSet.getInt(1));
            }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }



