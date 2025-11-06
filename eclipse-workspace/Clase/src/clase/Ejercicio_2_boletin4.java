
package clase;

import java.util.Scanner;

public class Ejercicio_2_boletin4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Cuantos números de la sucesion de fibonacci quieres calcular: ");
		int veces = teclado.nextInt();
		int num1 =0;
		int num2 = 1;
		System.out.print("Los " + veces + " números de la sucesión de fibonacci");
		
		for ( int i = 2; i< veces; i++) {
			int nuevoNumero = num1 + num2;
			System.out.print(", " + nuevoNumero);
			num1=num2;
			num2=nuevoNumero;
			
		}
		
		teclado.close();
		
		

	}

}
