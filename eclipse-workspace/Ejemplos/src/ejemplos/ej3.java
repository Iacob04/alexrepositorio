
package ejemplos;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		
		 Scanner teclado = new Scanner(System.in);
	        System.out.println("Introduce una cadena de texto:");
	        String texto = teclado.nextLine();

	        int espaciosEliminados = 0;
	        int vocalesEliminadas = 0;
	        String textoSinVocalesNiEspacios = ""; // Aquí guardaremos el texto limpio

	        for (int i = 0; i < texto.length(); i++) {
	            char c = texto.charAt(i);

	            // Comprobar si es un espacio
	            if (c == ' ') {
	                espaciosEliminados++;
	            }
	            // Comprobar si es una vocal (mayúscula o minúscula)
	            else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
	                     c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
	                vocalesEliminadas++;
	            }
	            // Si no es ni espacio ni vocal, lo añadimos al nuevo texto
	            else {
	                textoSinVocalesNiEspacios = textoSinVocalesNiEspacios + c;
	            }
	        }

	        System.out.println("Texto original: " + texto);
	        System.out.println("Texto sin vocales ni espacios: " + textoSinVocalesNiEspacios);
	        System.out.println("Espacios eliminados: " + espaciosEliminados);
	        System.out.println("Vocales eliminadas: " + vocalesEliminadas);

	        teclado.close();
	    }
	}