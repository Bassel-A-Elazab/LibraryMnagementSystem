package librarymanagementsystem;

import java.sql.Connection;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Connection con = null;
        con = ConnectDatabase.setConnect();
        AdminLogin Login = new AdminLogin();
        Login.setVisible(true);
    }
    
}
