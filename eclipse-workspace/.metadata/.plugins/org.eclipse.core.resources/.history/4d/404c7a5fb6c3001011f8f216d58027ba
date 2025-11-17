
package clase;

import java.util.Scanner;

public class Clase_17_Noviembre_3 {

	public static void main(String[] args) {
		// ejercicio 4 boletín 5
		 Scanner teclado = new Scanner(System.in);
		 System.out.print("Escribe una frase: ");
		 String entrada = teclado.nextLine();
		 String[]lista = entrada.split(" ");
		 int contador = 0;
		 
		 for(String palabra:lista) {
			// System.out.println(palabra);
			 if (vocales(palabra))
				 contador++;
		 } 
		 System.out.println("Hay " + contador + " palabras con 4 o mas vocales");
		 
		 
	}

	 public static boolean vocales (String p) {
		 int cuentaVocales = 0;
		 boolean vocales = false;
		 String[]letras = {"a","e", "i", "o", "u"};
		 for (String letra:letras)
			 cuentaVocales += buscaLetra(p,letra);
		 if(cuentaVocales >=4)
			 vocales = true;
		 return vocales;
		 
	 }
	 public static int buscaLetra(String p, String l) {
		 int hayLetra = 1;
		 if(p.indexOf(l)== -1)
			 hayLetra = 0;
		 return hayLetra;
	 }
}
