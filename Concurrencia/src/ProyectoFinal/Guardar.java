package ProyectoFinal;
/**
 * @author edgar
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Guardar {
    public synchronized static ArrayList<Musica> leer()throws Exception{
   File file=new File("Musica.xxx");    
 
    FileInputStream fis=new FileInputStream(file);
    ObjectInputStream  ois=new ObjectInputStream(fis);
  ArrayList<Musica> u=(ArrayList<Musica>)  ois.readObject();
  ois.close();
  return u;
  }
    
    public static void guardar(Musica u)throws Exception{
        ArrayList music=new ArrayList<Musica>();
        
       File file=new File("Musica.xxx");    
         if(file.exists()){
           music=  leer();
         }
    FileOutputStream fos=new FileOutputStream(file);
    ObjectOutputStream  oos=new ObjectOutputStream(fos);
    music.add(u);
     oos.writeObject(music); 
    oos.close();
  System.out.println("musica guardada");
    }
    
}
