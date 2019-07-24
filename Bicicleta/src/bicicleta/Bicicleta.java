
package bicicleta;

import java.util.Date;

public class Bicicleta {
     String tipo;
     String modelo;
     double precio;
     Date fecha_prestamo;
     boolean estado ;

    public Bicicleta(String tipo, String modelo, double precio, Date fecha_prestamo, boolean estado) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.precio = precio;
        this.fecha_prestamo = fecha_prestamo;
        this.estado = estado;
    }
   

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(Date fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


}