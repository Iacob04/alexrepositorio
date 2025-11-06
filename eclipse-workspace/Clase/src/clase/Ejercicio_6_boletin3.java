
package clase;

import java.util.Scanner;

public class Ejercicio_6_boletin3 {

	public static void main(String[] args) {

		String texto;
		System.out.println("Escribe tu texto");
		Scanner teclado = new Scanner(System.in);
		texto = teclado.nextLine();
		String impares = "";
		String pares = "";
		
				for (int i = 0; i<texto.length(); i++) {
					
				if(i%2 == 0)
					pares+=texto.charAt(i);
				else
					impares+=texto.charAt(i);
			
				
				}
		System.out.println("Cadena posiciones pares:" + pares);
		System.out.println("Cadena posiciones impares:" + impares);
		
		teclado.close();
		
		

	}

}
