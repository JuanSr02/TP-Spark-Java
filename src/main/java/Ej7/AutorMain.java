package Ej7;

import static spark.Spark.*;

public class AutorMain {

    public static void main(String[] args) {
        get("/libros", AutorControlador.getLibros);
    }
}
