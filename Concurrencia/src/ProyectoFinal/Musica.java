package ProyectoFinal;
/**
 * @author edgar
 */
import java.io.Serializable;

public class Musica implements Serializable {
  String nombre;
  String ruta;

    public Musica(String nombre, String ruta) {
        this.nombre = nombre;
        this.ruta = ruta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
       
}