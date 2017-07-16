/*
 * Escribir un programa que dado el precio de un producto, calcule el precio aplicando 
 * un descuento del 15%
 * Pintar por consola el precio original y el descuento
 */
package com.cice.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Alicia
 */
public class Ejercicio04 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el precio del producto: ");
        double precio=sc.nextDouble();
        double descuento=(precio*15)/100;
        double resultado =precio -descuento;
        System.out.println("El precio es: "+ precio + " y descontado el 15%: "+ resultado);
    
    }
    
}
