
package clase;

import java.util.Scanner;

public class Ejercicio_5_boletin3 {

	public static void main(String[] args) {

		String texto;
		System.out.println("Escribe tu texto");
		Scanner teclado = new Scanner(System.in);
		texto = teclado.nextLine();
		String alreves = "";
		
				for (int i=texto.length()-1; i>=0; i--) {
					
					alreves = alreves + texto.charAt(i);
			
				
				}
		System.out.println("Cadena al revés : " + alreves);
		
		teclado.close();
		
		

	}

}
