package Thread_Reloj;

import java.util.*;

public class Reloj{

    public static void main(String[] args) {
        
        //el new runnable es una clase interna anonima 
        //  y cada thread llevara su propio public void run
        Thread t1=new Thread(new Runnable(){
            public void run(){
                try{
                    Thread.sleep(1000);
                    
                    //Crearemos un objeto de una clase que se llama calendar
                    Calendar cal = Calendar.getInstance();
                    int hora = cal.get(Calendar.HOUR);
                    int min = cal.get(Calendar.MINUTE);
                    int seg = cal.get(Calendar.SECOND);
                    String time = hora+" : "+min+" : "+seg;
                    System.out.println(time);
                       
                }catch (InterruptedException ex){
                    
                }
             }  //llaves public void run()
        }); //llave y parametro del Thread
                 t1.start();}
    
}
