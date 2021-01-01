/*
 * Programa que lee un nº entero X y otro nº entero positivo N 
 * y calcula la enésima potencia de X.
 */

package propuestosbasicos;

import java.util.Scanner;

/**
 *
 * @author Franco David Laghezza
 */
public class Potencia {
    
    public static int calculaPotencia(int base, int exp){
        
        int resultado = 1;
        
        for(int i = 1; i <= exp; i++){
            resultado *= base;
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
        int x,n;
         
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dime el valor de X");
        x = entrada.nextInt();
                
        System.out.println("Dime el valor de N");
        n = entrada.nextInt();
        
        System.out.println(x+" ^ "+n+" = "+calculaPotencia(x,n));
    }
}
