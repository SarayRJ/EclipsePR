package es.studium.ejercicio17;

import java.util.Scanner;

public class Ejercicio17
{

	public static void main(String[] args)
	{
		Scanner teclado= new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Dame un número entero:");
		a=teclado.nextInt();
		
		System.out.println("Dame un segundo número entero");
		b=teclado.nextInt();
		
		System.out.println("Dame un tercer número entero:");
		c=teclado.nextInt();
		teclado.close();
		
			if(a>=b && b>=c) {
				System.out.println("El orden es:" +a+ "," + b + "," + c);
			}
			
			else if(a>=c && c>=b) {
				System.out.println("El orden es:" +a+ "," + c + "," + b);
			}
			
			if(b>=a && a>=c) {
				System.out.println("El orden es:" +b+ "," + a + "," + c);
			}
			
			if(b>=c && c>=a) {
				System.out.println("El orden es:" +b+ "," + c + "," + a);
			}
			
			if(c>=a && a>=b) {
				System.out.println("El orden es:" +c+ "," + a + "," + b);
			}
			
			if(c>=b && b>=a) {
				System.out.println("El orden es:" +c+ "," + b + "," + a);
			}
			
		
		
	}

}
