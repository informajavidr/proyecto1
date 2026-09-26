package proyecto1;
import java.util.Scanner;
public class HolaMundo 
{

	public static void main(String[] args) 
	{
			// comentario de una linea
		System.out.println("Hola desde Eclipse");
/* comentario de varias lineas
 * 
 */
		int edad=0;
		String nombre="";
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Nombre:\n");
		nombre=sc.nextLine ();
		System.out.print("Edad:\n");
		edad=sc.nextInt();
		
		//System.out.print("Hola "+nombre+",");
		System.out.printf("Hola, tu nombre es %s y tu edad es de %d años", nombre,edad);
	}

}
