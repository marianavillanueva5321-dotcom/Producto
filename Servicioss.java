package Producto;
import java.util.Scanner;

public class Servicioss {

   
    static Scanner sc = new Scanner(System.in);

   
    static int cantidadCortes = 0;
    static int cantidadShampoos = 0;
    static int cantidadTintes = 0;
    static int cantidadPeinados = 0;
    static int subtotal = 0;

   
    static int pedirCantidad() {
        System.out.println("¿Cuántos?");
        int cantidad = sc.nextInt();
        while (cantidad <= 0) {
            System.out.println("Debe ser mayor que 0. Intenta de nuevo:");
            cantidad = sc.nextInt();
        }
        return cantidad;
    }

    
    static void servicios() {
        int opcionServicio;
        int cantidad;

        do {
            System.out.println("===== SERVICIOS =====");
            System.out.println("1.- Corte de cabello  $200");
            System.out.println("2.- Shampoo especial  $92");
            System.out.println("3.- Tinte de cabello  $350");
            System.out.println("4.- Peinado           $150");
            System.out.println("5.- Volver al menú principal");
            opcionServicio = sc.nextInt();

            switch (opcionServicio) {
                case 1:
                    cantidad = pedirCantidad();
                    cantidadCortes = cantidadCortes + cantidad;
                    subtotal = subtotal + (200 * cantidad);
                    System.out.println("Elegiste " + cantidad + " Corte(s) de cabello");
                    System.out.println("Subtotal actual: $" + subtotal);
                    break;

                case 2:
                    cantidad = pedirCantidad();
                    cantidadShampoos = cantidadShampoos + cantidad;
                    subtotal = subtotal + (92 * cantidad);
                    System.out.println("Elegiste " + cantidad + " Shampoo(s) especial(es)");
                    System.out.println("Subtotal actual: $" + subtotal);
                    break;

                case 3:
                    cantidad = pedirCantidad();
                    cantidadTintes = cantidadTintes + cantidad;
                    subtotal = subtotal + (350 * cantidad);
                    System.out.println("Elegiste " + cantidad + " Tinte(s) de cabello");
                    System.out.println("Subtotal actual: $" + subtotal);
                    break;

                case 4:
                    cantidad = pedirCantidad();
                    cantidadPeinados = cantidadPeinados + cantidad;
                    subtotal = subtotal + (150 * cantidad);
                    System.out.println("Elegiste " + cantidad + " Peinado(s)");
                    System.out.println("Subtotal actual: $" + subtotal);
                    break;

                case 5:
                    System.out.println("Regresando al menú principal...");
                    break;

                default:
                    System.out.println("Opción no válida, elige entre 1 y 5");
                    break;
            }
        } while (opcionServicio != 5);
    }
}