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
public class TiposDatos {
    
    public static void main (String[] args){
        
        int entero=0;
        float comaflotante=1.15f; //recordad que es float debemos definir el valor como tal
        double decimal=1.359;
        long enterocongrancapacidad=12222200;
        char caracter='c';
        boolean booleano=true;
        
        String cadenaCaracteres="Esto es una cadena de caracteres";
        entero=2;
        System.out.println("entero: "+ entero);
        System.out.println(comaflotante);
        System.out.println(decimal);
        System.out.println(enterocongrancapacidad);
        System.out.println(caracter);
        System.out.println(booleano);
        System.out.println(cadenaCaracteres);
        
        //Operaciones matemáticas
        //+; -; *; /; %;
        System.out.println("===========================");
        System.out.println(comaflotante+1.15f);
        System.out.println(comaflotante-0.15f);
        System.out.println(decimal*5);
        System.out.println(comaflotante/1.15f);
        System.out.println(24%5);
        System.out.println(73%2);
        
        //Signos de comprobacion
        //>; <; >=,<=; ==; !=
        System.out.println("====Signos de comprobacion======");
        System.out.println(2>6);
        System.out.println(2<6);
        System.out.println(2==3);
        System.out.println(2!=3);
        
        //Concatenación
        System.out.println("El valor del entero es: "+ entero);
        
        
        
    
    }
    
}
