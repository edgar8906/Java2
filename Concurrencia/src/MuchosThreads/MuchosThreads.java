package MuchosThreads;
/**
 *
 * @author edgar
 */
import java.util.logging.Level;
import java.util.logging.Logger;

public class MuchosThreads implements Runnable {

    public static void main(String[] args) {
      
        Runnable r=new MuchosThreads();
        Thread ts[]=new  Thread[20];
        for(Thread t:ts){
            t=new Thread(r);
            t.start();
        }
          
    }
    
    public void run() {
        try {
            System.out.println("holasoy el thread:"+Thread.currentThread().getName());
            Thread.sleep(40);
        } catch (InterruptedException ex) {
            Logger.getLogger(MuchosThreads.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}