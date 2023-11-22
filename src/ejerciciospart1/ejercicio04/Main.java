package ejerciciospart1.ejercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Variable donde guardar el caracter
		String car;
		
		// Variable que me dice si es vocal o no
		boolean esVocal;
		
		// Scanner para leer de teclado
		Scanner sc = new Scanner(System.in);
		
		// Pedimos una letra
		System.out.println("Introduzca un carácter");
		car = sc.next();
		
		// Llamamos a la función
		esVocal = CompruebaVocal.compruebaVocal(car);
		
		if(esVocal) {
			System.out.println("Es una vocal");
		} else {
			System.out.println("No es una vocal");
		}
		
		sc.close();

	}

}
