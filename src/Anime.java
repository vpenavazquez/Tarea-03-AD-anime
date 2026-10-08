import java.util.Date;

public class Anime{

    private String nome;
    private String descripcion;
    private Date data;
    private int puntuacion;

    public Anime(String nome, String descripcion, Date data, int puntuacion) {
        this.nome = nome;
        this.descripcion = descripcion;
        this.data = data;
        this.puntuacion = puntuacion;
    }

    public Date getData() {
        return data;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNome() {
        return nome;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "anime{" +
                "nome='" + nome + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", data=" + data +
                ", puntuacion=" + puntuacion +
                '}';
    }



}