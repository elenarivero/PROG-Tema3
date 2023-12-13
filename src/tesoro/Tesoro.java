package tesoro;

import java.util.Random;

public class Tesoro {
	// Constante para indicar el tamaño del tablero
	public static final int TAM_TABLERO = 5;

	// Atributo que almacena la posición X del Tesoro
	static int xTesoro;

	// Atributo que almacena la posición Y del Tesoro
	static int yTesoro;

	// Atributo que almacena la posición X del Jugador
	int xJugador = 1;

	// Atributo que almacena la posición Y del Jugador
	int yJugador = 1;

	// Entrada: Vacía
	// Salida: Vacía
	// Funcionalidad: Generar número aletorio entre 1
	// tamaño + 1 si vamos a utilizar Random
	static void generaPosicionTesoro() {
		Random rand = new Random();
		xTesoro = rand.nextInt(1, TAM_TABLERO + 1);
		yTesoro = rand.nextInt(1, TAM_TABLERO + 1);
	}

	// Entrada: vacía
	// Salida: vacía
	// Funcionalidad: Un primer for para la primera línea
	// Otra bucle para pintar los números de las líneas
	// Si la posición X del Jugador coincide con la línea
	// creo otro for para imprimir los tabuladores que hay
	// antes del jugador. El número de tabuladores coincide
	// con la posición Y del Jugador
	void pintaTablero() {
		// Imprimimos la primera línea de números
		for (int i = 1; i <= TAM_TABLERO; i++) {
			System.out.print("\t" + i);
		}

		// Salto de línea para comenzar con los números de la izquierda
		System.out.println();

		// Bucle para imprimir las líneas
		for (int i = 1; i <= TAM_TABLERO; i++) {
			// Imprimimos el número de línea
			System.out.print(i);
			// Si la línea coincide con la posición X del jugador
			if (xJugador == i) {
				/// Imprimimos tantos tabuladores como posición Y del jugador
				for (int j = 1; j <= yJugador; j++) {
					System.out.print("\t");
				}
				// Imprimimos la ficha del jugador
				System.out.print("J");
			}
			// Salto de línea para pasar a la siguiente línea
			System.out.println();
		}
	}

	// Entrada: String con el movimiento
	// Salida: int
	// 
	int mueveJugador(String movimiento) {
		int res = 0;
		String movMinuscula = movimiento.toLowerCase();

		switch (movMinuscula) {
		case "arriba":
			if (xJugador - 1 < 1) {
				res = -1;
			} else {
				xJugador--;
			}
			break;
		case "abajo":
			if (xJugador + 1 > TAM_TABLERO) {
				res = -1;
			} else {
				xJugador++;
			}
			break;
		case "izquierda":
			if (yJugador - 1 < 1) {
				res = -1;
			} else {
				yJugador--;
			}
			break;
		case "derecha":
			if (yJugador + 1 > TAM_TABLERO) {
				res = -1;
			} else {
				yJugador++;
			}
			break;
		default:
			res = -2;
			break;
		}		
		
		return res;
	}

	// Entrada: Vacía
	// Salida: boolean
	// Funcionalidad: si X del Jugador es igual a x del Tesoro
	// y Y del Jugador es igual a Y del Tesoro devuelve true
	boolean buscaTesoro(){
		boolean res = false;
		if(xTesoro == xJugador && yTesoro == yJugador) {
			res = true;
		}
		return res;
	}
}
