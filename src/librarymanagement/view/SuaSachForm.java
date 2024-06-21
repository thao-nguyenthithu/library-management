
package librarymanagement.view;

import java.time.Year;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import librarymanagement.controller.BookController;
import librarymanagement.model.Book;


public class SuaSachForm extends javax.swing.JFrame {
    private AdminForm adminForm;
    private int row;
    BookController bookController = new BookController();
    public SuaSachForm(AdminForm adminForm, int row, String id, String name, String tg, String nxb, String namxb, String soluong ) {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);//center
        this.adminForm = adminForm; 
        this.row = row;
        text_IdBook.setText(id);
        text_nameBook.setText(name);
        text_authorNameBook.setText(tg);
        text_publicNameBook.setText(nxb);
        text_yearBook.setText(namxb);
        int soLuongValue = Integer.parseInt(soluong);
        JspinnerSoLuongBook.setValue(soLuongValue);
        bookController.deleteBook(id);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        text_IdBook = new javax.swing.JTextField();
        text_authorNameBook = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        text_nameBook = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        text_yearBook = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        text_publicNameBook = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JspinnerSoLuongBook = new javax.swing.JSpinner();
        jbtLuu = new javax.swing.JButton();
        jbtHuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(625, 400));

        jPanel1.setPreferredSize(new java.awt.Dimension(625, 400));

        jPanel2.setBackground(new java.awt.Color(28, 28, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(248, 135, 60));
        jLabel1.setText("CHỈNH SỬA SÁCH");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(28, 28, 102));
        jLabel2.setText("ID Sách");

        text_IdBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_IdBookActionPerformed(evt);
            }
        });

        text_authorNameBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_authorNameBookActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(28, 28, 102));
        jLabel3.setText("Tác giả");

        text_nameBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nameBookActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(28, 28, 102));
        jLabel4.setText("Tên sách");

        text_yearBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_yearBookActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(28, 28, 102));
        jLabel5.setText("Năm XB");

        text_publicNameBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_publicNameBookActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(28, 28, 102));
        jLabel6.setText("NXB");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(28, 28, 102));
        jLabel7.setText("Số lượng");

        JspinnerSoLuongBook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JspinnerSoLuongBook.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        JspinnerSoLuongBook.setVerifyInputWhenFocusTarget(false);

        jbtLuu.setBackground(new java.awt.Color(28, 28, 102));
        jbtLuu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtLuu.setForeground(new java.awt.Color(255, 255, 255));
        jbtLuu.setText("Lưu");
        jbtLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLuuActionPerformed(evt);
            }
        });

        jbtHuy.setBackground(new java.awt.Color(248, 135, 60));
        jbtHuy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtHuy.setForeground(new java.awt.Color(255, 255, 255));
        jbtHuy.setText("Hủy bỏ");
        jbtHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(text_yearBook, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(text_authorNameBook, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_IdBook, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtLuu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(text_publicNameBook, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JspinnerSoLuongBook, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_nameBook, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jbtHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(text_IdBook, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(text_nameBook, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(text_authorNameBook, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(text_publicNameBook, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JspinnerSoLuongBook, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_yearBook, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(161, 161, 161))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_IdBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_IdBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_IdBookActionPerformed

    private void text_authorNameBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_authorNameBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_authorNameBookActionPerformed

    private void text_nameBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nameBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nameBookActionPerformed

    private void text_yearBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_yearBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_yearBookActionPerformed

    private void text_publicNameBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_publicNameBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_publicNameBookActionPerformed

    private void jbtHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtHuyActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtHuyActionPerformed

    private void jbtLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLuuActionPerformed
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
                        JOptionPane.showMessageDialog(rootPane, "Sửa sách thành công!");
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
    }//GEN-LAST:event_jbtLuuActionPerformed

 


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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtHuy;
    private javax.swing.JButton jbtLuu;
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
        
        
}
