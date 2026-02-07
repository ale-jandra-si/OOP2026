package edu.alejandra.pena.actividad2.v2calculadora.process;

public class Raiz extends Potencia {
    /**
     *En esta clase vamos a calcular la raíz de un número utilizando la clase de potencia
     * @return para el valor de la raíz
     */

    @Override
    public int apply (int a, int b) {
        if (b == 0) return 1;
        if (a == 0) return 0;

        int base = 1;
        while (super.apply(base, b) <= a) {
            base++;
        }
        return base - 1;
    }
}
