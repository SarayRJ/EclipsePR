package es.studium.ejercicio2;

import java.util.Scanner;

public class Ejercicio2
{

	public static void main(String[] args)
	{
		//VARIABLES, ENTERO numero 1, numero 2, suma
		int numero1, numero2, suma;
		Scanner teclado = new Scanner (System.in); //los tipos basicos aparecen en minuscula como int, las clases como Scanner empiezan por mayuscula
		
		//ESCRIBIR "Dame un número"
		System.out.println("Dame un número:");
		
		//LEER numero1, para leer un numero necesito un objeto especial en JAVA, el objeto es de la clase Scanner
		numero1 = teclado.nextInt(); //en numero uno meto lo que se escriba en el teclado, en este caso un entero por eso nextint
		
		//ESCRIBIR "Dame otro número"
		System.out.println("Dame otro número entero");
		
		//LEER numero2
		numero2 = teclado.nextInt();
		teclado.close(); //cerramos teclado para que se nos quite el warning, despues de cuando dejo de usarlo
		
		//suma = numero 1 + numero 2
		suma = numero1 + numero2;
		
		//ESCRIBIR "La suma es" + suma
		System.out.println("La suma es " + suma);
		
	}

}
