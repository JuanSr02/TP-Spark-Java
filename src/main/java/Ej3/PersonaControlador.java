package Ej3;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import spark.Request;
import spark.Response;
import spark.Route;


public class PersonaControlador {
    
      public static Route getPersonas = (Request req, Response res) -> {
        PersonaDAO pDAO = new PersonaDAO();
        List<Persona> personas = pDAO.getPersonas();
        ObjectMapper mapperObj = new ObjectMapper();
        String jsonStr = mapperObj.writeValueAsString(personas);
        return jsonStr;
    };

     public static Route getHijos = (Request req, Response res) -> {
        PersonaDAO pDAO = new PersonaDAO();
        List<Persona> hijos = pDAO.getHijos(req.queryParams("nbrepadre"));
        ObjectMapper mapperObj = new ObjectMapper();
        String jsonStr = mapperObj.writeValueAsString(hijos);
        return jsonStr;
    };
      
    public static Route getNietos = (Request req, Response res) -> {
        PersonaDAO pDAO = new PersonaDAO();
        List<Persona> nietos = pDAO.getNietos(req.queryParams("nbreabuelo"));
        ObjectMapper mapperObj = new ObjectMapper();
        String jsonStr = mapperObj.writeValueAsString(nietos);
        return jsonStr;
    };
}
