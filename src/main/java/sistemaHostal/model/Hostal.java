package sistemaHostal.model;

import java.util.ArrayList;

public class Hostal {
    ArrayList<Habitacion> habitaciones;
    private Habitacion h;

    public Hostal(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Habitacion getH() {
        return h;
    }

    public void setH(Habitacion h) {
        this.h = h;
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;


    }
    public Habitacion buscarHabitacion(int camas) {
        for (Habitacion h : habitaciones) {
            if (h.isDisponible() && h.getNumCamas() == camas) {
                return h;
            }
        }
        return null;
    }
    public void agregarHabitacion (Habitacion h) {
        if(habitaciones != null){
            habitaciones.add(h);
        }
    }

}
