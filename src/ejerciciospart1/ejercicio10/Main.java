package ejerciciospart1.ejercicio10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Variables donde guardar la fecha
		int dia, mes, anyo;
		
		// Variable para saber si es correcta
		boolean esCorrecta;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pedimos los datos
		System.out.println("Introduzca dia, mes y año");
		dia = sc.nextInt();
		mes = sc.nextInt();
		anyo = sc.nextInt();
		
		esCorrecta = CompruebaFecha.esFechaCorrecta(dia, mes, anyo);
		if(esCorrecta) {
			System.out.println("La fecha es correcta");
		} else {
			System.out.println("La fecha no es correcta");
		}
		
		sc.close();

	}

}
