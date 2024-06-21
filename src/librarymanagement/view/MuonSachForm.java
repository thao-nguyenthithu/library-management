
package librarymanagement.view;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import librarymanagement.controller.ConnectDataBase;
import librarymanagement.controller.DocGiaController;
import librarymanagement.controller.EventBookController;
import librarymanagement.model.DocGia;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import librarymanagement.model.EventMuonTra;


public class MuonSachForm extends javax.swing.JFrame {
    private AdminForm adminForm;
    EventBookController eventbookController = new EventBookController();
    private DocGiaController docGiaController = new DocGiaController();
  
    public MuonSachForm(AdminForm ad) {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);//center
        this.adminForm = ad;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxIDSach = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jText_TenSach = new javax.swing.JTextField();
        jbtMuonSach = new javax.swing.JButton();
        jText_TacGia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jText_IDDocGia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jText_NameDocGia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jText_ngayMuon = new javax.swing.JTextField();
        jButtonHuy = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jText_ngayHenTra = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(625, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(28, 28, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 55));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(248, 135, 60));
        jLabel1.setText("PHIẾU MƯỢN SÁCH");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 625, 56));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(28, 28, 102));
        jLabel2.setText("ID sách");

        jComboBoxIDSach.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxIDSach.setBorder(null);
        jComboBoxIDSach.setPreferredSize(new java.awt.Dimension(72, 100));
        jComboBoxIDSach.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxIDSachFocusGained(evt);
            }
        });
        jComboBoxIDSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxIDSachActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(28, 28, 102));
        jLabel3.setText("Tên sách");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(28, 28, 102));
        jLabel6.setText("Tác giả");

        jText_TenSach.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jText_TenSach.setBorder(null);

        jbtMuonSach.setBackground(new java.awt.Color(28, 28, 102));
        jbtMuonSach.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtMuonSach.setForeground(new java.awt.Color(255, 255, 255));
        jbtMuonSach.setText("Mượn sách");
        jbtMuonSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtMuonSachActionPerformed(evt);
            }
        });

        jText_TacGia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jText_TacGia.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jComboBoxIDSach, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_TacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtMuonSach, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_TenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxIDSach, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jText_TenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_TacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jbtMuonSach)
                .addGap(40, 40, 40))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 62, -1, 338));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(28, 28, 102));
        jLabel4.setText("ID độc giả");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 87, 84, -1));

        jText_IDDocGia.setBackground(new java.awt.Color(231, 230, 230));
        jText_IDDocGia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jText_IDDocGia.setBorder(null);
        jText_IDDocGia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jText_IDDocGiaKeyReleased(evt);
            }
        });
        jPanel1.add(jText_IDDocGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 76, 131, 42));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(28, 28, 102));
        jLabel5.setText("Họ tên");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 142, 89, -1));

        jText_NameDocGia.setBackground(new java.awt.Color(231, 230, 230));
        jText_NameDocGia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jText_NameDocGia.setBorder(null);
        jPanel1.add(jText_NameDocGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 130, 131, 45));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(28, 28, 102));
        jLabel7.setText("Ngày mượn");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 193, 89, 40));

        jText_ngayMuon.setBackground(new java.awt.Color(231, 230, 230));
        jText_ngayMuon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jText_ngayMuon.setBorder(null);
        jText_ngayMuon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jText_ngayMuonFocusLost(evt);
            }
        });
        jPanel1.add(jText_ngayMuon, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 193, 131, 40));

        jButtonHuy.setBackground(new java.awt.Color(248, 135, 60));
        jButtonHuy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonHuy.setForeground(new java.awt.Color(255, 255, 255));
        jButtonHuy.setText("Hủy ");
        jButtonHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHuyActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 333, 130, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(28, 28, 102));
        jLabel8.setText("Ngày hẹn trả");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 250, 105, 44));

        jText_ngayHenTra.setBackground(new java.awt.Color(231, 230, 230));
        jText_ngayHenTra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jText_ngayHenTra.setBorder(null);
        jPanel1.add(jText_ngayHenTra, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 250, 131, 44));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHuyActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonHuyActionPerformed

    private void jComboBoxIDSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxIDSachActionPerformed
        String item = (String) jComboBoxIDSach.getSelectedItem();
        if (item != null) {
            try {
                Connection connection = ConnectDataBase.getConnection();
                String sql = "SELECT titleBook, author FROM Book WHERE idBook = ?";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, item);
                ResultSet resultSet = statement.executeQuery();
                
                if (resultSet.next()) {
                    jText_TenSach.setText(resultSet.getString("titleBook"));
                    jText_TacGia.setText(resultSet.getString("author"));
                    
                }                
                resultSet.close();
                statement.close();
                connection.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jComboBoxIDSachActionPerformed

    private void jComboBoxIDSachFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxIDSachFocusGained
            
        jComboBoxIDSach.removeAllItems();   
        try {
            Connection connection = ConnectDataBase.getConnection();
            String sql = "SELECT idBook FROM Book"; 
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
        
        while (resultSet.next()) {
            String idBook = resultSet.getString("idBook");
            jComboBoxIDSach.addItem(idBook);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception ex) {
        ex.printStackTrace();
        }
        jComboBoxIDSach.setMaximumRowCount(Integer.MIN_VALUE);
    }//GEN-LAST:event_jComboBoxIDSachFocusGained

    private void jbtMuonSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtMuonSachActionPerformed
        String idBook = (String) jComboBoxIDSach.getSelectedItem();
        String nameBook = jText_TenSach.getText();
        String authorBook = jText_TacGia.getText();
        String nameDocGia = jText_NameDocGia.getText(); 
        String idDocGia = jText_IDDocGia.getText(); 
        String ngayMuon = jText_ngayMuon.getText(); 
        String ngayHenTra = jText_ngayHenTra.getText();
        
        if(fullForm()){
            EventMuonTra e = new EventMuonTra(idDocGia, idBook, ngayMuon, ngayHenTra);
            eventbookController.addEventMuonSach(e);
            adminForm.showListEventMuon();
            JOptionPane.showMessageDialog(rootPane, "Mượn sách thành công!");
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Vui lòng không để trống thông tin!");
        }
    }//GEN-LAST:event_jbtMuonSachActionPerformed

    private void jText_IDDocGiaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_IDDocGiaKeyReleased
        String idDocGia = jText_IDDocGia.getText();
        if (!idDocGia.isEmpty()) {
            DocGia docGia = docGiaController.getDocGiaById(idDocGia);
            if (docGia != null) {
                jText_NameDocGia.setText(docGia.getTenDocGia());
            } else {
                jText_NameDocGia.setText("");
            }
        } else {
            jText_NameDocGia.setText("");
        }
    }//GEN-LAST:event_jText_IDDocGiaKeyReleased

    private void jText_ngayMuonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jText_ngayMuonFocusLost
        String text = jText_ngayMuon.getText();
        if (text.length() == 10) { 
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    sdf.setLenient(false);
                    Date ngayMuon = sdf.parse(text);

                    Calendar cal = Calendar.getInstance();
                    cal.setTime(ngayMuon);
                    cal.add(Calendar.DAY_OF_MONTH, 14);
                    jText_ngayHenTra.setText(sdf.format(cal.getTime()));
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(null, "Ngày mượn không hợp lệ, vui lòng nhập lại theo định dạng dd/MM/yyyy");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ngày mượn không hợp lệ, vui lòng nhập lại theo định dạng dd/MM/yyyy");
        }
    }//GEN-LAST:event_jText_ngayMuonFocusLost



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonHuy;
    private javax.swing.JComboBox<String> jComboBoxIDSach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jText_IDDocGia;
    private javax.swing.JTextField jText_NameDocGia;
    private javax.swing.JTextField jText_TacGia;
    private javax.swing.JTextField jText_TenSach;
    private javax.swing.JTextField jText_ngayHenTra;
    private javax.swing.JTextField jText_ngayMuon;
    private javax.swing.JButton jbtMuonSach;
    // End of variables declaration//GEN-END:variables

    private boolean fullForm() {
        return !jText_IDDocGia.getText().isEmpty() &&
               !jText_NameDocGia.getText().isEmpty() &&
               !jText_ngayMuon.getText().isEmpty() &&
               !jText_ngayHenTra.getText().isEmpty() &&
               jComboBoxIDSach.getSelectedItem() != null &&
               !jText_TenSach.getText().isEmpty() &&
               !jText_TacGia.getText().isEmpty();
    }

 
}
