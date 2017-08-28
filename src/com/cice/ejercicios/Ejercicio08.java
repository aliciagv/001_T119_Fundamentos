/*
 * Primera calculadora
*/
package com.cice.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Alicia
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion=0;
        int a=0;
        int b=0;
        Scanner sc =new Scanner(System.in);
        do {
            System.out.println("PRIMERA CALCULADORA v.1.0");
            System.out.println("=====================");
            System.out.println("Elige una opción");
            System.out.println("1. Sumar");
            System.out.println("2. Resta");
            System.out.println("0. Salir");
            
            opcion=sc.nextInt();
            if (opcion==1 || opcion==2){
             System.out.println("Introduce el número A:");
                a=sc.nextInt();
                System.out.println("Introduce el número B:");
                b=sc.nextInt();
            }
            switch (opcion) {
                case 1:
                    System.out.println("La suma de "+a + "+"+b+"="+ (a+b) );
                    break;
                case 2:
                    System.out.println("La resta de "+a + "-"+b+"="+ (a-b) );
                    break;
                default:
                  
            }
        } while (opcion!=0);
    }
    
}
