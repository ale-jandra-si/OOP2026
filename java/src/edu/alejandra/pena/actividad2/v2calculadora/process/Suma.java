package edu.alejandra.pena.actividad2.v2calculadora.process;

public class Suma extends Operacion {

    /**
     * Se va a realizar la suma de dos números enteros
     * @param a el primer valor
     * @param b segundo valor
     * @return para el valor final de la suma
     */

    @Override
    public int apply(int a, int b) {
        return a+b;
    }
}
