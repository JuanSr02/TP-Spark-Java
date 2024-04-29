
package Ej6;


public class Articulo {
 private int codigo;
 private String descripcion;
 private double precioNeto;
 private double IVA;

    public Articulo(int codigo, String descripcion, double precioNeto) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioNeto = precioNeto;
        this.IVA = precioNeto * 0.21; // IVA del 21%
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioNeto() {
        return precioNeto;
    }

    public double getIVA() {
        return IVA;
    }

    public double getPrecioTotal(){
        return precioNeto + IVA;
    }
}
