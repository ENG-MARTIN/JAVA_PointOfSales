
package SUPERMARKET;
import java.sql.*;
import javax.swing.JOptionPane;
public class CONNECTION {
    
    public static Connection connetsqlite(){
       Connection conn;
        try {
            String url="jdbc:Sqlite:MARTEX.db";
            conn=DriverManager.getConnection(url);
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
