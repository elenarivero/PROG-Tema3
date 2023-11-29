package ejerciciospart1.ejercicio07;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int numero;
		boolean primo;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		numero = sc.nextInt();
		
		primo = Primo.esPrimo(numero);
		
		if(primo) {
			System.out.println("El número es primo");
		} else {
			System.out.println("El número no es primo");
		}
		
		sc.close();
	}
}
