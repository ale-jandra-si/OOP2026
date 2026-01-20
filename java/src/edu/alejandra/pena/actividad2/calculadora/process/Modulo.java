package edu.alejandra.pena.actividad2.calculadora.process;

public class Modulo {
    /**
     * Esta clase muestra el residuo de las diviones
     * @return El residuo (resto) de la operación.
     */
    public static int realizarOperacion(int a, int b) {
        int residuo = a;
        while (residuo >= b) {
            residuo = Resta.realizarOperacion(residuo, b);
        }
        return residuo;
    }
}
