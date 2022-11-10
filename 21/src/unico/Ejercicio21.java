package unico;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final String GANA1 = "Gana el Jugador 1";
		final String GANA2 = "Gana el Jugador 2";
		final String EMPATE = "Empate";
		final String ERROR = "Error";
		
		String res1;
		String res2;
		String result = null;
		
		do {
			System.out.print("JUGADOR 1 (piedra/papel/tijeras): ");
			res1 = teclado.nextLine();
			System.out.print("JUGADOR 2 (piedra/papel/tijeras): ");
			res2 = teclado.nextLine();
			
			switch(res1) {
				case "piedra":
					switch(res2) {
						case "pieda": result = EMPATE; break;
						case "papel": result = GANA1; break;
						case "tijera" : result = GANA2; break;
						default: result = ERROR;
					} break;
				case "papel":
					switch(res2) {
						case "pieda": result = GANA2; break;
						case "papel": result = EMPATE; break;
						case "tijera" : result = GANA1; break;
						default: result = ERROR;
					} break;
				case "tijera":
					switch(res2) {
						case "pieda": result = GANA1; break;
						case "papel": result = GANA2; break;
						case "tijera" : result = EMPATE; break;
						default: result = ERROR;
					}
			}
			
			System.out.println(result);

		} while(true);
	}
	}
