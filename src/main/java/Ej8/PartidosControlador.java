package Ej8;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import spark.*;



public class PartidosControlador {

    public static Route getPartidos = (Request req, Response res) -> {
        PartidosDAO pDAO = new PartidosDAO();
        List<Partido> partidos = pDAO.getPartidos();
        ObjectMapper mapperObj = new ObjectMapper();
        String jsonStr = mapperObj.writeValueAsString(partidos);
        return jsonStr;
    };

    public static Route getPartidosPorEquipo = (Request req, Response res) -> {

        String equipo = String.valueOf(req.queryParams("equipo"));
        PartidosDAO pDAO = new PartidosDAO();
        List<Partido> partidos = pDAO.getPartidosPorEquipo(equipo);
        ObjectMapper mapperObj = new ObjectMapper();
        String jsonStr = mapperObj.writeValueAsString(partidos);
        return jsonStr;
    };

    public static Route getPartidosDeLocal = (Request req, Response res) -> {

        String equipo = String.valueOf(req.queryParams("equipo"));
        PartidosDAO pDAO = new PartidosDAO();
        List<Partido> partidos = pDAO.getPartidosDeLocal(equipo);
        ObjectMapper mapperObj = new ObjectMapper();
        String jsonStr = mapperObj.writeValueAsString(partidos);
        return jsonStr;
    };

    public static Route getPartidosDeVisitanteSinJugar = (Request req, Response res) -> {

        String equipo = String.valueOf(req.queryParams("equipo"));
        PartidosDAO pDAO = new PartidosDAO();
        List<Partido> partidos = pDAO.getPartidosDeVisitanteSinJugar(equipo);
        ObjectMapper mapperObj = new ObjectMapper();
        String jsonStr = mapperObj.writeValueAsString(partidos);
        return jsonStr;
    };

    public static Route getPartidosGanados = (Request req, Response res) -> {

        String equipo = String.valueOf(req.queryParams("equipo"));
        PartidosDAO pDAO = new PartidosDAO();
        int partidos = pDAO.getPartidosGanados(equipo);
        String partidosGanados = "Partidos ganados por " + equipo + " " + partidos;
        ObjectMapper mapperObj = new ObjectMapper();
        String jsonStr = mapperObj.writeValueAsString(partidosGanados);
        return jsonStr;
    };

    public static Route getGolesConvertidos = (Request req, Response res) -> {

        String equipo = String.valueOf(req.queryParams("equipo"));
        PartidosDAO pDAO = new PartidosDAO();
        int goles = pDAO.getGolesConvertidos(equipo);
        String golesConvertidos = "Goles convertidos por " + equipo + " " + goles;
        ObjectMapper mapperObj = new ObjectMapper();
        String jsonStr = mapperObj.writeValueAsString(golesConvertidos);
        return jsonStr;
    };

}
