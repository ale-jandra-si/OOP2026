package edu.alejandra.pena.actividad2.calculadora.process;

//Esta clase realiza las multiplicaciones

public class Multiplicacion {
    /**
     * Esta clase calcula el producto de dos números sumando 'a' la cantidad de veces que indique 'b'.
     * @param a Número que se multiplica
     * @param b Cantidad de veces que el número es multiplicado
     * @return El producto total.
     */
    public static int realizarOperacion(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < b; i = Suma.realizarOperacion(i, 1)) {
            resultado = Suma.realizarOperacion(resultado, a);
        }
        return resultado;
    }
}
