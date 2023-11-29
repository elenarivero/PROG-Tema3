package ejerciciospart1.ejercicio08;

import java.util.Scanner;

import ejerciciospart1.ejercicio07.Primo;

public class Main {

	public static void main(String[] args) {
		int numero;
		int divisores;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		numero = sc.nextInt();
		
		divisores = CuentaDivisores.numDivisoresPrimos(numero);
		
		System.out.println("Número de divisores: " + divisores);
		
		sc.close();

	}

}
