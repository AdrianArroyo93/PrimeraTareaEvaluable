package TransformaMinutosEnDiasyHoras;
import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

public class TransformaMinutosEnDiasyHoras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos una instancia de Scanner

        // Solicitamos al usuario que ingrese una cantidad de minutos
        System.out.print("Introduce una cantidad de minutos: ");
        int minutos = scanner.nextInt();

        // Convertimos los minutos a días y horas
        int dias = minutos / 1440; // Un día tiene 1440 minutos (24 horas * 60 minutos)
        int horas = (minutos % 1440) / 60; // Obtenemos las horas restantes después de calcular los días

        // Mostramos el resultado al usuario
        System.out.println(minutos + " minutos son aproximadamente " + dias + " días y " + horas + " horas.");
    }
}
