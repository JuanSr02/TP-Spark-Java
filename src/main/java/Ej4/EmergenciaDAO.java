
package Ej4;

import java.util.*;


public class EmergenciaDAO {
    
        private List<Emergencia> eList = new ArrayList<>();
    
       public void cargarTelefonosEmergencia() {
        eList.add(new Emergencia(911, "policia"));
        eList.add(new Emergencia(100, "bomberos"));
        eList.add(new Emergencia(144, "violencia de genero"));
        // Puedes agregar más servicios de emergencia aquí
    }
       
       public Emergencia getServicio(String servicio){
           cargarTelefonosEmergencia();
           for (Emergencia e : eList ){
               if(servicio.equals(e.getServicio())){
                   return e;
               }
           }
       return null;
       }
}
