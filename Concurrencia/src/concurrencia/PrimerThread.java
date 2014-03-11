package concurrencia;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PrimerThread implements Runnable {


    public static void main(String[] args) {

        //1. CREAR
        Runnable r = new PrimerThread();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);  //nuevo thread
        t1.setName(" primero ");
        t2.setName(" segundo ");

        //2. INICIALIZADO
        t1.start();
        t2.start(); //inicializa thread nuevo
        
    }
    
    //3.EJECUCION
    public void run() {
        try {
            
            if(Thread.currentThread().getName().equals(" primero ")) Thread.sleep(4000);
                //5. TERMINA EJECUCION    
                System.out.println(" soy un thread en ejecucion "+Thread.currentThread().getName());
                
        } catch (InterruptedException ex) {
            
        }
        
    }
    
    
    
}
