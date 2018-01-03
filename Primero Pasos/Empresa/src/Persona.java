
public class Persona {

    protected String Nombre;

    public Persona() {

    }

    public Persona(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setNombre(String unNombre) {
        Nombre = unNombre;

    }

    public String getNombre() {
        System.out.println("Nombre:" + Nombre);
        return Nombre;

    }
}
