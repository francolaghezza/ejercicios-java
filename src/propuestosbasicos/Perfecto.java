/*
 * Un número natural se denomina perfecto cuando es igual a la suma de todos sus
 * divisores, primos o no excepto él mismo.
 */
package propuestosbasicos;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class Perfecto {
    
    public static void main(String[] args) {
        
        int num;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escribe un número");
        
        num = entrada.nextInt();
        
        if(esPerfecto(num)){
            System.out.println(num+" es perfecto");
        }
        else{
            System.out.println(num+" no es perfecto");
        }
    }
    
    public static boolean esPerfecto(int num){
        
        int suma_num = 0;
        
        for(int i = 1; i < num; i++){
             
            if(num % i == 0){
                suma_num += i;
            }
        }
        return suma_num == num;
    }
}
