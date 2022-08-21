package Conexion;

import java.sql.Connection;

import java.sql.DriverManager;
import javax.swing.JOptionPane;



public class ConexionSQL1 {
    
    private static String url="jdbc:mysql://localhost:3306/clinica";
    private static String user="root";
    private static String pass="";
    Connection con = null;
    
    
    public static Connection conectar(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null,"Conexión exitosa");
            return con;
        } catch(Exception e) {
            System.out.println("error"+ e);
            return null;
        }
    
    }
        public static Connection conectar2(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
          
            return con;
        } catch(Exception e) {
            System.out.println("error"+ e);
            return null;
        }
    
    }


}
