
package clase;

import java.util.Scanner;

public class Ejercicio_cuenta {

	public static void main(String[] args) {
	
			
		Scanner teclado = new Scanner(System.in);
		double importe = 0;
		int personas = 0;
		
		try {
		System.out.print("Cuanto ha costado la cena? : ");
		importe = teclado.nextDouble();
		//teclado.nextLine(); // para limpiar el buffer del teclado
		System.out.print("Cuantos habeis cenado? : ");
		personas = teclado.nextInt();
		}catch(Exception e) {
			System.out.println("Ha ocurrido un error ");
		}finally {
			if(importe != 0 && personas != 0) {
				System.out.printf("Tocais a %.2f € por cabeza", importe/personas);
				}
				else
					System.out.println("Ni el importe ni las personas pueden ser 0");
		}
		
		teclado.close();
				
			
			

	}

}
