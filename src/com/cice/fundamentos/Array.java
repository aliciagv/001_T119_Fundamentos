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
public class Array {

    public static void main(String[] args) {

        //ARRAY DE UNA DIMENSIÓN    
        //Un array es un objeto de java, que permite almacenar en su interior varios datos del mismo tipo
        int[] arrayEnteros = {1, 2, 3, 4, 5};
        //    arrayEnteros=[0,1,2,3,4]
        //arrayEnteros[0 -4]
        System.out.println("El valor de la posición debes ser 1, y el valor recogido es: " + arrayEnteros[0]);
        System.out.println(arrayEnteros[4]);

        String[] arrayString = new String[7];
        arrayString[0] = "Lunes";
        arrayString[1] = "Martes";
        arrayString[2] = "Miércoles";
        arrayString[3] = "Jueves";
        arrayString[4] = "Viernes";
        arrayString[5] = "Sábado";
        arrayString[6] = "Domingo";

        System.out.println(arrayString[2]);

        String array2[] = new String[3];

        //ARRAY DE DOS DIMENSIONES
        //Matrices
        //Caja de cajas -> una caja es un array
        int[][] array2D = new int[2][5];
        //Para acceder a la primera caja(array) accedo mediante la posición [0]
        //Para acceder a la posición de esa caja utilizao la posición [x]

        //para alamacenar un dato requiero el número de caja y su posición [0][x]
        array2D[0][0] = 0;
        array2D[0][1] = 1;
        array2D[0][2] = 2;
        array2D[0][3] = 3;
        array2D[0][4] = 4;

        array2D[1][0] = 5;
        array2D[1][1] = 6;
        array2D[1][2] = 7;
        array2D[1][3] = 8;
        array2D[1][4] = 9;
        
        System.out.println("=====================");
        System.out.println(array2D[0][4]);
        System.out.println(array2D[1][1]);
    }

}
