/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroprimo;

import java.util.Scanner;

/**
 *
 * @author Sandy
 */
public class NumeroPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //utilidad para introducir datos a la consola
        Scanner teclado = new Scanner(System.in);

        //declaracion de variables a utilizar
        int num;
        int c =0;

        //mensaje por consola pidiendo valor
        System.out.print("Ingrese el numero a Comprobar:");

        //pasar como parametro valor introducido por la consola a variable num
        num = teclado.nextInt();

        //un numero primo es el numero que nada mas es divisible por el mismo y la unidad
        //u es el contado para saber la cantidad de divisores que tiene
        for ( int u = 1; u <=num ; u++) {
            if (num % u == 0) {
                c++;
            }

        }
           if (c == 2) {
            System.out.println(" No es Primo");

        } else {
            System.out.println(" Es primo");
        }

      
    }

}
