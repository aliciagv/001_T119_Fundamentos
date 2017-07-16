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
public class BucleFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //sirven para recorrer arrays
        int[] arrayEnteros={1,2,3,4,5};
        for (int i=0; i<arrayEnteros.length;i++){
            System.out.println(arrayEnteros[i]);    
        }
        
        // del 0 al 100 los números pares
        
        for (int i=0; i<=100; i++){
            if (i%2==0){
                System.out.print(i+ ", ");
            }
        }
        
    }
    
}
