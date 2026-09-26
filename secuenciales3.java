package proyecto1;

import java.util.Scanner;

public class secuenciales3 
{

	public static void main(String[] args) 
	{
		//Defino números
		double horas=0;
		double valor=0;
		
		//Creo objeto
		Scanner sc= new Scanner(System.in);
		
		//Introduzco los números
		System.out.print("Introduce las horas trabajadas: \n");
		horas= sc.nextDouble();
		System.out.print("Introduce el valor por hora: \n");
		valor= sc.nextDouble();
		//Añado operación
		double multiplica= horas*valor;
		System.out.print("Tu salario es de: "+multiplica);
		
	}

}
