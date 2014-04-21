package ProyectoFinal;
/**
 * @author edgar
 */
import java.io.File;
import javax.swing.filechooser.*;

public class Filtro extends FileFilter {
   private static final String MP3 ="mp3";
   private static final char P = '.';
   
   public boolean accept(File f){
       if(f.isDirectory()){
           return true;
       }
       if(extension(f).equalsIgnoreCase(MP3)){
           return true;
       }else{
           return false;
       }
   }
   
   public String getDescription(){
       return "archivo mp3";
   }
   private String extension(File f){
       String nombre=f.getName();
       int loc=nombre.lastIndexOf(P);
       if(loc >0 && loc < nombre.length() -1){
           return nombre.substring(loc +1);
       }else{
           return "";
       }
   }
    
}
