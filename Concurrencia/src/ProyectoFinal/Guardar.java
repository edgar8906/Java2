package ProyectoFinal;
/**
 * @author edgar
 */
import java.io.*;
import java.io.File;
import java.util.ArrayList;

public class Guardar {
    
    public synchronized static ArrayList<Operador> leer()throws Exception{
   File file=new File("morales.recargas");    
 
    FileInputStream fis=new FileInputStream(file);
    ObjectInputStream  ois=new ObjectInputStream(fis);
  ArrayList<Operador> o=(ArrayList<Operador>)  ois.readObject();
  ois.close();
  return o;
  }
    
    public static void guardar(Operador o)throws Exception{
        ArrayList operadores=new ArrayList<Operador>();
        
       File file=new File("morales.recargas");    
         if(file.exists()){
           operadores=  leer();
         }
    FileOutputStream fos=new FileOutputStream(file);
    ObjectOutputStream  oos=new ObjectOutputStream(fos);
    operadores.add(o);
     oos.writeObject(operadores); 
    oos.close();
  System.out.println("Se ah Guardo");
    }
    
}
