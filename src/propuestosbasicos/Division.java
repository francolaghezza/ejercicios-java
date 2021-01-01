/*
 * Programa que obtiene el cociente y el resto de dos números enteros y positivos
 * mediante restas sucesivas.
 */
package propuestosbasicos;

import java.util.Scanner;

/**
 *
 * @author Franco David Laghezza
 */
public class Division {
    
    public static void dividir(int dividendo, int divisor){
        
        int resto,cociente,aux_dividendo;
        resto = 0;
        cociente = 0;
        aux_dividendo = dividendo;
        
        if(divisor == 0){
            
            System.out.println("No se puede dividir entre 0");
            System.exit(0);
        }
        
        while(dividendo >= divisor){
            
            dividendo-=divisor;
            
            resto = dividendo;
            cociente ++;
        }
        
        System.out.println(aux_dividendo+" / "+divisor+" = "+cociente);
        System.out.println("El resto es "+resto);
    }
    
    public static void main(String[] args) {
         
        int dividendo,divisor;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escribe el dividendo");
        dividendo = entrada.nextInt();
        
        System.out.println("Escribe el divisor");
        divisor = entrada.nextInt();
        
        dividir(dividendo,divisor);
    }
}
