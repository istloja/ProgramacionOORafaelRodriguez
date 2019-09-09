
package equipo;

import java.util.HashMap;
import java.util.Scanner;

public class EjemploMapa {
    
    public static void main(String[] args) {
       HashMap <String ,String > mapa1= new HashMap<>();
//       String ciudad;
//       String codigo;
////       Scanner entrada= new Scanner (System.in);
////      System.out.println("ingrese una ciudad");
////      ciudad=entrada.nextLine();
////        System.out.println(mapa1.get(ciudad));
////        entrada=ciudad;
////        System.out.println(entrada);
////        
//        System.out.println("ingrese ña ciudad"+ciudad);
//        ciudad= entrada.next();
//        String entrada = mapa1.get("123");
//        entrada= ciudad;
//        System.out.println(entrada);
//       mapa1.put("123","mexico");
       mapa1.put("124","peru");
       mapa1.put("1234","Estado unidos");
       mapa1.put("128","ecuador");
       mapa1.put("162","Chile");
        
              
      
//        }
//    }
//    
//////Scanner entrada= new Scanner (System.in);
//////   String ciudad ="";
//////   String codigo = "";
//////        for (int i = 0; i < 5; i++) {
//////            System.out.println("ingrese elcodigo"+codigo);
//////            codigo= entrada.next();
//////            System.out.println("ingrese la ciudad"+ciudad);
//////            ciudad= entrada.next();
//////            mapa1.put(codigo,ciudad);
//////        }
//////        System.out.println(mapa1);
        
            
        

  HashMap <String ,Integer > mapa= new HashMap<>();  
    Scanner entrada2= new Scanner (System.in);
//    ingrese la ceduala y que elimine una de esas ingresadas solo eliminar una
for (int i = 0; i < 5; i++) {   
String cedula;
    int edad;
        System.out.println("ingrese la cedula");
        cedula= entrada2.next();
        System.out.println("ingrese la edad");
        edad = entrada2.nextInt();
        System.out.println(mapa.get(edad));
        mapa.remove(1);
            
        }
    }

}