package clases;

public class Primo {
	
	public static boolean esPrimo(int numero) {
		boolean esPrimo = true;
		if (numero == 1) {
			esPrimo = false;
		} else {
			for(int div = 2; div<numero/2; div++) {
				if(numero%div == 0) {
					esPrimo = false;
					break;
				}
			}
		}
				
		return esPrimo;
	}

}
