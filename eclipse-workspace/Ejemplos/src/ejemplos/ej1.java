
package ejemplos;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce  5 números aleatorios que no se repitan, que sean pares y se encuentren en un intervalo entre 1 y un número que des tú ");
		System.out.print("Da un número para el intervalo: ");
		int numeroDado = teclado.nextInt();
		
		
		while (numeroDado<10) {
			System.out.println("El mínimo intervalo con 5 pares es del 1 al 10");
			System.out.print("Da un número para el intervalo: ");
			 numeroDado = teclado.nextInt();
		}
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;

        System.out.println("Debes introducir 5 números pares entre 1 y " + numeroDado + ".");

        // --- Primer número ---
        System.out.print("Introduce el primer número: ");
        num1 = teclado.nextInt();
        while (num1 < 1 || num1 > numeroDado || num1 % 2 != 0) {
            System.out.println("Número inválido. Debe ser par y estar entre 1 y " + numeroDado);
            System.out.print("Introduce el primer número otra vez: ");
            num1 = teclado.nextInt();
        }

        // --- Segundo número ---
        System.out.print("Introduce el segundo número: ");
        num2 = teclado.nextInt();
        while (num2 < 1 || num2 > numeroDado || num2 % 2 != 0 || num2 == num1) {
            System.out.println("Número inválido. Debe ser par, estar en el rango y no repetirse.");
            System.out.print("Introduce el segundo número otra vez: ");
            num2 = teclado.nextInt();
        }

        // --- Tercer número ---
        System.out.print("Introduce el tercer número: ");
        num3 = teclado.nextInt();
        while (num3 < 1 || num3 > numeroDado || num3 % 2 != 0 || num3 == num1 || num3 == num2) {
            System.out.println("Número inválido. Debe ser par, estar en el rango y no repetirse.");
            System.out.print("Introduce el tercer número otra vez: ");
            num3 = teclado.nextInt();
        }

        // --- Cuarto número ---
        System.out.print("Introduce el cuarto número: ");
        num4 = teclado.nextInt();
        while (num4 < 1 || num4 > numeroDado || num4 % 2 != 0 || num4 == num1 || num4 == num2 || num4 == num3) {
            System.out.println("Número inválido. Debe ser par, estar en el rango y no repetirse.");
            System.out.print("Introduce el cuarto número otra vez: ");
            num4 = teclado.nextInt();
        }

        // --- Quinto número ---
        System.out.print("Introduce el quinto número: ");
        num5 = teclado.nextInt();
        while (num5 < 1 || num5 > numeroDado || num5 % 2 != 0 || num5 == num1 || num5 == num2 || num5 == num3 || num5 == num4) {
            System.out.println("Número inválido. Debe ser par, estar en el rango y no repetirse.");
            System.out.print("Introduce el quinto número otra vez: ");
            num5 = teclado.nextInt();
        }

        System.out.println("Los 5 números válidos son: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5);

        teclado.close();
	}

}
