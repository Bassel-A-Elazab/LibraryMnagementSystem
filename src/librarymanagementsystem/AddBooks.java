package librarymanagementsystem;

import infoClasses.Author;
import infoClasses.Books;
import infoClasses.Category;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AddBooks extends javax.swing.JFrame {

    Category cat;
    Books bk;

    /**
     * Creates new form AddBooks
     */
    public AddBooks() {
        initComponents();
        System.out.println("One");
        
         authorName.addItem("Usama Serag");
    }

    public AddBooks(Author auth) {
        initComponents();
        System.out.println("Two");
        authorName.addItem(auth.getFName() + " " + auth.getMName() + " " + auth.getLName()); 
        authorName.addItem("Bassel");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        copyRightYear = new javax.swing.JTextField();
        title = new javax.swing.JTextField();
        category = new javax.swing.JComboBox<>();
        publishCountry = new javax.swing.JComboBox<>();
        qnty = new javax.swing.JTextField();
        cost = new javax.swing.JTextField();
        authorName = new javax.swing.JComboBox<>();
        exit = new javax.swing.JButton();
        addAuthor = new javax.swing.JButton();
        add = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        publishDate = new com.toedter.calendar.JDateChooser();
        copyYearError = new javax.swing.JLabel();
        qntError = new javax.swing.JLabel();
        costError = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Add New Book");

        jLabel2.setText("Copy Right Year : ");

        jLabel4.setText("Title : ");

        jLabel3.setText("Author Name : ");

        jLabel5.setText("Cost : ");

        jLabel6.setText("Category : ");

        jLabel7.setText("Total Copy : ");

        jLabel8.setText("Publich Country : ");

        copyRightYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyRightYearActionPerformed(evt);
            }
        });
        copyRightYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                copyRightYearKeyPressed(evt);
            }
        });

        title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleActionPerformed(evt);
            }
        });

        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer Graphics", "Programming Languages", "Database System", "Artificial Intelligence", "Compilers", "Computer Vision", "Machine Learning", "Encryption", "Software Testing", "Computer Networking" }));
        category.setSelectedIndex(-1);

        publishCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria", "Austrian Empire", "Azerbaijan", "Baden", "ahamas", "Bahrain", "Bangladesh", "Barbados", "Bavaria", "Belarus", "Belgium", "Belize", "Benin (Dahomey)", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Brunswick and Lüneburg", "Bulgaria", "Burkina Faso (Upper Volta)", "Burma", "Burundi", "Cabo Verde", "Cambodia", "Cameroon", "Canada", "Cayman Islands", "The Central African Republic", "Central American Federation", "Chad", "Chile", "Chinam", "Colombia", "Comoros", "Congo Free State", "The Costa Rica", "Cote d’Ivoire (Ivory Coast)", "Croatia", "Cuba", "Cyprus", "Czechia", "Czechoslovakia", "Democratic Republic of the Congo", "Denmark", "Djibouti", "Dominic", "Dominican Republic", "Duchy of Parma" }));
        publishCountry.setSelectedIndex(-1);
        publishCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publishCountryActionPerformed(evt);
            }
        });

        qnty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qntyActionPerformed(evt);
            }
        });
        qnty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qntyKeyPressed(evt);
            }
        });

        cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costActionPerformed(evt);
            }
        });
        cost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                costKeyPressed(evt);
            }
        });

        authorName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Liam Noah William", "Jacob Michael Daniel", "James Oliver Benjamin", "Elijah Lucas Mason", "Logan Alexander Ethan", "Bassel Ahmed El-azab" }));
        authorName.setSelectedIndex(-1);
        authorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorNameActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        addAuthor.setText("Add New Author");
        addAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAuthorActionPerformed(evt);
            }
        });

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jLabel9.setText("Publish Date : ");

        publishDate.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(qntError, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(authorName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(copyRightYear, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(copyYearError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(publishCountry, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(publishDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(111, 111, 111)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(costError, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(7, 7, 7)
                                                        .addComponent(qnty, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(addAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(title, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(costError, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(copyRightYear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(copyYearError, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(publishCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qntError, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(publishDate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(qnty, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(authorName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void copyRightYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyRightYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_copyRightYearActionPerformed

    private void titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleActionPerformed

    private void qntyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qntyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qntyActionPerformed

    private void costActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_exitActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        clearInfo();
    }//GEN-LAST:event_resetActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        Connection con = ConnectDatabase.setConnect();
        this.cat = new Category();
        this.bk = new Books();
        Statement stmt = null;
        ResultSet rs = null;
        Integer idCateg = 0, idAuthor = 0, ISBN = 0, price, cpyRight, numberBk;
        String date_Publish = null, authName = null;
        String[] getAuthorId = new String[3];
        Date d = new Date();
        SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
        int brwCopy = 0;
        boolean chk = false;
        //Check Title Name
        if (title.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Title Name Is Empty", "Invalid Input Title", JOptionPane.INFORMATION_MESSAGE);
            chk = true;
        } else {
            this.bk.setTitle(title.getText());
        }

        //Check Cost
        if (cost.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cost Field Is Empty", "Invalid Input Cost", JOptionPane.INFORMATION_MESSAGE);
            chk = true;
        } else {
            try {
                if (Integer.parseInt(cost.getText()) < 0) {
                    JOptionPane.showMessageDialog(null, "Cost Field Is Less Than Zero", "Invalid Input Cost", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    this.bk.setCost(Integer.parseInt(cost.getText()));
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Not A Number", "Invalid Input Cost", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        //Check Total Of Copy
        if (qnty.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Total Copy Field Is Empty", "Invalid Input Total Copy", JOptionPane.INFORMATION_MESSAGE);
            chk = true;
        } else {
            try {
                this.bk.setQnty(Integer.parseInt(qnty.getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Not A Number", "Invalid Input Total Copy", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        //Check Total Of Copy
        if (copyRightYear.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Copy Right Year Field Is Empty", "Invalid Input Copy Right Year", JOptionPane.INFORMATION_MESSAGE);
            chk = true;
        } else {
            try {
                this.bk.setCopyRightYear(Integer.parseInt(copyRightYear.getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Not A Number", "Invalid Input Copy Right Year", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        if (publishCountry.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Publish Country Isn't Selected", "Invalid Input Copy Right Year", JOptionPane.INFORMATION_MESSAGE);
            chk = true;
        } else {
            this.bk.setPublishCountry(publishCountry.getSelectedItem().toString());
        }

        //Check Category
        if (category.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Category Isn't Selected", "Invalid Input Category", JOptionPane.INFORMATION_MESSAGE);
            chk = true;
        } else {
            this.cat.setName(category.getSelectedItem().toString());
        }

        //Check Author Name
        if (authorName.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Author Isn't Selected", "Invalid Input Author", JOptionPane.INFORMATION_MESSAGE);
            chk = true;
        } else {
            authName = (String) authorName.getSelectedItem();
            getAuthorId = authName.split(" ");
        }

        //Check Date
        if (publishDate.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Please Choose Correct Calender Like 01-06-2020", "Invalid Input Calender", JOptionPane.INFORMATION_MESSAGE);
            chk = true;
        } else {
            d = publishDate.getDate();
            date_Publish = dcn.format(d);
        }
        if (!chk) {
            try {
                String getCategId = "SELECT idCategory FROM category where Name_C =" + "'" + this.cat.getName() + "';";
                System.out.println(getCategId);
                stmt = con.createStatement();
                rs = stmt.executeQuery(getCategId);
                if (rs.next()) {
                    idCateg = rs.getInt(1);
                }
                String getAuthId = "SELECT idAuthors FROM Authors WHERE Fname_A ='" + getAuthorId[0] + "'AND Mname_A='" + getAuthorId[1] + "'AND Lname_A='" + getAuthorId[2] + "';";
                rs = stmt.executeQuery(getAuthId);
                if (rs.next()) {
                    idAuthor = rs.getInt(1);
                }
                String sql = "INSERT INTO books (Title,CopyRightYear,PublishCountry,TotalCopy,Cost,PublishDate,BorrowedCopy,Categ_ID)" + "VALUES('" + bk.getTitle() + "','" + bk.getCopyRightYear() + "','" + bk.getPublishCountry() + "','" + bk.getQnty() + "','" + bk.getCost() + "','" + date_Publish + "','" + brwCopy + "','" + idCateg + "');";
                stmt.executeUpdate(sql);
                sql = "SELECT LAST_INSERT_ID();";
                rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    ISBN = rs.getInt(1);
                }
                sql = "INSERT INTO publisher(Autor_ID,ISBN_Books_Publish) VALUES('" + idAuthor + "','" + ISBN + "');";
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Operation Success", "New Book Is Added", JOptionPane.INFORMATION_MESSAGE);
                clearInfo();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }//GEN-LAST:event_addActionPerformed

    private void authorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorNameActionPerformed

    private void costKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costKeyPressed

    }//GEN-LAST:event_costKeyPressed

    private void copyRightYearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_copyRightYearKeyPressed

    }//GEN-LAST:event_copyRightYearKeyPressed

    private void qntyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qntyKeyPressed
        /*
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            qntError.setText("Invalid Input, Please Enter A Number...");
            getToolkit().beep();
            evt.consume();
        } else {
            qntError.setText("");
        }
         */
    }//GEN-LAST:event_qntyKeyPressed

    private void publishCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publishCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publishCountryActionPerformed

    private void addAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAuthorActionPerformed
        AddAuthor addName = new AddAuthor();
        addName.setVisible(true);
    }//GEN-LAST:event_addAuthorActionPerformed

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
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new AddBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton addAuthor;
    private javax.swing.JComboBox<String> authorName;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JTextField copyRightYear;
    private javax.swing.JLabel copyYearError;
    private javax.swing.JTextField cost;
    private javax.swing.JLabel costError;
    private javax.swing.JButton exit;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JComboBox<String> publishCountry;
    private com.toedter.calendar.JDateChooser publishDate;
    private javax.swing.JLabel qntError;
    private javax.swing.JTextField qnty;
    private javax.swing.JButton reset;
    private javax.swing.JTextField title;
    // End of variables declaration//GEN-END:variables
public void clearInfo() {
        title.setText(null);
        copyRightYear.setText(null);
        publishCountry.setSelectedIndex(-1);
        authorName.setSelectedIndex(-1);
        cost.setText(null);
        category.setSelectedIndex(-1);
        qnty.setText(null);
        publishDate.setDate(null);
    }
}
