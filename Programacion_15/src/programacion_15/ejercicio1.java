
package programacion_15;

import java.util.Scanner;


public class ejercicio1 {
    public static void main(String[] args) {
        
    
   Scanner entrada = new Scanner (System.in);
    
    int opc;
    double pulgadas,milimetros,yardas,metros,millas,kilometros;
     
        System.out.println("ingrese la opcion que desea");
        System.out.println("1. pulgadas a milimetros");
        System.out.println("2. yardas a metros.");
        System.out.println("3. millas a kilometros");
        
        opc= entrada.nextInt();
        
        switch(opc){
                
            case 1: 
                System.out.println("ingrese la cantidad de pulgadas a convertir ");
                pulgadas = entrada.nextInt();
                milimetros = dato2(pulgadas);
                System.out.println(" pulgasda equivalen a :  "+pulgadas+" milimetros"+ milimetros);
                break;
               case 2: 
                System.out.println("ingrese la cantidad de  yardas a convertir ");
                yardas = entrada.nextInt();
                metros = dato(yardas);
                System.out.println(" yardas equivalen a :  "+yardas+" metros "+ metros);
                break;
                case 3: 
                System.out.println("ingrese la cantidad de millas a convertir ");
                millas = entrada.nextInt();
                kilometros = mostrardato(millas);
                System.out.println(" millas equivalen a :  "+kilometros+" kilometros"+ millas);
              
                
                default :
                    System.out.println("la opcion seleccionada  no es valida.");
                
              
           }
    }     
               public static double mostrardato(double millas){
               
                   return millas* 25.4;
           }
               public static double dato(double yardas){
                  
                   return  yardas*25.4; 
           }
        
               public  static double dato2(double pulgadas){
        
                   return  pulgadas*25.4;
               }  
       

}
