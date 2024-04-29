
package Ej7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class AutorDAO {
    private static Map<String, List<String>> librosPorAutor = new HashMap<>();
    
    public static void cargarLibrosPorAutor() {
        // Cargar algunos ejemplos de libros por autor
        List<String> libros1 = new ArrayList<>();
        libros1.add("Cien años de soledad");
        libros1.add("Cronica de una muerte anunciada");
        libros1.add("Del amor y otros demonios");
        librosPorAutor.put("Garcia Marquez", libros1);
        
        List<String> libros2 = new ArrayList<>();
        libros2.add("Tener y no tener");
        libros2.add("El Jardin del Eden");
        librosPorAutor.put("Hemingway", libros2);
        // Puedes cargar más libros por autor aquí
    }
    
    public List<String> getLibros(String autor) {
        cargarLibrosPorAutor();
        return librosPorAutor.get(autor);
    }

}
