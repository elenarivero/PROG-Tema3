package tesoro;

import java.util.Random;

/**
 * Clase que representa el juego de encuentra el tesoro
 * 
 */
public class Tesoro {
	/**
	 * Constante que reprsenta el tamaño del tablero
	 */
	public static final int TAM_TABLERO = 5;

	/**
	 * Posición x del Tesoro
	 */
	static int xTesoro;

	/**
	 * Posición y del Tesoro
	 */
	static int yTesoro;

	/**
	 * Posición x del Jugador
	 */
	int xJugador = 1;

	/**
	 * Posición y del Jugador
	 */
	int yJugador = 1;

	/**
	 * Genera dos números aleatorios que se corresponderán con la X y la Y
	 * del Tesoro
	 */
	static void generaPosicionTesoro() {
		Random rand = new Random();
		xTesoro = rand.nextInt(1, TAM_TABLERO + 1);
		yTesoro = rand.nextInt(1, TAM_TABLERO + 1);
	}

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

	/**
	 * A partir de una cadena mueve al jugador de posición 
	 * @param movimiento Cadena que indicará el movimiento del jugador. Los valores
	 *                   permitidos son "ARRIBA", "ABAJO","IZQUIERDA", "DERECHA"
	 * @return Devolverá 0 si el movimiento es correcto y modificará las posiciones
	 *         X e Y del Jugador <br>
	 *         Devolverá -1 si el movimiento implica salirse del tablero <br>
	 *         Devolverá -2 si la cadena introducida es errónea
	 */
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

	/**
	 * Indica si el jugador ha encontrado el tesoro
	 * @return true si la posición del jugador coincide con la del tesoro<br>
	 * false si la posición del jugador no coincide con la del tesoro
	 */
	boolean buscaTesoro() {
		boolean res = false;
		if (xTesoro == xJugador && yTesoro == yJugador) {
			res = true;
		}
		return res;
	}
}
