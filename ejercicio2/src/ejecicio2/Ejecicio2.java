
package ejecicio2;

import java.util.Scanner;


public class Ejecicio2 {
//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
//pantalla.
    
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("ingrese su nombre ");
        String nombre= teclado.nextLine();
        
        System.out.println("el nombre ingresado es "+nombre);
        
    }
    
}
