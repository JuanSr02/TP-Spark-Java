package Ej5;

import com.fasterxml.jackson.databind.ObjectMapper;
import spark.*;

public class MontoControlador {

    public static Route getMontoFuturo = (Request req, Response res) -> {

        double monto = Double.parseDouble(req.queryParams("monto"));
        int plazo = Integer.parseInt(req.queryParams("plazo")); // Plazo en meses
        double montoFuturo = Monto.calcularMontoFuturo(monto, plazo);
        ObjectMapper mapperObj = new ObjectMapper();
        String jsonStr = mapperObj.writeValueAsString(montoFuturo);
        return jsonStr;
    };

}
