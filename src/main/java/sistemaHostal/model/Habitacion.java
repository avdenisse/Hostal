package sistemaHostal.model;

public class Habitacion {
    private String numHabitacion;
    private int numCamas;
    private double precio;
    private boolean disponible;

    public Habitacion(String numHabitacion, int numCamas, double price, boolean disponible) {
        this.numHabitacion = numHabitacion;
        this.numCamas = numCamas;
        this.precio = price;
        this.disponible = disponible;
    }

    public String getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(String numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
