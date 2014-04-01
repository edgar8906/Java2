package Collections;
import java.util.*;
public class GenerarCuestionario {
    
    public static ArrayList <Pregunta> obtenerCuestionario(){
        Opcion op11 = new Opcion(1,"el salvador:",false);
        Opcion op21 = new Opcion(2,"peru:",false);
        Opcion op31 = new Opcion(3,"mexico:",false);
        Opcion op41 = new Opcion(4,"finlandia:",true);
        
        ArrayList<Opcion> opciones1 = new ArrayList<Opcion>();
        opciones1.add(op11);
        opciones1.add(op21);
        opciones1.add(op31);
        opciones1.add(op41);
        
        Pregunta p1 = new Pregunta(1,"CUAL ES EL PAIS CON MEJOR SISTEMA EDUCATIVO?", opciones1);
        
        ArrayList<Pregunta> cuestionario = new ArrayList<Pregunta>();
        cuestionario.add(p1);
        return cuestionario;
    }
}
