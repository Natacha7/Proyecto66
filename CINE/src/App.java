import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido al Cine");

        //Cliente uno

        Scanner sca = new Scanner(System.in);
        System.out.println("Ingrese su cédula");
        String cedula = sca.nextLine();
        System.out.println("Ingrese su nombre");
        String nombre = sca.nextLine();
        

        Cliente clienteUno = new Cliente();
        clienteUno.setCedula(cedula);
        clienteUno.setNombre(nombre);
        clienteUno.setId(1);
        clienteUno.generarSaludo();
        clienteUno.generarSaludo("Buenos días");
        clienteUno.mostrarDatos();
        float costo = clienteUno.calcularCosto(8000);

        System.out.println("Cédula: " + clienteUno.getCedula() + "\nNombre: " 
                           + clienteUno.getNombre() + "\nID: " + clienteUno.getId()
                           + "\nCosto Tiquete: " + costo );

        //Cliente dos

        ClientePremium clienteDos = new ClientePremium();
        clienteDos.setCedula("11657777");
        clienteDos.setNombre("José");
        clienteDos.setNumeroTarjeta(100);
        clienteDos.mostrarDatos();
        float costoDos = clienteDos.calcularCosto(8000);

        System.out.println();

        System.out.println("Cédula: " + clienteDos.getCedula() + "\nNombre: " 
                           + clienteDos.getNombre() + "\nNúmero Tarjeta: " + clienteDos.getNumeroTarjeta()
                           + "\nCosto Tiquete: " + costoDos);

        //prueba de contenedores
        System.out.println();
        Prueba pruebaContenedor = new Prueba();
        pruebaContenedor.generarLista();

        //Lista de objetos
        System.out.println();
        System.out.println("CREACION DE CLIENTES");
        String opcion = "S";
        while (opcion.equalsIgnoreCase("S")){//Ignora mayúsculas
            //Ingrese datos por teclado
            System.out.println("Ingrese su cédula:");
            cedula = sca.next(); // Uso de next
            sca.nextLine();
            System.out.println("Ingrese su nombre:");
            nombre = sca.nextLine();
            System.out.println("Ingrese su ID:");
            int id = sca.nextInt();

            //Crea objeto cliente
            /*Cliente nuevoCliente = new Cliente();
            nuevoCliente.setCedula(cedula);
            nuevoCliente.setNombre(nombre);
            nuevoCliente.setId(id);*/
            Cliente nuevoCliente = new Cliente(cedula, nombre, id);

            //Agregar cliente a la lista
            pruebaContenedor.agregarCliente(nuevoCliente);

            //Preguntar nuevo cliente
            System.out.println("Desea agregar otro cliente? (s/n):");
            opcion = sca.next();
            sca.nextLine();

        }

        pruebaContenedor.mostrarNombreClientes();
        pruebaContenedor.mostrarDatosClientes();
    }
}
