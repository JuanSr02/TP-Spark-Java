
package Ej1;

import spark.Request;
import spark.Response;
import spark.Route;
public class PalindromoControlador {
     public static Route palindromo = (Request request, Response response) -> {
        String palabra = String.valueOf(request.queryParams("palabra"));
        String resultado = Palindromo.esPalindromo(palabra) ? "Es palíndromo" : "No es palíndromo";
        return resultado;
    };

}
