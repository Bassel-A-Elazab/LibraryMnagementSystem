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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicToolBarUI;

/**
 *
 * @author Basola
 */
public class EditBooks extends javax.swing.JFrame {

    Books bk;
    Author auth;
    Category categClass;
    int ISBN;

    /**
     * Creates new form EditBooks
     */
    public EditBooks() {
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
        jLabel3 = new javax.swing.JLabel();
        bookID = new javax.swing.JTextField();
        editBook = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        copyRightYear = new javax.swing.JTextField();
        cost = new javax.swing.JTextField();
        category = new javax.swing.JComboBox<>();
        publishCountry = new javax.swing.JComboBox<>();
        qnty = new javax.swing.JTextField();
        publishDate = new com.toedter.calendar.JDateChooser();
        authorName = new javax.swing.JComboBox<>();
        confirmUpdate = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Book Information");

        jLabel3.setText("Book ID : ");

        editBook.setText("Edit");
        editBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBookActionPerformed(evt);
            }
        });

        jLabel4.setText("Title : ");

        jLabel5.setText("Cost : ");

        jLabel2.setText("Copy Right Year : ");

        jLabel6.setText("Category : ");

        jLabel8.setText("Publich Country : ");

        jLabel7.setText("Total Copy : ");

        jLabel9.setText("Publish Date : ");

        jLabel10.setText("Author Name : ");

        title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleActionPerformed(evt);
            }
        });
        title.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                titlePropertyChange(evt);
            }
        });

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

        publishDate.setDateFormatString("dd-MM-yyyy");

        authorName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Liam Noah William", "Jacob Michael Daniel", "James Oliver Benjamin", "Elijah Lucas Mason", "Logan Alexander Ethan", "Bassel Ahmed El-azab" }));
        authorName.setSelectedIndex(-1);
        authorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorNameActionPerformed(evt);
            }
        });

        confirmUpdate.setText("Update Information Of Book");
        confirmUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmUpdateActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editBook, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookID, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(383, 479, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(129, 129, 129)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cost)
                                    .addComponent(category, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(title)
                                    .addComponent(qnty)
                                    .addComponent(publishDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(publishCountry, 0, 371, Short.MAX_VALUE)
                                    .addComponent(copyRightYear)
                                    .addComponent(authorName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(confirmUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(editBook, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(copyRightYear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qnty, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(publishDate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(publishCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(confirmUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleActionPerformed

    private void copyRightYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyRightYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_copyRightYearActionPerformed

    private void copyRightYearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_copyRightYearKeyPressed

    }//GEN-LAST:event_copyRightYearKeyPressed

    private void costActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costActionPerformed

    private void costKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costKeyPressed

    }//GEN-LAST:event_costKeyPressed

    private void qntyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qntyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qntyActionPerformed

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

    private void authorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorNameActionPerformed

    private void editBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBookActionPerformed
        Connection con_book = ConnectDatabase.setConnect();
        Connection con_other = ConnectDatabase.setConnect();
        Statement stmt_book = null, stmt_other = null;
        ResultSet rs_book = null, rs_other = null;
        String categ = null;
        this.bk = new Books();
        this.auth = new Author();
        this.categClass = new Category();
        
        if (bookID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Book ID Is Empty...", "Invalid Input Of Book ID", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                //Get/Search  Book From DataBase With ISBN
                ISBN = Integer.parseInt(bookID.getText());
                String sql = "SELECT * FROM books WHERE ISBN = " + ISBN + ";";
                stmt_book = con_book.createStatement();
                rs_book = stmt_book.executeQuery(sql);
                if (rs_book.next()) {
                    stmt_other = con_other.createStatement();
                    sql = "SELECT Name_C FROM category WHERE idCategory = " + rs_book.getInt(9) + ";";
                    rs_other = stmt_other.executeQuery(sql);
                    rs_other.next();
                    categ = rs_other.getString(1);
                    sql = "SELECT * FROM authors WHERE idAuthors in ( SELECT Autor_ID FROM publisher WHERE ISBN_Books_Publish = " + ISBN + ");";
                    rs_other = stmt_other.executeQuery(sql);
                    rs_other.next();

                    this.auth.setFName(rs_other.getString(2));
                    this.auth.setMName(rs_other.getString(3));
                    this.auth.setLName(rs_other.getString(4));
                    
                    //Initialize Classes Of Books , AUthors ,Category
                    this.bk = new Books(rs_book.getString(2), rs_book.getInt(3), rs_book.getString(4), rs_book.getInt(5), rs_book.getInt(6), rs_book.getDate(7),rs_book.getInt(8));
                    this.categClass = new Category(categ);

                    //Set Info. Of Book Edit
                    title.setText(this.bk.getTitle());
                    copyRightYear.setText(String.valueOf(this.bk.getCopyRightYear()));
                    cost.setText(String.valueOf(this.bk.getCost()));
                    category.setSelectedItem(this.categClass.getName());
                    qnty.setText(String.valueOf(this.bk.getQnty()));
                    publishDate.setDate(this.bk.getDate());
                    publishCountry.setSelectedItem(this.bk.getPublishCountry());
                    authorName.setSelectedItem(this.auth.getFName() + " " + this.auth.getMName() + " " + this.auth.getLName());
                } else {
                    JOptionPane.showMessageDialog(null, "Sorry, This book Is Not Found", "Books List", JOptionPane.INFORMATION_MESSAGE);
                    title.setText("");
                    copyRightYear.setText("");
                    cost.setText("");
                    category.setSelectedIndex(-1);
                    qnty.setText("");
                    publishDate.setDate(null);
                    publishCountry.setSelectedIndex(-1);
                    authorName.setSelectedIndex(-1);
                }
            } catch (NumberFormatException el) {
                JOptionPane.showMessageDialog(null, "Book ID Should Be A Number...", "Invalid Input Of Book ID", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_editBookActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void confirmUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmUpdateActionPerformed
        Connection con = ConnectDatabase.setConnect();
        Statement stmt = null;
        ResultSet rs = null;
        boolean chkOther = false, chkBook = false, chkAuthor = false, chkCategory = false;
        String date_Publish = null;
        String sql = null;
        Date d = new Date();
        SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
        String authName = (String) authorName.getSelectedItem();
        String[] getAuthorName = authName.split(" ");

        //Edit Of Check If There Is No Change In Book Data
        try {
            if (title.getText().equals(this.bk.getTitle()) && Integer.parseInt(cost.getText()) == this.bk.getCost()
                    && Integer.parseInt(qnty.getText()) == this.bk.getQnty() && Integer.parseInt(copyRightYear.getText()) == this.bk.getCopyRightYear()
                    && publishCountry.getSelectedItem().toString().equals(this.bk.getPublishCountry())
                    && category.getSelectedItem().toString().equals(this.categClass.getName())
                    && ((dcn.format(publishDate.getDate()).compareTo(dcn.format(this.bk.getDate()))) == 0)
                    && (getAuthorName[0].equals(this.auth.getFName()) && getAuthorName[1].equals(this.auth.getMName()) && getAuthorName[2].equals(this.auth.getLName()))) {
                JOptionPane.showMessageDialog(null, "There Isn't Change In Book Info...", "Update Information Message", JOptionPane.INFORMATION_MESSAGE);
                chkOther = true;
            }
        } catch (NumberFormatException ex) {

        }catch(NullPointerException ex){
        
        }

        if (title.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Title Name Is Empty", "Invalid Input Title", JOptionPane.INFORMATION_MESSAGE);
            chkOther = true;
        } else {
            this.bk.setTitle(title.getText());
        }

        //Check Cost
        if (cost.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cost Field Is Empty", "Invalid Input Cost", JOptionPane.INFORMATION_MESSAGE);
            chkOther = true;
        } else {
            try {
                if (Integer.parseInt(cost.getText()) < 0) {
                    JOptionPane.showMessageDialog(null, "Cost Field Is Less Than Zero", "Invalid Input Cost", JOptionPane.INFORMATION_MESSAGE);
                    chkOther = true;
                } else {
                    this.bk.setCost(Integer.parseInt(cost.getText()));
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Not A Number", "Invalid Input Cost", JOptionPane.INFORMATION_MESSAGE);
                chkOther = true;
            }
        }

        //Check Total Of Copy
        if (qnty.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Total Copy Field Is Empty", "Invalid Input Total Copy", JOptionPane.INFORMATION_MESSAGE);
            chkOther = true;
        } else {
            try {
                this.bk.setQnty(Integer.parseInt(qnty.getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Not A Number", "Invalid Input Total Copy", JOptionPane.INFORMATION_MESSAGE);
                chkOther = true;
            }
        }

        //Check Total Of Copy
        if (copyRightYear.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Copy Right Year Field Is Empty", "Invalid Input Copy Right Year", JOptionPane.INFORMATION_MESSAGE);
            chkOther = true;
        } else {
            try {
                this.bk.setCopyRightYear(Integer.parseInt(copyRightYear.getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Not A Number", "Invalid Input Copy Right Year", JOptionPane.INFORMATION_MESSAGE);
                chkOther = true;
            }
        }

        if (publishCountry.getSelectedItem().toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Publish Country Isn't Selected", "Invalid Input Copy Right Year", JOptionPane.INFORMATION_MESSAGE);
            chkOther = true;
        } else {
            this.bk.setPublishCountry(publishCountry.getSelectedItem().toString());
        }

        //Check Category
        if (category.getSelectedItem().toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Category Isn't Selected", "Invalid Input Category", JOptionPane.INFORMATION_MESSAGE);
            chkOther = true;
        } else if ((category.getSelectedItem().toString().equals(this.categClass.getName()))) {
            chkCategory = true;
        } else {
            this.categClass.setName(category.getSelectedItem().toString());
        }

        //Check Author Name
        if (authorName.getSelectedItem().toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Author Isn't Selected", "Invalid Input Author", JOptionPane.INFORMATION_MESSAGE);
            chkOther = true;
        } else if ((getAuthorName[0].equals(this.auth.getFName()) && getAuthorName[1].equals(this.auth.getMName()) && getAuthorName[2].equals(this.auth.getLName()))) {
            chkAuthor = true;
        } else {
            authName = (String) authorName.getSelectedItem();
            getAuthorName = authName.split(" ");
        }

        //Check Date
        if (publishDate.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Please Choose Correct Calender Like 01-06-2020", "Invalid Input Calender", JOptionPane.INFORMATION_MESSAGE);
            chkOther = true;
        } else {
            d = publishDate.getDate();
            date_Publish = dcn.format(d);
        }
        System.out.println(chkOther);
        if (!chkOther) {
            try {
                stmt = con.createStatement();
                if (!chkAuthor && !chkCategory) {
                    sql = "UPDATE books SET Title = '" + this.bk.getTitle() + "',CopyRightYear = " + this.bk.getCopyRightYear()
                            + ",PublishCountry = '" + this.bk.getPublishCountry() + "', TotalCopy = " + this.bk.getQnty()
                            + ",Cost = " + this.bk.getCost() + ",PublishDate = '" + this.bk.getDate()
                            + "',Categ_ID = (SELECT idCategory FROM category WHERE Name_C = '" + this.categClass.getName() + "')WHERE ISBN = " + ISBN + ";";
                    System.out.println("Here 1 : " + sql);
                    stmt.executeUpdate(sql);
                    sql = "UPDATE publisher SET Autor_ID = (SELECT idAuthors FROM authors WHERE Fname_A = '" + this.auth.getFName() + "' and Mname_A = '" + this.auth.getMName() + "' and Lname_A = '" + this.auth.getLName() + "') WHERE ISBN_Books_Publish = " + ISBN + ";";
                    stmt.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Book Edited Success...", "Update Information Message", JOptionPane.INFORMATION_MESSAGE);
                    clearData();

                } else if (!chkAuthor && chkCategory) {
                    sql = "UPDATE books SET Title = '" + this.bk.getTitle() + "',CopyRightYear = " + this.bk.getCopyRightYear()
                            + ",PublishCountry = '" + this.bk.getPublishCountry() + "',TotalCopy = " + this.bk.getQnty()
                            + ",Cost = " + this.bk.getCost() + ",PublishDate = '" + this.bk.getDate() + "' WHERE ISBN = " + ISBN + ";";
                    System.out.println("Here 2 : " + sql);
                    stmt.executeUpdate(sql);
                    sql = "UPDATE publisher SET Autor_ID = (SELECT idAuthors FROM authors WHERE Fname_A = '" + this.auth.getFName() + "' and Mname_A = '" + this.auth.getMName() + "' and Lname_A = '" + this.auth.getLName() + "') WHERE ISBN_Books_Publish = " + ISBN + ";";
                    stmt.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Book Edited Success...", "Update Information Message", JOptionPane.INFORMATION_MESSAGE);

                    clearData();
                } else if (chkAuthor && !chkCategory) {
                    sql = "UPDATE books SET Title = '" + this.bk.getTitle() + "',CopyRightYear = " + this.bk.getCopyRightYear()
                            + ",PublishCountry = '" + this.bk.getPublishCountry() + "',TotalCopy = " + this.bk.getQnty()
                            + ",Cost = " + this.bk.getCost() + ",PublishDate = '" + this.bk.getDate()
                            + "',Categ_ID = (SELECT idCategory FROM category WHERE Name_C = '" + this.categClass.getName() + "')WHERE ISBN = " + ISBN + ";";
                    System.out.println("Here 3 : " + sql);
                    stmt.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Book Edited Success...", "Update Information Message", JOptionPane.INFORMATION_MESSAGE);
                    clearData();
                } else {
                    sql = "UPDATE books SET Title = '" + this.bk.getTitle() + "',CopyRightYear = " + this.bk.getCopyRightYear()
                            + ",PublishCountry = '" + this.bk.getPublishCountry() + "',TotalCopy = " + this.bk.getQnty()
                            + ",Cost = " + this.bk.getCost() + ",PublishDate = '" + this.bk.getDate() + "' WHERE ISBN = " + ISBN + ";";
                    System.out.println("Here 4 : " + sql);
                    stmt.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Book Edited Success...", "Update Information Message", JOptionPane.INFORMATION_MESSAGE);
                    clearData();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_confirmUpdateActionPerformed

    private void titlePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_titlePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_titlePropertyChange

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
            java.util.logging.Logger.getLogger(EditBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> authorName;
    private javax.swing.JTextField bookID;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JButton confirmUpdate;
    private javax.swing.JTextField copyRightYear;
    private javax.swing.JTextField cost;
    private javax.swing.JButton editBook;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> publishCountry;
    private com.toedter.calendar.JDateChooser publishDate;
    private javax.swing.JTextField qnty;
    private javax.swing.JTextField title;
    // End of variables declaration//GEN-END:variables
void clearData() {
        bookID.setText("");
        title.setText("");
        copyRightYear.setText("");
        cost.setText("");
        category.setSelectedIndex(-1);
        qnty.setText("");
        publishDate.setDate(null);
        publishCountry.setSelectedIndex(-1);
        authorName.setSelectedIndex(-1);
    }
}
