
import java.util.Calendar;
import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        int Añov;
        double montor, suma;

        //Impresion del Nombre
        Persona p = new Persona("Ramon Jose");
        p.getNombre();

        //Impresion del Cliente y el Contrato
        Contrato c = new Contrato("Ramon Jose", 258);
        c.getCliente();
        c.getMonto();

        //Comparacion de dos Montos
        Contrato m = new Contrato(259, 259);
        System.out.println("Comparando monto 1 y monto 2, son iguales: " + c.ComparacionMontos());

        //Introduciendo Año de vencimiento del Contrato
        System.out.print("Introduzca el Año de vencimiento: ");
        Scanner teclado = new Scanner(System.in);
        Añov = teclado.nextInt();

        //Obtener el Año actual del calendario
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);

        //Comparar Año de vencimiento del contrato con el actual del calendario
        if (Añov > year) {
            System.out.println("el Contrato esta vigente");

        } else {
            System.out.println("El contrato esta vencido");
        }

        //sumar procentaje introducido
        System.out.print("el porcentaje: ");
        Scanner teclodo = new Scanner(System.in);
        montor = teclodo.nextInt();

        double resultado = montor * c.getMonto() / 100;
        System.out.println("El porciento a incrementar es: " + resultado + "RD$");

        suma = resultado + c.getMonto();
        System.out.println("El nuevo monto es:" + suma);

    }

}
