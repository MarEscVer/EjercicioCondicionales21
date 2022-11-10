package unico;

import java.util.Scanner;

public class Ejercicio21bis {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final String GANA1 = "Gana el Jugador 1";
		final String GANA2 = "Gana el Jugador 2";
		final String EMPATE = "Empate";
		
		String res1;
		String res2;
		String result = null;
		
		do {
			System.out.println("JUGADOR 1 (piedra/papel/tijeras): ");
			res1 = teclado.nextLine();
			System.out.println("JUGADOR 2 (piedra/papel/tijeras): ");
			res2 = teclado.nextLine();
			
			if (res1.equals("piedra")) {
				switch(res2) {
					case "piedra" : result = EMPATE; break;
					case "papel" : result = GANA2; break;
					case "tijeras" : result = GANA1; break;
				}
			} else {
				if (res1.equals("papel")) {
					switch(res2) {
						case "piedra" : result = GANA1; break;
						case "papel" : result = EMPATE; break;
						case "tijeras" : result = GANA2; break;
					}
			} else {
				if (res1.equals("tijeras")) {
					switch(res2) {
						case "piedra" : result = GANA1; break;
						case "papel" : result = GANA2; break;
						case "tijeras" : result = EMPATE; break;
					}
				}	
			}	
			} 
			
			System.out.println(result);
			
		} while(true);
	}
}
	
