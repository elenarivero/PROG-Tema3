package ejerciciospart1.ejercicio10;

public class CompruebaFecha {

	public static boolean esFechaCorrecta(int dia, int mes, int anyo) {
		boolean esCorrecta = false;

		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			if (dia >= 1 && dia <= 31) {
				esCorrecta = true;
			}
			break;
		case 4, 6, 9, 11:
			if (dia >= 1 && dia <= 30) {
				esCorrecta = true;
			}
			break;
		case 2:
			if (esBisiesto(anyo)) {
				if (dia >= 1 && dia <= 29) {
					esCorrecta = true;
				}
			} else {
				esCorrecta = true;
			}
			break;
		}

		return esCorrecta;

	}

	public static boolean esBisiesto(int anyo) {
		boolean bisiesto = false;

		if ((anyo % 4 == 0 && anyo % 100 != 0) || anyo % 400 == 0) {
			bisiesto = true;
		}

		return bisiesto;
	}
}
