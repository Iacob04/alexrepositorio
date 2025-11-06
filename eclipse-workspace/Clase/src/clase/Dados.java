
package clase;

import java.util.Scanner;

public class Dados {

	public static void main(String[] args) {
	
			System.out.print("Introduce cuantos dados vas a tirar: ");
			Scanner teclado = new Scanner(System.in);
			int dados = teclado.nextInt();
			int[] numeros = new int[dados];
			boolean iguales = false;
			int tiradas = 0;
			int[] cantidadDados = new int [7];
			
			do {
				tiradas++;
			for(int i = 0; i<dados; i++) {
				numeros[i] = (int)(Math.random() * 6)+1 ;
				
				cantidadDados[numeros[i]]++;
			System.out.print(numeros[i]);
			
			if (i<dados-1)
				System.out.print("-");
			}
			System.out.println();
			iguales = true;
			for(int j =1; j<dados;j++) {
				if(numeros[0] != numeros[j])
					iguales= false;
			}
			}while (iguales == false);
			
			for(int i = 1; i<7; i++) {
				int porcentaje = 100*cantidadDados[i] /(tiradas*dados);
				System.out.println(i+": "+ porcentaje + " % de las veces");
			}
			System.out.println("has necesitado " + tiradas + " tiradas para que salgan iguales");
			

	}

}
