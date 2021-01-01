/*
 * Sucesión de Fibonacci:
 * La sucesión comienza con los números 0 y 1; a partir de estos,
 * cada término es la suma de los dos anteriores.
 */
package propuestosbasicos;

import java.util.Scanner;

/**
 *
 * @author Franco David Laghezza
 */
public class Fibonacci {
    
    public static int terminoFibonacci(int n){
        
        int resultado = 0;
        
        if(n > 2){
            
            resultado = terminoFibonacci(n-1)+terminoFibonacci(n-2);
        }
        
        else if(n == 1 || n == 2){
            
            resultado = 1;
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
        
        int num_terminos;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dime el número de términos que quieres en la serie de Fibonacci");
        
        num_terminos = entrada.nextInt();
        
        for(int i = 0;i < num_terminos ; i++){
            System.out.print(terminoFibonacci(i)+" ");
        }
        
    }
}
