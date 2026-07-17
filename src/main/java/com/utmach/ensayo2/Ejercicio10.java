package com.utmach.ensayo2;

/**
 * @author Diego Andrés Valdez Aguilar
 */

import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = sc.nextInt();
            suma += numero;
        }
        double promedio = suma / 10.0;
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}