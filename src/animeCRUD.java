import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class animeCRUD {

    Connection conn = conexion.conexion();

    public void insertarAnime(Anime anime){

        String sql = "INSERT INTO anime (nome, descripcion, data, puntuacion) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement pstmt =  conn.prepareStatement(sql);
            pstmt.setString(1, anime.getNome());
            pstmt.setString(2, anime.getDescripcion());
            pstmt.setDate(3, new java.sql.Date(anime.getData().getTime()));
            pstmt.setInt(4, anime.getPuntuacion());

            int filasInsertadas = pstmt.executeUpdate();

            System.out.println("Filas insertadas: " + filasInsertadas);
        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }


    }



}
