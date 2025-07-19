
package daos;

import java.util.ArrayList;
import modelo.Habitacion;
import modelo.Huesped;

/**
 *
 * @author Juan
 */
public class daoHuesped {
    private ArrayList<Huesped> Listahuespedes;
    private daoHabitacion dao;

    public daoHuesped( daoHabitacion dao) {
        this.Listahuespedes = new ArrayList<>();
        this.dao = dao;
    }

    public ArrayList<Huesped> getListahuespedes() {
        return Listahuespedes;
    }
      public boolean guardarHuesped(Huesped huesped) {
        Listahuespedes.add(huesped);
        return true;
    }
    //otro metodo importante para la ventana lo llama y guarda un huesped segun el numero de habitacion
    public boolean guardarHuespedConHabitacion(Huesped huesped, int numeroHabi) {
        Habitacion existente = dao.buscarHabitacion(numeroHabi);
        if (existente != null) {
            huesped.asignarHabitacion(existente);
            //osea llama este metodo para asociarlo con una habitacion y listo.
            dao.agregarHuespedAHabitacion(existente, huesped);
            Listahuespedes.add(huesped);
            return true;
        }
        return false;
    }
     public Huesped buscarHuesped(int documento) {
        for (int i = 0; i < Listahuespedes.size(); i++) {
            if (Listahuespedes.get(i).getDocumento() == documento) {
                return Listahuespedes.get(i);
            }
        }
        return null;
    }
     public boolean actualizarDatosHuesped(Huesped huesped) {
        Huesped buscar = buscarHuesped(huesped.getDocumento());
        if (buscar != null) {
            buscar.setNombre(huesped.getNombre());
            buscar.setCorreo(huesped.getCorreo());
            buscar.setTelefono(huesped.getTelefono());
        
            return true;
        }
        return false;
    }
      public boolean eliminarHuesped(int documento) {
        for (int i = 0; i < Listahuespedes.size(); i++) {
            if (Listahuespedes.get(i) != null && Listahuespedes.get(i).getDocumento()== documento) {
                Listahuespedes.remove(i);
                return true;
            }
        }
        return false;
    }
}
