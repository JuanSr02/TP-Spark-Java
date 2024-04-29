package ejemplosTeoria;
import static spark.Spark.get;

public class CalculadoraMain {

    public static void main(String[] args) {
        /* Ruta , Controlador */
        get("/sumar", CalculadoraControlador.sumar);
        get("/restar", CalculadoraControlador.restar);
    }
}

