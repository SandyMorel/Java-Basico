package tarea1;

public class Aficionado extends Persona {

    private String EquipoFavorito;
    private String JugadorFavorito;

    public Aficionado(String Nombre, String Apellido, int Edad, boolean Casado, String Cedula, String EquipoFavorito, String JugadorFavorito) {
        super(Nombre, Apellido, Edad, Casado, Cedula);
        this.EquipoFavorito = EquipoFavorito;
        this.JugadorFavorito = JugadorFavorito;
    }

    @Override
    public String toString() {
        String mensaje = "Aficionado 1 " + Nombre + " " + Apellido + " " + Edad + " " + Casado + " " + Cedula + " " + EquipoFavorito + " " + JugadorFavorito;
        return mensaje;

    }

}
