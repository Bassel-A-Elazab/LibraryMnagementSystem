/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Basola
 */
public class ReturnBookBorrowed extends javax.swing.JFrame {

    /**
     * Creates new form ReturnBookBorrowed
     */
    public ReturnBookBorrowed() {
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
        membID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        returnBook = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        ISBN = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Return A Book");

        jLabel2.setText("Member ID : ");

        membID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membIDActionPerformed(evt);
            }
        });

        jLabel6.setText("Book ID : ");

        returnBook.setText("Return");
        returnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBookActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(membID, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(returnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(membID, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(180, 266, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(returnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void membIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membIDActionPerformed

    }//GEN-LAST:event_membIDActionPerformed

    private void returnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBookActionPerformed
        Connection con = ConnectDatabase.setConnect();
        Statement stmt = null;
        ResultSet rs = null;
        int IDMemb = 0, IDBook = 0, fine = 0;
        Date date = new Date();
        SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
        String currentDate = dcn.format(date);
        String endDate = "";
        boolean chk = false;
        if (membID.getText().isEmpty() && ISBN.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Sorry , Enter The Requird Inforamtion !!!", "Invalid Input", JOptionPane.INFORMATION_MESSAGE);
            chk = true;
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
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Should Be A Number !!!", "Invalid Input", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if (!chk) {
            try {
                Date firstDate, secondDate;
                String sql = "SELECT * FROM borrowed WHERE Memb_ID_Borrow = " + IDMemb + ";";
                stmt = con.createStatement();
                rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    endDate = dcn.format(rs.getDate("EndDate"));
                    firstDate = dcn.parse(currentDate);
                    secondDate = dcn.parse(endDate);
                    long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
                    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
                    if (diff > 1) {
                        fine = (int) (diff * 150);
                    }

                    int result = JOptionPane.showConfirmDialog(null, "Aru You Want To Return This Book?\nYour Fine Amount Is : " + fine, "Return Book Confirmation", JOptionPane.YES_NO_OPTION);
                    switch (result) {
                        case JOptionPane.YES_OPTION:
                            sql = "UPDATE books SET TotalCopy = TotalCopy+1 where ISBn = " + IDBook + ";";
                            stmt.executeUpdate(sql);
                            sql = "DELETE FROM borrowed WHERE Memb_ID_Borrow = " + IDMemb + " and ISBN_Books_Borrow = " + IDBook + ";";
                            stmt.execute(sql);
                            JOptionPane.showMessageDialog(null, "Book Returned Successfully...", "Confiramtion Message", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case JOptionPane.NO_OPTION:
                            clearData();
                            break;
                        default:
                            break;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "There Isn't Book Borrowed For This Member...", "Warning Message", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_returnBookActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnBookBorrowed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBookBorrowed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBookBorrowed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBookBorrowed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBookBorrowed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JTextField ISBN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField membID;
    private javax.swing.JButton returnBook;
    // End of variables declaration//GEN-END:variables
void clearData() {
        membID.setText("");
        ISBN.setText("");
    }
}
