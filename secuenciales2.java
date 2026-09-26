package proyecto1;

import java.util.Scanner;

public class secuenciales2 
{

	public static void main(String[] args)
	{
		//Defino números
		int num=0;
		int num1=0;
		
		//Creo un objeto 
		Scanner sc= new Scanner(System.in);
		
		//Introduzco los números
		System.out.print("Introduce el primer número:\n");
			num=sc.nextInt();
		
		System.out.print("Introduce el segundo número:\n");
			num1=sc.nextInt();
		
		//Operaciones
		double suma = num+num1;
		double resta = num-num1;
		double multiplicacion = num*num1;
		double division = (double)num/num1;
		
		//Muestro los resultados
		System.out.println("La suma es: "+suma);
		System.out.println("El resultado de la resta es: "+resta);
		System.out.println("El resultado de la multiplicación es: "+multiplicacion);
		//Uso un formateo para la divisón con printf y dentro de las comillas añadir %.2f y después de comillas ,división
		System.out.printf("El resultado de la divisón es: %.2f\n",division);
		
	}

}
