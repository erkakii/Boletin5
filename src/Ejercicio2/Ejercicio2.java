package Ejercicio2;

import java.util.*;
/**
 * @author acastro
 * @version 1.0
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        //Conseguir vectores
        int x1, y1, z1, x2, y2, z2, opcion;
        double m1, m2, xsum, ysum, zsum, xpro, ypro, zpro;
        char continuar;
        Scanner sc = new Scanner(System.in);
        do {
            do {
                //Crear menú
                System.out.println("""
                        ¿Qué operación quiere realizar?
                        1: Modulo de los vectores
                        2: Suma de los vectores
                        3: Producto escalar
                        4: Producto vectorial
                        5: Salir
                        """);
                opcion = sc.nextInt();
            } while (opcion < 1 || opcion > 5);

            if (opcion != 5) {
                System.out.println("Diga el valor de la x del primer vector");
                x1 = sc.nextInt();
                System.out.println("Diga el valor de la y del primer vector");
                y1 = sc.nextInt();
                System.out.println("Diga el valor de la z del primer vector");
                z1 = sc.nextInt();
                System.out.println("Diga el valor de la x del segundo vector");
                x2 = sc.nextInt();
                System.out.println("Diga el valor de la y del segundo vector");
                y2 = sc.nextInt();
                System.out.println("Diga el valor de la z del segundo vector");
                z2 = sc.nextInt();

                switch (opcion) {
                    case 1 -> {
                        m1 = moduloVector1(x1, y1, z1);
                        System.out.println("El módulo del primmer vector es " + m1);
                        m2 = moduloVector1(x2, y2, z2);
                        System.out.println("El módulo del segundo vector es " + m2);
                    }
                    case 2 -> {
                        xsum = sumaVectores(x1, x2);
                        ysum = sumaVectores(y1, y2);
                        zsum = sumaVectores(z1, z2);
                        System.out.println("El vector suma es (" + xsum + " , " + ysum + " , " + zsum + ")");
                    }
                    case 3 -> {
                        xpro = productoEscalar(x1, x2);
                        ypro = productoEscalar(y1, y2);
                        zpro = productoEscalar(z1, z2);
                        System.out.println("El vector producto es (" + xpro + " , " + ypro + " , " + zpro + ")");
                    }
                    case 4 -> productoVectorial();
                }

            }
            System.out.println("¿Quiere volver ha usar el programa?");
            continuar = sc.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');
    }

    /**
     * @param x primera coordenada
     * @param y segunda coordenada
     * @param z tercera coordenada
     * @return módulo del vector
     */
    private static double moduloVector1(int x, int y, int z) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    /**
     * @param A coordenada del primer vector
     * @param B coordenada del segundo vector
     * @return suma de las dos coordenadas
     */
    private static double sumaVectores(int A, int B) {
        return A + B;
    }

    /**
     * @param A coordenada del primer vector
     * @param B coordenada del segundo vector
     * @return producto de las dos coordenadas
     */
    private static double productoEscalar(int A, int B) {
        return A * B;
    }

    private static void productoVectorial() {
        System.out.println("En construcción");
    }
}

