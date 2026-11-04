package Producto;
import java.util.Scanner;

public class Estetica {
    static Scanner sc = new Scanner(System.in);

    static double Calculos(double subtotal, String cupon, double iva, double totalPagar, double descuento, int opcionPago, String formaPago) {
        if (subtotal == 0) {
            System.out.println("Primero debes elegir al menos un servicio");
            return 0; 
        } else {
            System.out.println("¿Tiene cupón? (si/no)");
            cupon = sc.nextLine();
            if (cupon.equalsIgnoreCase("si")) {
                descuento = 90;
            } else {
                descuento = 0;
            }
        }

        iva = (subtotal - descuento) * 0.16;
        totalPagar = subtotal - descuento + iva;

        do {
            System.out.println("===== FORMA DE PAGO =====");
            System.out.println("1.- Tarjeta");
            System.out.println("2.- Efectivo");
            
            opcionPago = sc.nextInt();
            
            switch (opcionPago) {
                case 1:
                    formaPago = "Tarjeta";
                    System.out.println("Pago con tarjeta seleccionado.");
                    break;
                case 2:
                    formaPago = "Efectivo";
                    System.out.println("Pago en efectivo seleccionado.");
                    break;
                default:
                    System.out.println("Opción no válida, elige 1 o 2.");
                    break;
            }
        } while (opcionPago != 1 && opcionPago != 2);

        System.out.println("Pago registrado. Total a pagar: $" + totalPagar);
        
        return totalPagar; 
    }
}
