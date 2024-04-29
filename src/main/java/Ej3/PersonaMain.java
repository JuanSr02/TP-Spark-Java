package Ej3;

import static spark.Spark.*;

public class PersonaMain {

    public static void main(String[] args) {
        get("/getPersonas", PersonaControlador.getPersonas);
        get("/getHijos", PersonaControlador.getHijos); 
        get("/getNietos", PersonaControlador.getNietos);
    }
}
