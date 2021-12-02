package Ejercicio5;

import java.util.*;

public class Ejercicio5 {
    /*Realizar un subprograma que pinte un triángulo en pantalla
     * Entrada: Base del triángulo y carácter a pintar en el triángulo
     * Salida: Triángulo en pantalla */

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Declarar e iniciar variables
        int base;
        char caracter, continuar;
        base = 0;
        caracter = '0';
        do {
            base = pedirBase(base);
            caracter = pedirCaracter(caracter);
            dibujarTriangulo(base, caracter);
            System.out.println("¿Quiere pintar otro triángulo?");
            continuar = sc.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

    }

    /**
     * Algoritmo que dibuja el triángulo
     * @param base     la base del triángulo
     * @param caracter carácter con el que va a dibujar le triangulo
     */
    private static void dibujarTriangulo(int base, char caracter) {

        for (int x = 1; x <= base; x++) {
            for (int blancos = 1; blancos <= base - x; blancos++) {
                System.out.print(" ");
            }
            for (int y = 1; y <= x; y++) {
                System.out.print(caracter + " ");
            }
            System.out.println();
        }
    }


    /**
     * @param caracter pide el carácter con el que va a rellenar el triángulo
     * @return El carácter con el que va a rellenar el triángulo
     */
    private static char pedirCaracter(char caracter) {
        System.out.println("¿Con qué carácter va a rellenar el triángulo?");
        caracter = sc.next().charAt(0);
        return caracter;
    }

    /**
     * @param base pide la base que va ha tener el triángulo
     * @return devuelve el valor de la base
     */
    private static int pedirBase(int base) {
        do {
            System.out.println("¿Cuál es la base del triángulo?");
            base = sc.nextInt();
        } while (base <= 0);
        return base;
    }
}
