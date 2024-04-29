package Ej5;
import static spark.Spark.*;

public class MontoMain {
    public static void main(String[] args) {
        get("/MontoFuturo", MontoControlador.getMontoFuturo);
    }
}
