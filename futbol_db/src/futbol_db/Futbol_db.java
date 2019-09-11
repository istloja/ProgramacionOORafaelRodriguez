
package futbol_db;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Futbol_db {

    public void Conexion (String usuario, String clave){
    try{
        DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
        Connection nuevo = DriverManager.getConnection("jdbc:mysql://localhost/futbol_db", usuario, clave);
        System.out.println(nuevo);
         java.sql. Statement s = nuevo.createStatement();//inicializar la consulta
        ResultSet resultado = s.executeQuery(" select*from");
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
    public static void main(String[] args) {
    Futbol_db nuevo = new Futbol_db();
    nuevo.Conexion("rafa", "126");
    }
    
}
// crear una consulta , desde java hacer la consulta, crear una consulta 
