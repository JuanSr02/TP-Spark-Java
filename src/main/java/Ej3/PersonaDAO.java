package Ej3;

import java.util.ArrayList;
import java.util.List;

public class PersonaDAO {

    private List<Persona> personas;

    public void init() {
        personas = new ArrayList<Persona>();
        Persona pJuan = new Persona("JUAN", "SANCHEZ");
        personas.add(pJuan);
        Persona pIvan = new Persona("IVAN", "BROCAS");
        personas.add(pIvan);
        pJuan.addHijo(pIvan);
        Persona pCelso = new Persona("CELSO", "FERNANDEZ");
        personas.add(pCelso);
        pJuan.addHijo(pCelso);
        Persona pLautaro = new Persona("LAUTARO", "SORIA");
        personas.add(pLautaro);
        pIvan.addHijo(pLautaro);
        Persona pNicolas = new Persona("NICOLAS", "VILURON");
        personas.add(pNicolas);
        pIvan.addHijo(pNicolas);
        Persona pLuciana = new Persona("LUCIANA", "LOYOLA");
        personas.add(pLuciana);
        pCelso.addHijo(pLuciana);
    }

    public List<Persona> getPersonas() {
        init();
        return personas;
    }

    public List<Persona> getNietos(String nombre) {
        init();
        List<Persona> nietos;
        nietos = new ArrayList<Persona>();
        if (nombre == null) {
            return nietos;
        }
        Persona pEncontrada = personas.stream() // Convierte a stream
                .filter(p -> nombre.equals(p.getNombre())) // buscamos la persona
                .findAny() // Si 'findAny' entonces retorna la persona
                .orElse(null);                                  // sino null.
        if (pEncontrada != null) {
            pEncontrada.getHijos().forEach(persona -> {
                nietos.addAll(persona.getHijos());
            });
        }
        return nietos;
    }

    public List<Persona> getHijos(String nombre) {
        init();
        List<Persona> hijos;
        hijos = new ArrayList<Persona>();
        if (nombre == null) {
            return hijos;
        }
        Persona pEncontrada = personas.stream() // Convierte a stream
                .filter(p -> nombre.equals(p.getNombre())) // buscamos la persona
                .findAny() // Si 'findAny' entonces retorna la persona
                .orElse(null);                                  // sino null.
        if (pEncontrada != null) {
            hijos = pEncontrada.getHijos();
        }
        return hijos;
    }
}
