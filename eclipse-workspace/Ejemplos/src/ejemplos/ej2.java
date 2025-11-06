
package ejemplos;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		
		System.out.println("Se van a generar 10 números aleatorios entre el 1 y el 1000");
		
		int[] pares = new int[10];
		int paresContador = 0;
		int mayor = 0;      
        int menor = 1001;

        for (int i = 0; i < 10 ; i++) {
            int num = (int)(Math.random() * (1000 - 1 + 1)) + 1;
            System.out.println(num + ", ");

            if (num%2 == 0) {
            	pares[paresContador++] = num;
            }

            // Comprobamos si es mayor o menor
            if (num > mayor)
                mayor = num;
            if (num < menor)
                menor = num;
        
        }
        System.out.println("Los números pares son: ");
        if (paresContador == 0) {
            System.out.println("No ha salido ningún número par.");
        } 
        else {
            for (int i = 0; i < paresContador; i++) {
                System.out.print(pares[i] + ", ");
            }
        }
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
	}

}
