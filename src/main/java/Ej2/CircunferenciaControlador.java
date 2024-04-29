
package Ej2;

import spark.Request;
import spark.Response;
import spark.Route;


public class CircunferenciaControlador {
         public static Route PerimetroyArea = (Request request, Response response) -> {
            String doble = String.valueOf(request.queryParams("radio"));
            double radio = Double.parseDouble(doble);
            double perimetro = Circunferencia.calcularPerimetro(radio);
            double area = Circunferencia.calcularArea(radio);
            String resultado = "Perímetro: " + perimetro + ", Área: " + area;
            return resultado;
    };
}
