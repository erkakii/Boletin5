package Ejercicio3;

import static Ejercicio3.minimo.minimoMultiplo;

public class suma {
    public static int sumaFracciones(int n1, int n2, int d1, int d2){
        int mcm;
        mcm = minimoMultiplo(d1, d2);
        n1 = mcm / d1 * n1;
        n2 = mcm / d2 * n2;
        return n1 + n2;
    }
}

