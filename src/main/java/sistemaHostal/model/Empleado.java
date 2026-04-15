package sistemaHostal.model;

import sistemaHostal.service.IServiceReserva;

public class Empleado implements IServiceReserva {
    private String nombre;
    private Hostal hostal;


    public Empleado(String nombre, Hostal hostal) {
        this.nombre = nombre;
        this.hostal = hostal;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Hostal getHostal() {
        return hostal;
    }

    public void setHostal(Hostal hostal) {
        this.hostal = hostal;
    }


    @Override
    public Reserva hacerReserva(Reserva reserva) {
        Habitacion h = hostal.buscarHabitacion(reserva.getHabitacion().getNumCamas());

        if (h == null) {
            System.out.println("No hay habitación disponible con esas camas");
            return null;
        }

        h.setDisponible(false);
        reserva.setHabitacion(h);

        reserva.setTotal(calcularTotal(reserva));

        return reserva;
    }

    @Override
    public Double calcularTotal(Reserva reserva) {


        double precio = reserva.getHabitacion().getPrecio();

        return precio * reserva.getDias();
    }

    @Override
    public void mostrarReserva(Reserva reserva) {
        if (reserva != null) {
            System.out.println("Empleado: " + nombre);
            System.out.println("Cliente: " + reserva.getCliente().getNombre());
            System.out.println("Habitación: " + reserva.getHabitacion().getNumHabitacion());
            System.out.println("Días: " + reserva.getDias());
            System.out.println("Total: " + reserva.getTotal());
        } else {
            System.out.println("No hay reserva.");
        }

    }
}
