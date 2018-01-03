

package sumardigitos;
import java.util.Scanner;

public class SumarDigitos {

    public static void main(String[] args) {
        
        
        int numero, suma=0,digito;
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Introduzca un numero:");
        numero=leer.nextInt();
        
        
        
        while( numero!=0){
            
            digito=numero%10;
            numero=numero/10;
            suma=suma+digito;
            digito=0;
        }
        
        System.out.println("La suma de los digitos es:"+suma);
    }
    
}
