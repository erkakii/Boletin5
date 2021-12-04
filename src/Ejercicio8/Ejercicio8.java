package Ejercicio8;

import java.util.*;

public class Ejercicio8 {
    /*Queremos un subprograma que dibuje la pirámide Pascal*/
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int filas;
        filas = pedirFilas(sc);
        for (int i = 0; i < filas; i++) {
            int num = 1;
            System.out.format("%" + (filas - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", num);
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }


    /**
     * Este método es el encargado de pedir el número de filas
     *
     * @param sc Variable del scanner
     * @return numero de filas del triángulo
     */
    private static int pedirFilas(Scanner sc) {
        System.out.print("Escribe el numero de columnas: ");
        return sc.nextInt();
    }
}

