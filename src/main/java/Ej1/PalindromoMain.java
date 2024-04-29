package Ej1;
import static spark.Spark.*;
public class PalindromoMain {
    
    
    public static void main(String[] args) {
        get("/palindromo",PalindromoControlador.palindromo);
    }
    


    
    
}
