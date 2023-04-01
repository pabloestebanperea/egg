/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.
*/
package encuentro3.pkg4.pkg5.ejercicio02;

import java.util.Scanner;

public class Encuentro345Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.print("Ingrese Una Frase: ");        
        String frase = leer.nextLine(); 
        if (frase.equals("eureka")){
            System.out.println("Correcto");
        }
        else{
         System.out.println("Incorrecto");
        }    
    }    
}
