
package clase;

import java.util.Scanner;

public class Ejercicio_8_boletin3 {

	public static void main(String[] args) {

		String texto;
		System.out.println("Escribe tu texto");
		Scanner teclado = new Scanner(System.in);
		texto = teclado.nextLine();
		String sinvocales = "";
		String minusculas = texto.toLowerCase();
		for(int i=0; i<texto.length(); i++) {
		
			char c = minusculas.charAt(i);
			/*if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' )
				sinvocales = sinvocales+minusculas.charAt(i);*/
			switch(c) {
			case 'a':
				break;
			case 'e':
				break;
			case 'i':
				break;
			case 'o':
				break;
			case 'u':
				break;
				default:sinvocales = sinvocales+minusculas.charAt(i);
			}
		
		}
	
		
		System.out.println("Cadena de texto sin vocales : " + sinvocales);
		
		
		teclado.close();
		
		

	}

}
