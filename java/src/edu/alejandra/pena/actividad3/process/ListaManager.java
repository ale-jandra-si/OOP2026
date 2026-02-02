package edu.alejandra.pena.actividad3.process;

/**
 * En esta clase vamos a resolver todas las operaciones que se basen en listas (especificamente listas de números enteros)
 */

public class ListaManager {
    /**
     * Vamos a recorrer todos los ceros que esten en la lista hacía la derecha, manteniendo el orden del resto de los números
     *
     * @return nueva lista con los ceros a la derecha
     */

    public int[] moverCeros(int [] nums) {
        int posicion = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums [i];
                nums[i] = nums[posicion];
                nums[posicion] = temp;
                posicion++;
            }
        }
        return nums;
    }

    /**
     * Vamos a recibir una lista de números enteros y vamos a contar la cantidad de pares que haya
     * @return cantidad de pares que se encontraron
     */

    public int contarPares(int [] nums) {
        int contador = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }
}
