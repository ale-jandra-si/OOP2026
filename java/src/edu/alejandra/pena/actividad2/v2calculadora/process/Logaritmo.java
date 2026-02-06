package edu.alejandra.pena.actividad2.v2calculadora.process;

public class Logaritmo extends Division {

    /**
     * En esta clase se desarrolla el metodo de Logaritmo paara saber a que exponente debemos elevar la base, utilizamos la clase de division
     * @return para el valor final de la base elevada al exponente
     */

    private int contador;

    @Override
    public int apply(int a, int b) {
        if (b <= 1) return 0;
        contador = 0;
        while (a >= b) {
            a = super.apply(a, b);
            contador++;
        }
        return contador;
    }
}
