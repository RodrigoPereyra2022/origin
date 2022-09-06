
package ejercio5;

import java.util.Scanner;


public class Ejercio5 {
//Escribir un programa que lea un número entero por teclado y muestre por pantalla el
//doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
   
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese un numero ");
        int num = leer.nextInt();
        
        System.out.println("el doble de su numero es "+num*2);
        System.out.println("el triple de su numero es "+num*3);      
        System.out.println("la raiz cuadrada  de su numero es "+Math.sqrt(num));
        
    }
    
}
