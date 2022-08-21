package Conexion;



import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class Metodos_Sql {
    
     private String Nombre;
     private String Apellido;
     private int Dni;
     private String Correo;
     private int Tel;
     private String Localidad;
     private String Dire;
     private String Nacimiento;
     private String Sexo;
     private String Estado;
     private String OS;

     public Metodos_Sql(String Nombre, String Apellido, int Dni, String Correo, int Tel, String Localidad, String Dire, String Nacimiento, String sexo,String Os,String Estado){
         this.Nombre=Nombre;
         this.Apellido=Apellido;
         this.Dni=Dni;
         this.Correo=Correo;
         this.Tel=Tel;
         this.Localidad=Localidad;
         this.Nacimiento=Nacimiento;
         this.Sexo=sexo;
         this.Dire=Dire;
         this.OS=Os;
         this.Estado=Estado;
     }
     public Metodos_Sql(){
     
     }
   //conexion
    private static ResultSet resultado = null;
    private static java.sql.PreparedStatement sentenciaPreparada;
    static Connection conexion;

 
    public String getNom(){
            return Nombre;
        }
    
    public String getApe(){
        return Apellido;
    }
    public int getDni(){
        return Dni;
    }
    public String getOs(){
        return OS;
    }
    public String getCorreo(){
        return Correo;
    }
    public int getTel(){
        return Tel;
    }
    public String getLoca(){
        return Localidad;
    }
    public String getDire(){
        return Dire;
    }
    public String getNacimiento(){
        return Nacimiento;
    }
    public String getSexo(){
        return Sexo;
    }
    public String getEstado(){
        return Estado;
    }

    
    //metodos setters
    public void setNom(String Nombre){
        this.Nombre = Nombre;
    }
    
    public void setApe(String Apellido){
        this.Apellido = Apellido;
    }
    public void setDni(int Dni){
        this.Dni = Dni;
    }
    
    public void setCorreo(String Correo){
        this.Correo = Correo;
    }
    public void setTel(int Tel){
        this.Tel = Tel;
    }
    public void setLoca(String Localidad){
        this.Localidad=Localidad;
    }
    public void setDire(String Dire){
        this.Dire = Dire;
    }
    public void setNacimiento(String Nacimiento){
        this.Nacimiento =Nacimiento;
    }
    public void setsexo(String Sexo){
        this.Sexo = Sexo;
    }
    public void setEstado(String Estado){
        this.Estado = Estado;
    }
    public void setOs(String Os){
        this.OS=Os;
    }
    
    
    public void altaPacientes(String ConsultaSQL) 
    {

        try {
            
            conexion = ConexionSQL1.conectar();

           
            
            sentenciaPreparada = conexion.prepareStatement(ConsultaSQL);
            sentenciaPreparada.setInt(1, getDni());
            sentenciaPreparada.setString(2, getApe());
            sentenciaPreparada.setString(3, getNom());
            sentenciaPreparada.setString(4, getOs());
            sentenciaPreparada.setString(5, getSexo());
            sentenciaPreparada.setString(6, getNacimiento());
            sentenciaPreparada.setString(7, getDire());
            sentenciaPreparada.setString(8, getLoca());
            sentenciaPreparada.setString(9, getCorreo());
            sentenciaPreparada.setInt(10, getTel());
            sentenciaPreparada.setString(11, String.valueOf(this.getEstado()));
            int i = sentenciaPreparada.executeUpdate();

            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Datos Guardados");
            } else {
                JOptionPane.showMessageDialog(null, "Error, Datos NO Guardados");
            }
            //conexion.close();

        } catch (Exception e) {
            System.out.print("Erorafd: " + e);

        } finally {
            try {
                conexion.close();
            } catch (Exception e) {
                System.out.print("Eror: " + e);
            }
        }

    }

    public static String BuscarUsuarioContraseña(String usuario, String contraseña) {
        String mensaje = null;
        try {
            conexion = ConexionSQL1.conectar();
            String consulta = "SELECT * FROM usuarios";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error" + e.getMessage());
        }
        return null;
    }



    public int asignarDatos(String Dni) 
    {
        int encontrado = 0;
        try {
            
            conexion = ConexionSQL1.conectar();

            String Buscar = "SELECT * FROM pacientes WHERE dni ='"+Dni+"'";
           
            sentenciaPreparada = conexion.prepareStatement(Buscar);
            resultado = sentenciaPreparada.executeQuery();
            if (resultado.next()){
                this.setDni(resultado.getInt(1));
                this.setApe(resultado.getString(2));
                this.setNom(resultado.getString(3));
                this.setOs(resultado.getString(4));
                this.setsexo(resultado.getString(5));
                this.setNacimiento(resultado.getString(6));
                this.setDire(resultado.getString(7));
                this.setLoca(resultado.getString(8));
                this.setCorreo(resultado.getString(9));
                this.setTel(resultado.getInt(10));
                this.setEstado(resultado.getString(11));
               JOptionPane.showMessageDialog(null, "Datos encontrados");
               encontrado = 1;
            }else{
                JOptionPane.showMessageDialog(null, "Paciente no encontrado");
                encontrado = 0;
            }
           /*int i = sentenciaPreparada.executeUpdate();

            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Datos Encontrados");
            } else {
                JOptionPane.showMessageDialog(null, "Error, Datos NO Encontrados");
            }*/
           

        } catch (Exception e) {
            System.out.print("Error: " + e);
            

        } finally {
            try {
                conexion.close();
            } catch (Exception e) {
                System.out.print("Error: " + e);
            }
            return encontrado;
        }

    }
    public void actualizarDatos(String Dni) 
    {

        try {
            
            conexion = ConexionSQL1.conectar();

            String Cambio = "UPDATE pacientes SET dni=? , apellidos=? , nombres=? , obrasocial=? , sexo=? , fechanacimiento=? , direccion=? , localidad=? , Email=? , telefono=? , estado =? WHERE dni ='"+Dni+"'";
            //String Cambio = "UPDATE pacientes SET (dni, apellidos, nombres, obrasocial, sexo, fechanacimiento, direccion, localidad, email, telefono, estado) VALUES(?,?,?,?,?,?,?,?,?,?,?) WHERE dni='"+Dni+"'";
            sentenciaPreparada = conexion.prepareStatement(Cambio);
            //resultado = sentenciaPreparada.executeQuery();
            sentenciaPreparada.setInt(1, this.getDni());
            sentenciaPreparada.setString(2, this.getApe());
            sentenciaPreparada.setString(3, this.getNom());
            sentenciaPreparada.setString(4, this.getOs());
            sentenciaPreparada.setString(5, this.getSexo());
            sentenciaPreparada.setString(6, this.getNacimiento());
            sentenciaPreparada.setString(7, this.getDire());
            sentenciaPreparada.setString(8, this.getLoca());
            sentenciaPreparada.setString(9, this.getCorreo());
            sentenciaPreparada.setInt(10, this.getTel());
            sentenciaPreparada.setString(11,"ACTIVO");
            
            int i = sentenciaPreparada.executeUpdate();

            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Datos Guardados");
            } else {
                JOptionPane.showMessageDialog(null, "Error, Datos NO Guardados");
            }
            conexion.close();

        } catch (Exception e) {
            System.out.print("Errorff: " + e);

        } finally {
            try {
                conexion.close();
            } catch (Exception e) {
                System.out.print("Error: " + e);
            }
        }

    }
    
    public void Baja(String Dni)
    {
        String BajaSQL ="UPDATE pacientes SET estado=? WHERE Dni = ?";
        conexion = ConexionSQL1.conectar();
        try{
            sentenciaPreparada= conexion.prepareStatement(BajaSQL);
            sentenciaPreparada.setString(2, Dni);
            sentenciaPreparada.setString(1, "INACTIVO");
           int result = sentenciaPreparada.executeUpdate();
            
           if  (result >0)
           {
               JOptionPane.showMessageDialog(null, "Paciente dado de baja");
           }
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "NO SE PUDO DAR DE BAJA "+e  );
            
        }
        
        
    }
    
   public DefaultTableModel MuestroPac()
    {
        String ConsultaSql="SELECT * FROM pacientes WHERE estado='ACTIVO'";
        String [] titulos={"DNI","APELLIDOS","NOMBRES","OBRA SOCIAL","SEXO","FECHA NACIMIENTO","DIRECCIÓN","LOCALIDAD","EMAIL","TEL"};
        DefaultTableModel Tabla = new DefaultTableModel(null,titulos);
        try
        {
            conexion = ConexionSQL1.conectar();
            sentenciaPreparada = conexion.prepareStatement(ConsultaSql);
            resultado = sentenciaPreparada.executeQuery();
            
            while(resultado.next()) //
            {
                this.setApe(resultado.getString(3));
                this.setNom(resultado.getString(2));
                this.setDni(resultado.getInt(1));
                
               
                 String [] registros = {resultado.getString(1),resultado.getString(2),resultado.getString(3),resultado.getString(4),resultado.getString(5),resultado.getString(6)
                         ,resultado.getString(7),resultado.getString(8),resultado.getString(9),resultado.getString(10)
                        };
                Tabla.addRow(registros);
            }
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "No se mostro la lista" + "\n" + e);
        }
        return Tabla;
    }
   public DefaultTableModel buscoPac(String buscar)
    {
        String ConsultaSql="SELECT * FROM pacientes WHERE estado='ACTIVO' AND dni LIKE '%"+buscar+"%' OR apellidos LIKE '%"+buscar+"%'";
        
        String [] titulos={"DNI","APELLIDOS","NOMBRES","OBRA SOCIAL","SEXO","FECHA NACIMIENTO","DIRECCIÓN","LOCALIDAD","EMAIL","TEL"};
        DefaultTableModel Tabla = new DefaultTableModel(null,titulos);
        try
        {
            conexion = ConexionSQL1.conectar2();
            sentenciaPreparada = conexion.prepareStatement(ConsultaSql);
            resultado = sentenciaPreparada.executeQuery();
            
            while(resultado.next()) //
            {
                this.setApe(resultado.getString(3));
                this.setNom(resultado.getString(2));
                this.setDni(resultado.getInt(1));
                
               
                 String [] registros = {resultado.getString(1),resultado.getString(2),resultado.getString(3),resultado.getString(4),resultado.getString(5),resultado.getString(6)
                         ,resultado.getString(7),resultado.getString(8),resultado.getString(9),resultado.getString(10)
                        };
                Tabla.addRow(registros);
            }
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "No se mostro la lista" + "\n" + e);
        }
        return Tabla;
    }
}
