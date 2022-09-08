package ejercicio15;

//@author Your Name <Rodrigo Pereyra>
public class Ejercicio15 {

// Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los 
//muestre por pantalla en orden descendente
    public static void main(String[] args) {

        int v[] = new int [100];
        
       
       
        for (int i = 0; i < 100; i++) {
            v[i]= i+1; 
            
        }
        for (int i = 99; i >= 0; i--) {
            System.out.print( v[i] + " , ");
            
        }
        System.out.println(" ");
        }
        }

    


