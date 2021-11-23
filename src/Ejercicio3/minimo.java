package Ejercicio3;

public class minimo {
    public static int minimoMultiplo(int d1, int d2) {
        int mcm, i;
        mcm = 1;
        i = 2;
        while (i <= d1 || i <= d2) {
            if (d1 % i == 0 || d2 % i == 0) {
                mcm = mcm * i;
                if (d1 % i == 0) d1 = d1 / i;
                if (d2 % i == 0) d2 = d2 / i;
            } else
                i = i + 1;
        }
        return mcm;
    }
}
