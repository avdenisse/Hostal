package sistemaHostal.test;

import sistemaHostal.model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Habitacion> habitaciones = new ArrayList<>();
        Hostal hostal = new Hostal(habitaciones);

        ArrayList<Reserva> reservas = new ArrayList<>();

        System.out.println("Nombre del empleado:");
        String nombreEmp = sc.nextLine();

        Empleado emp = new Empleado(nombreEmp, hostal);

        int opcion;

        do {
            System.out.println("\n1. Agregar habitación");
            System.out.println("2. Hacer reserva");
            System.out.println("3. Mostrar reservas");
            System.out.println("4. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("Número habitación:");
                    String num = sc.nextLine();

                    System.out.println("Número de camas:");
                    int camas = sc.nextInt();

                    System.out.println("Precio:");
                    double precio = sc.nextDouble();

                    Habitacion h = new Habitacion(num, camas, precio, true);
                    hostal.agregarHabitacion(h);

                    System.out.println("Habitación agregada");
                    break;

                case 2:
                    sc.nextLine();

                    System.out.println("Nombre cliente:");
                    String nombre = sc.nextLine();

                    System.out.println("Apellido:");
                    String apellido = sc.nextLine();

                    System.out.println("Teléfono:");
                    String tel = sc.nextLine();

                    Cliente cliente = new Cliente(nombre, apellido, tel);

                    System.out.println("Cantidad de días:");
                    int dias = sc.nextInt();

                    System.out.println("Número de camas deseadas:");
                    int camasReq = sc.nextInt();

                    Habitacion temp = new Habitacion(null, camasReq, 0, true);

                    Reserva nueva = new Reserva(cliente, temp, dias, 0);

                    Reserva r = emp.hacerReserva(nueva);

                    if (r != null) {
                        reservas.add(r);
                        System.out.println("Reserva realizada con éxito");
                    } else {
                        System.out.println("No se pudo realizar la reserva");
                    }

                    break;

                case 3:
                    if (reservas.isEmpty()) {
                        System.out.println("No hay reservas aún.");
                    } else {
                        for (Reserva res : reservas) {
                            emp.mostrarReserva(res);
                            System.out.println("----------------------");
                        }
                    }
                    break;
            }

        } while (opcion != 4);

        sc.close();
    }
}