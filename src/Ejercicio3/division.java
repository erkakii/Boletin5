package Ejercicio3;

public class division {
    /**
     * Hacemos la división de las dos fracciones
     * @param n1 el numerador de la primera fracción
     * @param n2 el numerador de la segunda fracción
     * @param d1 el denominador de la primera fracción
     * @param d2 el denominador de la segunda fracción
     */
    public static void divisionFracciones(int n1, int n2, int d1, int d2){
        //Declarar variables
        int n3, d3;
        //Operaciones correspondientes
        n3 = n1 * d2;
        d3 = n2 * d1;
        System.out.println("La división de las fracciones es " + n3 + "/" + d3);
    }
}
