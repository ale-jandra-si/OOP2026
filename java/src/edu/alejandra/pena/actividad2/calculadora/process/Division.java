package edu.alejandra.pena.actividad2.calculadora.process;

public class Division {
    /**
     * Calcula cuántas veces cabe el divisor en el dividendo.
     * @param a Número a dividir
     * @param b Cantidad de veces que el número se divide
     * @return Regresa el cociente entero de la división.
     */
    public static int realizarOperacion(int a, int b) {
        int cociente = 0;
        int residuo = a;
        while (residuo >= b) {
            residuo = Resta.realizarOperacion(residuo, b);
            cociente = Suma.realizarOperacion(cociente, 1);
        }
        return cociente;
    }
}
