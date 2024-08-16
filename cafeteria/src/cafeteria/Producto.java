/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;

/**
 *
 * @author Milo
 */

public abstract class Producto {
    private String nombre;
    private double precio;
    private String tamaño;

    public Producto(String nombre, double precio, String tamaño) {
        this.nombre = nombre;
        this.precio = precio;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTamaño() {
        return tamaño;
    }

    public abstract String obtenerCategoria();

    @Override
    public String toString() {
        return nombre + " tamaño: " + tamaño + " - $" + precio;
    }
}


