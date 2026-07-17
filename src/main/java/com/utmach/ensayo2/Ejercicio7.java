package com.utmach.ensayo2;

/**
 * @author Diego Andrés Valdez Aguilar
 */

import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int cantidad = 0;
        int suma = 0;
        while (true) {
            System.out.print("Ingrese un número positivo: ");
            numero = sc.nextInt();
            if (numero < 0) {
                break;
            }
            cantidad++;
            suma += numero;
        }
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Suma: " + suma);
    }
}