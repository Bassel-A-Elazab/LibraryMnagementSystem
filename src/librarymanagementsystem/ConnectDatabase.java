
package librarymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectDatabase {
    private static final String CONN_NAME = "jdbc:mysql://localhost:3306/library_management_system";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static Connection con = null;
    public static Connection setConnect(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                con = DriverManager.getConnection(CONN_NAME,USERNAME,PASSWORD);
                System.out.println("Success...");
            } catch (SQLException ex) {
                System.out.println("Failed To Create DataBase Connection...");
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Not Found!!!.");
        }
         return con;
    }
   
}
