
package clase;

import java.util.Scanner;

public class Clase_17_Noviembre {

	public static void main(String[] args) {

		int lado=0;
		int minas=0;
		boolean correcto=false;
		Scanner teclado=new Scanner(System.in);
		do {
			
			try {
			System.out.print("De cuantos lados es el tablero?: ");
			lado=teclado.nextInt();
			System.out.println("Cuantas minas vas a poner?: ");
			minas = teclado.nextInt();
			if(minas<lado*lado) {
				correcto=true;
			}else {
				System.out.println("No puedo poner "+minas+" minas en un tablero de "+lado+" casillas");
			}
			}catch (Exception e) {
				System.out.println("No has metido un numero entero");
			}
		}while(correcto==false);
		teclado.close();
		int [][] tablero =  new int [lado][lado];
		colocarMinas(tablero,lado,minas);
		mostrarTablero(tablero,lado);
		
	
	}
	
	
	public static void mostrarTablero(int [][] tablero, int lado) {
		for(int j=0;j<lado;j++) {
			for(int i=0;i<lado;i++) {
				if(tablero[j][i]<=1) {
					System.out.print("X ");
				}else {
					System.out.println("0 ");
				}
			
		}
			System.out.println();
		}
		
	}
	
	
	public static void colocarMinas(int [][] tablero, int lado, int minas) {
		int numMinas=0;
		while(numMinas!=minas) {
			int fila = (int)(Math.random()*lado);
			int columna = (int)(Math.random()*lado);
			if(tablero[fila][columna]==0) {
				tablero[fila][columna]=1;
				numMinas++;
			}
		}
		
	}

}
