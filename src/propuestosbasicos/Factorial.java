/*
 * Programa que calcula el factorial de un nº entero y positivo.
 */
package propuestosbasicos;

import java.util.Scanner;

/**
 *
 * @author Franco David Laghezza
 */
public class Factorial {
    
     public static int factorial(int n){
        
        int resultado = 1;
        
        if(n > 0){
            
            resultado = n*factorial(n-1);
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un número");
        num = entrada.nextInt();
        System.out.println("El factorial de " +num+ " es "+factorial(num));
    }
}
