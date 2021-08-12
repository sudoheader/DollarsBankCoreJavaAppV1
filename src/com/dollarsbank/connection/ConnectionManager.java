package com.dollarsbank.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dollarsbank.dao.CustomerDao;
import com.dollarsbank.model.Customer;

public abstract class ConnectionManager implements CustomerDao {

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
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        if (connection == null) {
            makeConnection();
        }

        return connection;
    }

    public int update(String userId, double balance) {
        try {
            Connection conn = getConnection();

            PreparedStatement pstmt =
                    conn.prepareStatement("update account_details set balance=? where user_name=" +"'"+ userId+"'");
            pstmt.setDouble(1, balance);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int delete(int id) {
        int status = 0;
        try {
            Connection conn = getConnection();
            PreparedStatement pstmt =
                    conn.prepareStatement("delete from usercrud where id = ?");
            pstmt.setInt(1, id);
            status = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return status;
    }

    public int save(Customer cr) {
        try {
            Connection conn = getConnection();
            List<Customer> list = getAllAccounts();
            for (Customer customer : list) {
                if(cr.getUserId().equals(customer.getUserId())) {
                    return 0;
                }
            }

            PreparedStatement pstmt =
                    conn.prepareStatement("insert into " +
                            "account_details(name, address, number, user_name, password, balance) values(?,?,?,?,?,?)");
            pstmt.setString(1, cr.getName());
            pstmt.setString(2, cr.getAddress());
            pstmt.setString(3, cr.getContact());
            pstmt.setString(4, cr.getUserId());
            pstmt.setString(5, cr.getPassword());
            pstmt.setDouble(6, cr.getAccount());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public Customer getCustomerById(int id) {
        Customer cr = new Customer();
        try {
            Connection conn = ConnectionManager.getConnection();
            PreparedStatement pstmt =
                    conn.prepareStatement("select * from user where id=?");
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            conn.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }

        return cr;
    }

    public List<Customer> getAllAccounts() {
        List<Customer> list = new ArrayList<Customer>();
        try {
            Connection conn = getConnection();
            PreparedStatement pstmt =
                    conn.prepareStatement("select * from account_details");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                list.add(new Customer(rs.getString(1),
                        //FIXME: getAccount()?
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getDouble(6)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void saveHistory(String userId, String message) {
        try {
            Connection conn = getConnection();
            PreparedStatement pstmt =
                    conn.prepareStatement("insert into transactions(userid, message) values(?,?)");
            pstmt.setString(1, userId);
            pstmt.setString(2, message);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<String> getHistory(String userId) {
        List<String> list = new ArrayList<>();
        try {
            Connection conn = getConnection();
            PreparedStatement pstmt =
                    conn.prepareStatement("select * from transactions where userid = '"+userId+"'");
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()) {
                list.add(rs.getString(3));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
