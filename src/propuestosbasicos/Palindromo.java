/*
 * Programa que evalúe si una palabra o frase es un palíndromo.
 */
package propuestosbasicos;

import java.util.Scanner;

/**
 *
 * @author Franco David Laghezza
 */
public class Palindromo {
    
     public static void main(String[] args) {
        
        String cadena;
        Scanner entrada = new Scanner(System.in);
        
        cadena = entrada.nextLine();
        
        System.out.println(esPalindromo(cadena.replace(" ","")));
    }
    
    public static boolean esPalindromo(String cadena){
        
        String alreves = "";
        
        for (int i = cadena.length()-1; i >= 0; i--) {
            
            alreves += cadena.charAt(i);

        }
        return cadena.equalsIgnoreCase(alreves);
        
       //Alli va Ramon y no maravilla -> true
    }
}
