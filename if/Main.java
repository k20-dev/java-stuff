import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		System.out.println("Si es mayor de 18 no entra a la tafies.");	
		System.out.println(" ");

		System.out.println("Ingrese su Edad: ");
		Scanner prompt = new Scanner(System.in);
	    
		// EDAD	
		int edad = prompt.nextInt();

		if (edad < 18) {
			System.out.println("ERROR!! : No es mayor de edad");	
		}
		else if ((edad > 20) && (edad < 22))
	   	{ 
			System.out.println("Si es mayor de edad");		
		}
		else 
	   	{
			System.out.println("Hola que es para hacer nunca hay argumentos");	
		}
	}
}
