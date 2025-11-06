
package clase;

import java.util.Scanner;

public class Ejercicio_14_boletin4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una hora en formato HH:MM ");
		String hora = teclado.nextLine();
		boolean correcto = true;
		int hhEntero = 0;
			if (hora.length()== 5) {
				
				if(hora.charAt(2) == ':') {
					/*
					String hh = hora.substring(0,2);
					String mm = hora.substring(3,5);
					int hhEntero = Integer.parseInt(hh);
					int mmEntero = Integer.parseInt(mm);
					*/
					hhEntero = Integer.parseInt(hora.substring(0,2));
					int mmEntero = Integer.parseInt(hora.substring(3,5));
						
						if(hhEntero >=0 && hhEntero <=23)
							if(mmEntero >=0 && mmEntero <=59)
								correcto=true;
							else
								correcto = false;
				}
				else 
					correcto = false;
				
			}
			
			else
				correcto = false;
			
			
			if(correcto == true) {
				System.out.println("La hora " + hora + " está en un formato correcto");
				if(hhEntero >=0 && hhEntero <=5)
					System.out.println("Estás en horario de madrugada");
				else if (hhEntero >=6 && hhEntero <=11)
					System.out.println("Estás en horario de mañana");
				else if (hhEntero >=12 && hhEntero <=19)
					System.out.println("Estás en horario de tarde");
				else
					System.out.println("Estas en en horario de noche");
			}
			else
				System.out.println("La hora " + hora + " no está en un formato correcto");
		
		teclado.close();
		
		

	}

}
