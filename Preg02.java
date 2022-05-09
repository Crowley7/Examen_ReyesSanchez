package ejercicios.cap1.lp3;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class EJERCICIO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Datos de entrada:\nN: ");
        Scanner numero = new Scanner(System.in);
        int n = numero.nextInt();
        int l = Integer.toString(n).length();
        
        System.out.println("\nDatos de salida: ");
        
        for (int i=0; i <l; i++){
            String num = String.valueOf(Integer.toString(n).charAt(i));
            System.out.println(num + "\n");
        }
        
    }
    
}