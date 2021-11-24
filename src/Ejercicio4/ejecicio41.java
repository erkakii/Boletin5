package Ejercicio4;

import java.util.*;

public class ejecicio41 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int gradosCelsius, gradosKelvin, gradosFarenheit;
        char repetir, unidad, conversion;
        unidad = '0';
        conversion = '0';
        gradosFarenheit = 0;
        gradosCelsius = 0;
        gradosKelvin = 0;
        do {
            do {
                System.out.println("¿En qué unidad va ha introducir los grados?");
                unidad = sc.next().charAt(0);
            } while (unidad != 'K' && unidad != 'F' && unidad != 'C');

            do {
                System.out.println("¿A qué unidad quiere cambiar los grados?");
                conversion = sc.next().charAt(0);
            } while (conversion != 'K' && conversion != 'F' && conversion != 'C');
            System.out.println("¿Quiere realizar otra conversión?");
            repetir = sc.next().charAt(0);
        } while (repetir == 'S' || repetir == 's');
    }
}

