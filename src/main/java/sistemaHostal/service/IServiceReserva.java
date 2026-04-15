package sistemaHostal.service;

import sistemaHostal.model.Reserva;

public interface IServiceReserva {
    Reserva hacerReserva(Reserva reserva);
    Double calcularTotal(Reserva reserva);
    void mostrarReserva(Reserva reserva);
}
