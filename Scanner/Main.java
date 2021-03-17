// Importar el paquete Scanner
import java.util.Scanner; 

public class Main {
	public static void main (String[] args) {
		System.out.println("Prompts or Scanner in Java");	
		
		Scanner miEscaner = new Scanner(System.in);	
		String miPregunta;
		
		// Ingrese usuario y presione ENTER
		System.out.println("Ingrese Nombre de usuario: ");
		miPregunta = miEscaner.nextLine();

		//Print al resultado
		System.out.println("El nombre es: " + miPregunta);
	}
}
