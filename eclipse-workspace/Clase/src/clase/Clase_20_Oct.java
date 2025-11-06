
package clase;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Clase_20_Oct {

	public static void main(String[] args) {

		//Pattern patron = Pattern.compile("\\d{9}");
		Pattern patron = Pattern.compile("[6-8][0-9]{8}");
		Matcher coincidencia = patron.matcher ("632331511");
		
		
		if (coincidencia.find() == true)
			System.out.println("Es un número de teléfono válido");
		else
			System.out.println("No es número de teléfono válido");
		
		
		
		
		
	}

}
