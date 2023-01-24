package es.studium.ejercicio7;

import java.util.Scanner;

public class Ejercicio7
{

	public static void main(String[] args)
	{
		int numero1, numero2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un número entero:");
		numero1 = teclado.nextInt();
		
		System.out.println("Dame otro número entero:");
		numero2 = teclado.nextInt();
		teclado.close();
		
		if(numero1==numero2) {
		System.out.println("Los números son iguales");
		}
		else {
			if(numero1<numero2) {
			System.out.println("El segundo número es mayor");
			}
			else {
				System.out.println("El primer número es mayor");
			}
			
		}
		// TODO Auto-generated method stub

	}

}
