package ejercicios.cap1.lp3;

import java.util.Scanner;
public class EJERCICIO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Datos de entrada:\nN: ");
        Scanner numero = new Scanner(System.in);
        int num = numero.nextInt();
        if ((capicua(num)==true)){
            System.out.println("\nDatos de Salida:\nEs capicúa");
        } else {
            System.out.println("\nDatos de Salida:\nNo es capicúa");
        }
        
    }
    
    public static boolean capicua(int num){
        String valor = String.valueOf(num);
        
        for (int i=0, j = valor.length()-1; i<=j; i++,j--){
            if (valor.charAt(i) != valor.charAt(j)){
                return false;
            }
        }
        return true;   
    }
}