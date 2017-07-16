/*
 * Escribir un programa que escriba en la pantalla tu nombre completo en una línea y en la siguiente línea
 * tu fecha de nacimiento
 * 2 variables de tipo de String, cada una contendrá la información solicitada
 * Pintamos las 2 líneas con un sout
 */
package com.cice.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Alicia
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Escribe tu nombre completo");
        String nombre=sc.nextLine();
        System.out.println("Escribe tu fecha de nacimiento");
        String fecha =sc.nextLine();
        System.out.println("Tu nombre es: "+ nombre+ " y tu fecha de nacimiento: "+ fecha);
    }
    
}
