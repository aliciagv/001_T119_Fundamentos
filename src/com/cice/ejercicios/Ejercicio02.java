/*
 * Dados dos números por consola diga cual es el mayor
 */
package com.cice.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alicia
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Introduce un número");

            int a = sc.nextInt();

            System.out.println("Introduce otro número");

            int b = sc.nextInt();
            if (a > b) {
                System.out.println("a es mayor que b");
            } else if (a < b) {
                System.out.println("a es menor que b");
            } else {
                System.out.println("a y b son iguales");
            }

        } catch (InputMismatchException imme) {
            System.out.println("Debe introducir un número");
        }
    }
}
