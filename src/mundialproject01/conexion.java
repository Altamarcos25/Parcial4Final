/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialproject01;

/**
 *
 * @author Christian
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class conexion {

    public String usuario = "Christian_dba";
    public String password = "Alquimista0xx";
    public String url = "jdbc:sqlserver://DESKTOP-BOMQLAG\\SQLEXPRESS:1433;databaseName=Mundial [Christian_dba on dbo";
    public Connection cn = null;
    public Statement st = null;

    public Statement Conectar() {
        try {
            Connection cn = DriverManager.getConnection(url, usuario, password);
            st = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
        } catch (SQLException i) {
            
            JOptionPane.showMessageDialog(null, i);
        }
        return st;
    }

}
