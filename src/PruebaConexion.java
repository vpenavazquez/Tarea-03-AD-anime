import java.sql.Connection;
import java.sql.SQLException;

public class PruebaConexion {
    public static void main(String[] args) {
        System.out.println("Probando conexión a la base de datos...");

        Connection conn = conexion.conexion();

        if (conn != null) {
            try {

                if (!conn.isClosed()) {
                    System.out.println("¡Conexión establecida con éxito a PostgreSQL!");
                }


                conn.close();
                System.out.println("Conexión cerrada correctamente.");

            } catch (SQLException e) {
                System.err.println("Error al comprobar la conexión: " + e.getMessage());
            }
        } else {
            System.err.println("Falló la conexión. Revisa los mensajes de error anteriores.");
        }
    }
}