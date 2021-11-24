package Ejercicio4;

import java.util.*;

public class Ejercicio4 {

    /*Las unidades deben escribirse en mayúsculas*/
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
            unidad = conseguirUnidad(unidad);
            switch (unidad) {
                case 'K':
                    gradosKelvin = kelvin(gradosKelvin);
                    conversion = unidadConversion(conversion, unidad);
                    if (conversion == 'F') {
                        gradosFarenheit = kelvinFarenheit(gradosKelvin, gradosFarenheit);
                        System.out.println(gradosKelvin + "K " + "son " + gradosFarenheit + "F");
                    } else {
                        gradosCelsius = kelvinCelsius(gradosKelvin, gradosCelsius);
                        System.out.println(gradosKelvin + "K " + "son " + gradosCelsius + "C");
                    }
                    break;
                case 'F':
                    gradosFarenheit = fareheit(gradosFarenheit);
                    conversion = unidadConversion(conversion, unidad);
                    break;
                case 'C':
                    break;
            }
            System.out.println("¿Quiere realizar otra conversión?");
            repetir = sc.next().charAt(0);
        } while (repetir == 'S' || repetir == 's');
    }

    private static int kelvin(int gradosKelvin) {
        do {
            System.out.println("¿Cuántos grados kelvin son?");
            gradosKelvin = sc.nextInt();
        } while (gradosKelvin < 0);
        return gradosKelvin;
    }

    private static int fareheit(int gradosFarenheit) {
        do {
            System.out.println("¿Cuántos grados fareheit son?");
            gradosFarenheit = sc.nextInt();
        } while (gradosFarenheit < -459);
        return gradosFarenheit;
    }

    private static int kelvinCelsius(int gradosKelvin, int gradosCelsius) {
        return gradosCelsius = gradosKelvin - 273;
    }


    private static int kelvinFarenheit(int gradosKelvin, int gradosFareheit) {
        return gradosFareheit = (gradosKelvin - 273) * 9 / 5 + 32;
    }

    private static char unidadConversion(char conversion, char unidad) {
        do {
            System.out.println("¿A qué unidad quiere cambiar los grados?");
            conversion = sc.next().charAt(0);
        } while (conversion == unidad && conversion != 'F' && conversion != 'C');
        return conversion;
    }

    private static char conseguirUnidad(char unidad) {
        do {
            System.out.println("¿En qué unidad va ha introducir los grados?");
            unidad = sc.next().charAt(0);
        } while (unidad != 'K' && unidad != 'F' && unidad != 'C');
        return unidad;
    }
}
