
package ejemplosTeoria;
import static spark.Spark.*;


public class SaludoConParametro {
    public static void main(String[] args) {
        get("/hola", (req, res) -> {
            return "Hola Spark " + req.queryParams("nombre") + req.queryParams("apellido"); } );} 
}
