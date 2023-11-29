package ejerciciospart2.ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num1, num2;
		double decimal1, decimal2;
		int sumaEntera;
		double sumaDecimal;
		
		Scanner sc = new Scanner(System.in);
		
		// Suma de números enteros
		System.out.println("Introduzca dos números enteros:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		sumaEntera = Sumas.suma(num1, num2);
		System.out.println("La suma entera es: " + sumaEntera);
		
		// Suma de números decimales
		System.out.println("Introduzca dos números decimales:");
		decimal1 = sc.nextDouble();
		decimal2 = sc.nextDouble();
		
		sumaDecimal = Sumas.suma(decimal1, decimal2);
		System.out.println("La suma decimal es: " + sumaDecimal);
		
		sc.close();
	}

}
