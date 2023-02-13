package es.studium.ejercicio4;
/**
 * @author Saray Rodríguez Nuñez
 */
import java.util.Scanner;

public class Ejercicio4
{

	public static void main(String[] args)
	{
		int numero1, numero2, i;
		Scanner teclado = new Scanner (System.in);// TODO Auto-generated method stub
		
		System.out.println("Dame un número:");
		
		
		numero1 = teclado.nextInt(); 
		
		
		System.out.println("Dame otro número entero");
		
		
		numero2 = teclado.nextInt();
		teclado.close();

		//PARA i=numero HASTA i=2
		for(i = numero1; i<=numero2; i++) //i++ significa i mas incremento de 1
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
	}

}
