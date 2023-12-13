package funcionesatributos01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opc;
		double numero1, numero2;
		Operaciones oper;
		double resultado;

		opc = menu();
		while (opc != 0) {

			numero1 = pideNumero();
			numero2 = pideNumero();
			oper = new Operaciones(numero1, numero2);

			resultado = switch (opc) {
			case 1 -> oper.suma();
			case 2 -> oper.resta();
			case 3 -> oper.multiplicacion();
			case 4 -> oper.division();
			case 5 -> oper.max();
			case 6 -> oper.min();
			default -> Math.sqrt(-1);
			};
			
			System.out.println(resultado);
			
			opc = menu();
		}

		sc.close();
	}

	public static int menu() {
		int opc;

		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		// ...
		System.out.println("Introduzca una opción:");

		opc = sc.nextInt();

		return opc;
	}

	public static double pideNumero() {
		double numero = 0;
		boolean seguir = true;

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

		} while (seguir);

		return numero;
	}

}
