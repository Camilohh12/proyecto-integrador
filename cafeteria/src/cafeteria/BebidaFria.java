/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;

import java.util.Scanner;

public class BebidaFria extends Producto {
    private String ingredientes;

    public BebidaFria(String nombre, double precio, String tamaño) {
        super(nombre, precio, tamaño);
    }

    @Override
    public String obtenerCategoria() {
        return "Bebida Fría";
    }

    public void elegirP(Pedido pedido) {
        Scanner scanner = new Scanner(System.in);
        int tmñ;

        System.out.println("Seleccione una Bebida Fría:");
        System.out.println("1. Clasico");
        System.out.println("2. Frosticchiato Moka");
        System.out.println("3. Frosticchiato Caramel");
        System.out.println("4. Frosticchiato Vainilla");
        System.out.println("5. Cold Brew");
        System.out.println("6. Affoga\n");

        int bebidaFriaSeleccion = scanner.nextInt();
        scanner.nextLine();

        System.out.println("¿Qué tamaño quiere su bebida?");
        System.out.println("1. Chica -> $50");
        System.out.println("2. Mediana -> $60");
        System.out.println("3. Grande -> $80");
        tmñ = scanner.nextInt();

        switch (bebidaFriaSeleccion) {
            case 1:
                agregarProductoAPedido(pedido, "Clasico", tmñ);
                break;
            case 2:
                agregarProductoAPedido(pedido, "Frosticchiato Moka", tmñ);
                break;
            case 3:
                agregarProductoAPedido(pedido, "Frosticchiato Caramel", tmñ);
                break;
            case 4:
                agregarProductoAPedido(pedido, "Frosticchiato Vainilla", tmñ);
                break;
            case 5:
                agregarProductoAPedido(pedido, "Cold Brew", tmñ);
                break;
            case 6:
                agregarProductoAPedido(pedido, "Affoga", tmñ);
                break;
            default:
                System.out.println("Opción no disponible");
        }
    }

    private void agregarProductoAPedido(Pedido pedido, String nombre, int tmñ) {
        switch (tmñ) {
            case 1:
                pedido.agregarProducto(new BebidaFria(nombre, 50, "chica"));
                break;
            case 2:
                pedido.agregarProducto(new BebidaFria(nombre, 60, "mediana"));
                break;
            case 3:
                pedido.agregarProducto(new BebidaFria(nombre, 80, "grande"));
                break;
            default:
                System.out.println("Tamaño no disponible");
        }
    }
}
