
/*
tres tablas bebidas calientes, frias,alimentos
pedidos cafe quires toping
registros 
 */
package cafeteria;

/*
 */
import java.util.Scanner;

public class Cafeteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pedido pedido = new Pedido();
        Alimento al=new Alimento("Temporal", 0, "Temporal");
        BebidaFria bebidaFria = new BebidaFria("Temporal", 0, "Temporal");
        BebidaCaliente bed=new BebidaCaliente("Temporal", 0, "Temporal");
        int tmñ;
        
        boolean seguirPidiendo = true;

        while (seguirPidiendo) {
            System.out.println("Seleccione el tipo de producto que desea:");
            System.out.println("1. Bebida Fría");
            System.out.println("2. Bebida Caliente");
            System.out.println("3. Alimento");

            int tipoProducto = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (tipoProducto) {
                case 1:
                    bebidaFria.elegirP(pedido);
                    break;
                case 2:
                   bed.elegirP(pedido);
                   break;
                           
                case 3:
                    al.elegirP(pedido);
                    break;

                default:
                    System.out.println("Selección inválida.");
                    break;
            }

            System.out.println("¿Desea pedir otro producto? (s/n)");
            String respuesta = scanner.nextLine();
            seguirPidiendo = respuesta.equalsIgnoreCase("s");
        }

        pedido.imprimirPedido();
        scanner.close();
    }
}

