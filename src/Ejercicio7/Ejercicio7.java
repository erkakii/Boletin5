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
        factorial1 = calcularFactorial1(num1, factorial1);
        factorial2 = calcularFactorial2(num2, factorial2);
        num3 = num1 - num2;
        factorialResta = calcularFactorialResta(num3, factorialResta);
        numCombinatorio = calcularCombinatorio(factorial1, factorial2, numCombinatorio, factorialResta);
        System.out.println("El numero combinatorio es " + numCombinatorio);
    }

    private static long calcularFactorialResta(int num3, long factorialResta) {
        for (int i = num3; i > 0; i--) {
            // Calcular factorial
            factorialResta = factorialResta * i;
        }
        return factorialResta;
    }

    private static long calcularCombinatorio(long factorial1, long factorial2, long numCombinatorio, long factorialResta) {
        numCombinatorio =(factorial1 / (factorial2 * factorialResta));
        return numCombinatorio;
    }

    private static long calcularFactorial2(int num2, long factorial2) {
        for (int i = num2; i > 0; i--) {
            // Calcular factorial
            factorial2 = factorial2 * i;
        }
        return factorial2;
    }

    private static long calcularFactorial1(int num1, long factorial1) {
        for (int i = num1; i > 0; i--) {
            // Calcular factorial
            factorial1 = factorial1 * i;
        }
        return factorial1;
    }
}
