// Declaración del paquete donde se encuentra esta clase
package clase;

// Importación de las clases necesarias
// Scanner no se usa en el código actual, pero permite leer datos desde teclado (input del usuario)
import java.util.Scanner;
// Clases para trabajar con expresiones regulares (tampoco se usan en este código)
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Definición de la clase principal
public class Clase_21_Oct_2 {

	public static void main(String[] args) {

		// Se inicializa el número desde el que empezaremos a buscar números primos
		int numero = 587;

		// Guarda el número primo anterior encontrado
		int anterior = 0;

		// Bandera para indicar si ya se encontraron los primos gemelos
		boolean gemelosEncontrados = false;

		// Bucle principal: se ejecuta mientras no se encuentren primos gemelos
		// El bloque "for" siguiente está comentado, probablemente era una versión inicial
		// for(int contador = 0; contador<50; contador++) {
		while(gemelosEncontrados == false) {
			
			// Variable para determinar si un número es primo
			boolean esPrimo;
			
			// Bucle que se repite hasta que se encuentre un número primo
			do {
				// Calcula la raíz cuadrada del número + 1 (para optimizar las comprobaciones)
				int raiz = (int)Math.sqrt(numero)+1;
				
				// Inicialmente se asume que el número es primo
				esPrimo = true;
				
				// Se comprueba si el número es divisible por algún valor entre 2 y su raíz cuadrada
				for(int i=2; i<raiz && esPrimo == true; i++) {
					if(numero%i == 0)  // Si el número es divisible, no es primo
						esPrimo = false;
				}
				
				// Si el número no es primo, se incrementa en 1 y se vuelve a probar
				if(esPrimo == false)
					numero++;
			
			// Se repite el ciclo hasta que "esPrimo" sea true
			} while(esPrimo == false);
			
			// En este punto, "numero" es primo

			// Si la diferencia entre el número actual y el anterior es 2,
			// significa que hemos encontrado dos primos gemelos
			if (numero - anterior == 2) {
				gemelosEncontrados = true;  // Salimos del bucle principal
			}
			else {
				// Si no son gemelos, el número actual pasa a ser el "anterior"
				anterior = numero;
				// Y seguimos buscando con el siguiente número
				numero++;
			}
		}
		
		// Cuando salimos del bucle, mostramos los primos gemelos encontrados
		System.out.println("Los primeros gemelos son " + anterior + " y " + numero);
		
		
		// ----------------- CÓDIGO INACTIVO / COMENTADO -----------------
		
		// Muestra el número y si es primo (solo quedaba de una prueba previa)
		// System.out.println(numero + " es primo");
		
		// Calcula y muestra información matemática del número (de una práctica anterior)
		// double numeroRaiz = Math.sqrt(numero); // Raíz cuadrada del número
		// int cuadrado = numero * numero;        // Cuadrado del número
		// int cubo = numero * numero * numero;   // Cubo del número
		// System.out.println(numero + " - " + numeroRaiz + " - " + cuadrado + " - " + cubo);
		
		// Incrementa el número (posible prueba de bucle anterior)
		// numero++;
		
		// Cierre del "for" que estaba comentado arriba
		// }
	}
}

