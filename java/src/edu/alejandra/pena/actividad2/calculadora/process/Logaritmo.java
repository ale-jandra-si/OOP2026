package edu.alejandra.pena.actividad2.calculadora.process;

public class Logaritmo {
    /**
     * Esta clase calcula el exponente al que hay que elevar la base para obtener el operando.
     * @param b Base del logaritmo.
     * @param a Operando
     * @return el número entero
     */
    public static int realizarOperacion(int b, int a) {
        int exponente = 0;
        int resultado = 1;
        while (resultado < a) {
            // Multiplicacion: resultado * b
            int multiplicacion = 0;
            int i = 0;
            while (i < b) {
                multiplicacion = Suma.realizarOperacion(multiplicacion, resultado);
                i = Suma.realizarOperacion(i, 1);
            }
            resultado = multiplicacion;

            exponente = Suma.realizarOperacion(exponente, 1);
        }
        return exponente;
    }
}
