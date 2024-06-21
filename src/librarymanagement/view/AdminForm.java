
package librarymanagement.view;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import librarymanagement.controller.BookController;
import librarymanagement.controller.DocGiaController;
import librarymanagement.controller.EventBookController;
import librarymanagement.controller.LoginController;
import librarymanagement.database.ThongKeDao;
import librarymanagement.model.Book;
import librarymanagement.model.DocGia;
import librarymanagement.model.EventMuonTra;

public class AdminForm extends javax.swing.JFrame {
    BookController bookController = new BookController();
    private DefaultTableModel tableBookModel;
    private DefaultTableModel tableDocGiaModel;
    private DefaultTableModel tableMuonModel;
    private DefaultTableModel tableTraModel;
    private String actionButton = "";
    DocGiaController docgiaController = new DocGiaController();
    EventBookController eventController = new EventBookController();
    ThongKeDao thongke = new ThongKeDao();


    public AdminForm() {
        initComponents();
        jPanelWelcome.setVisible(true);
        jPanelSach.setVisible(false);
        jPanelMuonSach.setVisible(false);
        jPanelTraSach.setVisible(false);
        jPanelDocGia.setVisible(false);
        jPanelThongKe.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupNamNu = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btQLSach = new javax.swing.JLabel();
        btMuonSach = new javax.swing.JLabel();
        btTraSach = new javax.swing.JLabel();
        btQLDocGia = new javax.swing.JLabel();
        btThongKe = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        btDangXuat = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanelWelcome = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanelSach = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jTextFieldSearchBook = new javax.swing.JTextField();
        jbtSearchBook = new javax.swing.JButton();
        jbtThemSach = new javax.swing.JButton();
        jbtSuaBook = new javax.swing.JButton();
        jbtXoaBook = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBook = new javax.swing.JTable();
        jPanelMuonSach = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jbtMuonSach = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableMuon = new javax.swing.JTable();
        jPanelTraSach = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButtonTraSach = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableTraSach = new javax.swing.JTable();
        jPanelDocGia = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableDocGia = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        text_idDocGia = new javax.swing.JTextField();
        text_tenDocGia = new javax.swing.JTextField();
        text_SDT = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton_Nam = new javax.swing.JRadioButton();
        jRadioButton_Nu = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jbtThemDocGia = new javax.swing.JButton();
        jbtSuaDocGia = new javax.swing.JButton();
        jbtXoaDocGia = new javax.swing.JButton();
        jButtonLuuDocGia = new javax.swing.JButton();
        jButtonHuy_DocGia = new javax.swing.JButton();
        jPanelThongKe = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        soLuongSach = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        soLuongDocGia = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        soLuongSachQuaHan = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        soLuongSachMuon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PU-LIC");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(28, 28, 102));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 655));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Trung tâm thư viện Phenikaa Uni");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(248, 135, 60));
        jLabel3.setText("PU-LIC");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        btQLSach.setBackground(new java.awt.Color(255, 153, 51));
        btQLSach.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btQLSach.setForeground(new java.awt.Color(255, 255, 255));
        btQLSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/book (2).png"))); // NOI18N
        btQLSach.setText("  Quản lý sách");
        btQLSach.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 50, 2, 1));
        btQLSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btQLSachMouseClicked(evt);
            }
        });

        btMuonSach.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btMuonSach.setForeground(new java.awt.Color(255, 255, 255));
        btMuonSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/list.png"))); // NOI18N
        btMuonSach.setText("  Quản lý mượn sách");
        btMuonSach.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 50, 2, 1));
        btMuonSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btMuonSachMouseClicked(evt);
            }
        });

        btTraSach.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btTraSach.setForeground(new java.awt.Color(255, 255, 255));
        btTraSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/book (1).png"))); // NOI18N
        btTraSach.setText("  Quản lý trả sách");
        btTraSach.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 50, 2, 1));
        btTraSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btTraSachMouseClicked(evt);
            }
        });

        btQLDocGia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btQLDocGia.setForeground(new java.awt.Color(255, 255, 255));
        btQLDocGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/multiple-users-silhouette.png"))); // NOI18N
        btQLDocGia.setText("  Quản lý độc giả");
        btQLDocGia.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 50, 2, 1));
        btQLDocGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btQLDocGiaMouseClicked(evt);
            }
        });

        btThongKe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btThongKe.setForeground(new java.awt.Color(255, 255, 255));
        btThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/statistical.png"))); // NOI18N
        btThongKe.setText("  Thống kê");
        btThongKe.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 50, 2, 1));
        btThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btThongKeMouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        btDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btDangXuat.setForeground(new java.awt.Color(255, 153, 51));
        btDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout (1).png"))); // NOI18N
        btDangXuat.setText("  Đăng xuất");
        btDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDangXuatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADMIN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btQLSach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btMuonSach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btTraSach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btThongKe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))))
            .addComponent(btQLDocGia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btQLSach)
                .addGap(18, 18, 18)
                .addComponent(btMuonSach)
                .addGap(18, 18, 18)
                .addComponent(btTraSach)
                .addGap(24, 24, 24)
                .addComponent(btQLDocGia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btThongKe)
                .addGap(29, 29, 29)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new javax.swing.OverlayLayout(jPanel1));

        jPanelWelcome.setBackground(new java.awt.Color(255, 204, 204));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bia(1).jpg"))); // NOI18N
        jLabel13.setText("jLabel13");

        javax.swing.GroupLayout jPanelWelcomeLayout = new javax.swing.GroupLayout(jPanelWelcome);
        jPanelWelcome.setLayout(jPanelWelcomeLayout);
        jPanelWelcomeLayout.setHorizontalGroup(
            jPanelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWelcomeLayout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelWelcomeLayout.setVerticalGroup(
            jPanelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWelcomeLayout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelWelcome);

        jPanelSach.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSach.setPreferredSize(new java.awt.Dimension(755, 700));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Quản lý danh sách sách");

        jSeparator2.setForeground(new java.awt.Color(255, 102, 0));

        jTextFieldSearchBook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jbtSearchBook.setBackground(new java.awt.Color(255, 153, 0));
        jbtSearchBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search (1).png"))); // NOI18N
        jbtSearchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSearchBookActionPerformed(evt);
            }
        });

        jbtThemSach.setBackground(new java.awt.Color(28, 28, 102));
        jbtThemSach.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtThemSach.setForeground(new java.awt.Color(255, 255, 255));
        jbtThemSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addadd.png"))); // NOI18N
        jbtThemSach.setText("Thêm");
        jbtThemSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThemSachActionPerformed(evt);
            }
        });

        jbtSuaBook.setBackground(new java.awt.Color(28, 28, 102));
        jbtSuaBook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtSuaBook.setForeground(new java.awt.Color(255, 255, 255));
        jbtSuaBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sửa.png"))); // NOI18N
        jbtSuaBook.setText("Sửa");
        jbtSuaBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSuaBookActionPerformed(evt);
            }
        });

        jbtXoaBook.setBackground(new java.awt.Color(28, 28, 102));
        jbtXoaBook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtXoaBook.setForeground(new java.awt.Color(255, 255, 255));
        jbtXoaBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xoa (2).png"))); // NOI18N
        jbtXoaBook.setText("Xóa");
        jbtXoaBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXoaBookActionPerformed(evt);
            }
        });

        tableBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã sách", "Tên sách", "Tác giả", "Nhà xuất bản", "Năm xuất bản", "Số lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableBook.setGridColor(new java.awt.Color(232, 227, 227));
        tableBook.setRowHeight(30);
        jScrollPane1.setViewportView(tableBook);

        javax.swing.GroupLayout jPanelSachLayout = new javax.swing.GroupLayout(jPanelSach);
        jPanelSach.setLayout(jPanelSachLayout);
        jPanelSachLayout.setHorizontalGroup(
            jPanelSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSachLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSachLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSachLayout.createSequentialGroup()
                        .addGroup(jPanelSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanelSachLayout.createSequentialGroup()
                                .addComponent(jTextFieldSearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jbtSearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                .addComponent(jbtThemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtSuaBook, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtXoaBook, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46))))
        );
        jPanelSachLayout.setVerticalGroup(
            jPanelSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSachLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(jPanelSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtSearchBook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldSearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtThemSach)
                        .addComponent(jbtSuaBook)
                        .addComponent(jbtXoaBook)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanelSach);

        jPanelMuonSach.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMuonSach.setPreferredSize(new java.awt.Dimension(755, 700));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Quản lý mượn sách");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 153, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search (1).png"))); // NOI18N

        jbtMuonSach.setBackground(new java.awt.Color(0, 0, 102));
        jbtMuonSach.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtMuonSach.setForeground(new java.awt.Color(255, 255, 255));
        jbtMuonSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tag.png"))); // NOI18N
        jbtMuonSach.setText("MƯỢN SÁCH");
        jbtMuonSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtMuonSachActionPerformed(evt);
            }
        });

        jSeparator7.setForeground(new java.awt.Color(255, 102, 0));

        tableMuon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID độc giả", "ID sách", "Ngày mượn", "Ngày hẹn trả", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMuon.setRowHeight(30);
        jScrollPane3.setViewportView(tableMuon);

        javax.swing.GroupLayout jPanelMuonSachLayout = new javax.swing.GroupLayout(jPanelMuonSach);
        jPanelMuonSach.setLayout(jPanelMuonSachLayout);
        jPanelMuonSachLayout.setHorizontalGroup(
            jPanelMuonSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMuonSachLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanelMuonSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMuonSachLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMuonSachLayout.createSequentialGroup()
                        .addGroup(jPanelMuonSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelMuonSachLayout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                                .addComponent(jbtMuonSach, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45))))
        );
        jPanelMuonSachLayout.setVerticalGroup(
            jPanelMuonSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMuonSachLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelMuonSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMuonSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(jbtMuonSach, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanelMuonSach);

        jPanelTraSach.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTraSach.setPreferredSize(new java.awt.Dimension(755, 700));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Quản lý trả sách");

        jSeparator5.setForeground(new java.awt.Color(255, 102, 0));

        jButton5.setBackground(new java.awt.Color(255, 102, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search (1).png"))); // NOI18N

        jButtonTraSach.setBackground(new java.awt.Color(0, 0, 102));
        jButtonTraSach.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonTraSach.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTraSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/return (1).png"))); // NOI18N
        jButtonTraSach.setText("TRẢ SÁCH");
        jButtonTraSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTraSachActionPerformed(evt);
            }
        });

        tableTraSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID độc giả", "ID sách", "Ngày mượn", "Ngày hẹn trả", "Ngày trả", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTraSach.setRowHeight(30);
        jScrollPane2.setViewportView(tableTraSach);

        javax.swing.GroupLayout jPanelTraSachLayout = new javax.swing.GroupLayout(jPanelTraSach);
        jPanelTraSach.setLayout(jPanelTraSachLayout);
        jPanelTraSachLayout.setHorizontalGroup(
            jPanelTraSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTraSachLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelTraSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTraSachLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTraSachLayout.createSequentialGroup()
                        .addGroup(jPanelTraSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTraSachLayout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                                .addComponent(jButtonTraSach, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55))))
        );
        jPanelTraSachLayout.setVerticalGroup(
            jPanelTraSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTraSachLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelTraSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(23, 23, 23)
                .addGroup(jPanelTraSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTraSach))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelTraSach);

        jPanelDocGia.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDocGia.setPreferredSize(new java.awt.Dimension(755, 700));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Quản lý độc giả");

        jSeparator6.setForeground(new java.awt.Color(255, 102, 0));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Danh sách độc giả");

        jButton1.setBackground(new java.awt.Color(28, 28, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search (1).png"))); // NOI18N

        tableDocGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Họ tên", "Số điện thoại", "Giới tính"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDocGia.setRowHeight(30);
        jScrollPane4.setViewportView(tableDocGia);

        jPanel6.setBackground(new java.awt.Color(235, 243, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Thông tin độc giả");

        text_idDocGia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID độc giả", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        text_tenDocGia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Họ tên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        text_SDT.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Số điện thoại", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        text_SDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_SDTActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Giới tính");

        buttonGroupNamNu.add(jRadioButton_Nam);
        jRadioButton_Nam.setSelected(true);
        jRadioButton_Nam.setText("Nam");
        jRadioButton_Nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_NamActionPerformed(evt);
            }
        });

        buttonGroupNamNu.add(jRadioButton_Nu);
        jRadioButton_Nu.setText("Nữ");
        jRadioButton_Nu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_NuActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Chức năng");

        jSeparator4.setForeground(new java.awt.Color(255, 204, 153));

        jbtThemDocGia.setBackground(new java.awt.Color(28, 28, 102));
        jbtThemDocGia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtThemDocGia.setForeground(new java.awt.Color(255, 255, 255));
        jbtThemDocGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addadd.png"))); // NOI18N
        jbtThemDocGia.setText("Thêm");
        jbtThemDocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThemDocGiaActionPerformed(evt);
            }
        });

        jbtSuaDocGia.setBackground(new java.awt.Color(28, 28, 102));
        jbtSuaDocGia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtSuaDocGia.setForeground(new java.awt.Color(255, 255, 255));
        jbtSuaDocGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sửa.png"))); // NOI18N
        jbtSuaDocGia.setText("Sửa");
        jbtSuaDocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSuaDocGiaActionPerformed(evt);
            }
        });

        jbtXoaDocGia.setBackground(new java.awt.Color(28, 28, 102));
        jbtXoaDocGia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtXoaDocGia.setForeground(new java.awt.Color(255, 255, 255));
        jbtXoaDocGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xoa (2).png"))); // NOI18N
        jbtXoaDocGia.setText("Xóa");
        jbtXoaDocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXoaDocGiaActionPerformed(evt);
            }
        });

        jButtonLuuDocGia.setBackground(new java.awt.Color(255, 102, 0));
        jButtonLuuDocGia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonLuuDocGia.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLuuDocGia.setText("Lưu");
        jButtonLuuDocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLuuDocGiaActionPerformed(evt);
            }
        });

        jButtonHuy_DocGia.setBackground(new java.awt.Color(28, 28, 102));
        jButtonHuy_DocGia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonHuy_DocGia.setForeground(new java.awt.Color(255, 255, 255));
        jButtonHuy_DocGia.setText("Hủy");
        jButtonHuy_DocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHuy_DocGiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text_idDocGia)
                            .addComponent(text_tenDocGia)
                            .addComponent(text_SDT)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(jRadioButton_Nam, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)))
                                .addComponent(jRadioButton_Nu)
                                .addGap(34, 34, 34))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonHuy_DocGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbtThemDocGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtXoaDocGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbtSuaDocGia, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(jButtonLuuDocGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(27, 27, 27)
                .addComponent(text_idDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(text_tenDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(text_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_Nam, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_Nu))
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtThemDocGia)
                    .addComponent(jbtSuaDocGia))
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtXoaDocGia)
                    .addComponent(jButtonLuuDocGia))
                .addGap(32, 32, 32)
                .addComponent(jButtonHuy_DocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelDocGiaLayout = new javax.swing.GroupLayout(jPanelDocGia);
        jPanelDocGia.setLayout(jPanelDocGiaLayout);
        jPanelDocGiaLayout.setHorizontalGroup(
            jPanelDocGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDocGiaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE))
            .addGroup(jPanelDocGiaLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDocGiaLayout.setVerticalGroup(
            jPanelDocGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDocGiaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelDocGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelDocGia);

        jPanelThongKe.setBackground(new java.awt.Color(227, 241, 255));
        jPanelThongKe.setPreferredSize(new java.awt.Dimension(755, 700));

        jPanel4.setBackground(new java.awt.Color(255, 204, 153));
        jPanel4.setForeground(new java.awt.Color(153, 153, 153));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Số lượng Sách");

        soLuongSach.setFont(new java.awt.Font("Viner Hand ITC", 1, 48)); // NOI18N
        soLuongSach.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soLuongSach.setText("10");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(soLuongSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(soLuongSach)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(204, 255, 204));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Số Độc Giả");

        soLuongDocGia.setFont(new java.awt.Font("Viner Hand ITC", 1, 48)); // NOI18N
        soLuongDocGia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soLuongDocGia.setText("3");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(soLuongDocGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(soLuongDocGia)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 204));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Sách Quá Hạn");

        soLuongSachQuaHan.setFont(new java.awt.Font("Viner Hand ITC", 1, 48)); // NOI18N
        soLuongSachQuaHan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soLuongSachQuaHan.setText("1");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(soLuongSachQuaHan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(soLuongSachQuaHan)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Sách Đang Mượn");

        soLuongSachMuon.setFont(new java.awt.Font("Viner Hand ITC", 1, 48)); // NOI18N
        soLuongSachMuon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soLuongSachMuon.setText("1");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(soLuongSachMuon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(soLuongSachMuon)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanelThongKeLayout = new javax.swing.GroupLayout(jPanelThongKe);
        jPanelThongKe.setLayout(jPanelThongKeLayout);
        jPanelThongKeLayout.setHorizontalGroup(
            jPanelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelThongKeLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(jPanelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(104, 104, 104))
        );
        jPanelThongKeLayout.setVerticalGroup(
            jPanelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelThongKeLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(258, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelThongKe);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQLSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btQLSachMouseClicked
        jPanelSach.setVisible(true); 
        jPanelWelcome.setVisible(false);
        jPanelMuonSach.setVisible(false);
        jPanelTraSach.setVisible(false);
        jPanelDocGia.setVisible(false);
        jPanelThongKe.setVisible(false);
        
        btQLSach.setOpaque(true);// Để JLabel có thể thay đổi màu nền
        btQLSach.setBackground(new Color(248,135,60));
        btMuonSach.setBackground(new Color(28,28,102));
        btTraSach.setBackground(new Color(28,28,102));
        btQLDocGia.setBackground(new Color(28,28,102));
        btThongKe.setBackground(new Color(28,28,102));
        
        showListBook();
    }//GEN-LAST:event_btQLSachMouseClicked

    private void btMuonSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMuonSachMouseClicked
        jPanelSach.setVisible(false); 
        jPanelWelcome.setVisible(false);
        jPanelMuonSach.setVisible(true);
        jPanelTraSach.setVisible(false);
        jPanelDocGia.setVisible(false);
        jPanelThongKe.setVisible(false);
        
        btMuonSach.setOpaque(true);// Để JLabel có thể thay đổi màu nền
        btMuonSach.setBackground(new Color(248,135,60));
        btQLSach.setBackground(new Color(28,28,102));
        btTraSach.setBackground(new Color(28,28,102));
        btQLDocGia.setBackground(new Color(28,28,102));
        btThongKe.setBackground(new Color(28,28,102));
        
        showListEventMuon();
    }//GEN-LAST:event_btMuonSachMouseClicked

    private void btTraSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTraSachMouseClicked
        jPanelSach.setVisible(false); 
        jPanelWelcome.setVisible(false);
        jPanelMuonSach.setVisible(false);
        jPanelTraSach.setVisible(true);
        jPanelDocGia.setVisible(false);
        jPanelThongKe.setVisible(false);
        
        btTraSach.setOpaque(true);// Để JLabel có thể thay đổi màu nền
        btTraSach.setBackground(new Color(248,135,60));
        btQLSach.setBackground(new Color(28,28,102));
        btMuonSach.setBackground(new Color(28,28,102));
        btQLDocGia.setBackground(new Color(28,28,102));
        btThongKe.setBackground(new Color(28,28,102));
        
        showListEventTra();
    }//GEN-LAST:event_btTraSachMouseClicked

    private void btQLDocGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btQLDocGiaMouseClicked
        jPanelSach.setVisible(false); 
        jPanelWelcome.setVisible(false);
        jPanelMuonSach.setVisible(false);
        jPanelTraSach.setVisible(false);
        jPanelDocGia.setVisible(true);
        jPanelThongKe.setVisible(false);
        
        btQLDocGia.setOpaque(true);// Để JLabel có thể thay đổi màu nền
        btQLDocGia.setBackground(new Color(248,135,60));
        btQLSach.setBackground(new Color(28,28,102));
        btMuonSach.setBackground(new Color(28,28,102));
        btTraSach.setBackground(new Color(28,28,102));
        btThongKe.setBackground(new Color(28,28,102));
        
        showListDocGia();
    }//GEN-LAST:event_btQLDocGiaMouseClicked

    private void btThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThongKeMouseClicked
        jPanelSach.setVisible(false); 
        jPanelWelcome.setVisible(false);
        jPanelMuonSach.setVisible(false);
        jPanelTraSach.setVisible(false);
        jPanelDocGia.setVisible(false);
        jPanelThongKe.setVisible(true);
        
        btThongKe.setOpaque(true);// Để JLabel có thể thay đổi màu nền
        btThongKe.setBackground(new Color(248,135,60));
        btQLSach.setBackground(new Color(28,28,102));
        btMuonSach.setBackground(new Color(28,28,102));
        btTraSach.setBackground(new Color(28,28,102));
        btQLDocGia.setBackground(new Color(28,28,102));
        
        updateThongKe();
    }//GEN-LAST:event_btThongKeMouseClicked

    private void btDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDangXuatMouseClicked
        int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn Đăng Xuất?", 
				                    "Exit", JOptionPane.YES_NO_OPTION);		
        if(option == JOptionPane.YES_OPTION) {
            this.dispose();
            LoginForm loginView = new LoginForm();
            LoginController loginController = new LoginController(loginView);
            loginController.showLoginView(); 
        }
    }//GEN-LAST:event_btDangXuatMouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked

    }//GEN-LAST:event_jPanel3MouseClicked

    private void jbtSearchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSearchBookActionPerformed
        ArrayList<Book> bookList = null; 
        if(jbtSearchBook.getText().equals("")){
            bookList = bookController.getBookList();
        }else{
            bookList = bookController.showBookSearch(jTextFieldSearchBook.getText());                 
        }
        String[] columnNames = {"Mã sách", "Tên sách", "Tác giả", "Nhà xuất bản","Năm xuất bản","Số lượng"};
        tableBookModel = new DefaultTableModel();
        tableBookModel.setColumnIdentifiers(columnNames);
        tableBook.setModel(tableBookModel);
        for(Book b: bookList){
            tableBookModel.addRow(new Object[]{
                b.getIdBook(),b.getTitleBook(),b.getAuthor(),b.getPublisher(),b.getYearPublicationBook(),b.getSoLuongBook()
            });
        }
        tableBookModel.fireTableDataChanged();     
    }//GEN-LAST:event_jbtSearchBookActionPerformed

    private void text_SDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_SDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_SDTActionPerformed

    private void jRadioButton_NamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_NamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_NamActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jRadioButton_NuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_NuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_NuActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        jPanelSach.setVisible(false); 
        jPanelWelcome.setVisible(true);
        jPanelMuonSach.setVisible(false);
        jPanelTraSach.setVisible(false);
        jPanelDocGia.setVisible(false);
        jPanelThongKe.setVisible(false);
        
        btQLSach.setBackground(new Color(28,28,102));
        btMuonSach.setBackground(new Color(28,28,102));
        btTraSach.setBackground(new Color(28,28,102));
        btQLDocGia.setBackground(new Color(28,28,102));
        btThongKe.setBackground(new Color(28,28,102));
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jbtThemSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThemSachActionPerformed
        new ThemSachForm(this); 
    }//GEN-LAST:event_jbtThemSachActionPerformed

    private void jbtMuonSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtMuonSachActionPerformed
        new MuonSachForm(this);
        
    }//GEN-LAST:event_jbtMuonSachActionPerformed

    private void jbtXoaBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXoaBookActionPerformed
        tableBookModel = (DefaultTableModel) tableBook.getModel(); 
        int i_row = tableBook.getSelectedRow();
        if(i_row != -1) {
            String bookId = (String)tableBook.getValueAt(i_row, 0);
            int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa Sách đã chọn?", "Xóa sách", JOptionPane.YES_NO_OPTION);		
            if(option == JOptionPane.YES_OPTION) {
		bookController.deleteBook(bookId);
		showListBook();
		JOptionPane.showMessageDialog(rootPane, "Xóa sách thành công!");
            }
            i_row = -1;
        }else {
		JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn sách muốn xóa!");
        }
    }//GEN-LAST:event_jbtXoaBookActionPerformed

    private void jbtSuaBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSuaBookActionPerformed
        tableBookModel = (DefaultTableModel) tableBook.getModel(); 
        int i_row = tableBook.getSelectedRow(); 
        if(i_row != -1){
            String idBook = (String)tableBook.getValueAt(i_row, 0);
            String nameBook = (String)tableBook.getValueAt(i_row, 1);
            String tgBook = (String)tableBook.getValueAt(i_row, 2);
            String nxbBook = (String)tableBook.getValueAt(i_row, 3);
            String year = (String)tableBook.getValueAt(i_row, 4);
            String soluong = (String)tableBook.getValueAt(i_row, 5);
            new SuaSachForm(this,i_row, idBook, nameBook, tgBook, nxbBook, year, soluong);
        }else{ 
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn sách cần sửa!");
        }
    }//GEN-LAST:event_jbtSuaBookActionPerformed

    private void jbtThemDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThemDocGiaActionPerformed
        actionButton = "themDocGia";
        DocGia docGia = new DocGia();
        if(fullDocGia()){
            docGia.setIdDocGia(text_idDocGia.getText());
            docGia.setTenDocGia(text_tenDocGia.getText());
            String phone = text_SDT.getText().replaceAll("\\s+", "");
            if (jRadioButton_Nam.isSelected()) {
	        docGia.setGioiTinh(jRadioButton_Nam.getText());
	    } else if (jRadioButton_Nu.isSelected()) {
	        docGia.setGioiTinh(jRadioButton_Nu.getText());
	    }
            if(phone.length() == 10){
                docGia.setSoDienthoai(phone);
                if(checkIdDocGia(docGia)){
                    JOptionPane.showMessageDialog(rootPane, "Mã độc giả đã tồn tại!");
                }else{             
	            docgiaController.addDocGia(docGia);
	            showListDocGia();
	            removeFormDocGia();
	            JOptionPane.showMessageDialog(rootPane, "Thêm độc giả thành công!");
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Số điện thoại không hợp lệ. Vui lòng nhập lại.");
            }                   
        }else{
            JOptionPane.showMessageDialog(rootPane, "Vui lòng không để trống thông tin!");
        }
                
    }//GEN-LAST:event_jbtThemDocGiaActionPerformed

    private void jButtonHuy_DocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHuy_DocGiaActionPerformed
        removeFormDocGia();
    }//GEN-LAST:event_jButtonHuy_DocGiaActionPerformed

    private void jbtSuaDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSuaDocGiaActionPerformed
        tableDocGiaModel = (DefaultTableModel) tableDocGia.getModel(); 
        int i_row = tableDocGia.getSelectedRow(); 
        if(i_row != -1){
            String idDocGia = (String)tableDocGia.getValueAt(i_row, 0);
            String nameDocGia = (String)tableDocGia.getValueAt(i_row, 1);
            String phoneDocGia = (String)tableDocGia.getValueAt(i_row, 2);
            String gioiTinh = (String)tableDocGia.getValueAt(i_row, 3);
            
            // Cập nhật các thành phần của form với giá trị từ bảng
            text_idDocGia.setText(idDocGia);
            text_tenDocGia.setText(nameDocGia);
            text_SDT.setText(phoneDocGia);
            if (gioiTinh.equals("Nam")) {
                jRadioButton_Nam.setSelected(true);
                jRadioButton_Nu.setSelected(false);
            } else if (gioiTinh.equals("Nữ")) {
                jRadioButton_Nu.setSelected(true);
                jRadioButton_Nam.setSelected(false);
            }
            actionButton = "suaDocGia";
            docgiaController.deleteDocGia(idDocGia);
        }else{ 
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn độc giả cần sửa!");
        }
    }//GEN-LAST:event_jbtSuaDocGiaActionPerformed

    private void jbtXoaDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXoaDocGiaActionPerformed
        tableDocGiaModel = (DefaultTableModel) tableDocGia.getModel(); 
        int i_row = tableDocGia.getSelectedRow();
        if(i_row != -1) {
            String idDocGia = (String)tableDocGia.getValueAt(i_row, 0);
            int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa Độc Giả đã chọn?", "Xóa độc giả", JOptionPane.YES_NO_OPTION);		
            if(option == JOptionPane.YES_OPTION) {
		docgiaController.deleteDocGia(idDocGia);
		showListDocGia();
		JOptionPane.showMessageDialog(rootPane, "Xóa độc giả thành công!");
            }
            i_row = -1;
        }else {
		JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn độc giả muốn xóa!");
        }
    }//GEN-LAST:event_jbtXoaDocGiaActionPerformed

    private void jButtonLuuDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLuuDocGiaActionPerformed
        if(actionButton.equals("suaDocGia")){
            DocGia docGia = new DocGia();
            if(fullDocGia()){
                docGia.setIdDocGia(text_idDocGia.getText());
                docGia.setTenDocGia(text_tenDocGia.getText());
                String phone = text_SDT.getText().replaceAll("\\s+", "");
                if (jRadioButton_Nam.isSelected()) {
                    docGia.setGioiTinh(jRadioButton_Nam.getText());
                } else if(jRadioButton_Nu.isSelected()) {
                    docGia.setGioiTinh(jRadioButton_Nu.getText());
                }
                if(phone.length() == 10){
                    docGia.setSoDienthoai(phone);
                    if(checkIdDocGia(docGia)){
                        JOptionPane.showMessageDialog(rootPane, "Mã độc giả đã tồn tại!");
                    }else{
                        docgiaController.addDocGia(docGia);
                        showListDocGia();
                        removeFormDocGia();
                        JOptionPane.showMessageDialog(rootPane, "Cập nhật thông tin độc giả thành công!");
                        actionButton = "";
                    }                        
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Số điện thoại không hợp lệ. Vui lòng nhập lại.");
                }                   
            }else{
                JOptionPane.showMessageDialog(rootPane, "Vui lòng không để trống thông tin!");
            }
        }     
    }//GEN-LAST:event_jButtonLuuDocGiaActionPerformed

    private void jButtonTraSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTraSachActionPerformed
        int selectedRow = tableTraSach.getSelectedRow();
        if (selectedRow != -1) {
            String idDocGia = (String) tableTraSach.getValueAt(selectedRow, 0);
            String idSach = (String) tableTraSach.getValueAt(selectedRow, 1);
            String ngayMuon = (String) tableTraSach.getValueAt(selectedRow, 2);
            String ngayHenTra = (String) tableTraSach.getValueAt(selectedRow, 3);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String ngayTra = sdf.format(new Date());
            String status = "đã trả";
            EventMuonTra event = new EventMuonTra(idDocGia, idSach, ngayMuon, ngayHenTra, ngayTra,status);
            eventController.updateEventMuonTra(event); 
            showListEventMuon();
            showListEventTra();           
            JOptionPane.showMessageDialog(rootPane, "Trả sách thành công!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn một hàng để trả sách!");
        }
    }//GEN-LAST:event_jButtonTraSachActionPerformed


    public void updateThongKe() {
    int slSach = thongke.getSoLuongSach();
    int slDocGia = thongke.getSoLuongDocGia();
    int slSachDangMuon = thongke.getSoLuongSachDangMuon();
    int slSachQuaHan = thongke.getSoLuongSachQuaHan();
    
    soLuongSach.setText(String.valueOf(slSach));
    soLuongDocGia.setText(String.valueOf(slDocGia));
    soLuongSachMuon.setText(String.valueOf(slSachDangMuon));
    soLuongSachQuaHan.setText(String.valueOf(slSachQuaHan));
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btDangXuat;
    private javax.swing.JLabel btMuonSach;
    private javax.swing.JLabel btQLDocGia;
    private javax.swing.JLabel btQLSach;
    private javax.swing.JLabel btThongKe;
    private javax.swing.JLabel btTraSach;
    private javax.swing.ButtonGroup buttonGroupNamNu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonHuy_DocGia;
    private javax.swing.JButton jButtonLuuDocGia;
    private javax.swing.JButton jButtonTraSach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelDocGia;
    private javax.swing.JPanel jPanelMuonSach;
    private javax.swing.JPanel jPanelSach;
    private javax.swing.JPanel jPanelThongKe;
    private javax.swing.JPanel jPanelTraSach;
    private javax.swing.JPanel jPanelWelcome;
    private javax.swing.JRadioButton jRadioButton_Nam;
    private javax.swing.JRadioButton jRadioButton_Nu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextFieldSearchBook;
    private javax.swing.JButton jbtMuonSach;
    private javax.swing.JButton jbtSearchBook;
    private javax.swing.JButton jbtSuaBook;
    private javax.swing.JButton jbtSuaDocGia;
    private javax.swing.JButton jbtThemDocGia;
    private javax.swing.JButton jbtThemSach;
    private javax.swing.JButton jbtXoaBook;
    private javax.swing.JButton jbtXoaDocGia;
    private javax.swing.JLabel soLuongDocGia;
    private javax.swing.JLabel soLuongSach;
    private javax.swing.JLabel soLuongSachMuon;
    private javax.swing.JLabel soLuongSachQuaHan;
    private javax.swing.JTable tableBook;
    private javax.swing.JTable tableDocGia;
    private javax.swing.JTable tableMuon;
    private javax.swing.JTable tableTraSach;
    private javax.swing.JTextField text_SDT;
    private javax.swing.JTextField text_idDocGia;
    private javax.swing.JTextField text_tenDocGia;
    // End of variables declaration//GEN-END:variables

    public void showListBook(){
        ArrayList<Book> listBook = bookController.getBookList();
        tableBookModel = (DefaultTableModel) tableBook.getModel();
        tableBookModel.setRowCount(0);
        for(Book b: listBook){
            tableBookModel.addRow(new Object[]{
                b.getIdBook(), b.getTitleBook(), b.getAuthor(), b.getPublisher(), b.getYearPublicationBook(), b.getSoLuongBook()
            });           
        }
        tableBookModel.fireTableDataChanged();
    }
    
    
    private boolean fullDocGia() {
        return !text_tenDocGia.getText().isEmpty() && !text_idDocGia.getText().isEmpty()
                && !text_SDT.getText().isEmpty();
    }

    private void showListDocGia() {
        ArrayList<DocGia> listDocGia = docgiaController.getDocGia();
        tableDocGiaModel = (DefaultTableModel) tableDocGia.getModel();
        tableDocGiaModel.setRowCount(0);
        for(DocGia b: listDocGia){
            tableDocGiaModel.addRow(new Object[]{
                b.getIdDocGia(), b.getTenDocGia(), b.getSoDienthoai(), b.getGioiTinh()
            });           
        }
        tableDocGiaModel.fireTableDataChanged();
    }

    private void removeFormDocGia() {
        text_idDocGia.setText("");
        text_tenDocGia.setText("");
        text_SDT.setText("");
        jRadioButton_Nam.setSelected(true);
        jRadioButton_Nu.setSelected(false);
    }

    private boolean checkIdDocGia(DocGia docGia) {
        ArrayList<DocGia> listDocGia = docgiaController.getDocGia();
        for(DocGia d: listDocGia){
            if(d.getIdDocGia().equals(docGia.getIdDocGia())) return true;
        }
        return false;
    }

    void showListEventMuon() {
        ArrayList<EventMuonTra> listEvent = eventController.getEventMuonList();
        tableMuonModel = (DefaultTableModel) tableMuon.getModel();
        tableMuonModel.setRowCount(0);
        for(EventMuonTra e: listEvent){
            tableMuonModel.addRow(new Object[]{
                e.getIdDocGia(), e.getIdSach(), e.getNgayMuon(), e.getNgayHenTra(), e.getStatus()
            });           
        }
        tableMuonModel.fireTableDataChanged();
    }
        
    void showListEventTra() {
        ArrayList<EventMuonTra> listEvent = eventController.getEventTraList();
        tableTraModel = (DefaultTableModel) tableTraSach.getModel();
        tableTraModel.setRowCount(0);
        for(EventMuonTra e: listEvent){
            tableTraModel.addRow(new Object[]{
                e.getIdDocGia(), e.getIdSach(), e.getNgayMuon(), e.getNgayHenTra(),e.getNgayTra(), e.getStatus()
            });           
        }
        tableTraModel.fireTableDataChanged();
    }
    

}
