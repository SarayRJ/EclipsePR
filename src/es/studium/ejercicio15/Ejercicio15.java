package es.studium.ejercicio15;

import java.util.Scanner;

public class Ejercicio15
{

	public static void main(String[] args)
	{Scanner teclado = new Scanner(System.in);
		int num;
		System.out.println("Dame un número entero:");
		num=teclado.nextInt();
		teclado.close();
		
		switch(num)
		{
		case 1:
			System.out.println("El mes equivalente al número introducido es Enero");
			break;
			
		case 2:
			System.out.println("El mes equivalente al número introducido es Febrero");
			break;
			
		case 3:
			System.out.println("El mes equivalente al número introducido es Marzo");
			break;
			
		case 4:
			System.out.println("El mes equivalente al número introducido es Abril");
			break;
			
		case 5:
			System.out.println("El mes equivalente al número introducido es Mayo");
			break;
			
		case 6:
			System.out.println("El mes equivalente al número introducido es Junio");
			break;
			
		case 7:
			System.out.println("El mes equivalente al número introducido es Julio");
			break;
			
		case 8:
			System.out.println("El mes equivalente al número introducido es Agosto");
			break;
			
		case 9:
			System.out.println("El mes equivalente al número introducido es Septiembre");
			break;
			
		case 10:
			System.out.println("El mes equivalente al número introducido es Octubre");
			break;
			
		case 11:
			System.out.println("El mes equivalente al número introducido es Noviembre");
			break;
			
		case 12:
			System.out.println("El mes equivalente al número introducido es Diciembre");
			break;
			
		 default:
			System.out.println("El mes equivalente al número introducido no equivale a ningún mes del año");
			break;
			
			
			
			
			
			
			
			
		}

	}

}
