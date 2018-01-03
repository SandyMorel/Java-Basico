package tarea1;

public class JugadorFutbol extends Persona {

    public String NombredeEquipo;

    public JugadorFutbol(String Nombre, String Apellido, int Edad, Boolean Casado, String Cedula, String NombredeEquipo) {

        super(Nombre, Apellido, Edad, Casado, Cedula);
        this.NombredeEquipo = NombredeEquipo;

    }

    @Override
    public String toString() {

        String mensaje = "Jugador 1 " + Nombre + " " + Apellido + " " + Edad + " " + Casado + " " + Cedula + " " + NombredeEquipo;
        return mensaje;

    }

}
