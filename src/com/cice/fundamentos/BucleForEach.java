/*
 *
 */
package com.cice.fundamentos;

/**
 *
 * @author Alicia
 */
public class BucleForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //estos bucle se usan para recorrer arrays
        String[] nombres = {"Gustavo", "Eva", "Martín", "Jose Luis", "Inma"};

        for (String name : nombres) {
            System.out.println(name);

        }
    }
}
