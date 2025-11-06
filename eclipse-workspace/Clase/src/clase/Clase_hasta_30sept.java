package clase;

import java.util.Scanner;

public class Clase_hasta_30sept {

    public static void main(String[] args) {
        // ===================================================================
        // BLOQUES DE EJEMPLOS (INACTIVOS, ESTÁN COMENTADOS)
        // ===================================================================

        // ---------- NÚMERO ALEATORIO (DADO) ----------
        /* 
        double azar = Math.random();      // genera un número aleatorio entre 0.0 y 1.0
        System.out.println(azar);  

        azar = azar * 6;                  // lo multiplico por 6 → [0.0, 6.0)
        System.out.println(azar);

        azar = azar + 1 ;                 // sumo 1 → [1.0, 7.0)
        System.out.println(azar); 

        int dado = (int) azar;            // lo convierto a entero (trunca decimales)
        System.out.println(dado);         // dado entre 1 y 6
        */

        // ---------- DADO DE FORMA REDUCIDA ----------
        /*
        int dado = (int)(Math.random() * 6) + 1; // número entero entre 1 y 6
        System.out.println(dado);
        */

        // ---------- NÚMERO ALEATORIO ENTRE 5 Y 15 ----------
        /*
        int inicio = 5;
        int fin = 15;

        int dado = (int)(Math.random() * (fin - inicio + 1)) + inicio; 
        // fórmula general: (Math.random() * (máx - mín + 1)) + mín
        System.out.println(dado);
        */

        // ---------- PROBAR ALGORITMO DE ALEATORIOS REPITIENDO ----------
        /*
        int inicio = 2;
        int fin = 4;

        for (int i = 0; i < 100 ; i++) {
            int dado = (int)(Math.random() * (fin - inicio + 1)) + inicio;
            System.out.println(dado);  // debe imprimir números entre 2 y 4
        }
        */

        // ---------- CONVERSIONES ENTRE STRINGS Y NÚMEROS ----------
        /*
        String textoEntero = "33";
        String textoConDecimal = "33.56";
        int entero = 42;
        double conDecimal = 44.67;

        int num1 = Integer.parseInt(textoEntero);   // convertir String → int
        System.out.println(num1);

        double num2 = Double.parseDouble(textoConDecimal); // String → double
        System.out.println(num2);

        String texto1 = String.valueOf(entero);     // int → String
        System.out.println(texto1);

        String texto2 = String.valueOf(conDecimal); // double → String
        System.out.println(texto2);

        double num3 = (double) entero;              // int → double (casting)
        */

        // ---------- REDONDEOS Y FUNCIONES MATH ----------
        /*
        int num4 = (int) conDecimal;                // trunca decimal
        System.out.println(num4);

        int num5 = (int) Math.round(conDecimal);    // redondea decimal
        System.out.println(num5);

        final double PI = 3.14159;

        double PIRedondeado = (double) Math.round(PI * 10000) / 10000;
        // redondear PI a 4 decimales
        System.out.println(PIRedondeado);

        int maximo = Math.max(4500, 2);             // devuelve el mayor
        System.out.println(maximo);

        int minimo = Math.min(4500, 2);             // devuelve el menor
        System.out.println(minimo);
        */

        // ---------- OPERACIONES CON STRINGS ----------
        /*
        String texto1 = "Hola mundo";
        String texto2 = new String("Hola mundo cruel");

        texto1 = texto1 + " cruel!";                 // concatenar con +
        System.out.println(texto1);

        texto1 = texto1.concat(" ¿Que tal estamos?"); // concatenar con concat()
        System.out.println(texto1);

        int precio = 33;
        System.out.println("El precio es de " + precio + " euros.");

        // Recorrer string carácter a carácter
        for (int i = 0; i < texto2.length(); i++)
            System.out.println(texto2.charAt(i));

        System.out.println(texto2.toLowerCase());    // todo en minúsculas
        System.out.println(texto2.toUpperCase());    // todo en mayúsculas

        // Comparación ignorando mayúsculas/minúsculas
        String nombre1 = "Ridriguez";
        String nombre2 = "RODRÍGUEZ";

        if (nombre1.equalsIgnoreCase(nombre2))
            System.out.println("Son iguales");
        else
            System.out.println("No son iguales");
        */

        // ---------- COMPARACIÓN DE CADENAS ----------
        /*
        String apellido1 = "Rodriguez";
        String apellido2 = "Romero";

        if (apellido1.compareTo(apellido2) == 0)
            System.out.println("Son iguales");
        else if (apellido1.compareTo(apellido2) > 0)
            System.out.println(apellido1 + " va detrás de " + apellido2);
        else
            System.out.println(apellido1 + " va delante de " + apellido2);

        System.out.println(apellido1.substring(3));     // subcadena desde índice 3
        System.out.println(apellido1.substring(3, 7));  // subcadena de 3 a 6
        */

        // ---------- STRINGS VACÍOS Y OTRAS FUNCIONES ----------
        /*
        String cadenaVacia = "";
        String cadenaNula;
        String cadenaNula2 = null;

        if (cadenaVacia.isEmpty())                      // comprobar si está vacía
            System.out.println("La cadena está vacía");

        if (cadenaVacia.equals(""))                     // otra forma de comprobar
            System.out.println("La cadena está vacía");

        String texto = "Hola mundo cruel";
        System.out.println(texto.indexOf("cru"));       // índice donde empieza "cru"

        System.out.println(texto.replace(" ", "-"));    // reemplaza espacios por guiones
        System.out.println(texto);                      // original no cambia
        */

        // ===================================================================
        // CÓDIGO ACTIVO: MENÚ PRINCIPAL
        // ===================================================================

        // Scanner para leer lo que escribe el usuario
        Scanner teclado = new Scanner(System.in);

        // Mostrar opciones
        System.out.println("Pulsa P para jugar , C para configurar o X para salir: ");

        // Leer lo que escribe el usuario
        String opcion = teclado.nextLine();

        // Evaluar la opción con switch
        switch (opcion) {

            // Caso: jugar
            case "P":
            case "p":
                System.out.println("Vamos a jugar. ¡Partida nueva!");
                break;

            // Caso: configuración
            case "C":
            case "c":
                System.out.println("Entrando en la configuración");
                break;

            // Caso: salir
            case "X":
            case "x":
                System.out.println("Hasta la próxima");
                break;

            // Cualquier otra entrada
            default:
                System.out.println("Opción incorrecta");
        }

        // Cerramos el Scanner (buena práctica)
        teclado.close();
    }
}
