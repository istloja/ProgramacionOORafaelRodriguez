
package juego;

import java.util.*;
public class JuegoAdivinanumero extends EntradadeTeclado  {

    public static void main(String[] args)
    {

        EntradadeTeclado entrada= new EntradadeTeclado();
        Random cantidadDeNumero=new Random();
      boolean intentos=true;
        
       int valorB= 1 + cantidadDeNumero.nextInt(10);       
        
        System.out.println("Pon un numero del 1 al 10");
        
              
            System.out.println("Escribe el numero : ");       
            
            entrada.pedirEntrada();
           int convertir=Integer.parseInt(entrada.getEntrada());
           
            if(convertir==(valorB)) {
                System.out.println("Muy bien:)");
                intentos=false;
            }
             if(convertir<=valorB){
            
                System.out.println("el numero es par");
                intentos=true;
            }
             else{
            
                System.out.println(" el numero es impar");
                intentos=false;
            }
    }
}

