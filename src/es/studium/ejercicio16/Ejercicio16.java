package es.studium.ejercicio16;

import java.util.Scanner;

public class Ejercicio16
{

	public static void main(String[] args)
	{
		Scanner teclado= new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Dame el valor de la variable a:");
		a=teclado.nextInt();
		
		System.out.println("Dame el valor de la variable b:");
		b=teclado.nextInt();
		
		System.out.println("Dame el valor de la variable c:");
		c=teclado.nextInt();
		teclado.close();
		System.out.println("El resultado de la expresión es: " + expresion(a,b,c));

	}
	
	public static float expresion( int a, int b, int c) {
		return((((float)b*(float)b)-(4*(float)a*(float)c))/(2*(float)a));
		
	}

}
