// Declaración del paquete donde se encuentra esta clase
package clase;

// Importación de las clases necesarias
// Scanner no se usa en el código actual, pero permite leer datos desde teclado (input del usuario)
import java.util.Scanner;
// Clases para trabajar con expresiones regulares (tampoco se usan en este código)
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Definición de la clase principal
public class Clase_21_Oct {

	public static void main(String[] args) {
		
		int lista[]= new int [6];
		String textos[] = new String [10];
		int[]vector ;
		double[]nota = {7.5 ,6 ,9.4 ,2.5, 7.5};
		lista[2] = 5;
		System.out.println(nota [1]);
		nota[1]= 9.2;
		System.out.println(nota [1]);
		int [][]matriz = new int [2][3];
		matriz[1][2]= 99;
		System.out.println(matriz [1][2]);
		System.out.println(matriz [1][1]);
		String[][] alumnos = {{"Ana" , "lópez"},{"Mario" , "Perez"},{"Eva" , "Gutierrez"}};
		System.out.println(alumnos [1][0]);

	}
}

