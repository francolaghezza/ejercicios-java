/*
 * Algoritmo que diga si un número entero positivo es primo o no.
 */
package propuestosbasicos;

import java.util.Scanner;

/**
 *
 * @author Franco David Laghezza
 */
public class Primo {
    
     public static void main(String[] args) {
        
        int num;
      
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escribe un número");
        num = entrada.nextInt();
        
        if(esPrimo(num)){
            System.out.println(num+ " es primo");
        }
        else{
            System.out.println(num+ " no es primo");
        }
    }
    
    public static boolean esPrimo(int num){
        
        boolean primo = true;
         
        for(int i = 2;i < num; i++){
             
            if(num % i == 0){
                primo = false;
            }
        }
        return primo;
    }
}
