
package programacion_15;

import java.util.Scanner;

public class ejercicio5 {
//    posicion
    public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in);
 
		String texto;
 
		System.out.println("Ingrese un el 1r Texto");
		texto = scan.nextLine();
 
		if (texto.length() > 10) {
 
			System.out.println("Su palabra tiene más de 10 Carácteres");
 
//			texto.SetCharAt(0,"0");
//                        texto.SetCharAt(1,"0");
// 
                        System.out.println("Su NUEVA palabra es: "+texto);
 
			}
 
		else {
			System.out.println("Su palabra tiene: "+texto.length()+" Carácteres");
		}
	}
}
