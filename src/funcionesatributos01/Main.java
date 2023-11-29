package funcionesatributos01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opc;
		double num1, num2;
		// Mostrar el menú
		opc = menu();
		
		// Pedir los números al usuario
		num1 = pideNumero();
		num2 = pideNumero();
		
		Operaciones op = new Operaciones(num1, num2);
		
		switch(opc) {
		case 1: op.suma();
		}
		
	}

	public static int menu() {
		int opc;
		Scanner sc = new Scanner(System.in);

		System.out.println("1. Suma");
		System.out.println("2. Resta");
		// ...
		opc = sc.nextInt();

		sc.close();
		return opc;
	}

	public static double pideNumero() {
		double numero = 0;
		boolean seguir = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.println("Introduzca un número");
				numero = sc.nextDouble();
				seguir = false;
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido es decimal");
			} finally {
				sc.nextLine();
			}
			
		}while(seguir);
		
		sc.close();
		return numero;
	}

}
