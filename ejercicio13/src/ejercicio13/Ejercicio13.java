

package ejercicio13;

//@author Your Name <Rodrigo Pereyra>

import java.util.Scanner;


public class Ejercicio13 {
//Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
//cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//    * * * *
//    *     *
//    *     *
//    * * * *
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la longitud que desea del cuadrado: ");
        int longitud = leer.nextInt();
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < longitud; j++) {
                if (i==0||j==0||i==longitud-1||j==longitud-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

    }

}