package GenerarCuatroPassRandom;
import java.util.Random; // Importamos la clase Random para generar números aleatorios
public class GenerarCuatroPassRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(); // Creamos una instancia de Random (si no se importa anteriormente no funcionará, al igual que scanner)

        // Generamos un número aleatorio de 4 dígitos
        int contrasena = random.nextInt(9000) + 1000; // Le sumamos + 1000 para asegurarnos los 4 digitos 
        											  // y 9000 siendo el numero tope de las cuatro cifras (1000 - 9999)

        // Imprimimos para mostrar la contraseña generada al usuario
        System.out.println("Tu contraseña generada es: " + contrasena);
		
	}

}
