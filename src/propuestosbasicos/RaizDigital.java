/*
 * Dado un número natural N, se calcula la raíz digital de N sumando los dígitos que
 * lo componen. El proceso se repite sobre el nuevo número hasta que el resultado
 * obtenido tiene un sólo dígito. Este último número es la raíz digital del número N.
 */
package propuestosbasicos;

/**
 *
 * @author Franco David Laghezza
 */
public class RaizDigital {
    
    public static void main(String[] args) {
        
        int num = 347;
        int resto = 0;
        int resultado = 0;
        
        while(num > 0){

            resto = num % 10;
            
            resultado += resto;
            
            num /= 10;
            
        }
        
        while(resultado >= 10){
            
            resto = resultado % 10;
            
            resultado /= 10;
                        
            resultado += resto;
 
        }
        System.out.println(resultado);
        //Output -> 347 = 3 + 4 + 7 -> 14 = 1 + 4 -> 5
    }
}
