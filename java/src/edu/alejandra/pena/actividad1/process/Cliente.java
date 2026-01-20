package edu.alejandra.pena.actividad1.process;

import edu.alejandra.pena.actividad1.data.Vehiculos;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private List<Vehiculos> inventario;

    public Cliente() {
        inventario = new ArrayList<>();
        // Autos en exhibición
        inventario.add(new Vehiculos("BMW X1", 345000, "Color blanco, Gasolina, Automático"));
        inventario.add(new Vehiculos("Kia K4 Sedán", 259000, "Color gris, Gasolina, Automático"));
        inventario.add(new Vehiculos("Nissan Frontier Pickup", 1249000, "Color negro, Gasolina, Automático"));
        inventario.add(new Vehiculos("Tesla Y SUV", 950000, "Color rojo, Eléctrico, Automático"));
    }

    public List<Vehiculos> getInventario() {
        return inventario;
    }
}
