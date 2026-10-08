import java.sql.*;

public class conexion {
    public static Connection conexion() {
        Connection conn = null;
        try {
            String url = "jdbc:postgresql://10.0.9.226:5432/probas";
            String usuario = "postgres";
            String password = "admin";
            conn = DriverManager.getConnection(url, usuario, password);
        } catch (Exception e) {
            System.out.println("Erro na conexión: "+ e.getMessage());
        }
        return conn;
    }
}

