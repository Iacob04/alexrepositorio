
package clase;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class examen_ejercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//for(int intentos=1; intentos<6 && acertado == false; intentos++) {
		
			
			System.out.print("Introduce una frase: ");
			String frase = teclado.nextLine();
			 System.out.print("Introduce una letra a mantener: ");
			 String letra = teclado.nextLine();
			 
			// System.out.println(frase.replaceAll(  , "*"));
			 for (int i = 0; i < frase.length(); i++) 
				 
				 System.out.print("*");
				
				
					//System.out.print(letra);
		            
			
		
		teclado.close();
		
		
		
	}

}
