
package Ej7;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import spark.*;
public class AutorControlador {
    
    public static Route getLibros = (Request req, Response res) -> {

        String autor = String.valueOf(req.queryParams("autor"));
        AutorDAO aDAO = new AutorDAO();
        List<String> l = aDAO.getLibros(autor);
        ObjectMapper mapperObj = new ObjectMapper();
        String jsonStr = mapperObj.writeValueAsString(l);
        return jsonStr;
    };

}
