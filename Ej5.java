/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package ejerciciosc1;

import java.util.Scanner;

/**
 *
 * @author Santiago
 */
public class Ej5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();

        System.out.println("Doble = " + numero * 2);
        System.out.println("Triple = " + numero * 3);
        System.out.println("Raiz cuadrada = " + Math.sqrt(numero));

    }

}
