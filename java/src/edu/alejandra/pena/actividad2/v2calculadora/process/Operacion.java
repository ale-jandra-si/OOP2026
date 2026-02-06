package edu.alejandra.pena.actividad2.v2calculadora.process;

public abstract class Operacion {

    /**
     * Este metodo abstracto es el que hace que se pueda aplicar la operación matematica
     * @param a el primer valor
     * @param b segundo valor
     * @return el resultado de forma entera de la operación
     */

    public abstract int apply(int a, int b);
}
