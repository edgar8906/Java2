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
        
        
        Opcion op12 = new Opcion(5,"brasil: ",false);
        Opcion op22 = new Opcion(6,"londres: ",false);
        Opcion op32 = new Opcion(7,"dubai: ",false);
        Opcion op42 = new Opcion(8,"japon: ",true);
        
        ArrayList<Opcion> opciones2 = new ArrayList<Opcion>();
        opciones2.add(op12);
        opciones2.add(op22);
        opciones2.add(op32);
        opciones2.add(op42);
        
        Pregunta p2 = new Pregunta(2,"CUAL ES LA CAPITAL DE INGLATERRA?", opciones2);
        
        ArrayList<Pregunta> cuestionario2 = new ArrayList<Pregunta>();
        cuestionario2.add(p2);
        return cuestionario;
    }
}
