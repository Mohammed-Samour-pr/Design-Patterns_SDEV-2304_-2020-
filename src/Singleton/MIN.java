/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author PC
 */
public class MIN {

    public static void main(String[] args) throws SQLException {
        Connection c = null;
        String sql = "SELECT * FROM `Stdunt`";
        c = DBConnection.getConnection();
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs);

        }

    }
}
