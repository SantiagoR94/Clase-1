/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/


package ejerciciosc1;

import java.util.Scanner;

/**
 *
 * @author Santiago
 */
public class Ej4 {
    
            public static void main(String[] args) {
            
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese la cantidad de grados en Celsius");
            double grados = leer.nextDouble() ;
            
            System.out.println(grados + " grados Celsius equivalen a " + (32+(9*grados/5)) + " grados Fahrenheit");
                
            
            }
}
