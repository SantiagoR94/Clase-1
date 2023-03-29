/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
 */
package ejerciciosc1;

import java.util.Scanner;

/**
 *
 * @author Santiago
 */
public class Ej1 {


    public static void main(String[] args) {

        //Defino leer para ingresar por pantalla
        Scanner leer = new Scanner(System.in);
        
        //Defino num1 y num2 como int (numero)
        int num1,num2 ;
        
        System.out.println("Ingrese el primer numero:");
        num1 = leer.nextInt() ;
        System.out.println("Ingrese el segundo numero:");
        num2 = leer.nextInt() ;
        
        //Se imprime el mensaje final,al usar (num1+num2) entre parentesis la suma se realiza sin requerir otra variable
        System.out.println("La suma de " + num1 + " y " + num2 + " da un total de = " + (num1+num2));
        //Esto deberia salir en el pull
    }
    
}
