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


    }
}
