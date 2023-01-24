package es.studium.ejercicio11;

import java.util.Scanner;

public class OtraForma
{

	public static void main(String[] args)
	{
		int numero1, numero2, auxiliar1, auxiliar2;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Dame un número entero");
		numero1 = teclado.nextInt();
		
		System.out.println("Dame otro número entero");
		numero2 = teclado.nextInt();
		teclado.close();
		{
		
		auxiliar1= numero1;
		auxiliar2 = numero2;
		numero1= auxiliar2;
		numero2=auxiliar1;
		System.out.println("El nuevo valor del primer número es " + numero1 + " y el nuevo valor del segudo número es " + numero2);
		// TODO Auto-generated method stub

	}

	}
}
