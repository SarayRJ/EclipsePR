package es.studium.ejercicio6;

import java.util.Scanner;

public class Ejercicio6
{

	public static void main(String[] args)
	{
		int numerador, denominador;
		double resultado; //se utiliza para los numeros reales
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame el numerador:");
		
		
		numerador = teclado.nextInt(); 
		
		
		System.out.println("Dame el denominador:");
		
		
		denominador = teclado.nextInt();
		teclado.close();

		resultado = dividir(numerador, denominador); // NOS VAMOS A LA VARIABLE DIVIDIR QUE LA HEMOS CRADO ABAJO Y LE TRANSPORTO LOS DATOS PARA QUE ME HAGA LA DIVISION Y ME DEVUELVA EL RESULTADO.
		
		System.out.println(resultado);
	}

	public static double dividir(int num, int den)// SON OTRAS DOS VARIABLES DIFERENTES QUE VAN A RECOGER LO QUE LE MANDE LA VARIABLE DE ARRIBA PERO NO SON LAS MISMAS, ES COMO CREAR LA ZONA DONDE CREAS LA DIVISION PARA USARLA ARRIBA O AL REVES
	{
		double r;
		r = (double)num / (double) den;//ponemos double entre parentesis para no cambiar el tipo de variables sino que le digo que en esa operacion se disfrazen de reales
		
		return r;
	}

	
		// TODO Auto-generated method stub
		
	

}
