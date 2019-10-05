
package programacion_15;

public class ejercicio3Frase {
   public String[] invertirpalabras(String cadena){
   String texto[]= cadena.split(" ");
        for (int i = texto.length ; i == 0; i--) {
            System.out.println(texto[i]);
        }
//   [1,3,5,6,7]
   
   return texto;
 
       
    }
    public static void main(String[] args) {
     
        ejercicio3Frase obj = new ejercicio3Frase();
        System.out.println(obj.invertirpalabras("holi boli"));
    }
   
}
      

