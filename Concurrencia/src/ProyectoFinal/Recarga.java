package ProyectoFinal;
/**
 *
 * @author edgar
 */
public class Recarga {

    public static void main(String[] args) throws Exception {
        Operador o = new Operador("telcel", 551234567, 30);
      Guardar.guardar(o);

        for (Operador ope : Guardar.leer()) {
            System.out.println(ope);
        }
    }

}
