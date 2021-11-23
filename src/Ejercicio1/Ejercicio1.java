package Ejercicio1;

import java.util.*;

public class Ejercicio1 {
    /*Precondiciones: Para usar el programa 2 solo podrá introducir una cadena de texto. Además la
     * cadena debe introducirse en mayúsculas
     * El subprograma 6 solo funciona si las letras se introducen en minúsculas*/
    //Programa general

    public static void main(String[] args) {
//Declaración de variables
        int programa;
        char continuar;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("""
                    1: Escribir carácter un número de veces
                    2: Pasar de mayúsculas a minúsculas
                    3: Calcular si un año es bisiesto o no
                    4: Determinar si un carácter esta entre 0 y 9
                    5: Saber si un número es perfecto
                    6: Saber si un carácter pertenece al alfabeto
                    7: Números amigos
                    8: Cuantas cifras tiene un número entero
                    9: Medida de hectáreas y áreas a metros cuadrados
                    10: Saber si un número es primo o no
                    11: Devuelve el siguiente número primo
                    12: Pendiente de la recta
                    13: Calculo de factores primos
                    """);
            do {
                System.out.println("Elija el programa que quiere iniciar");
                programa = sc.nextInt();
            } while (programa <= 0 || programa > 13);

            //Subprogramas

            switch (programa) {
                case 1 -> escribirCaracter();
                case 2 -> convertirMayuscula();
                case 3 -> anioBisiesto();
                case 4 -> caracterEntre0a9();
                case 5 -> numPerfecto();
                case 6 -> perteneceAlfabeto();
                case 7 -> numAmigo();
                case 8 -> cifrasNum();
                case 9 -> metrosCuadrados();
                case 10 -> numPrimo();
                case 11 -> sigPrimo();
                case 12 -> pendienteRecta();
                case 13 -> factoresPrimos();
            }
            System.out.println("¿Quiere utilizar otro programa?");
            continuar = sc.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

    }


    private static void factoresPrimos() {
        System.out.println("En construcción");
    }

    private static void pendienteRecta() {
        System.out.println("En construcción");
    }

    //Subprograma 11
    private static void sigPrimo() {
        //Declarar variables
    }

    //Subprograma 10
    private static void numPrimo() {
        //Declarar variables
        int num, i, contador;
        contador = 0;
        Scanner sc = new Scanner(System.in);
        //Conseguir número
        System.out.println("Diga el número");
        num = sc.nextInt();
        //Cálculo de divisores
        for (i = 1; i < num; i++) {
            if (num % i == 0) {
                contador++;
            }
        }
        //Mostrar resultados
        if (contador > 1) {
            System.out.println("El número no es primo");
        } else {
            System.out.println("El número es primo");
        }
    }

    //Subprograma 9
    private static void metrosCuadrados() {
        //Declarar variables
        int hectareas, metrosCuadrados;
        Scanner sc = new Scanner(System.in);
        //Conseguir hectáreas
        System.out.println("Diga el número de hectáreas");
        hectareas = sc.nextInt();
        //Calcular metros cuadrados
        metrosCuadrados = hectareas * 10000;
        //Mostrar resultado
        System.out.println("Esas hectáreas son " + metrosCuadrados + " metros cuadrados");
    }

    //Subprograma 8
    private static void cifrasNum() {
        //Declarar variables
        int num, contador;
        contador = 0;
        Scanner sc = new Scanner(System.in);
        //Conseguir número
        System.out.println("Escriba el número");
        num = sc.nextInt();
        //Calcular cifras
        do {
            num = num / 10;
            contador++;
        } while (num > 0);
        //Mostrar resultados
        System.out.println("El número tiene " + contador + " cifras");
    }

    //Subprograma 7
    private static void numAmigo() {
        //Declarar las variables
        int i, j, num1, num2, suma1, suma2;
        suma1 = 0;
        suma2 = 0;
        Scanner sc = new Scanner(System.in);
        //Pedir y validar números
        do {
            System.out.println("Escriba un número");
            num1 = sc.nextInt();
        } while (num1 <= 0);
        do {
            System.out.println("Escriba el otro número");
            num2 = sc.nextInt();
        } while (num2 < 0);
        //Conseguir divisores
        for (i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                suma1 = suma1 + i;
            }
        }
        for (j = 1; j < num2; j++) {
            if (num2 % j == 0) {
                suma2 = suma2 + j;
            }
        }
        //Comparar y mostrar resultados
        if (suma1 == suma2) {
            System.out.println("Los números son amigos");
        } else {
            System.out.println("Los números no son amigos");
        }
    }

    //Subprograma 6
    private static void perteneceAlfabeto() {
        //Declarar variables
        char caracter;
        Scanner sc = new Scanner(System.in);
        //Conseguir carácter
        System.out.println("Escriba el carácter");
        caracter = sc.next().charAt(0);
        //Comprobación del carácter
        if (caracter < 'a' || caracter > 'z') {
            System.out.println("El carácter no está en el abecedario");
        } else {
            System.out.println("El carácter está en el abecedario");
        }

    }

    //Subprograma 5
    private static void numPerfecto() {
        //Declarar variables
        int num, i, suma;
        suma = 0;
        Scanner sc = new Scanner(System.in);
        //Preguntar y validar número
        do {
            System.out.println("¿Qué número quiere comprobar?");
            num = sc.nextInt();
        } while (num <= 1);
        //Conseguir divisores
        for (i = 1; i < num; i++) {
            if (num % i == 0) {
                suma = suma + i;
            }
        }
        //Comprobación del resultado
        if (suma == num) {
            System.out.println("El número es un número perfecto");
        } else {
            System.out.println("El número no es un número perfecto");
        }

    }

    //Subprograma 4
    private static void caracterEntre0a9() {
        //Declarar variables
        int num;
        Scanner sc = new Scanner(System.in);
        //Pedir y verificar número
        System.out.println("Diga el número");
        num = sc.nextInt();
        if (num >= 0 && num <= 9) {
            System.out.println("El número está ente 0 y 9");
        } else {
            System.out.println("El número no está entre 0 y 9");
        }
    }

    //Subprograma 3
    private static void anioBisiesto() {
        //Declaración de variables
        int anio;
        //Pedir y validar año
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce un año: ");
            anio = sc.nextInt();
        } while (anio < 0);

        //Comprobación de si es bisiesto
        if (anio % 4 == 0 || (anio % 100 == 0 && anio % 400 == 0)) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }

    //Subprograma 2
    private static void convertirMayuscula() {
        //Declarar variables
        String cadena1;
        Scanner teclado = new Scanner(System.in);
        //Lectura de la cadena
        System.out.println("Escriba la palabra a convertir");
        cadena1 = teclado.next();
        //Mostrar cadena en pantalla
        System.out.println(cadena1.toLowerCase());
    }

    //Subprograma 1
    private static void escribirCaracter() {
        //Declarar variables
        int veces;
        char caracter;
        Scanner sc = new Scanner(System.in);
        //leer caracter
        System.out.println("Diga el carácter que quiere introducir");
        caracter = sc.next().charAt(0);
        //leerenum de veces
        do {
            System.out.println("Diga el número de veces que quierese imprimir el caracter");
            veces = sc.nextInt();
        } while (veces <= 0);


        //Escribir la línea
        for (int i = 1; i <= veces; i++) {
            System.out.print(caracter);
        }
        System.out.println("\n");
    }
}
