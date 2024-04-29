
package Ej8;

import static spark.Spark.*;
public class PartidosMain {
    
        public static void main(String[] args) {
        get("/todos-los-partidos", PartidosControlador.getPartidos);
        get("/partidos-por-equipo",PartidosControlador.getPartidosPorEquipo);
        get("/partidos-de-local",PartidosControlador.getPartidosDeLocal);
        get("/partidos-de-visitante",PartidosControlador.getPartidosDeVisitanteSinJugar);
        get("/partidos-ganados",PartidosControlador.getPartidosGanados);
        get("/goles-convertidos",PartidosControlador.getGolesConvertidos);
    }

}
