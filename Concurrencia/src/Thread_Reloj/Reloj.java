package Thread_Reloj;

public class Reloj{

    public static void main(String[] args) {
        
        //el new runnable es una clase interna anonima 
        //  y cada thread llevara su propio public void run
        Thread t1=new Thread(new Runnable(){
            public void run(){
                System.out.println("Yo soy el primer Thread");
             }  //llaves public void run()
        });//llave y parametro del Thread
        
        Thread t2=new Thread(new Runnable(){
            public void run(){
                System.out.println("Estoy seguro de que es el Thread t2");
            }
        });
        
        t1.start();
        t2.start();
    }
    
}
