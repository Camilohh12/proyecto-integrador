/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;

import java.util.Scanner;

public class BebidaCaliente extends Producto {
    private int temperatura;
    private String ingredientes;

    public BebidaCaliente(String nombre, double precio, String tamaño) {
        super(nombre, precio, tamaño);
    }

    @Override
    public String obtenerCategoria() {
        return "Bebida Caliente";
    }

    public void elegirP(Pedido pedido) {
        Scanner scanner = new Scanner(System.in);
        int tmñ;

        System.out.println("Seleccione una Bebida Caliente:");
        System.out.println("1. Cafe");
        System.out.println("2. Te");
        System.out.println("3. Chocolate Caliente");
        System.out.println("4. Capuchino");
        System.out.println("5. Latte");
        System.out.println("6. Espresso\n");

        int bebidaCalienteSeleccion = scanner.nextInt();
        scanner.nextLine();

        System.out.println("¿Qué tamaño quiere su bebida?");
        System.out.println("1. Chica -> $50");
        System.out.println("2. Mediana -> $60");
        System.out.println("3. Grande -> $80");
        tmñ = scanner.nextInt();

        switch (bebidaCalienteSeleccion) {
            case 1:
                agregarProductoAPedido(pedido, "Cafe", tmñ);
                break;
            case 2:
                agregarProductoAPedido(pedido, "Te", tmñ);
                break;
            case 3:
                agregarProductoAPedido(pedido, "Chocolate Caliente", tmñ);
                break;
            case 4:
                agregarProductoAPedido(pedido, "Capuchino", tmñ);
                break;
            case 5:
                agregarProductoAPedido(pedido, "Latte", tmñ);
                break;
            case 6:
                agregarProductoAPedido(pedido, "Espresso", tmñ);
                break;
            default:
                System.out.println("Opción no disponible");
        }
    }

    private void agregarProductoAPedido(Pedido pedido, String nombre, int tmñ) {
        switch (tmñ) {
            case 1:
                pedido.agregarProducto(new BebidaCaliente(nombre, 50, "chica"));
                break;
            case 2:
                pedido.agregarProducto(new BebidaCaliente(nombre, 60, "mediana"));
                break;
            case 3:
                pedido.agregarProducto(new BebidaCaliente(nombre, 80, "grande"));
                break;
            default:
                System.out.println("Tamaño no disponible");
        }
    }
}
