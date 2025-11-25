
package clase;

import java.util.Scanner;

public class Clase_21_Noviembre {

	public static void main(String[] args) {
		int pin = 6789;

		 if(pin<0 || pin>9999)

		 System.out.println("tu pin es negativo o tiene más de 4 cifras");

		 else {

		 String[] codigo = cifraPin(pin);

		 for (String linea : codigo)

		 System.out.println(linea);

		 }

		 }

		 

		 public static String[] cifraPin(int pin) {

		 String[] codigo = new String[4];

		 String txtPin = Integer.toString(pin);

		 if(txtPin.length()!=4)

		 for(int i=txtPin.length(); i<4;i++)

		 txtPin = "0" +txtPin;

		 

		 for (int i = 0; i < txtPin.length(); i++) {

		 int cifra = (int) txtPin.charAt(i) - 48;

		 codigo[i] = cifraNumero2(cifra);

		 }

		 

		 return (codigo);

		 }

		 

		 public static String cifraNumero(int num) {

		 String linea = "";

		 if (num == 0)

		 num = 10;

		 for (int i = 0; i < 10; i++)

		 if (i == num - 1)

		 linea += "O";

		 else

		 linea += "X";

		 

		 return linea;

		 

		 }

		 public static String cifraNumero2(int num) {

		 String linea = "";

		 for (int i=0;i<num;i++)

		 linea+= "0";

		 for(int i=0; i<10-num;i++)

		 linea = "X" + linea;

		 

		 return linea;

		 

		 }

		}