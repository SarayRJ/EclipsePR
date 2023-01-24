package es.studium.ejercicio14;

import java.util.Scanner;

public class Ejercicio14
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int base,exp;
		int resultado;
		
		
		System.out.println("Dame un número entero:");
		base=teclado.nextInt();
		
		System.out.println("Dame otro número entero");
		exp=teclado.nextInt();
		teclado.close();
		
		
		resultado=pot(base,exp);
		System.out.println("El número " +base+ " elevado a " + exp + " es igual a " + resultado);
		
	}
	public static int pot(int base, int exp)
	{
		int i, resultado=1;
		for (i=1;i<=exp;i++)
		{
			resultado=resultado*base;
			
		}
			
		return(resultado);
		
		

	}

}
