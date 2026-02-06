package edu.alejandra.pena.actividad2.v2calculadora.process;

public class Division extends Resta {

    /**
     * En esta clase vamos a realizar la división entera utilizando restas
     * @return para el valor final de la división
     */

    private int cociente;

    @Override
    public int apply(int a, int b) {
        if (b == 0) return 0;
        cociente = 0;
        while (a >= b) {
            a = super.apply(a, b);
            cociente++;
        }
        return cociente;
    }

}
