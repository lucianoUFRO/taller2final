/*
Equipo 2

Valentina Campos Pinilla
Luciano Castañeda Torres - Jefe Equipo
Hugo Fernández Valenzuela
Emilio Contreras Fernández
Javier Contreras Mora (fuera del equipo 2 por no aportar en el taller)
*/
package Conectar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conex_inv { 
    public static Connection iniciarConexion(){
     Connection conexion = null;
     try{
         Class.forName("com.mysql.jdbc.Driver");
         String serv= "jdbc:mysql://localhost:3306/inventario";
         String usuarioBD = "root";
         String passwordBD = "";
         conexion = DriverManager.getConnection(serv, usuarioBD, passwordBD);
     }catch(ClassNotFoundException ex){
       JOptionPane.showMessageDialog(null,ex,"ERROR DB"+ex.getMessage(),JOptionPane.ERROR_MESSAGE);
     }catch(SQLException ex){
       JOptionPane.showMessageDialog(null,ex,"ERROR DB"+ex.getMessage(),JOptionPane.ERROR_MESSAGE);
     }catch (Exception ex){
       JOptionPane.showMessageDialog(null,ex,"ERROR DB"+ex.getMessage(),JOptionPane.ERROR_MESSAGE);
     }
     return conexion;

    }

 }
