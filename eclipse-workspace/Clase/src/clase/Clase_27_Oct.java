// Declaración del paquete donde se encuentra esta clase
package clase;

// Importación de las clases necesarias
// Scanner no se usa en el código actual, pero permite leer datos desde teclado (input del usuario)
import java.util.Scanner;
// Clases para trabajar con expresiones regulares (tampoco se usan en este código)
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Definición de la clase principal
public class Clase_27_Oct {

	public static void main(String[] args) {
		
		boolean hemosAcabado = false ;
		Scanner teclado = new Scanner(System.in);
		String patronNumerico = "[0-9]+";
		int contador = 0;
		 do {
	            System.out.println("Introduce un número entre 1 y 100 o FIN para salir: ");
	            String entrada = teclado.nextLine();

	            
	            if (entrada.equalsIgnoreCase("FIN")) {
	                hemosAcabado = true;
	            }
	           
	            else if (entrada.matches("[0-9]+")) {
	                System.out.println("Es un número entero");

	                int numero = Integer.parseInt(entrada);

	                if (numero >= 1 && numero <= 100)
	                    contador++;
	                else
	                    System.out.println("Pero no es un número entre 1 y 100");
	            }
	           
	            else {
	                System.out.println("Entrada no válida. Debes escribir un número o FIN.");
	            }

	        } while (!hemosAcabado);

	        System.out.println("Has introducido " + contador + " números válidos");
	        teclado.close();
	    }
	}

