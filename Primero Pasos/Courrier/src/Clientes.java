
import javax.swing.JTextField;

public class Clientes {

    private String Nombre;
    private String Apellido;
    private String Cedula;

    public Clientes(String Nombre, String Apellido, String Cedula) {
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.Cedula = Cedula;

    }

    public String getNombre() {

        return Nombre;
    }

    public void setNombre(String Nombre) {

        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }
}
