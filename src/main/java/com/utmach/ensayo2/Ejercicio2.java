package com.utmach.ensayo2;

/**
 * @author Diego Andrés Valdez Aguilar
 */

import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Ingrese el primer número: ");
        a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        b = sc.nextInt();
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Residuo: " + (a % b));
    }
}