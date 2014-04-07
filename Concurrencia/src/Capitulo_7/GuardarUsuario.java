package Capitulo_7;

import java.io.File;
import java.io.*;

public class GuardarUsuario {
    
    public synchronized static Usuario leer()throws Exception{
   File file=new File("archivaldo.xxx");    
   
    FileInputStream fis = new FileInputStream(file);
    ObjectInputStream  ois = new ObjectInputStream(fis);
  Usuario u=(Usuario) ois.readObject();
  ois.close();
  return u;
  }
    
    public static void guardar(Usuario u)throws Exception{
       File file=new File("archivaldo.xxx");    
   
    FileOutputStream fis=new FileOutputStream(file);
    ObjectOutputStream  ois = new ObjectOutputStream(fis);
    ois.writeObject(u); 
    ois.close();
    System.out.println("Guardado");
    }
    
}
