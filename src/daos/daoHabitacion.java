
package daos;
import java.util.ArrayList;
import modelo.Habitacion;
import modelo.Huesped;
/**
 *
 * @author Juan
 */
public class daoHabitacion {
    private ArrayList<Habitacion> habitaciones;

    public daoHabitacion() {
        this.habitaciones = new ArrayList<>();
        
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }
      public boolean guardarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
        return true;
    }
      // este es el metodo importante lo que hace es agrgar una huesped a una habitacion y ya quedan asociados los dos.
    void agregarHuespedAHabitacion(Habitacion habitacion, Huesped huesped) {
      huesped.getHabitaciones().add(habitacion);
    }
     public Habitacion buscarHabitacion(int numero) {
        for (int i = 0; i < habitaciones.size(); i++) {
            if (habitaciones.get(i).getNumero()== numero) {
                return habitaciones.get(i);
            }
        }
        return null;
    }
     public boolean actualizarHabitacion(Habitacion habitacion) {
        Habitacion buscar = buscarHabitacion(habitacion.getNumero());
        if (buscar != null) {
            
            buscar.setCapacidad(habitacion.getCapacidad());
            buscar.setEstado(habitacion.getEstdo());
            buscar.setTipo(habitacion.getTipo());
            
            return true;
        }
        return false;
    }
       public boolean eliminarHabitacion(int numero) {
        for (int i = 0; i < habitaciones.size(); i++) {
            if (habitaciones.get(i).getNumero()== numero) {
                habitaciones.remove(i);
                return true;
            }
        }
        return false;
    }
}
