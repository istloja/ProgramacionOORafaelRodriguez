
package equipo;

import java.io.Serializable;


public class Cuerpotecnico implements Serializable {
    private Equipo equipo;
    private String nombre;
    private int edad;
    private int cedula;

    public Cuerpotecnico(Equipo equipo, String nombre, int edad, int cedula) {
        this.equipo = equipo;
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    
}
