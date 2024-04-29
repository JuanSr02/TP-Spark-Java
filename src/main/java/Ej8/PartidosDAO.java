package Ej8;

import java.util.ArrayList;
import java.util.List;

public class PartidosDAO {

    private List<Partido> partidos;

    public void cargarPartidos() {
        partidos = new ArrayList<Partido>();
        // Cargar algunos ejemplos de partidos
        partidos.add(new Partido("River", "Boca", 2, 2, true));
        partidos.add(new Partido("River", "Racing", 0, 0, true));
        partidos.add(new Partido("Aldosivi", "Racing", 0, 0, false));
        partidos.add(new Partido("Talleres", "Racing", 0, 0, false));
        partidos.add(new Partido("Independiente", "Racing", 1, 0, true));
        partidos.add(new Partido("Racing", "Boca", 4, 2, true));
        partidos.add(new Partido("Godoy Cruz", "River", 1, 0, true));
        partidos.add(new Partido("San Lorenzo","Boca",0,1,true));
        // Puedes cargar más partidos aquí
    }

    public List<Partido> getPartidos() {
        cargarPartidos();
        return partidos;
    }

    public List<Partido> getPartidosPorEquipo(String equipo) {
        cargarPartidos();
        // Partidos jugados por un equipo dado con el resultado obtenido
        List<Partido> partidosEquipo = new ArrayList<>();
        for (Partido partido : partidos) {
            if (partido.getLocal().equals(equipo) || partido.getVisitante().equals(equipo)) {
                if (partido.isJugado()) {
                    partidosEquipo.add(partido);
                }
            }
        }
        return partidosEquipo;
    }

    public List<Partido> getPartidosDeLocal(String equipo) {
        cargarPartidos();
        // Equipos con los que jugó de local
        List<Partido> partidosLocal = new ArrayList<>();
        for (Partido partido : partidos) {
            if (partido.getLocal().equals(equipo) && partido.isJugado()) {
                partidosLocal.add(partido);
            }
        }
        return partidosLocal;
    }

    public List<Partido> getPartidosDeVisitanteSinJugar(String equipo) {
        cargarPartidos();
        // Equipos con los que debe jugar de visitante
        List<Partido> partidosVisitante = new ArrayList<>();
        for (Partido partido : partidos) {
            if (partido.getVisitante().equals(equipo) && !partido.isJugado()) {
                partidosVisitante.add(partido);
            }
        }
        return partidosVisitante;
    }

    public int getPartidosGanados(String equipo) {
        cargarPartidos();
        // Cantidad de partidos ganados por un equipo
        int partidosGanados = 0;
        for (Partido partido : partidos) {
            if (partido.getGolesLocal() > partido.getGolesVisitante() && partido.getLocal().equals(equipo)) {
                partidosGanados++;
            } else if (partido.getGolesVisitante() > partido.getGolesLocal() && partido.getVisitante().equals(equipo)) {
                partidosGanados++;
            }
        }
        return partidosGanados;
    }

    public int getGolesConvertidos(String equipo) {
        cargarPartidos();
        // Cantidad de goles convertidos por un equipo
        int golesConvertidos = 0;
        for (Partido partido : partidos) {
            if (partido.getLocal().equals(equipo)) {
                golesConvertidos += partido.getGolesLocal();
            } else if (partido.getVisitante().equals(equipo)) {
                golesConvertidos += partido.getGolesVisitante();
            }
        }
        return golesConvertidos;
    }

}