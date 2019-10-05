
package programacion_15;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Programacion_15 {

    public static void main(String[] args) {
      String palabra;
        Scanner nuevo = new Scanner (System.in);
        System.out.println("introduce la palabra");
        palabra= nuevo.nextLine();
        StringTokenizer nuevo2= new  StringTokenizer (palabra);
        System.out.println(" las palabras que ingreso son " + nuevo2.countTokens());
        
        String nuevapalabra;
        Scanner nuevo3= new Scanner(System.in);
        System.out.println("ingrese las letras");
        nuevapalabra=nuevo.nextLine();
         StringTokenizer letra= new StringTokenizer(nuevapalabra);
        System.out.println("Cadena de texto :   "+letra.countTokens() );
          
      
    }
    
}
