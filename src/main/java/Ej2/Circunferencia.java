
package Ej2;


public class Circunferencia {
    
     public static double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }
    
    public static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}
