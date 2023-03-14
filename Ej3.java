/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package ejerciciosc1;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Santiago
 */
public class Ej3 {
    
        public static void main(String[] args) {
            
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese una frase:");
            String frase = leer.nextLine();
            
            System.out.println(toLowerCase(frase));
            System.out.println(toUpperCase(frase));
            
        }
}
