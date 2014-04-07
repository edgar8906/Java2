package Capitulo_7;

import java.io.Serializable;

public class Usuario implements Serializable{

String nombre;
int edad;
String email;

    public String toString() {
        return "Usuario{" + "nombre = " + nombre + ", edad = " + edad + ", email = " + email + '}';
    }
    public Usuario(String nombre, int edad, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }
    
}
