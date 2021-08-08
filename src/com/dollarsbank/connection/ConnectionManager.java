package com.dollarsbank.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    // Mac and Linux
    private static final String URL = "jdbc:mysql://localhost:3306/dollarsbank_db?serverTimezone=EST5EDT";

    // Windows
//	private static final String URL = "jdbc:mysql://localhost:3306/crud_db";

    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private static Connection connection = null;

    private static void makeConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Could not make connection to database");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        if (connection == null) {
            makeConnection();
        }

        return connection;
    }
}
