package es.studium.ejercicio10;

import java.util.Scanner;

public class Ejercicio10
{

	public static void main(String[] args)
	{
		int veces, numero, i;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame las veces a repetir:");
		veces = teclado.nextInt();
		
		System.out.println("Dame un número entero:");
		numero = teclado.nextInt();
		teclado.close();
		
		for(i=1; i<=veces; i++){
		System.out.println(numero);
		}
		
	
		// TODO Auto-generated method stub

	}

}
