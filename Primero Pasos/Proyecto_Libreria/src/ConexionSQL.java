
import java.sql.*;





public class ConexionSQL {
    
    Connection conectar= null;
    
    
    public Connection conexion() {
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/libreria", "root", "");
            
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return conectar;
        
        
    
    }
    
    
}
