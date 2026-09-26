package proyecto1;

import java.util.Scanner;

public class secuencial4 
{

	public static void main(String[] args) 
	{
		double valor1=0;
		double valor2=0;
		double valor3=0;
		double valor4=0;
		
		Scanner sc= new Scanner(System.in);
		
		
		
		System.out.print("Introduce la Primera Calificación: \n");
		valor1=sc.nextDouble();
		System.out.print("Introduce la Segunda la Calificación: \n");
		valor2=sc.nextDouble();
		System.out.print("Introduce la Tercera Calificación: \n");
		valor3=sc.nextDouble();
		System.out.print("Introduce la Cuarta Calificación: \n");
		valor4=sc.nextDouble();
		
		double suma=valor1+valor2+valor3+valor4/4;
		System.out.printf("Calificación promedia: %.2f \n", suma);
		
		
		
		
	}

}
