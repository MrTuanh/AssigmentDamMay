/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigmentdammay;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Tu Anh
 */
public class MysqlConnect {
    Connection conn = null;
    public static Connection connectDB(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn  = DriverManager.getConnection("jdbc:mysql://localhost/mydatabase","root","");
       // JOptionPane.showMessageDialog(null, "Connect to database");
        return conn;
    }catch(Exception e){
        return null;

    }
    }
}

