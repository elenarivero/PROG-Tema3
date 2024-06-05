package tesoro;

import java.util.Scanner;

public class Principal {

	
	public static void main(String[] args) {
		// Primer paso: generar posición del tesoro
		Tesoro.generaPosicionTesoro();
		// Creamos el objeto
		Tesoro tesoro = new Tesoro();
		
		// Creamos variable para el movimiento
		String movimiento;
		
		// Resultado del movimiento
		int resMovimiento;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Mientras no hayamos encontrado el tesoro
		while(!tesoro.buscaTesoro()) {
			// Pintamos tablero
			tesoro.pintaTablero();
			
			do {
				System.out.println("Introduzca un movimiento");
				movimiento = sc.next();
				resMovimiento = tesoro.mueveJugador(movimiento);
				if (resMovimiento == -1) {
					System.out.println("Ese movimiento no está dentro de los límites del tablero");
				} else if (resMovimiento == -2) {
					System.out.println("Lo siento, pero no entiendo ese movimiento");
				}
			} while(resMovimiento!=0);
			
		}
		tesoro.pintaTablero();
		System.out.println("ENHORABUENA HA ENCONTRADO EL TESORO");
		sc.close();
	}
	
	

}
