package Ejercicio3;

import static Ejercicio3.suma.sumaFracciones;
import static Ejercicio3.minimo.minimoMultiplo;
import static Ejercicio3.resta.restaFracciones;
import static Ejercicio3.multiplicacion.multiplicacionFracciones;
import static Ejercicio3.division.divisionFracciones;

import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        int opcion, mcm, n1, n2, d1, d2, n3;
        char continuar;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Diga el valor del primer numerador");
            n1 = sc.nextInt();
            System.out.println("Diga el valor del primer denominador");
            d1 = sc.nextInt();
            System.out.println("Diga el valor del segundo numerador");
            n2 = sc.nextInt();
            System.out.println("Diga el valor del segundo denominador");
            d2 = sc.nextInt();
            mcm = minimoMultiplo(d1, d2);
            System.out.println("""
                    1. Sumar las fracciones
                    2. Restar las fracciones
                    3. Multiplicar fracciones
                    4. Dividir fracciones
                    Eliga una opción
                    """);
            opcion = sc.nextInt();
            switch (opcion) {

                case 1 -> {
                    n3 = sumaFracciones(n1, n2, d1, d2);
                    System.out.println("La fracción suma es " + n3 + "/" + mcm);
                }
                case 2 -> {
                    n3 = restaFracciones(n1, n2, d1, d2);
                    System.out.println("La fracción resta es " + n3 + "/" + mcm);
                }
                case 3 -> multiplicacionFracciones(n1, n2, d1, d2);
                case 4 -> divisionFracciones(n1, n2, d1, d2);
                default -> System.out.println("Error");
            }
            System.out.println("¿Quiere realizar otra operación?");
            continuar = sc.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

    }
}
