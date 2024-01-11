/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

import java.util.Scanner;

public class Ejemplo08 {

    public static void main(String[] args) {
        // Ingresar por teclado el tamaño de un arreglo
        // Ingresar por teclado los valores enteros del arreglo
        // Sumar los valores del arreglo, mediante la función misterio
       
        Scanner entrada = new Scanner(System.in);
        System.out.println("define el tamanio del arreglo");
        int n = entrada.nextInt();
        int [] arreglo = new int[n];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("ingrese los datos del arreglo");
            arreglo[i]= entrada.nextInt();
            
        }
         for (int i = 0; i < arreglo.length; i++) {
             misterio(arreglo, n);
        }
         System.out.println(misterio(arreglo, arreglo.length));
    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}
