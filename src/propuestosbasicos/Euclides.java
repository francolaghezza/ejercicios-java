/*
 * 4 primeros números perfectos según Euclides -> 2^n–1(2^n – 1)
 */
package propuestosbasicos;

/**
 *
 * @author Franco David Laghezza
 */
public class Euclides {
    
     public static int elevar(int x,int n){
        
        int num_elevado = 1;
        
        for(int i=0;i<n;i++){
            
            num_elevado*=x;
            
        }
        return num_elevado;
    }
    
    public static boolean esPrimo(int num){
        boolean primo = true;
        
        if(num == 0 || num == 1){
            primo = false;
        }
        for(int i = 2 ;i < num; i++){
        
            if(num % i == 0){
                
                primo = false;
            }
        }
        return primo;
    }
    
    public static void cuatroPerfectos(){
        int contador = 0;
       
        for(int i=0;contador<4;i++){
            
            if(esPrimo(i)){
                
                contador++;
                System.out.println(elevar(2,i-1)*(elevar(2,i)-1));
            }
        }         
    }
    
    public static void main(String[] args) {
        
       cuatroPerfectos();
    }
}
