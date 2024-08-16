
package cafeteria;

import java.util.ArrayList;

public class Pedido {
      private ArrayList<Producto> productos;

    public Pedido() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }


    public double calcularTotal() {
        double total = 0.0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void imprimirPedido() {
        double total = 0;
        System.out.println("Pedido:");
        for (Producto producto : productos) {
            System.out.println(producto);
            total += producto.getPrecio();
        }
        System.out.println("Total: $" + total);
    }
}

