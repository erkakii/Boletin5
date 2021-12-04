package Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    /*Queremos un programa que calcule el número combinatorio de dos números
     * Entrada: Dos números
     * Salida: Número combinatorio*/
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Declarar variables
        int num1, num2, num3;
        long factorial1, factorial2, factorialResta, numCombinatorio;
        factorial1 = 1;
        factorial2 = 1;
        numCombinatorio = 0;
        factorialResta = 1;
        num3 = 0;
        //Pedir números
        System.out.println("Diga el primer número");
        num1 = sc.nextInt();
        System.out.println("Diga el segundo número");
        num2 = sc.nextInt();
        //Calcular factoriales
        factorial1 = calcularFactorial1(num1, factorial1);
        factorial2 = calcularFactorial2(num2, factorial2);
        num3 = num1 - num2;
        factorialResta = calcularFactorialResta(num3, factorialResta);
        //Calculo de numCombinatorio
        numCombinatorio = calcularCombinatorio(factorial1, factorial2, numCombinatorio, factorialResta);
        //Mostrar resultado
        System.out.println("El numero combinatorio es " + numCombinatorio);
    }

    /**
     *
     * @param num3 es el número resultante de restar el numero1 y el numero2
     * @param factorialResta es el resultado del factorial del número 3
     * @return devuelve el factorial del número 3
     */
    private static long calcularFactorialResta(int num3, long factorialResta) {
        for (int i = num3; i > 0; i--) {
            // Calcular factorial
            factorialResta = factorialResta * i;
        }
        return factorialResta;
    }

    /**
     *
     * @param factorial1 es el factorial del primer número
     * @param factorial2 es el factorial del segundo número
     * @param numCombinatorio es el resultado de calcular el número
     *                        combinatorio del número uno y el número dos
     * @param factorialResta es el factorial del número resultante de num1 menos num2
     * @return devuelve el número combinatorio del num1 y el num2
     */
    private static long calcularCombinatorio(long factorial1, long factorial2, long numCombinatorio, long factorialResta) {
        numCombinatorio =(factorial1 / (factorial2 * factorialResta));
        return numCombinatorio;
    }

    /**
     *
     * @param num2 el segundo número introducido por el usuario
     * @param factorial2 el factorial de num2
     * @return  el factorial de num2
     */
    private static long calcularFactorial2(int num2, long factorial2) {
        for (int i = num2; i > 0; i--) {
            // Calcular factorial
            factorial2 = factorial2 * i;
        }
        return factorial2;
    }

    /**
     *
     * @param num1 el primer número introducido por el usuario
     * @param factorial1 el factorial de num1
     * @return el factorial de num1
     */
    private static long calcularFactorial1(int num1, long factorial1) {
        for (int i = num1; i > 0; i--) {
            // Calcular factorial
            factorial1 = factorial1 * i;
        }
        return factorial1;
    }
}
