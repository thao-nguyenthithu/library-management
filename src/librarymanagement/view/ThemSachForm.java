/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarymanagement.view;

import java.time.Year;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import librarymanagement.controller.BookController;
import librarymanagement.model.Book;


public class ThemSachForm extends javax.swing.JFrame {
    private AdminForm adminForm;
    BookController bookController = new BookController();

    public ThemSachForm(AdminForm ad) {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);//center
        this.adminForm = ad;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        text_IdBook = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        text_authorNameBook = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        text_yearBook = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        text_nameBook = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        text_publicNameBook = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JspinnerSoLuongBook = new javax.swing.JSpinner();
        jbtAddSach = new javax.swing.JButton();
        jbtnHuyThemSach = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(625, 400));

        jPanel1.setBackground(new java.awt.Color(28, 28, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 55));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(248, 135, 60));
        jLabel1.setText("THÊM SÁCH MỚI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(28, 28, 102));
        jLabel2.setText("Mã sách");

        text_IdBook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text_IdBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_IdBookActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(28, 28, 102));
        jLabel3.setText("Tác giả");

        text_authorNameBook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(28, 28, 102));
        jLabel4.setText("Năm xuất bản");

        text_yearBook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(28, 28, 102));
        jLabel5.setText("Tên sách");

        text_nameBook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(28, 28, 102));
        jLabel6.setText("Nhà xuất bản");

        text_publicNameBook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(28, 28, 102));
        jLabel7.setText("Số lượng");

        JspinnerSoLuongBook.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jbtAddSach.setBackground(new java.awt.Color(28, 28, 102));
        jbtAddSach.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtAddSach.setForeground(new java.awt.Color(255, 255, 255));
        jbtAddSach.setText("Thêm");
        jbtAddSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddSachActionPerformed(evt);
            }
        });

        jbtnHuyThemSach.setBackground(new java.awt.Color(248, 135, 60));
        jbtnHuyThemSach.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnHuyThemSach.setForeground(new java.awt.Color(255, 255, 255));
        jbtnHuyThemSach.setText("Hủy");
        jbtnHuyThemSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnHuyThemSachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(text_IdBook, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(text_authorNameBook))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JspinnerSoLuongBook, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text_publicNameBook, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text_nameBook, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnHuyThemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116)))
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text_yearBook)
                            .addComponent(jbtAddSach, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(text_IdBook, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_nameBook, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_authorNameBook, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_publicNameBook, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_yearBook, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(JspinnerSoLuongBook, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtAddSach)
                    .addComponent(jbtnHuyThemSach))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_IdBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_IdBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_IdBookActionPerformed

    private void jbtnHuyThemSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnHuyThemSachActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtnHuyThemSachActionPerformed

    private void jbtAddSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddSachActionPerformed
        String idBook = text_IdBook.getText(); 
        String nameBook = text_nameBook.getText(); 
        String authorBook = text_authorNameBook.getText(); 
        String publiBook = text_publicNameBook.getText();
        String yearBook = text_yearBook.getText(); 
        int soLuong = (int)JspinnerSoLuongBook.getValue();
        String soLuongBook = String.valueOf(soLuong);
        
        if(fullFormBook()){
            if(yearBook.matches("\\d{4}")){
                int year = Integer.parseInt(yearBook);
                if(year >= 2000 && year <= Year.now().getValue()){
                    Book b = new Book(idBook, nameBook, authorBook, publiBook, yearBook, soLuongBook);
                    if(checkIdBook(b)){
                        JOptionPane.showMessageDialog(rootPane, "Mã sách đã tồn tại!");                       
                    }else{
                        bookController.addBoook(b);
                        adminForm.showListBook();
                        JOptionPane.showMessageDialog(rootPane, "Thêm sách thành công!");
                        this.dispose();
                        
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Năm xuất bản phải bé hơn hoặc bằng năm hiện tại");
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đúng định dạng năm(vd: 2024)");
            }    
        }else{
            JOptionPane.showMessageDialog(rootPane, "Vui lòng không để trống thông tin sách!");
        }       
    }//GEN-LAST:event_jbtAddSachActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner JspinnerSoLuongBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtAddSach;
    private javax.swing.JButton jbtnHuyThemSach;
    private javax.swing.JTextField text_IdBook;
    private javax.swing.JTextField text_authorNameBook;
    private javax.swing.JTextField text_nameBook;
    private javax.swing.JTextField text_publicNameBook;
    private javax.swing.JTextField text_yearBook;
    // End of variables declaration//GEN-END:variables

    private boolean fullFormBook() {
        return !text_IdBook.getText().isEmpty() && !text_nameBook.getText().isEmpty()
               && !text_authorNameBook.getText().isEmpty() && !text_publicNameBook.getText().isEmpty()
                && !text_yearBook.getText().isEmpty() && !JspinnerSoLuongBook.getValue().toString().isEmpty();
    }

    private boolean checkIdBook(Book b) {
        ArrayList<Book> bookList = bookController.getBookList();
        for(Book book: bookList){
            if(book.getIdBook().equalsIgnoreCase(b.getIdBook())) return true;
        }
        return false;
    }

//    private void showListBook() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
