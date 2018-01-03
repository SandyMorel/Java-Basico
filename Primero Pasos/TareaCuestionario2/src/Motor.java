
public class Motor {

    public int Cilindrada;
    public String Combustible;

    public Motor() {
        this.setCilindrada(130);
        this.setCombustible("Gasolina");
    }

    public int getCilindrada() {
        return Cilindrada;
    }

    public void setCilindrada(int Cilindrada) {
        this.Cilindrada = Cilindrada;
    }

    public String getCombustible() {
        return Combustible;
    }

    public void setCombustible(String Combustible) {
        this.Combustible = Combustible;
    }

    @Override
    public String toString() {

        return "La Cilindrada del Motor es " + this.getCilindrada() + " Con combustible de Tipo " + this.getCombustible();

    }

}
