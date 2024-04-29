package Ej6;

import java.util.HashMap;
import java.util.Map;

public class ArticuloDAO {
private static Map<Integer, Articulo> articulos = new HashMap<>();

    public static void cargarArticulos() {
        // Cargar algunos ejemplos de artículos
        articulos.put(001, new Articulo(001, "Laptop", 1000.0));
        articulos.put(002, new Articulo(002, "Smartphone", 500.0));
        articulos.put(003, new Articulo(003, "Tablet", 300.0));
        // Puedes cargar más artículos aquí
    }

    public Articulo getArticulo(int codigo) {
        cargarArticulos();
        return articulos.get(codigo);
    }

}
