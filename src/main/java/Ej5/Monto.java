
package Ej5;


public class Monto {
    public static double calcularMontoFuturo(double monto, int plazo) {
        // Simulación de inflación propuesta por el gobierno Argentino (ejemplo)
        // Plazo es en meses
        double tasaInflacionAnual = 2.762; // 276,2%
        double tasaInflacionMensual = tasaInflacionAnual / 12;
        double montoFuturo = monto;
        for (int i = 0; i < plazo; i++) {
            montoFuturo /= (1 + tasaInflacionMensual); // Aplicar la tasa de inflación mensual
        }
        return montoFuturo;

}
}
