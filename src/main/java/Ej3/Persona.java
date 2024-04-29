package Ej3;

import java.util.*;

public class Persona {

    String nombre;
    String apellido;
    List<Persona> hijos;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.hijos = new ArrayList<Persona>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public List<Persona> getHijos() {
        return hijos;
    }
    
    public void addHijo(Persona hijo) {
        hijos.add(hijo);
    }

}
