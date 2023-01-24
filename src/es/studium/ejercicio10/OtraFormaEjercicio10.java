package es.studium.ejercicio10;

import java.util.Scanner;

public class OtraFormaEjercicio10
{

	public static void main(String[] args)
	{
		int veces, numero;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame las veces a repetir:");
		veces = teclado.nextInt();
		
		System.out.println("Dame un número entero:");
		numero = teclado.nextInt();
		teclado.close();
		
		for( int i=0; i<veces; i++){ //*Para ganar memoria ponemos la i aqui del tiron*//
		System.out.println(numero);
		}
		// TODO Auto-generated method stub

	}

}
