
package examen;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Se han generado 10 números aleatorios entre el 1 y el 50");
		
		int[] numeros = new int[10];	
		int contador = 10;

        for (int i = 0; i < 10 ; i++) {
            int num = (int)(Math.random() * 50) + 1;
           
            System.out.print(num + ", ");
            System.out.print(num[i] + ", ");
            
          
         
        }
        System.out.println("Introduce un número comprendido entre el 1 y el 50: ");
        int numero = teclado.nextInt();
        
        
       
        
        
      
	}

}
