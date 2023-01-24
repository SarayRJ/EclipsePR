package es.studium.ejercicio9;

import java.util.Scanner;

public class Ejercicio9
{

	public static void main(String[] args)
	{
		int a, b, r;
		r = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un número entero");
		a = teclado.nextInt();
		
		System.out.println("Dame otro número entero:");
		b=teclado.nextInt();
		teclado.close();
		
		if (a<b)
		{ 
			r=a+b;
		
			System.out.println("La suma de " + a + " mas " + b + " es " + r);
		}
		else {
			r=a*b;
			System.out.println("El producto de " + a + " por " + b + " es: " + r);
			
		}
		

	}
	

}
