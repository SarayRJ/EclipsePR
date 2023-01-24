package es.studium.ejercicio3;

import java.util.Scanner;

public class Ejercicio3
{

	public static void main(String[] args)
	{
		int numero;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame un número");
		
		numero = teclado.nextInt();
		teclado.close();
		
		//SI numero%2=0 ENTONCES
		if(numero%2==0)//HAY QUE PONER DOS IGUALES PARA DECIR QUE ES IGUAL A, YA QUE SINO SE PONDRÍA QUE ES UNA ASIGNACION
		{
			System.out.println("El número es par");
		}
		else //SINO
		{
			System.out.println("El número es impar");
		}
		
		
		

	}

}
