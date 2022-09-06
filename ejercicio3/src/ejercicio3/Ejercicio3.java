
package ejercicio3;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;




public class Ejercicio3 {
//Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
//en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("imgrese una frase ");
        String frase= leer.nextLine();
        
        System.out.println("en mayuscucula seria "+toUpperCase(frase));
        System.out.println("en minuscucula seria "+toLowerCase(frase));
        
        
    }
    
}
