/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosTeoria;

import static spark.Spark.*;

public class HolaSpark {
    
    public static void main(String[] args) {
        get("/hola", (req, res) -> "Hola Spark"); } 
}