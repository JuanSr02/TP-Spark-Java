
package Ej4;


public class Emergencia {

    private long telefono;
    private String servicio;

    public Emergencia(long telefono, String servicio) {
        this.telefono = telefono;
        this.servicio = servicio;
    }

    public long getTelefono() {
        return telefono;
    }

    public String getServicio() {
        return servicio;
    }
    
    
}
