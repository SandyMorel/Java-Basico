package tarea1;

public class Persona {

    public String Nombre;
    public String Apellido;
    public int Edad;
    public boolean Casado;
    public String Cedula;

    public Persona(String Nombre, String Apellido, int Edad, boolean Casado, String Cedula) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Casado = Casado;
        this.Cedula = Cedula;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {

        System.out.println(" Nombre :" + Nombre);
        return Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getApellido() {
        System.out.println("Apellido:" + Apellido);
        return Apellido;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getEdad() {

        System.out.println("Edad:" + Edad);
        return Edad;
    }

    public void setCasado(boolean Casado) {
        this.Casado = Casado;
    }

    public boolean getCasado() {
        System.out.println("Estado civil:" + Casado);
        return Casado;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getCedula() {
        System.out.println("Cedula:" + Cedula);
        return Cedula;
    }

}
