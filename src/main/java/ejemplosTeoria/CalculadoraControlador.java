
package ejemplosTeoria;

import spark.Request;
import spark.Response;
import spark.Route;


class CalculadoraControlador {

    public static Route sumar = (Request request, Response response) -> {
        Calculadora c = new Calculadora();
        int a = Integer.parseInt(request.queryParams("a"));
        int b = Integer.parseInt(request.queryParams("b"));
        int resSuma = c.sumar(a, b);
        return "Resultado " + resSuma;
    };
    public static Route restar = (Request request, Response response) -> {
        Calculadora c = new Calculadora();
        int a = Integer.parseInt(request.queryParams("a"));
        int b = Integer.parseInt(request.queryParams("b"));
        int resResta = c.restar(a, b);
        return "Resultado " + resResta;
    };
}
