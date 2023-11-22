package ejerciciospart1.ejercicio04;

public class CompruebaVocal {

	public static boolean compruebaVocal(String caracter) {
		boolean res = false;
		
		switch(caracter.toLowerCase()) {
		case "a","e","i","o","u":
			res = true;
		}
		
		return res;
	}
	
}
