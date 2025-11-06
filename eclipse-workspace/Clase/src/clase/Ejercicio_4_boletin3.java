
package clase;

import java.util.Scanner;

public class Ejercicio_4_boletin3 {

	public static void main(String[] args) {

		String texto;
		System.out.println("Escribe tu texto");
		Scanner teclado = new Scanner(System.in);
		texto = teclado.nextLine();
		String sinEspacio = "";
		int contador = 0;
				for (int i=0; i<texto.length(); i++)
					if(texto.charAt(i) != ' ')
					{
						sinEspacio = sinEspacio + texto.charAt(i);
						//System.out.println(sinEspacio);
						
						
					}
					else 
						contador++;
				System.out.println("Cadena sin espacios :" + sinEspacio );
				System.out.println("Numero de espacios eliminados :" + contador);
				
		
		
		
		teclado.close();
		
		

	}

}
