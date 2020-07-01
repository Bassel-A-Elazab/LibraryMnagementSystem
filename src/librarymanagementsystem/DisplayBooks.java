/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

import infoClasses.Author;
import infoClasses.Books;
import infoClasses.Category;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Basola
 */
public class DisplayBooks extends javax.swing.JFrame {

    /**
     * Creates new form DisplayBooks
     */
    Books bk = new Books();
    Author auth = new Author();
    Category cat = new Category();
    Connection con = ConnectDatabase.setConnect();
    Connection con_other = ConnectDatabase.setConnect();
    Statement stmt = null, stmt_other = null;
    ResultSet rs = null, rs_other = null;

    public DisplayBooks() {
        initComponents();
        showBooks();
    }

    public void showBooks() {
        String sql1, sql2;
        Object[] row = new Object[10];
        DefaultTableModel model = (DefaultTableModel) tableMembers.getModel();
        try {
            sql1 = "SELECT * FROM books";
            stmt = con.createStatement();
            stmt_other = con_other.createStatement();
            rs = stmt.executeQuery(sql1);
            while (rs.next()) {
                sql2 = "select Name_C from category where idCategory = " + rs.getInt("Categ_ID") + ";";
                rs_other = stmt_other.executeQuery(sql2);
                rs_other.next();
                cat = new Category(rs_other.getString("Name_C"));
                sql2 = "select Fname_A,Mname_A,Lname_A from authors where idAuthors in (select Autor_ID from publisher where ISBN_Books_Publish = " + rs.getInt("ISBN") + ");";
                rs_other = stmt_other.executeQuery(sql2);
                rs_other.next();
                auth = new Author(rs_other.getString("Fname_A"), rs_other.getString("Fname_A"), rs_other.getString("Fname_A"));
                bk = new Books(rs.getString("Title"), rs.getInt("CopyRightYear"), rs.getString("PublishCountry"), rs.getInt("TotalCopy"), rs.getInt("Cost"), rs.getDate("PublishDate"), rs.getInt("BorrowedCopy"));
                row[0] = rs.getString("ISBN");
                row[1] = bk.getTitle();
                row[2] = auth.getFName() + " " + auth.getMName() + " " + auth.getLName();
                row[3] = bk.getCopyRightYear();
                row[4] = bk.getPublishCountry();
                row[5] = bk.getQnty();
                row[6] = bk.getCost();
                row[7] = bk.getDate();
                row[8] = cat.getName();
                row[9] = bk.getBorrowedCopy();
                model.addRow(row);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMembers = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Display All Books");

        tableMembers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Title", "Author Name", "CopyRightYear", "PublishCountry", "TotalCopy", "Cost", "PublishDate", "Category", "BorrowedCopy"
            }
        ));
        jScrollPane1.setViewportView(tableMembers);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(486, 486, 486)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(573, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DisplayBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMembers;
    // End of variables declaration//GEN-END:variables
}
