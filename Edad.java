package CalculaTuEdad;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

public class CalculaTuEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos una instancia de Scanner

        // Solicitamos al usuario que ingrese su año de nacimiento
        System.out.print("Introduce tu año de nacimiento: ");
        int anioNacimiento = scanner.nextInt();

        // Definimos el año actual
        int anioActual = 2024;

        // Calculamos la edad
        int edad = anioActual - anioNacimiento;

        // Mostramos la edad al usuario
        System.out.println("Tu edad actual es: " + edad + " años.");
    }
}