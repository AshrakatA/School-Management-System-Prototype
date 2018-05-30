
package project;
import java.sql.*;
import javax.swing.JOptionPane;
public class database {
    Connection c=null;

    public static Connection connect(){
    try {
           
              Connection c =(Connection) DriverManager.getConnection("jdbc:sqlite:Students.sqlite");
            System.out.println("Connected");
            return c;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    
    }
    
}
