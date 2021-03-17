import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		int x;

		System.out.println("Digite edad: ");	
		x = myScan.nextInt();
		/* switch (x) {
			case 17: 
				System.out.println("Es mayor de edad");
				break;
			
			case 19:
				System.out.println("No es mayor de edad");
				break;
		} */		

		if (x <= 18) {
			System.out.println("menorcito");	
		} else {
			System.out.println("Mayor");	
		}
	}
}
