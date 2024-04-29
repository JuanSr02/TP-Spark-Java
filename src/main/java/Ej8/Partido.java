package Ej8;

public class Partido {

    private String local;
    private String visitante;
    private int golesLocal;
    private int golesVisitante;
    private boolean jugado;

    public Partido(String local, String visitante, int golesLocal, int golesVisitante, boolean jugado) {
        this.local = local;
        this.visitante = visitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.jugado = jugado;
    }

    public String getLocal() {
        return local;
    }

    public String getVisitante() {
        return visitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public boolean isJugado() {
        return jugado;
    }
}
