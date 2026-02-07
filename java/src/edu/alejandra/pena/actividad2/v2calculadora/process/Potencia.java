package edu.alejandra.pena.actividad2.v2calculadora.process;

public class Potencia extends Multiplicacion {
    /**
     * En esta clase se va a elevar un número base a un exponente
     * @return para el valor final de la potencia a^b
     */

    public int producto;

    @Override
    public int apply(int a, int b) {
        producto = 1;
        for(int i = 0; i < b; i++) {
            producto = super.apply(producto,a);
        }
        return producto;
    }
}
