package clases;

public class Persona {
	String nombre = "";
	int edad = 0;
	double altura = 0;
	static String diaSemana;
			
	public Persona(String nombre, int edad, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}

	public void cumpleAños() {
		edad++;
	}
	
	public static void saludo() {
		System.out.println("Hola");
	}


}

