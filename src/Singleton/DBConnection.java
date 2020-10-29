/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class DBConnection {

    private static DBConnection instance;
//    private String url = "jdbc:oracle://localhost:3306/";
    private String login = "epiz_26396507";
    private String pass = "4MwLNkkJAvYBx";
    String dbName = "epiz_26396507_java2020";

    // if you need mysql connection then uncomment below details
    private String url = "jdbc:mysql:https://sql111.epizy.com";

    private DBConnection() {

    }

    public static Connection getConnection() throws SQLException {
        if (instance == null) {
            instance = new DBConnection();
            System.out.println(" Connection  - - - - - - - -  New DBConnection created");
        }
        try {
            return DriverManager.getConnection(instance.url + instance.dbName, instance.login, instance.pass);
        } catch (SQLException e) {
            throw e;
        }
    }

    public static void close(Connection connection) throws SQLException {
        if (connection != null) {
            connection.close();
            connection = null;
        }
    }

}
