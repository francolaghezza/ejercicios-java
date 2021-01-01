/*
 * Programa que calcula el producto de dos números enteros y positivos mediante
 * sumas sucesivas.
 */
package propuestosbasicos;

import java.util.Scanner;

/**
 *
 * @author Franco David Laghezza
 */
public class Producto {
    
    public static int producto(int num1,int num2){
        
        int resultado = 0;
        
        for(int i = 0;i < num2; i++){
            resultado += num1;
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
        
        int num1,num2;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escribe un número");
        num1 = entrada.nextInt();
        
        System.out.println("Escribe otro número");
        num2 = entrada.nextInt();
        
        System.out.println(num1+" X "+num2+" = "+producto(num1,num2));
    }
}

