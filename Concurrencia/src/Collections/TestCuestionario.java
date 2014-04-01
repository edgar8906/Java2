package Collections;
public class TestCuestionario {

    public static void main(String[] args) {
      for(Pregunta pregunta: GenerarCuestionario.obtenerCuestionario()){
        System.out.println(pregunta.getTitulo());
          for(Opcion opcion: pregunta.getOpciones()){
            System.out.println(opcion.getTitulo()+" valor "+ opcion.isValor());
          }
      }
    }
    
}
