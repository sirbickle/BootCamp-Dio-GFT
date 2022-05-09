/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio.de.hora;
import java.util.Scanner;

/**
 *
 * @author limal
 */
public class ExercicioDeHora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       double hora;
       Scanner entrada = new Scanner (System.in);
       
       System.out.println ("Digite a hora");
       hora = entrada.nextDouble();
       
    
       
       if (hora >= 1 && hora <12) {
          System.out.println ("BOM DIA");
      
    }
       
           if (hora >=12 && hora <17) {
               System.out.println ("BOA TARDE");
           }
           
               if ((hora >=17 && hora <=24)||hora ==0) {
                   System.out.println ("BOA NOITE");
               }
           }
       }
      
       
        
                
    
    

