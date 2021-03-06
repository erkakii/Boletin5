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
                    13: Cálculo de factores primos
                    """);
            do {
                System.out.println("Elija el programa que quiere iniciar");
                programa = sc.nextInt();
            } while (programa <= 0 || programa > 13);

            //Según el número elegido por el usuario usaremos un subprograma u otro

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

    //Subprograma para sacar los factores primos de un número
    private static void factoresPrimos() {
        //Declarar variables y pedir números
        Scanner objEntrada = new Scanner(System.in);
        System.out.println("Escribe un numero para sacar sus factores primos");
        int numero = objEntrada.nextInt();
        factor(numero);
    }
    //Sacar factores primos
    static void factor(int numero) {
        int num = 2;

        while (numero != 1) {
            while (numero % num == 0) {
                System.out.println(num);
                numero /= num;
            }
        }
    }


    /**
     * Subprograma para saber la pendiente de una recta
     */
    private static void pendienteRecta() {
        //Declarar variables
        double angulo, pendiente;
        Scanner sc = new Scanner(System.in);
        //Pedir ángulo que forma la recta
        System.out.println("¿Qué ángulo forma la recta con el eje x?");
        angulo = sc.nextFloat();
        //Calcular pendiente
        pendiente = Math.tan(angulo);
        //Mostrar resultado
        System.out.println("La pendiente de la recta es " + pendiente);
    }

    //Subprograma para saber el siguiente número primo
    private static void sigPrimo() {
        //Declarar variables
        int num, i;
        boolean contador;
        contador = true;
        Scanner sc = new Scanner(System.in);
        //Conseguir num
        System.out.println("Diga el número");
        num = sc.nextInt();
        //Conseguir num primo
        for (i = num + 1; contador; i++) {
            if ((i % 2 == 0) || (i % 3 == 0) || (i % 5 == 0)) {
                contador = false;
            }
        }
        //Mostrar resultado
        System.out.println("El siguiente número primo es " + i);
    }

    /**
     * Subprograma para saber si un número es primo o no
     */
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

    /**
     * Subprograma para pasar hectáreas a metros cuadrados
     */
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

    /**
     * Subprograma para saber cuantas cifras tiene un número introducido por el usuario
     */
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

    //Subprograma para saber si dos números son amigos o no
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

    //Subprograma para saber si un carácter pertenece al alfabeto o no
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

    //Subprograma para saber si un número es perfecto o no
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

    //Subprograma para saber si un número está entre 0 y 9
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

    //Subprograma para saber si un año es bisiesto o no
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

    //Subprograma para convertir una cadena en mayúsculas a minúsculas
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

    //Subprograma 1 escribir un carácter tantas veces como el usuario pida
    private static void escribirCaracter() {
        //Declarar variables
        int veces;
        char caracter;
        Scanner sc = new Scanner(System.in);
        //leer caracter
        System.out.println("Diga el carácter que quiere introducir");
        caracter = sc.next().charAt(0);
        //leer numero de veces de veces
        do {
            System.out.println("Diga el número de veces que quierese imprimir el caracter");
            veces = sc.nextInt();
        } while (veces <= 0);


        //Escribir la línea
        for (int i = 1; i <= veces; i++) {
            System.out.print(caracter);
        }
        System.out.println("/n");
    }
}
