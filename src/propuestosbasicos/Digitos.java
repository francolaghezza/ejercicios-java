/*
 * Dado un número entero positivo N, escribe un programa Java que determine cuántos
 * dígitos se necesitan para escribir el valor N.
 */

package propuestosbasicos;

import java.util.Scanner;

/**
 *
 * @author Franco David Laghezza
 */
public class Digitos {
    
    public static void main(String[] args) {
        
        final int BASE = 10;
        int digitos = 1;
        int n,aux;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un número");
        
        n = entrada.nextInt();
        aux = n;
        
        while( n / BASE > 0){
            digitos++;
            n /= BASE;
        }
        System.out.println("Para "+aux+" se necesita/n "+digitos+" dígito/s");
    }
}
