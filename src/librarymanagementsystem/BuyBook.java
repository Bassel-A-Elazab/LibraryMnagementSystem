/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

import infoClasses.Books;
import infoClasses.Members;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Basola
 */
public class BuyBook extends javax.swing.JFrame {

    /**
     * Creates new form BuyBook
     */
    Books bk = new Books();
    Members memb = new Members();

    public BuyBook() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ISBN = new javax.swing.JTextField();
        qnty = new javax.swing.JTextField();
        membID = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        buy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Buy A Book");

        jLabel2.setText("Member ID : ");

        jLabel3.setText("Total Copy : ");

        jLabel5.setText("Book ID : ");

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        buy.setText("Buy");
        buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(membID, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qnty, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(buy, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(membID, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qnty, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buy, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyActionPerformed
        Connection con = ConnectDatabase.setConnect(), con_book = ConnectDatabase.setConnect(), con_member = ConnectDatabase.setConnect();
        Statement stmt = null, stmt_book, stmt_member = null;
        ResultSet rs = null, rs_book, rs_member = null;

        int IDMemb = 0, IDBook = 0, QNTY = 0, qntyAfter = 0, totalCost = 0;
        Date date = new Date();
        SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
        String dateSell = dcn.format(date);
        boolean chk = false;
        if (membID.getText().isEmpty() && ISBN.getText().isEmpty() && qnty.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Sorry , Enter The Requird Inforamtion !!!", "Invalid Input", JOptionPane.INFORMATION_MESSAGE);

        } else {
            try {

                if (membID.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Sorry , Member ID Is Empty !!!", "Invalid Input", JOptionPane.INFORMATION_MESSAGE);
                    chk = true;
                } else if (Integer.parseInt(membID.getText()) < 0) {
                    JOptionPane.showMessageDialog(null, "Sorry , Member ID Is Less Than 0 !!!", "Invalid Input", JOptionPane.INFORMATION_MESSAGE);
                    chk = true;
                } else {
                    IDMemb = Integer.parseInt(membID.getText());
                }

                if (ISBN.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Sorry , Book ID Is Empty !!!", "Invalid Input", JOptionPane.INFORMATION_MESSAGE);
                    chk = true;
                } else if (Integer.parseInt(ISBN.getText()) < 0) {
                    JOptionPane.showMessageDialog(null, "Sorry , Book ID Is Less Than 0 !!!", "Invalid Input", JOptionPane.INFORMATION_MESSAGE);
                    chk = true;
                } else {
                    IDBook = Integer.parseInt(ISBN.getText());
                }

                if (qnty.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Sorry , Total Copy Is Empty !!!", "Invalid Input", JOptionPane.INFORMATION_MESSAGE);
                    chk = true;
                } else if (Integer.parseInt(qnty.getText()) < 0) {
                    JOptionPane.showMessageDialog(null, "Sorry , Total Copy Is Less Than 0 !!!", "Invalid Input", JOptionPane.INFORMATION_MESSAGE);
                    chk = true;
                } else {
                    QNTY = Integer.parseInt(qnty.getText());
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Should Be A Number !!!", "Invalid Input", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        if (!chk) {
            try {
                String sql_book = "SELECT * FROM books WHERE ISBN = " + IDBook + ";";
                String sql_member = "SELECT * FROM members WHERE idMembers = " + IDMemb + ";";
                stmt_book = con_book.createStatement();
                rs_book = stmt_book.executeQuery(sql_book);
                stmt_member = con_member.createStatement();
                rs_member = stmt_member.executeQuery(sql_member);

                if (rs_book.next() && rs_member.next()) {
                    bk = new Books(rs_book.getString("Title"), rs_book.getInt("CopyRightYear"), rs_book.getString("PublishCountry"), rs_book.getInt("TotalCopy"), rs_book.getInt("Cost"), rs_book.getDate("PublishDate"), rs_book.getInt("BorrowedCopy"));
                    memb = new Members(rs_member.getString("Fname_M"), rs_member.getString("Mname_M"), rs_member.getString("Lname_M"), rs_member.getString("Email_M"), rs_member.getString("Phone_M"), rs_member.getString("Address_M"), rs_member.getInt("NumOfBooksBorrowed"), rs_member.getInt("NumOfBooksBought"));
                    if (QNTY <= bk.getQnty()) {
                        totalCost = bk.getCost() * QNTY;
                        String paneMessg = "Book Title : " + bk.getTitle() + "\n"
                                + "Book Price : " + bk.getCost() + "\n"
                                + "Member Name : " + memb.getFName() + " " + memb.getMName() + " " + memb.getLName() + "\n"
                                + "Total Cost : " + totalCost + "\n";
                        int option = JOptionPane.showConfirmDialog(this, "Are You Want To Buy This Book Your Info?\n" + paneMessg, "Confirmation Buy Book", JOptionPane.YES_NO_CANCEL_OPTION);
                        switch (option) {
                            case JOptionPane.YES_OPTION:

                                qntyAfter = bk.getQnty() - QNTY;
                                memb.setBookBought(memb.getBookBought() + 1);
                                String sql = "INSERT INTO sold(ISBN_Sold,Memb_ID_Sold,sell_date,qnty,cost,total_cost)VALUES(" + IDBook + "," + IDMemb + ",'" + dateSell + "'," + QNTY + "," + bk.getCost() + "," + totalCost + ");";
                                stmt = con.createStatement();
                                stmt.execute(sql);

                                sql_book = "UPDATE books SET TotalCopy = " + qntyAfter + " WHERE ISBN = " + IDBook + ";";
                                stmt_book.executeUpdate(sql_book);

                                sql_member = "UPDATE members SET NumOfBooksBought = " + memb.getBookBought() + " WHERE idMembers = " + IDMemb + ";";
                                stmt_member.executeUpdate(sql_member);

                                JOptionPane.showMessageDialog(null, "Book Bought Successfully...", "Buy Operation", JOptionPane.INFORMATION_MESSAGE);
                                clearData();
                                break;
                            case JOptionPane.NO_OPTION:
                                clearData();
                                break;
                            case JOptionPane.CANCEL_OPTION:
                                clearData();
                                break;
                            default:
                                break;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Sorry , There Isn't Avaliable Number\nWe Have" + bk.getQnty() + "Total Copy of This Book", "Warning Message", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please, Be Shure From Member ID OR Book ID !!!", "Warning Message", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_buyActionPerformed

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
            java.util.logging.Logger.getLogger(BuyBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuyBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuyBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuyBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuyBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ISBN;
    private javax.swing.JButton buy;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField membID;
    private javax.swing.JTextField qnty;
    // End of variables declaration//GEN-END:variables
void clearData() {
        membID.setText("");
        ISBN.setText("");
        qnty.setText("");
    }
}
