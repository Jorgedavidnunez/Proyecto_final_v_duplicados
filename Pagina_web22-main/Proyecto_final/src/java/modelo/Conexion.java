 
package modelo;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author Luis Fernando Paxel
 */
public class Conexion {
  
    public Connection conexiondb;
    public final String bd ="db_punto_venta";
    public final String urlCon= String.format("jdbc:mysql://localhost:3306/%s",bd);
    public final String usuario= "crudfinal";
    public final String contra= "finalcrudcrud123";
    public final String jdbc="com.mysql.cj.jdbc.Driver";
    
    public void abrirCon(){
     try{
       Class.forName(jdbc);
       conexiondb= DriverManager.getConnection(urlCon,usuario,contra);
   //JOptionPane.showMessageDialog(null, "Conexion Exitosa","Exito",JOptionPane.INFORMATION_MESSAGE);
   System.out.println("Conexion Exitosa");
     } catch(HeadlessException | ClassNotFoundException | SQLException ex){
      System.out.println("--  Error4444  --"+ex.getMessage());
     }
    }
    
    public void cerrarCon(){
        try{
            conexiondb.close();
        }
         catch(SQLException ex){
       
               System.out.println("--  Error  --"+ex.getMessage());
          }
        }
    
}
