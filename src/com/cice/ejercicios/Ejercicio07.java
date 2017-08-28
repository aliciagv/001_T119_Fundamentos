/*
 * Crear un arraiy con los datos de un alumnos, mostra la media y que pinte una calificación
 *{2,5,7,6,9} -> calcular la media 
 * calificacion
 * 0-4.9 insuficente
 * 5- 5.9 suficente
 * 6 - 6.9 bien
 * 7 - 8.9 notable
 * 9 - 10 sobresaliente
 */
package com.cice.ejercicios;

/**
 *
 * @author Alicia
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double[] notas = {3, 5, 7, 6, 9};

        double media = 0;
        System.out.print("Las notas del alumno son:");
        for (double nota : notas) {
            System.out.print(" " + nota);
            media += nota;
        }
        media = media / notas.length;
        System.out.println("La media de las notas es: " + media);
        if (media < 5) {
            System.out.println(" CALIFICACIÓN: Insuficiente");
        } else if (media < 6) {
            System.out.println(" CALIFICACIÓN: Suficiente");
        } else if (media < 7) {
            System.out.println(" CALIFICACIÓN: Bien");
        } else if (media < 9) {
            System.out.println(" CALIFICACIÓN: Notable");
        } else {
            System.out.println(" CALIFICACIÓN: Sobresaliente");
        }
        //CASTING -> conversión de un dato de tipo double o float a un entero
        int notaEntero = (int) media;

        switch (notaEntero) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                   System.out.println("CALIFICACIÓN: Insuficiente");
                break;
            case 5:
                  System.out.println("CALIFICACIÓN: Suficiente");
                break;
            case 6:
                     System.out.println("CALIFICACIÓN: Bien");
                break;
            case 7:
            case 8:
                  System.out.println("CALIFICACIÓN: Notalbe");
                break;
            case 9:
            case 10:
                  System.out.println("CALIFICACIÓN: Sobresaliente");
                break;

            default:
                throw new AssertionError();
        }
    }

}
