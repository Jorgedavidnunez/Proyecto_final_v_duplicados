
package modelo;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

/**
 * @author Luis Fernando Paxel
 */
public class Cliente extends Persona{
  private int genero;
  private String nit, correo_electronico,fecha_ingreso;
 public Cliente(){}
Conexion cn;
    public Cliente(int id, String nombres, String apellidos, String nit, int genero,  String telefono,String correo_electronico, String fecha_ingreso,String direccion, String fecha_nacimiento) {
        super(id, nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.genero = genero;
        this.nit = nit;
        this.correo_electronico = correo_electronico;
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

     @Override
    public int agregar() {
        int retorno;

        {
            try {

                String fecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
                PreparedStatement parametro;
                String query = "insert into clientes(Nombres,Apellidos,NIT,Genero,Telefono,Correo_electronico,Fecha_ingreso)values(?,?,?,?,?,?,?);";
                cn = new Conexion();
                cn.abrirCon();
                parametro = (PreparedStatement) cn.conexiondb.prepareStatement(query);
                parametro.setString(1, this.getNombres());
                parametro.setString(2, this.getApellidos());
                parametro.setString(3, this.getNit());
                parametro.setInt(4, this.getGenero());
                parametro.setString(5, this.getTelefono());
                parametro.setString(6, this.getCorreo_electronico());
                parametro.setString(7, fecha);

                retorno = parametro.executeUpdate();
                cn.cerrarCon();
            } catch (HeadlessException | SQLException ex) {
                System.out.println("Error!!22" + ex.getMessage());
                retorno = 0;

            }
            return retorno;
        }
    }

     public DefaultTableModel leer3() {
        DefaultTableModel tabla = new DefaultTableModel();
        String uno[] = {"Masculino", "Femenino"};
        String elegir;
        try {
            cn = new Conexion();
            cn.abrirCon();
            String query = "select idCliente as id, Nombres,Apellidos,NIT,Genero,Telefono,Correo_electronico,Fecha_ingreso from clientes;";
            ResultSet consulta = cn.conexiondb.createStatement().executeQuery(query);
            String encabezado[] = {"Id", "Nombres", "Apellidos", "Nit","Genero", "Telefono", "Correo","Fecha Ingreso"};
            tabla.setColumnIdentifiers(encabezado);
            String datos[] = new String[9];
            while (consulta.next()) {

                if (consulta.getString("Genero").equals("1")) {
                    elegir = uno[0];
                } else {
                    elegir = uno[1];
                }

                datos[0] = consulta.getString("id");
                datos[1] = consulta.getString("Nombres");
                datos[2] = consulta.getString("Apellidos");
                datos[3] = consulta.getString("NIT");
                datos[4] = elegir;
                datos[5] = consulta.getString("Telefono");
                datos[6] = consulta.getString("Correo_electronico");
                datos[7] = consulta.getString("Fecha_ingreso");
         
                tabla.addRow(datos);
            }
            cn.cerrarCon();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return tabla;
    }

 
  @Override
 public int modificar() {
        int retorno;

        {
            try {
                PreparedStatement parametro;
                String query = "update clientes set Nombres=?,Apellidos=?,NIT=?,Genero=?,Telefono=?,Correo_electronico=? where idCliente=?;";
                cn = new Conexion();
                cn.abrirCon();
                parametro = (PreparedStatement) cn.conexiondb.prepareStatement(query);
                parametro.setString(1, this.getNombres());
                parametro.setString(2, this.getApellidos());
                parametro.setString(3, this.getNit());
                parametro.setInt(4, this.getGenero());
                parametro.setString(5, this.getTelefono());
                parametro.setString(6, this.getCorreo_electronico());
                parametro.setInt(7, this.getId());

                retorno = parametro.executeUpdate();
                cn.cerrarCon();
            } catch (HeadlessException | SQLException ex) {
                System.out.println("Error!!" + ex.getMessage());
                retorno = 0;

            }
            return retorno;
        }
    }
  @Override
    public int eliminar() {
        int retorno;

        {
            try {
                PreparedStatement parametro;
                String query = "delete from clientes where idCliente=?;";
                cn = new Conexion();
                cn.abrirCon();
                parametro = (PreparedStatement) cn.conexiondb.prepareStatement(query);
                parametro.setInt(1, this.getId());
                retorno = parametro.executeUpdate();
                cn.cerrarCon();
            } catch (HeadlessException | SQLException ex) {
                System.out.println("Error!!" + ex.getMessage());
                retorno = 0;

            }
            return retorno;
        } 
       }
    
    
    public boolean buscarNitRepetido(String nit){
          boolean nitRepetido = false;
          try { 
              cn = new Conexion();
              cn.abrirCon();
              String query = "SELECT NIT FROM clientes WHERE NIT = ?";
              PreparedStatement parametro;
              parametro = (PreparedStatement) cn.conexiondb.prepareStatement(query);
              parametro.setString(1, nit);
              ResultSet resultado = parametro.executeQuery();
              if(resultado.next()){
                  nitRepetido = true;
              }else{
                  nitRepetido = false;
              }
              cn.cerrarCon();
          } catch (SQLException ex) {
              System.out.println("Error..."+ex.getMessage());
          }finally{
              cn.cerrarCon();
        }
          return nitRepetido;
      }
}
