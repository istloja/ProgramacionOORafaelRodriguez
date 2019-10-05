
package programacion_15;

public class EjercicioDetextoAnumero {
    
   private String unidades[]={"uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
   private String cadena[]={"diez","veinte","treinta","cuarenta","cincuenta","sesenta","setenta"};
   private String cententa[]={"cien","docientos","trecientos","cuatrocientos","quinientos","seiscientos","setecientos","ochocientos",
                              "novecientos"};
  
   private String descripcion[]=new String [3];
   public EjercicioDetextoAnumero(String[]descripcion){
       this.descripcion=new String[descripcion.length];
       this.descripcion=descripcion;
       
   }
    
    
   public String regresaNumero(){
       for (int i = 0; i < 3; i++) {
           System.out.println(descripcion[i]);
           
       }
 
  String numero="";
       for (int i = 0; i < 9; i++) {
        if(cententa[i].equals(descripcion[0]))
            numero = numero+(i+1);
        
       }
       for (int i = 0; i < 9; i++) {
        if(cententa[i].equals(descripcion[1]))
            numero = numero+(i+1);
       }
       for (int i = 0; i < 9; i++) {
        if(cententa[i].equals(descripcion[2]))
            numero = numero+(i+1);
       } 
       return numero;
   }
    public static void main(String[] args) {
        EjercicioDetextoAnumero objeto=new EjercicioDetextoAnumero( args);
        objeto.regresaNumero();
        System.out.println(objeto);
                
    }
  
}
