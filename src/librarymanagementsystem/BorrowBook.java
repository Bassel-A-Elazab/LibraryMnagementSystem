/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

import infoClasses.Books;
import infoClasses.Members;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Basola
 */
public class BorrowBook extends javax.swing.JFrame {

    /**
     * Creates new form BorrowBook
     */
    Books bk = new Books();
    Members memb = new Members();
    Date dateToday = new Date();
    SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
    String fromDate = dcn.format(dateToday);

    public BorrowBook() {
        initComponents();
        stDate.setText(fromDate);
        stDate.setEditable(false);
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
        jLabel5 = new javax.swing.JLabel();
        stDate = new javax.swing.JTextField();
        ISBN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        borrow = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        endDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Borrow A Book");

        jLabel2.setText("Member ID : ");

        membID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membIDActionPerformed(evt);
            }
        });

        jLabel5.setText("Start Date : ");

        jLabel6.setText("Book ID : ");

        jLabel7.setText("End Date : ");

        borrow.setText("Borrow");
        borrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        endDate.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(borrow, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(membID, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(stDate, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(ISBN, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(endDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(membID, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stDate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(borrow, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void membIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membIDActionPerformed

    }//GEN-LAST:event_membIDActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void borrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowActionPerformed
        Connection con = ConnectDatabase.setConnect(), con_book = ConnectDatabase.setConnect(), con_member = ConnectDatabase.setConnect();
        Statement stmt = null, stmt_book, stmt_member = null;
        ResultSet rs = null, rs_book = null, rs_member = null;
        int IDMemb = 0, IDBook = 0, qntyAfter = -1;
        boolean chk = false;
        Date date = new Date();
        String toDate = null;
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
                if (endDate.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "Please Choose Correct Calender Like 01-06-2020", "Invalid Input Calender", JOptionPane.INFORMATION_MESSAGE);
                    chk = true;
                } else if ((dcn.format(endDate.getDate()).compareTo(fromDate) < 0)) {
                    JOptionPane.showMessageDialog(null, "Please, Choose Date After Today Day", "Invalid Input", JOptionPane.INFORMATION_MESSAGE);
                    chk = true;
                    endDate.setDate(null);
                } else {
                    date = endDate.getDate();
                    toDate = dcn.format(date);
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

                    if (bk.getQnty() > 1) {
                        String paneMessg = "Book Title : " + bk.getTitle() + "\n"
                                + "Member Name : " + memb.getFName() + " " + memb.getMName() + " " + memb.getLName() + "\n";
                        int option = JOptionPane.showConfirmDialog(this, "Are You Want To Borrow This Book Your Info?\n" + paneMessg, "Confirmation Borrow Book", JOptionPane.YES_NO_CANCEL_OPTION);
                        switch (option) {
                            case JOptionPane.YES_OPTION:

                                qntyAfter = bk.getQnty() - 1;
                                memb.setBookBorrowed(memb.getBookBorrowed() + 1);
                                String sql = "INSERT INTO borrowed(ISBN_Books_Borrow,Memb_ID_Borrow,StartDate,EndDate)VALUES(" + IDBook + "," + IDMemb + ",'" + fromDate + "','" + toDate + "');";
                                stmt = con.createStatement();
                                stmt.execute(sql);

                                sql_book = "UPDATE books SET TotalCopy = " + qntyAfter + " WHERE ISBN = " + IDBook + ";";
                                stmt_book.executeUpdate(sql_book);

                                sql_member = "UPDATE members SET NumOfBooksBorrowed = " + memb.getBookBorrowed() + " WHERE idMembers = " + IDMemb + ";";
                                stmt_member.executeUpdate(sql_member);

                                JOptionPane.showMessageDialog(null, "Book Borrow Successfully...", "Borrow Operation", JOptionPane.INFORMATION_MESSAGE);
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
                    JOptionPane.showMessageDialog(null, "Please, Be Sure From Member ID OR Book ID !!!", "Warning Message", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_borrowActionPerformed

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
            java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrowBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JTextField ISBN;
    private javax.swing.JButton borrow;
    private com.toedter.calendar.JDateChooser endDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField membID;
    private javax.swing.JTextField stDate;
    // End of variables declaration//GEN-END:variables
void clearData() {
        membID.setText("");
        ISBN.setText("");
        endDate.setDate(null);
    }
}
