package Ej6;

import com.fasterxml.jackson.databind.ObjectMapper;
import spark.*;

public class ArticuloControlador {

    public static Route getArticulo = (Request req, Response res) -> {

        int codigo = Integer.parseInt(req.queryParams("codigo"));
        ArticuloDAO aDAO = new ArticuloDAO();
        Articulo a = aDAO.getArticulo(codigo);
        ObjectMapper mapperObj = new ObjectMapper();
        String jsonStr = mapperObj.writeValueAsString(a);
        return jsonStr;
    };
}
