
package futbol_db;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Futbol_db {

    public void Conexion (String usuario, String clave){
    try{
        DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
        Connection nuevo = DriverManager.getConnection("jdbc:mysql://localhost/futbol_db", usuario, clave);
        System.out.println(nuevo.getCatalog());
          PreparedStatement s = (PreparedStatement) nuevo.createStatement();//inicializar la consulta
        ResultSet resultado = s.executeQuery(" select*from persona");
        while (resultado.next()) {
            System.out.println(resultado.getInt("idpersona"));
            System.out.println(resultado.getString("nombre"));
            System.out.println(resultado.getString("apellido"));
            System.out.println(resultado.getString("cedula"));
        }
    }catch (Exception e){
        System.out.println(e);
    }
    }
    public void escribir(String  usuario, String clave, int idpersona,String nombre,String apellido ,String cedula,int edad){
        try{
        DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
        Connection nuevo = DriverManager.getConnection("jdbc:mysql://localhost/futbol_db", usuario, clave);
        PreparedStatement s = nuevo.prepareStatement("insert into persona values(?,?,?,?,?)");
         s.setInt(1,idpersona);
         s.setString(2,nombre);
         s.setString(3,apellido);
         s.setString(4,cedula);
         s.setInt(5,edad);
         s.executeUpdate();
         
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    public static void main(String[] args) {
    Futbol_db nuevo2= new Futbol_db();
    nuevo2.Conexion("root","root");
        try {
            nuevo2.escribir("root","root",12,"miguel","perez","121223243",23);
        } catch (Exception e) {
            System.out.println(e);
        }
    
    
        
    Futbol_db nuevo = new Futbol_db();
    nuevo.Conexion("root", "123$Rafael");
    
    }}
// crear una consulta , desde java hacer la consulta, crear una consulta 
// ingresar los nombres de nosotros y guardar los nombres por teclado java con mysql y subir al gifthub y al eva
