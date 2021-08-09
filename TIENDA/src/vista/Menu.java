package vista;

import javax.swing.JOptionPane;

import conexion.SqliteConnection;
import modelo.*;

public class Menu {
    public void generarMenu(SqliteConnection conexionBD){
        String textoMenu = "Elija su opción: \n"+
                           "1. Crear cliente \n"+
                           "2. Listar 10 primeros clientes \n"+
                           "3. Listar productos comprados por el cliente \n";
        String opcionElegida = JOptionPane.showInputDialog(null, textoMenu, "Menu principal", JOptionPane.QUESTION_MESSAGE);
    
            /*Objeto ClienteDAO para insertar cliente*/
            ClienteDAO cli1 = new ClienteDAO();

        switch(opcionElegida) {
            case "1":
                String ident = JOptionPane.showInputDialog(null, "Ingrese la identificación del cliente", "LA TIENDA DE ROPA", JOptionPane.QUESTION_MESSAGE);
                String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente", "LA TIENDA DE ROPA", JOptionPane.QUESTION_MESSAGE);
                String apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido del cliente", "LA TIENDA DE ROPA", JOptionPane.QUESTION_MESSAGE);
    
            /*Objeto cliente*/
                Cliente nuevoCliente = new Cliente(ident, nombre, apellido);
                cli1.insertarCliente(nuevoCliente, conexionBD);
                break;

            case "2":
                    /*Consulta cliente*/
                String clientes = cli1.mostrarClientes(conexionBD);
                JOptionPane.showMessageDialog(null, clientes, "Listado de clientes", JOptionPane.INFORMATION_MESSAGE);
                break;

            case "3":
                String identCliente = JOptionPane.showInputDialog(null, "Ingrese la identificación del cliente a buscar:", "LA TIENDA DE ROPA", JOptionPane.QUESTION_MESSAGE);
                String productos = cli1.listarProductosPorCliente(identCliente, conexionBD);
                JOptionPane.showMessageDialog(null, productos, "Listado de productos comprados por cliente", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
   
}
