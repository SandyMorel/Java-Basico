
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tabla {

    public void pasar_valores(JTable ta) {

        String[] Columnas = {"Nombres", "Apellido", "Cedula", "Telefono", "Direccion"};
        DefaultTableModel dtm = new DefaultTableModel(null, Columnas);
        ta.setModel(dtm);
    }

}
