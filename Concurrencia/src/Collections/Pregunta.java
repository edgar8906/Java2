package Collections;
import java.util.*;
public class Pregunta {
    private int id;
    private String titulo;
    private ArrayList<Opcion>opciones;

    public Pregunta(int id, String titulo, ArrayList<Opcion> opciones) {
        this.id = id;
        this.titulo = titulo;
        this.opciones = opciones;
    }
    
    public ArrayList<Opcion> getOpciones( ){
        return opciones;
    }
    
    public void setOpciones(ArrayList<Opcion>opciones){
        this.opciones = opciones;
    }
    
}
