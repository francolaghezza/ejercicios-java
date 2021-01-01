/*
 * Construir un algoritmo que permita multiplicar dos números enteros positivos
 * empleando el método denominado MULTIPLICACIÓN RUSA. Este método permite
 * calcular el producto de M*N de la siguiente manera:
 *
 * En pasos sucesivos se divide M por 2 (división entera) y se multiplica N por 2.
 * Este proceso se repite hasta que M es 0. El resultado de la multiplicación
 * deseada se obtiene acumulando aquellos valores sucesivos de N para los cuales
 * el valor de M es impar.
 */
package propuestosbasicos;

/**
 *
 * @author Franco David Laghezza
 */
public class MultiplicacionRusa {
    
    public static boolean esImpar(int num){
        
        return num % 2 != 0;
    }
    
    public static int multiplicacionRusa(int n, int m){
        
        int acumulado = 0;
        
        while(m > 0){
 
            if(esImpar(m)){
                
                acumulado += n;
            }
            
            m /= 2;
            n *= 2;
        }
        return acumulado;
    }
    
    public static void main(String[] args) {
        
        System.out.println(multiplicacionRusa(89,37));
        // Salida -> 3293
    }
}
