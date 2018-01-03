
import java.util.Calendar;

public class Camion extends Motor {

    private static int Año;

    private int chapa;
    private String color;

    public Camion(String color, int chapa) {

        this.color = color;
        this.chapa = chapa;

    }

    public String pintarCamion() {
        color = "verde";
        System.out.println(" Color  nuevo :" + color);
        return color;

    }

    public Camion() {
        this.setchapa(123);
        this.setcolor("Rojo");
        this.setAño(1993);
        this.setCombustible("Gassolina");
        this.setCilindrada(250);

    }

    public String getCombustible() {
        return Combustible;
    }

    public int getCilindrada() {
        return Cilindrada;
    }

    public void setcolor(String color) {
        this.color = color;

    }

    public String getcolor() {
        //System.out.println(" Color :" + color);
        return color;
    }

    public void setchapa(int chapa) {
        this.chapa = chapa;

    }

    public int getchapa() {
        //System.out.println(" Chapa :" + chapa);
        return chapa;
    }

    public static void setAño(int unAño) {
        Año = unAño;
    }

    public static int getAño() {
        return Año;
    }

    @Override
    public String toString() {

        return "Año del camion " + this.getAño() + "  de color  " + this.getcolor() + " y chapa " + this.getchapa() + " Le toca Revision al Camion: " + Revision() + "  El Motor del camion tiene un Kilometraje de " + this.getCilindrada() + " y usa Combustible de Tipo " + this.getCombustible();

    }

    public String Revision() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);

        if (Año < year) {
            return "Si";

        } else {
            return "No";
        }

    }

}
