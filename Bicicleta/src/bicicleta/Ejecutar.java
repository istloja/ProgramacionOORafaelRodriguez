
package bicicleta;

import java.util.Date;
import java.util.LinkedList;

public class Ejecutar {
     
  
      public static void main(String[] args) {
         LinkedList cola= new  LinkedList();
          Bicicleta  objeto1=new Bicicleta("Bmx","jhdkh",3000.0,new Date (),false);
          Bicicleta  objeto2= new Bicicleta ("una","hjk",40.9,new Date(),false);
          Bicicleta  objeto3= new Bicicleta ("ghy","yh",49.00,new Date(), false);
          Bicicleta  objeto4 = new Bicicleta ("yth","hg",47.00,new Date(),false);
          Bicicleta  objeto5 = new Bicicleta ("Pdf","ahs",46.0, new Date(),false);
          Bicicleta  objeto6 = new Bicicleta ("lwe","has",54.4,new Date (),false );
          Bicicleta  objeto7= new Bicicleta ("asñ","mas",46.4,new Date (),false );
          Bicicleta objeto8 = new Bicicleta ("has"," ajs",923.9, new Date(),false);
          Bicicleta objeto9 = new Bicicleta ("asas","ajs",934.8, new Date(),false );
          Bicicleta  objeto10 = new Bicicleta ("jas","ju",832.737,new Date (), false);
          
          
          cola.add(objeto1);
          cola.add(objeto2);
          cola.add(objeto3);
          cola.add(objeto4);
          cola.add(objeto5);
          cola.add(objeto6);
          cola.add(objeto7);
          cola.add(objeto8);
          cola.add(objeto9);
          cola.add(objeto10);
          System.out.println(" usar"+objeto1);
      }

 
      
                  
}
           
    
