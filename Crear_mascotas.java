package ingvictorgarcia.tarea_mascotas;

/**
 * Created by victor on 25/08/2016.
 */
public class Crear_mascotas {


    private int Foto;
    private String Nombre;
    private int like;
    private int Logo;

    public Crear_mascotas(int foto, String nombre, int like, int logo) {
        Foto = foto;
        Nombre = nombre;
        this.like = like;
        Logo = logo;
    }

    public int getFoto() {
        return Foto;
    }

    public void setFoto(int foto) {
        Foto = foto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getLogo() {
        return Logo;
    }

    public void setLogo(int logo) {
        Logo = logo;
    }
}
