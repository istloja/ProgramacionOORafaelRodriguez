
package juego;

import java.util.Scanner; 
public class EntradadeTeclado {
  
    private String EntradaT;
    
   public EntradadeTeclado ()  {
        
        EntradaT=""; } 
    
  public void pedirEntrada ()  {  
        
     Scanner Entrada = new Scanner (System.in);
        
   EntradaT = Entrada.nextLine ();
    } 
    public String getEntrada () {
    
        return EntradaT;
 } }

