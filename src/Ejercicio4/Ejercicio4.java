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
                case 'K' -> {
                    gradosKelvin = kelvin(gradosKelvin);
                    conversion = unidadConversion(conversion, unidad);
                    if (conversion == 'F') {
                        gradosFarenheit = kelvinFarenheit(gradosKelvin, gradosFarenheit);
                        System.out.println(gradosKelvin + "K " + "son " + gradosFarenheit + "F");
                    } else {
                        gradosCelsius = kelvinCelsius(gradosKelvin, gradosCelsius);
                        System.out.println(gradosKelvin + "K " + "son " + gradosCelsius + "C");
                    }
                }
                case 'F' -> {
                    gradosFarenheit = fareheit(gradosFarenheit);
                    conversion = unidadConversion(conversion, unidad);
                    if (conversion == 'K') {
                        gradosKelvin = fareheitKelvin(gradosKelvin, gradosFarenheit);
                        System.out.println(gradosFarenheit + "F " + "son " + gradosKelvin + "K");
                    } else {
                        gradosCelsius = farenheitCelsius(gradosFarenheit, gradosCelsius);
                        System.out.println(gradosFarenheit + "F " + "son " + gradosCelsius + "C");
                    }
                }
                case 'C' -> {
                    gradosCelsius = Celsius(gradosCelsius);
                    conversion = unidadConversion(conversion, unidad);
                    if (conversion == 'K') {
                        gradosKelvin = celsiusKelvin(gradosKelvin, gradosCelsius);
                        System.out.println(gradosCelsius + "C " + "son " + gradosKelvin + "K");
                    } else {
                        gradosFarenheit = celsiusFarenheit(gradosFarenheit, gradosCelsius);
                        System.out.println(gradosCelsius + "C " + "son " + gradosFarenheit + "F");
                    }
                }
            }
            System.out.println("¿Quiere realizar otra conversión?");
            repetir = sc.next().charAt(0);
        } while (repetir == 'S' || repetir == 's');
    }

    private static int celsiusKelvin(int gradosKelvin, int gradosCelsius) {
        return gradosKelvin = gradosCelsius + 273;
    }

    private static int celsiusFarenheit(int gradosFarenheit, int gradosCelsius) {
        return gradosFarenheit = (gradosCelsius * 9 / 5) + 32;
    }

    /**
     * @param gradosCelsius
     * @return
     */
    private static int Celsius(int gradosCelsius) {
        do {
            System.out.println("¿Cuántos grados celsius son?");
            gradosCelsius = sc.nextInt();
        } while (gradosCelsius < -273);
        return gradosCelsius;
    }

    /**
     * @param gradosFarenheit
     * @param gradosCelsius
     * @return
     */
    private static int farenheitCelsius(int gradosFarenheit, int gradosCelsius) {
        return gradosCelsius = (gradosFarenheit - 32) * 5 / 9;
    }

    /**
     * @param gradosKelvin
     * @param gradosFarenheit
     * @return
     */
    private static int fareheitKelvin(int gradosKelvin, int gradosFarenheit) {
        return gradosKelvin = (gradosFarenheit - 32) * 5 / 9 + 273;
    }

    /**
     * @param gradosKelvin
     * @return
     */
    private static int kelvin(int gradosKelvin) {
        do {
            System.out.println("¿Cuántos grados kelvin son?");
            gradosKelvin = sc.nextInt();
        } while (gradosKelvin < 0);
        return gradosKelvin;
    }

    /**
     * @param gradosFarenheit
     * @return
     */
    private static int fareheit(int gradosFarenheit) {
        do {
            System.out.println("¿Cuántos grados fareheit son?");
            gradosFarenheit = sc.nextInt();
        } while (gradosFarenheit < -459);
        return gradosFarenheit;
    }

    /**
     * @param gradosKelvin
     * @param gradosCelsius
     * @return
     */
    private static int kelvinCelsius(int gradosKelvin, int gradosCelsius) {
        return gradosCelsius = gradosKelvin - 273;
    }

    /**
     * @param gradosKelvin
     * @param gradosFareheit
     * @return
     */
    private static int kelvinFarenheit(int gradosKelvin, int gradosFareheit) {
        return gradosFareheit = (gradosKelvin - 273) * 9 / 5 + 32;
    }

    /**
     * @param conversion
     * @param unidad
     * @return
     */
    private static char unidadConversion(char conversion, char unidad) {
        do {
            System.out.println("¿A qué unidad quiere cambiar los grados?");
            conversion = sc.next().charAt(0);
            if (conversion == unidad) {
                System.out.println("La unidad a la que quiere cambiar es la misma que la unidad introducida");
                conversion = 'a';
            }
        } while (conversion != 'K' && conversion != 'F' && conversion != 'C');
        return conversion;
    }

    /**
     * @param unidad
     * @return
     */
    private static char conseguirUnidad(char unidad) {
        do {
            System.out.println("¿En qué unidad va ha introducir los grados?");
            unidad = sc.next().charAt(0);
        } while (unidad != 'K' && unidad != 'F' && unidad != 'C');
        return unidad;
    }
}
