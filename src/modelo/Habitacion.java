
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class Habitacion {
    private int numero;
    private String tipo;
    private int capacidad;
    private String estado;
    private ArrayList<Huesped> huespedes;
    private ArrayList<Reserva> reservas;

    public Habitacion(int numero, String tipo, int capacidad, String estado) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.estado = estado;
        this.reservas = new ArrayList<>();
        this.huespedes = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEstdo() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public ArrayList<Huesped> getHuespedes() {
        return huespedes;
    }

    public void setHuespedes(ArrayList<Huesped> huespedes) {
        this.huespedes = huespedes;
    }
    
}
