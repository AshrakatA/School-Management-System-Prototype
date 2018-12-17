
package project;
import java.sql.*;
import javax.swing.JOptionPane;
public class Coursesdatabase {
    Connection c=null;

    public static Connection connect(){
    try {
           
            Connection c =(Connection) DriverManager.getConnection("jdbc:sqlite:Courses.sqlite");
            System.out.println("Connected");
            return c;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println("error :( ");
            return null;
        }
    
    }
    
}
