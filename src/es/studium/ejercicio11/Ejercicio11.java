package es.studium.ejercicio11;

import java.util.Scanner;

public class Ejercicio11
{

	public static void main(String[] args)
	{
		int numero1, numero2, auxiliar;
		Scanner teclado = new Scanner(System.in);
		auxiliar=0;
		
		System.out.println("Dame un número entero");
		numero1 = teclado.nextInt();
		
		System.out.println("Dame otro número entero");
		numero2 = teclado.nextInt();
		teclado.close();
		{
		
		auxiliar= numero1;
		numero1= numero2;
		numero2 = auxiliar;
		
		System.out.println("El nuevo valor del primer número es " + numero1);
		System.out.println("El nuevo valor del segudo número es " + numero2);
		
		
		}
		
			
			
			
		}
		
		
		// TODO Auto-generated method stub

	}


