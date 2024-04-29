package Ej4;

import static spark.Spark.*;

public class EmergenciaPrincipal {

    public static void main(String[] args) {
        get("/Emergencia", EmergenciaControlador.getTelefono);
    }
}
