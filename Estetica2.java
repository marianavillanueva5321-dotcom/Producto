import java.util.Scanner;

public class Estetica2 {

    static Scanner scanner = new Scanner(System.in);
// Parte de clientes
    static String clientes() {

        String nombreCliente;
        String fechaCita;

        System.out.println("===== REGISTRO DE CLIENTE =====");
        System.out.print("Ingrese su nombre: ");
        nombreCliente = scanner.nextLine();

        System.out.print("Ingrese la fecha (dia/mes/año): ");
        fechaCita = scanner.nextLine();

        System.out.println("Datos del cliente registrados\n");

        return nombreCliente;
    }
// Servicios

// Calculos
     static double Calculos(double subtotal) {

        String cupon;
        double descuento;
        double iva;
        double totalPagar;
        int opcionPago;

        if (subtotal == 0) {
            System.out.println("Primero debes elegir al menos un servicio");
            return 0;
        }

        System.out.println("¿Tiene cupón? (si/no)");
        cupon = scanner.nextLine();

        if (cupon.equalsIgnoreCase("si")) {
            descuento = 90;
        } else {
            descuento = 0;
        }

        iva = (subtotal - descuento) * 0.16;
        totalPagar = subtotal - descuento + iva;

        System.out.println("Descuento: $" + descuento);
        System.out.println("IVA (16%): $" + iva);
        System.out.println("Total a pagar: $" + totalPagar);

        do {
            System.out.println("===== FORMA DE PAGO =====");
            System.out.println("1.- Tarjeta");
            System.out.println("2.- Efectivo");

            opcionPago = scanner.nextInt();

            if (opcionPago == 1) {
                System.out.println("Pago con tarjeta seleccionado");
            } else if (opcionPago == 2) {
                System.out.println("Pago en efectivo seleccionado");
            } else {
                System.out.println("Opción no válida, elige 1 o 2");
            }

        } while (opcionPago != 1 && opcionPago != 2);

        System.out.println("Pago registrado. Total: $" + totalPagar);

        return totalPagar;
    }
// reporte

static void Reporte(String nombreCliente, String fechaCita,
            int cantidadCortes, int cantidadShampoos,
            int cantidadTintes, int cantidadPeinados,
            double subtotal, double descuento, double iva,
            double totalPagar, int opcionPago) {

        if (subtotal == 0) {
            System.out.println("Primero debes elegir al menos un servicio");
        } else {

            System.out.println("===== ESTETICA DOÑA GERTRUDIS CHAN =====");
            System.out.println("Ticket de servicio");
            System.out.println("Cliente: " + nombreCliente);
            System.out.println("Fecha: " + fechaCita);
            System.out.println("Cortes de cabello: " + cantidadCortes);
            System.out.println("Shampoos especiales: " + cantidadShampoos);
            System.out.println("Tintes de cabello: " + cantidadTintes);
            System.out.println("Peinados: " + cantidadPeinados);
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Descuento: $" + descuento);
            System.out.println("IVA (16%): $" + iva);
            System.out.println("Total a pagar: $" + totalPagar);

            if (opcionPago == 1) {
                System.out.println("Forma de pago: Tarjeta");
            } else if (opcionPago == 2) {
                System.out.println("Forma de pago: Efectivo");
            }
        }
    }

// salir

  static void Salir() {
        System.out.println("¡Gracias por visitar Estética Doña Gertrudis Chan!");
    }
    
//main
public static void main(String[] args) {

        int opcion = 0;
        int opcionServicio;
        int cantidad;

        String nombreCliente = "";
        String fechaCita = "";

        int cantidadCortes = 0;
        int cantidadShampoos = 0;
        int cantidadTintes = 0;
        int cantidadPeinados = 0;

        double subtotal = 0;
        double descuento = 0;
        double iva = 0;
        double totalPagar = 0;
        int opcionPago = 0;

        do {
            System.out.println("===== ESTETICA DOÑA GERTRUDIS CHAN =====");
            System.out.println("1.- Registrar cliente");
            System.out.println("2.- Menú de servicios");
            System.out.println("3.- Pagar");
            System.out.println("4.- Reporte");
            System.out.println("5.- Salir");
            System.out.print("Elige una opción: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Por favor, ingresa un número válido: ");
                scanner.next();
            }

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    nombreCliente = clientes();
                    break;

                case 2:
                    do {
                        System.out.println("===== SERVICIOS =====");
                        System.out.println("1.- Corte de cabello  $200");
                        System.out.println("2.- Shampoo especial  $92");
                        System.out.println("3.- Tinte de cabello  $350");
                        System.out.println("4.- Peinado           $150");
                        System.out.println("5.- Volver al menú principal");

                        opcionServicio = scanner.nextInt();

                        if (opcionServicio >= 1 && opcionServicio <= 4) {

                            System.out.print("¿Cuántos? ");
                            cantidad = scanner.nextInt();

                            while (cantidad <= 0) {
                                System.out.print("Debe ser mayor que 0. Intenta de nuevo: ");
                                cantidad = scanner.nextInt();
                            }

                            subtotal = servicios(opcionServicio, cantidad, subtotal);

                            switch (opcionServicio) {
                                case 1:
                                    cantidadCortes += cantidad;
                                    break;
                                case 2:
                                    cantidadShampoos += cantidad;
                                    break;
                                case 3:
                                    cantidadTintes += cantidad;
                                    break;
                                case 4:
                                    cantidadPeinados += cantidad;
                                    break;
                            }

                            System.out.println("Subtotal actual: $" + subtotal);

                        } else if (opcionServicio == 5) {
                            System.out.println("Regresando al menú principal...");
                        } else {
                            System.out.println("Opción no válida, elige entre 1 y 5");
                        }

                    } while (opcionServicio != 5);
                    break;

                case 3:
                    totalPagar = Calculos(subtotal);
                    break;

                case 4:
                    Reporte(nombreCliente, fechaCita,
                            cantidadCortes, cantidadShampoos,
                            cantidadTintes, cantidadPeinados,
                            subtotal, descuento, iva, totalPagar, opcionPago);
                    break;

                case 5:
                    Salir();
                    break;

                default:
                    System.out.println("Opción no válida, elige entre 1 y 5\n");
            }

        } while (opcion != 5);
    }
}
