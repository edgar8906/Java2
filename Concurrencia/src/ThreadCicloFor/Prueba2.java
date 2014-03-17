package ThreadCicloFor;

/**
 *
 * @author edgar
 */
public class Prueba2 implements Runnable {
    
    public static void main(String[] args) {
        
            for(int i=0; i<20; i++){
                Runnable r = new Prueba2();
                Thread t = new Thread(r);
                t.start();
                t.setName("1");
            }
    }
    
        public void run() {
        try {
            
            if(Thread.currentThread().getName().equals("1")) Thread.sleep(4000);
                   
                System.out.println(" soy un thread en ejecucion "+Thread.currentThread().getName());
                
        } catch (InterruptedException ex) {
            
        }
        
    }
    
}
