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
        
        System.out.println(digital_root(347));
        //Output -> 347 = 3 + 4 + 7 -> 14 = 1 + 4 -> 5
    }
    
    public static int digital_root(int n) {
        int ac = 0;

        while (n >= 1) {
            ac += n % 10;
            n /= 10;
        } 

        if( ac >= 10) {
            return digital_root(ac);
        }

        return ac;
    
  }
}
