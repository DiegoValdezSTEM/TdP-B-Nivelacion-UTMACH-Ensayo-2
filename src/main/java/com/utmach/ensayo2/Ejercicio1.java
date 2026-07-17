package com.utmach.ensayo2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre, carrera;
        int edad;
        double estatura;

        System.out.print("Nombre: ");
        nombre = sc.nextLine();

        System.out.print("Edad: ");
        edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Carrera: ");
        carrera = sc.nextLine();

        System.out.print("Estatura: ");
        estatura = sc.nextDouble();

        System.out.println("\nDatos ingresados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Estatura: " + estatura);
    }
}