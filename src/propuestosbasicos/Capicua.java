/*
 * Comprobar si un número entero y positivo es capicúa.
 */
package propuestosbasicos;

import java.util.Scanner;

/**
 *
 * @author Franco David Laghezza
 */
public class Capicua {
    
    public static void main(String[] args) {
        
        int num;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escribe un número");
        
        num = entrada.nextInt();
       
        if(esCapicua(num)){
            System.out.println(num+" es capicúa"); 
        }
        
        else{
            System.out.println(num+" no es capicúa"); 
        }
       
    }
    
    public static boolean esCapicua(int num){
        
        int auxiliar = num;
        int num_reves = 0;
        int resto = 0;
        
        while(num > 0){
            
            resto = num % 10;
            num_reves = num_reves*10+resto;
            num /= 10;
             
        }
        
        return num_reves == auxiliar;
    }
}
