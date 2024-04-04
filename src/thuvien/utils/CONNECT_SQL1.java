/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuvien.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CONNECT_SQL1 {

    public static Connection conn = null;

    public static Connection getConnection(String user, String pass, String database) {
        try {
            String url = "jdbc:sqlserver://localhost:1433;"
                    + "databaseName=" + database + ";encrypt=false";
            // kết nối
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Ket noi thanh cong");
        } catch (SQLException ex) {
            System.out.println("Loi ket noi " + ex.getMessage());
        }
        return conn;
    }

}
