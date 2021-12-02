package Ejercicio3;

public class multiplicacion {
    /**
     * Calculamos la fracción resultante de multiplicar las dos primeras
     * @param n1 el numerador de la primera fracción
     * @param n2 el numerador de la segunda fracción
     * @param d1 el denominador de la primera fracción
     * @param d2 el denominador de la segunda fracción
     */
    public static void multiplicacionFracciones(int n1, int n2, int d1, int d2){
        //Declarar variables
        int n3, d3;
        //Operaciones correspondientes
        n3 = n1 * n2;
        d3 = d1 * d2;
        System.out.println("La multiplicación de las fracciones es " + n3 + "/" + d3);
    }
}
