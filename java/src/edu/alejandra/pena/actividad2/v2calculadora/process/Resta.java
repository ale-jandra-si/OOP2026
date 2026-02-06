package edu.alejandra.pena.actividad2.v2calculadora.process;

public class Resta extends Operacion {

    /**
     * Se va a realizar la resta de dos números enteros
     * @param a el primer valor
     * @param b segundo valor
     * @return para el valor final de la resta
     */

    @Override
    public int apply(int a, int b) {
        return a-b;
    }
}
