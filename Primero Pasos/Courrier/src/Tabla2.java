
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tabla2 {

    public void pasarvalores_paquetes(JTable to) {

        String[] Columnas = {"Nombres", "Apellido", "Cedula", "Telefono", "Direccion", "Codigo", "Cantidad", "Tipo", "Peso", "Destino", "Estatus"};
        DefaultTableModel dtm2 = new DefaultTableModel(null, Columnas);
        to.setModel(dtm2);
    }
}
