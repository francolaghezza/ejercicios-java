/*
 * Programa que dado dos intervalos cerrados [a, b] y [c, d] de la recta real
 * devuelve la intersección de ambos intervalos.
 */
package propuestosbasicos;

import java.util.Scanner;

/**
 *
 * @author Franco David Laghezza
 */
public class Intervalo {
    
    public static void main(String[] args) {
        
        int a,b,c,d;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escribe el primer valor del intervalo[a,b]");
        a = entrada.nextInt();
        
        System.out.println("Escribe el segundo valor del intervalo[a,b]");
        b = entrada.nextInt();
        
        System.out.println("Escribe el primer valor del intervalo[c,d]");
        c = entrada.nextInt();
        
        System.out.println("Escribe el segundo valor del intervalo[c,d]");
        d = entrada.nextInt();
        System.out.println("La intersección de ["+a+","+b+"] U ["+c+","+d+"] es:");
        
        for(int i = a; i <= b; i++){
            
            for(int j = c; j <= d; j++){
                
                if(i == j){
                    
                   System.out.print(i+" "); 
                }
   
            }
        }
        System.out.println();
    }
}
