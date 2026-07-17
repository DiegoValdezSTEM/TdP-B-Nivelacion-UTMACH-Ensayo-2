package com.utmach.ensayo2;

/**
 * @author Diego Andrés Valdez Aguilar
 */

import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String clave;
        do {
            System.out.print("Ingrese la contraseña: ");
            clave = sc.nextLine();
        } while (!clave.equals("java2026"));
        System.out.println("Acceso concedido.");
    }
}