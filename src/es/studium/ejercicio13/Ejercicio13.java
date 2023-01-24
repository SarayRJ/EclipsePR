package es.studium.ejercicio13;

import java.util.Scanner;

public class Ejercicio13
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num1, resultado,i;
		
		System.out.println("Dame un número entero:");
		num1= teclado.nextInt();
		teclado.close();
		for(i=0;i<=10;i++)
		{
			resultado=num1*i;
			System.out.println(num1+ "*" + i+ "="  + resultado);
		}
		
				
		// TODO Auto-generated method stub

	}

}
