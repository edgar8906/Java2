package PruebaConcurrencia;

/**
 *
 * @author edgar
 */
public class Prueba implements Runnable {

    public static void main(String[] args) {
        Runnable r = new Prueba();
            Thread t1 = new Thread (r);
            Thread t2 = new Thread (r);
                t1.start();
                t2.start();
                
                t1.setName("primero");
                t2.setName("segundo");                
    }
    
    public void run(){
        if(Thread.currentThread().getName().equals("primero"))
            System.out.println("Hola");
    }
    
    else{
          Calendar cal = Calendar.getInstance();
          Date hora = cal.getTime();
          DateFormat df = DateFormat.getTimeInstance();
          horaActual = df.format(hora);
          repaint();
          
}
    
}
