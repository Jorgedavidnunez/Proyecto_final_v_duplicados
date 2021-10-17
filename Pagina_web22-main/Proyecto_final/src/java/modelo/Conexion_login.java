/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author david
 */
public class Conexion_login {    
    
    
    private static String bd = "db_login";
    private static String urlConexion = String.format("jdbc:mysql://localhost:3306/%s",bd);
    private static String usuario = "crudfinal";
    private static String contra = "finalcrudcrud123";
    private static String jdbc = "com.mysql.cj.jdbc.Driver";
    
    
    public static Connection abrir_conexionLog(){
        Connection conexion = null;
        try {
            Class.forName(jdbc);
            conexion = DriverManager.getConnection(urlConexion,usuario,contra);
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error... "+ex.getMessage());
        }
        return conexion;
    }   
}
