package calculadorasimple;

import java.io.*;
import java.util.Scanner;

public class calculadorasimple {
    public static void main(String[] args) {
        double op1 = 0, op2 = 0, total = 0;
        String op = "";
//usamos la clase BufferedReader para introducir los datos por teclado
//InputStreamReader clase que funciona como “puente” entre el flujo de bytes y el flujo de caracteres,
// lee bytes y los decodifica en caracteres, usando un charset específico.
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (true && !op.equals("Z")) {
            try {
                System.out.println("\nTeclee operación (+,-,*,/),  Z para terminar: ");
                op = entrada.readLine().toUpperCase();
                if (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")
                        && !op.equals("Z")) throw new OpMal();
                else if (!op.equals("Z")) {

                    System.out.println("\nTeclee operando 1: ");
                    op1 = Double.parseDouble(entrada.readLine());
                    System.out.println("\nTeclee operando 2: ");
                    op2 = Double.parseDouble(entrada.readLine());
                    if (op.equals("+")) total = op1 + op2;
                    if (op.equals("-")) total = op1 - op2;
                    if (op.equals("*")) total = op1 * op2;
                    if (op.equals("/")) total = op1 / op2;
                    System.out.println("el resultado de " + op1 + op + op2 + " es = " + total);
                }
            } catch (OpMal om) {
                System.out.println("\n" + om);
            } catch (NumberFormatException nfe) {
                System.out.println("\nError de formato numérico: " + nfe.toString());
            } catch (ArithmeticException ae) {
                System.out.println("\nError aritmético: " + ae.toString());
            } catch (IOException ioe) {
                System.out.println("\nError de entrada/salida: " + ioe.toString());
            } catch (Exception e) {
// Captura cualquier otra excepción
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
    }
}

class OpMal extends Exception {
    public OpMal() {
        super("Excepción: OPERACIÓN INCORRECTA.");
    }
}
