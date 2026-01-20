package edu.alejandra.pena.actividad2.calculadora.process;

public class Raiz {
    /**
     * Esta clase calcula la raíz aproximada usando potencias
     * @param b Índice de la raíz
     * @param a Es el número al que se le busca la raíz
     * @return La raíz entera positiva.
     */
    public static int realizarOperacion(int b, int a) {
        int respuesta = 0;
        
        // Calculamos potencia (respuesta ^ b) <= a
        while (true) {
            // Calcular potencia: respuesta ^ b
            int potencia = 1;
            if (b != 0) {
                int base = respuesta;
                int resultadoPotencia = base;
                int i = 1;
                while (i < b) {
                    // Multiplicacion: resultadoPotencia * base
                    int multiplicacion = 0;
                    int j = 0;
                    while (j < base) {
                        multiplicacion = Suma.realizarOperacion(multiplicacion, resultadoPotencia);
                        j = Suma.realizarOperacion(j, 1);
                    }
                    resultadoPotencia = multiplicacion;
                    i = Suma.realizarOperacion(i, 1);
                }
                potencia = resultadoPotencia;
            }
            
            if (potencia > a) {
                break;
            }
            respuesta = Suma.realizarOperacion(respuesta, 1);
        }
        return Resta.realizarOperacion(respuesta, 1);
    }
}
