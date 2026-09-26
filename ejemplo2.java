package proyecto1;

import java.util.Scanner;

public class ejemplo2 {

	public static void main(String[] args) 
	{
		int numero= 0; 
		Scanner sc= new Scanner(System.in);

		System.out.println("Introduce un nº");
		numero=sc.nextInt();
		System.out.println("El valor introducido es "+numero);
		System.out.printf("El valor introducido es %s", numero);
	}

}
