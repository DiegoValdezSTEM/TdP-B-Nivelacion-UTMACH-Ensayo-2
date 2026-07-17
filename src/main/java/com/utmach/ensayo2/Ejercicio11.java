package com.utmach.ensayo2;

/**
 * @author Diego Andrés Valdez Aguilar
 */

import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número 1: ");
        int numero = sc.nextInt();
        int mayor = numero;
        int menor = numero;
        for (int i = 2; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = sc.nextInt();
            if (numero > mayor) {
                    mayor = numero;
            }
            if (numero < menor) {
                    menor = numero;
            }
        }
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);
    }
}