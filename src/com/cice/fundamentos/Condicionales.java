/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.fundamentos;

/**
 *
 * @author Alicia
 */
public class Condicionales {

    public static void main(String[] args) {

        int a = 4;
        int b = 5;

        //Condicional if(a>b)
        //if (true) {ejecuta sentencias}
        if (a < b) {
            System.out.println("a es menor que b");
        } else {
            System.out.println("a no es menor que b");
        }
        
        System.out.println("===========================================");
        //Primera condición a<=b
        
        if (a<=b){
            if (a<b){
                System.out.println("a es menor que b");     
            } else {
                System.out.println("a y b son iguales");
            }
        } else {
            System.out.println("a es mayor que b");
        
        }
        
         System.out.println("===========================================");
         
         if (a==b){
             System.out.println("a y b son iguales");
         } else if (a>b){
             System.out.println("a es mayor que b");
         } else {
             System.out.println("a es menor que b");
         }
         
          System.out.println("===========================================");
         //Instrucción switch()-> int, char, String
         
        
         switch(a){
             case 0:
                 System.out.println("a es 0");
                 break;
             case 1:
                 System.out.println("a es 1");
                 break;
             case 2: 
                 System.out.println("a es 2");
                 break;
             case 3:
                 System.out.println("a es 3");
                 break;
             case 4: 
                 System.out.println("a es 4");
                 break;
             case 5: 
                 System.out.println("a es 5");
                 break;
             default:
                 System.out.println("a no esta entre 0 y 5");
        }
         
         
    }

}
