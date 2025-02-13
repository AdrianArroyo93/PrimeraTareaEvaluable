package SolicitaTresNumeros;
import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

public class SolicitaTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos una instancia de Scanner

        // Solicitamos al usuario que ingrese tres números
        System.out.print("Introduce el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Introduce el tercer número: ");
        int numero3 = scanner.nextInt();

        // Usamos el operador ternario para verificar si el tercer número es mayor que la suma de los dos primeros
        String resultado = (numero3 > (numero1 + numero2)) ? "El tercer número es mayor que la suma de los dos primeros." 
                                                  : "El tercer número no es mayor que la suma de los dos primeros.";

        // Mostramos el resultado al usuario
        System.out.println(resultado);
    }
}