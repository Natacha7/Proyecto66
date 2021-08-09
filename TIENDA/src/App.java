import conexion.SqliteConnection;
import vista.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("**La Tienda de Ropa**");

    

       // Producto productoUno = new Producto();

        // productoUno.setNombre("Falda");
        // productoUno.setPrecio(70000);
        // productoUno.mostrar();
        
        //Se crea conexion a base de datos
        SqliteConnection conexionBD = new SqliteConnection();
        Menu menuPrincipal = new Menu();
        menuPrincipal.generarMenu(conexionBD);

        ////Ejemplo consulta///
        /* ResultSet resultado = conexionBD.ejecutarConsulta("SELECT * FROM Productos");
        while(resultado.next()) {
            String codigoBarras = resultado.getString("CodigoBarras");
            String nombreProducto = resultado.getString("nombre");
            float precioProd = resultado.getFloat("precio");

            System.out.println(codigoBarras + " " + nombreProducto + " $" + precioProd);
        } */

        ///////////////-- Creación y consulta de clientes --/////////////////////

        /*JOptionPane*/
        //String prueba = JOptionPane.showInputDialog(null, "Cuál es su nombre?", "Nuevo Ciente", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Hola Mondo", "Saludo", JOptionPane.WARNING_MESSAGE);



    }
}
