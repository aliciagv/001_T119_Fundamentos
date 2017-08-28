/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.fundamentos;

import java.util.Scanner;

/**
 *
 * @author Alicia
 */
public class BucleWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //while(boolean){ejecutar sentencias}
        int a = 1;
        int b = 0;
       /* while (a > b) {
            System.out.println("a es mayor que b");
            a = b;
        }

        do {
            System.out.println("a puede que sea mayor que b");
        } while (a > b);*/
    
       int opcion=0; 
       do {
           System.out.println("MENU PRINCIPAL");
           System.out.println("===================");
           System.out.println("Elige una oipción");
           System.out.println("1.- Suma");
           System.out.println("2.- Resta");
           System.out.println("0.- Salir");
           System.out.println("==================");
           Scanner  sc = new Scanner(System.in);
           opcion=sc.nextInt();
           
       } while(opcion!=0);
    }

}
