package tarea1;

public class Tarea1 {

    public static void main(String[] args) {

        JugadorFutbol Jugador1 = new JugadorFutbol("Sandy", "Morel", 24, true, "12345", "Barcelona");

        System.out.println(Jugador1.toString());

        Aficionado Aficionado1 = new Aficionado("Juan", "Martinez", 18, false, "158979", "Madrid", "Ronaldo");

        System.out.println(Aficionado1.toString());
    }

}
