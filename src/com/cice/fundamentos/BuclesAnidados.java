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
public class BuclesAnidados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /* for (int i=0; i<10; i++){
        for (int j=0; j<10; j++){
        }
        */
     /*  
      Tabla de multiplicar
      for (int i=1; i<10; i++){
        for (int j=0; j<=10; j++){
           System.out.println(i +" X "+ j +" = "+(i*j));
        }
       }*/
       String[][] alumnos = new String[2][4];
       alumnos[0][0]="23678A";
       alumnos[0][1]="Kike";
       alumnos[0][2]="Blasco";
       alumnos[0][3]="Java";
       
       alumnos[1][0]="123456B";
       alumnos[1][1]="Pedro";
       alumnos[1][2]="De la Fuente";
       alumnos[1][3]="Web";
       
      for (int i=0; i<alumnos.length;i++){
           System.out.println("Alumno");
           System.out.println("================");
           for (int j=0; j<alumnos[i].length; j++){
               System.out.println(alumnos[i][j]);
           }
       }
      
       for (String[] alumno: alumnos){
           System.out.println("Alumno");
           System.out.println("================");
           for (String dato: alumno){
               System.out.println(dato);
           }
       }
    }
   
    
}
