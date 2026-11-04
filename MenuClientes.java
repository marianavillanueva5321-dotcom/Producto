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