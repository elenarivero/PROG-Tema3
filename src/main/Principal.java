package main;

import java.util.Random;

import clases.Operaciones;
import clases.Primo;

public class Principal {

	public static void main(String[] args) {
		Random rand = new Random();
		int aleatorio = rand.nextInt(1, 101);
		
		System.out.println(aleatorio + " " + Primo.esPrimo(aleatorio));
		
		

	}

}
