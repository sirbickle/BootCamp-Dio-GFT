/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcular;

/**
 *
 * @author limal
 */
public class Calcular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double lado, lado1, lado2, baseMaior, baseMenor, altura;
       
       lado = 2;
       lado1 = 2;
       lado2 = 2;
               baseMaior = 5;
       baseMenor = 5;
       altura = 10; 
       
       System.out.println ("Area do quadrado " + lado * lado);
       System.out.println ("Area do retangulo " + lado1 + lado2);
       System.out.println ("Area do trapezio " + ((baseMaior + baseMenor) * altura)/2);
        
    }
    
}
