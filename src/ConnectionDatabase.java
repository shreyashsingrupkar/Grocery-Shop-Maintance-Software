import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConnectionDatabase {
    
    Connection con;
    PreparedStatement stmt;
    
    public Connection DBConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/grocery_shop_database","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
}
