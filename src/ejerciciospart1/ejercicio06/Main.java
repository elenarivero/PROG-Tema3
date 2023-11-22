package ejerciciospart1.ejercicio06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Variable donde guardar la opción
		int opc;
		
		// Variables del radio y la altura
		double radio, altura;
		
		// Variable donde guardar el resultado
		double resultado;
		
		// Scanner para leer datos
		Scanner sc = new Scanner(System.in);
		
		// Pedimos la opción
		System.out.println("¿Quiere calcular el área(1) o el volumen(2)?");
		opc = sc.nextInt();
		
		// Pedimos el radio
		System.out.println("Introduzca el radio");
		radio = sc.nextDouble();
		
		// Pedimos el radio
		System.out.println("Introduzca la altura");
		altura = sc.nextDouble();
		
		resultado = Cilindro.areaVolumen(opc, radio, altura);
		
		System.out.println("El resultado es: " + resultado);
		
		sc.close();
		
	}
}
