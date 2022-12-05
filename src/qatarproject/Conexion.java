/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qatarproject;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
/**
 *
 * @author Christian
 */
public class Conexion {
    
    public static Connection getConexion(){
    
        String url = "jdbc:sqlserver://localhost:1433;" + "database=Qatar;"
                + "user=Christian_dba;"+"password=Alquimista0xx;";
    
        try{
            Connection con = DriverManager.getConnection(url);
            return con;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    
}
