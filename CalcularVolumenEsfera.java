package CalcularVolumenEsfera;
import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario
public class CalcularVolumenEsfera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in); // Creamos una instancia de Scanner

        // Solicitamos al usuario que ingrese el radio de la esfera
        System.out.print("Introduce el radio de la esfera: ");
        double radio = scanner.nextDouble();

        // Calculamos el volumen de la esfera
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3); 
        //Calculamos el volumen de la esfera utilizando la fórmula V=43πR3. Math.PI proporciona el valor de π y Math.pow(radio, 3) calcula el radio al cubo.


        // Mostramos el volumen al usuario
        System.out.println("El volumen de la esfera es: " + volumen);

	}

}
