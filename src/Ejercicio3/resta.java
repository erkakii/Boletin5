package Ejercicio3;

import static Ejercicio3.minimo.minimoMultiplo;

public class resta {
    /**
     * @param n1 el numerador de la primera fracción
     * @param n2 el numerador de la segunda fracción
     * @param d1 el denominador de la primera fracción
     * @param d2 el denominador de la segunda fracción
     * @return la resta de los numeradores para conseguir el denominador resultante
     */
    public static int restaFracciones(int n1, int n2, int d1, int d2) {
        //Declarar variables
        int mcm;
        mcm = minimoMultiplo(d1, d2);
        //Operaciones correspondientes
        n1 = mcm / d1 * n1;
        n2 = mcm / d2 * n2;
        return n1 - n2;
    }
}
