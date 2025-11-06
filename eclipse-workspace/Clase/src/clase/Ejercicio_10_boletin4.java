
package clase;

import java.util.Scanner;

public class Ejercicio_10_boletin4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un texto con números y letras: ");
		String texto = teclado.nextLine();
		
		System.out.println("Las cifras en ese texto son: ");
		for(int i = 0; i<texto.length(); i++){
			char caracter = texto.charAt(i);
			switch(caracter) {
			case '0' ,'1' ,'2' ,'3','4','5','6','7','8','9':
				System.out.print(caracter);
			}
			
			
		}
		
			
		
		
		teclado.close();
		
		

	}

}
