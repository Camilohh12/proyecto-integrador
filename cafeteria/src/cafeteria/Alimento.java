/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;

import java.util.Scanner;

public class Alimento extends Producto {
    public Alimento(String nombre, double precio, String tamaño) {
        super(nombre, precio, tamaño);
    }

    @Override
    public String obtenerCategoria() {
        return "Alimento";
    }

    public void elegirP(Pedido pedido) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione un Alimento:");
        System.out.println("1. Sandwich - $3.0");
        System.out.println("2. Ensalada - $2.5");

        int alimentoSeleccion = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea

        if (alimentoSeleccion == 1) {
            pedido.agregarProducto(new Alimento("Sandwich", 3.0, ""));
        } else if (alimentoSeleccion == 2) {
            pedido.agregarProducto(new Alimento("Ensalada", 2.5, ""));
        } else {
            System.out.println("Opción no disponible");
        }
    }
}
