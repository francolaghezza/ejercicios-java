/*
 * Programa que evalúa un polinomio de grado N.
 * Los datos de entrada son el valor de la variable, el grado y
 * los valores de los coeficientes.
 */
package propuestosbasicos;

import java.util.Scanner;

/**
 *
 * @author Franco David Laghezza
 */
public class Polinomio {
    
    public static int potencia( int base, int exponente){
        
        int resultado = 1;
        for (int i = 0; i < exponente; i++){
            resultado = resultado * base;
        }
        return resultado;
        
    }
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int grado, monomio, coeficiente;
        int x, valorPolinomio;
        System.out.println("Grado del polinomio: ");
        grado = entrada.nextInt();
        
        System.out.println("Valor de la variable ");
        x = entrada.nextInt();
        
        valorPolinomio = 0;
        
        for(monomio= grado; monomio >= 0; monomio--){
            System.out.println("coeficiente de  X^"+ monomio);
            coeficiente = entrada.nextInt();
            valorPolinomio = valorPolinomio + coeficiente * potencia(x,monomio);
        
        }
        System.out.println("El valor del Polinomio es " + valorPolinomio);
    }
}
