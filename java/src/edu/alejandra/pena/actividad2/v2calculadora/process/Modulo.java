package edu.alejandra.pena.actividad2.v2calculadora.process;

public class Modulo extends Resta {

    /**
     *Vamos a calcular el residuo de la división utilizando la clase de resta
     * @return para el valor final del residuo a/b
     */

    @Override
    public int apply(int a, int b) {
        if (b == 0) return a;
        while (a >= b) {
            a = super.apply(a, b);
        }
        return a;
    }
}
