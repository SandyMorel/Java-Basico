
public class Contrato {

    private String Cliente;
    private int Monto;
    private double monto1, monto2;

    public Contrato(double monto1, double monto2) {

        this.monto1 = monto1;
        this.monto2 = monto2;
    }

    public Contrato(String Cliente, int Monto) {

        this.Cliente = Cliente;
        this.Monto = Monto;
    }

    public String toString() {
        String mensaje = "Nombre del cliente: " + Cliente + " -Monto de su contrato RD$: " + Monto;
        return mensaje;

    }

    public String getCliente() {
        System.out.println("El cliente es:" + Cliente);
        return Cliente;
    }

    public void Cliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public int getMonto() {
        System.out.println("El monto es:" + Monto);
        return Monto;
    }

    public void setMonto(int Monto) {
        this.Monto = Monto;
    }

    public boolean ComparacionMontos() {

        if (monto1 == monto2) {

            return true;

        } else {
            return false;
        }

    }

    public int porciento() {

        return 0;

    }

}
