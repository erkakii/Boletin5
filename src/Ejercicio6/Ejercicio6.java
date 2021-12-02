package Ejercicio6;

import java.util.*;

public class Ejercicio6 {
    /*Queremos un programa que calcule el tiempo en segundos transcurrido desde las 00:00:00 hasta la hora
     introducida por el usuario.
     Entrada: Hora en horas minutos y segundos
     Salida: Tiempo transcurrido en segundos*/
    public static Scanner sc = new Scanner(System.in);
    public static int segundosT;
    public static void main(String[] args) {
        //Declarar variables
        int hora, minutos, segundos;
        hora = 0;
        minutos = 0;
        segundos = 0;

        //Uso de funciones
        hora = conseguirHora(hora);
        minutos = conseguirMinutos(minutos);
        segundos = conseguirSegundos(segundos);
        segundosT = segundosTotales(hora, minutos, segundos);
        System.out.println("Desde las 00:00:00 hasta tu hora han pasado " + segundosT + " segundos");
    }

    /**
     *
     * @param hora horas introducidas por el usuario
     * @param minutos minutos introducidos por el usuario
     * @param segundos segundos introducidos por el usuario
     * @return devuelve los segundos transcurridos desde las 00:00:00 hasta la hora
     * introducida por el usuario en el mismo formato
     */
    private static int segundosTotales(int hora, int minutos, int segundos) {
        segundosT = hora * 3600 + minutos * 60 + segundos;
        return segundosT;
    }

    /**
     *
     * @param segundos representa los segundos de ese minuto
     * @return los minutos de ese minuto
     */
    private static int conseguirSegundos(int segundos) {
        do {
            System.out.println("¿Qué segundo es?: ");
            segundos = sc.nextInt();
        } while (segundos < 0 || segundos > 59);
        return segundos;
    }

    /**
     *
     * @param minutos representa los minutos de esa hora
     * @return devuelve los minutos del la hora
     */
    private static int conseguirMinutos(int minutos) {
        do {
            System.out.println("¿Qué minuto es?:");
            minutos = sc.nextInt();
        } while (minutos < 0 || minutos > 59);
        return minutos;
    }

    /**
     *
     * @param hora representa la hora del día
     * @return devuelve la hora del día
     */
    private static int conseguirHora(int hora) {
        do{
            System.out.println("¿Qué hora es?:");
            hora = sc.nextInt();
        } while (hora < 0 || hora > 23);
        return hora;
    }
}
