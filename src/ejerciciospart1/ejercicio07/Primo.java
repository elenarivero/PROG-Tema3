package ejerciciospart1.ejercicio07;

public class Primo {

	/*
	 * Entrada: un número entero
	 * Salida: booleano que diga si el número de entrada es primo
	 * Bucle que vaya desde el 2 hasta la raíz cuadrada del número
	 * Dentro del bucle comprobaré si el número es divisible por los números del 2 a la raíz cuadrada
	 * En el momento en el que encuentre un divisor, sé que no es primo
	 * Utilizará un booleano para saber si es primo o no
	 */
	public static boolean esPrimo(int num) {
		boolean primo = true;
		int div = 2;
		if(num == 1) {
			primo = false;
		} else {
			
//			for(int i = 2; i<=Math.sqrt(num) && primo; i++) {
//				if(num%i == 0) {
//					primo = false;
//				}
//			}
			
			while(div <= Math.sqrt(num) && primo) {
				if(num%div == 0) {
					primo = false;
				}
				div++;
			}
		}
		return primo;
	}
}
