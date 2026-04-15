package sistemaHostal.model;

public class Reserva {
    private Cliente cliente;
    private Habitacion habitacion;
    private int dias;
    private double total;

    public Reserva(Cliente cliente, Habitacion habitacion, int dias, int total) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.dias = dias;
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }




}
