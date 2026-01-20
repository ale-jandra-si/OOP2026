package edu.alejandra.pena.actividad2.calculadora.process;

public class Potencia {
    /**
     * Esta clase eleva el número a un exponente
     * @param base El número que se eleva
     * @param exponente La cantidad de veces que se multiplica la base.
     * @return Resultado del número o base elevado al del exponente.
     */
    public static int realizarOperacion(int base, int exponente) {
        if (exponente == 0) return 1;
        int resultado = base;
        int i = 1;
        while (i < exponente) {
            // Multiplicacion: resultado * base
            int multiplicacion = 0;
            int j = 0;
            while (j < base) {
                multiplicacion = Suma.realizarOperacion(multiplicacion, resultado);
                j = Suma.realizarOperacion(j, 1);
            }
            resultado = multiplicacion;

            i = Suma.realizarOperacion(i, 1);
        }
        return resultado;
    }
}
