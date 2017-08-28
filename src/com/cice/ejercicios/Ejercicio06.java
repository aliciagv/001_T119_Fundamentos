/*
 * Dado un número se suman todos los consecutivos hasta que la suma llegue a 100
 */
package com.cice.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alicia
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Escribe un número menor que 100");
        try {
            int nextInt = sc.nextInt();
            int suma=0;
            for (int i= nextInt; suma<=100; i++){
                suma+=i;
            }
            System.out.println("El resultado es:  "+ suma);
        } catch (InputMismatchException ime){
            System.out.println("No ha introducido un número");
        }
        
    }
    
}
