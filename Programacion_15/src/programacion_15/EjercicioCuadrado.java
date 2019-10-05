
package programacion_15;

import java.util.Scanner;

public class EjercicioCuadrado {
  public static void main(String arr[]){
      Scanner Teclado = new Scanner (System.in);
  
         int num;
         double sum,r;
       
         System.out.print("\n Ingrese Numero:");
         num = Teclado.nextInt();
       
         sum = Math.sqrt(num);
         r = sum;
          
       
         if(r%2 ==0)
         {
            if(sum*sum == num)
            {
               System.out.print("\n Es cuadrado Perfecto");
            
         } 
         else
         {
            System.out.print("\n No es");
         }
  }
  
  }}



