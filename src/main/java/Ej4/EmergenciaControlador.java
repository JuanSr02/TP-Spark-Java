
package Ej4;

import com.fasterxml.jackson.databind.ObjectMapper;
import spark.*;


public class EmergenciaControlador {
    
    public static Route getTelefono = (Request req, Response res) -> {
        EmergenciaDAO eDAO = new EmergenciaDAO();
        Emergencia e = eDAO.getServicio(req.queryParams("servicio"));
        ObjectMapper mapperObj = new ObjectMapper();
        String jsonStr = mapperObj.writeValueAsString(e);
        return jsonStr;
    };
    
    
}
