package ejercicios.cap1.lp3;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class EJERCICIO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner teclado=new Scanner(System.in);
        System.out.println("Digite N: ");
        double num=teclado.nextDouble();
        double sumatoria=0.25-(1/(num+4));
        System.out.println("Sumatoria: " + sumatoria);
        
            
    }
    
}