package clases;

public class Persona {
	String nombre = "";
	int edad = 0;
	double altura = 0;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, int age, double height) {
		this.nombre = nombre;
		edad = age;
		altura = height;
	}
	
	public static void tresSaludos() {
		for(int i=1; i<=3; i++) {
			System.out.println("Hola");
		}
	}
}

