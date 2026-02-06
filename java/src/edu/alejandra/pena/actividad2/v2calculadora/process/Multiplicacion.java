package edu.alejandra.pena.actividad2.v2calculadora.process;

public class Multiplicacion extends Suma {

    /**
     * En esta clase se va a realizar la multiplicación de dos números enteros utilizando la clase de suma
     * @return para el valor final de la multiplicación a por b usando solo sumas
     */

    private int producto;

    @Override
    public int apply(int a, int b) {
        producto = 0;
        for(int i = 0; i < b; i++) {
            producto = super.apply(producto,a);
        }
        return producto;
    }
}
