import java.util.Scanner;
public class Estetica {

static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
//Esta parte ya es el menu si ven que no les gusta pueden realizar sus cambios :)
        do {
            System.out.println("===== ESTETICA DONA GERTRUDIS CHAN =====");
            System.out.println("1.- Registrar cliente");
            System.out.println("2.- Menu de servicios");
            System.out.println("3.- Pagar");
            System.out.println("4.- Reporte");                                    
            System.out.println("5.- Salir");
            System.out.print("Elige una opcion: ");
            
            while (!scanner.hasNextInt()) {
                System.out.print("Por favor, ingresa un numero valido: ");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

//Aca ustedes agregan sus case de cada parte que les toco, nomas ya agregue mi parte de clientes
            switch (opcion) {
                case 1:clientes();
                    break;
                    
                 default:
                    System.out.println("Opcion no valida, elige entre 1 y 5\n");
            }
        } while (opcion != 5);
    }
//Aca ps ya es la parte de clientes
    public static void clientes() {
        System.out.println("===== REGISTRO DE CLIENTE =====");
        System.out.print("Ingrese su nombre: ");
        nombreCliente = scanner.nextLine();
        System.out.print("Ingrese la fecha (dia/mes/año): ");
        fechaCita = scanner.nextLine();
        System.out.println("Datos del cliente registrados\n");
    }
}
