package Ej6;

import static spark.Spark.*;

public class ArticuloMain{

    public static void main(String[] args) {
        get("/articulo", ArticuloControlador.getArticulo);
    }

}
