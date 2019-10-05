
package programacion_15;


public class ejercicio {
    public static void main(String[] args) {
        
    
     int []arreglo = buscarSerie (255);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]+",");
        } 
        }
      public int funcionPedida(int x, int y , int [] arreglo){
       
          int valor =-1;
          if (x>0&& x<255&& y>0&&y<255){
              valor=arreglo[x]+arreglo[y];
          }
                  return valor;
                  
      
      }          
      
    

    private static int[] buscarSerie(int limite) {
        int []arreglo = new int [limite];
        int a= 7,b =6;
        for (int i = 0; i < limite; i++) {
            if(i % 2 ==0){
                arreglo[i]=a ;
                a++;
            }else{
                arreglo[i]=b ;
                b=b-2;
                
            }
        }
        return arreglo;
    
        
}
}

