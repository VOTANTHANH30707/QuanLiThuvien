/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package thuvien;

import java.awt.Image;
import java.awt.Toolkit;


public class QuanLyJFrame extends javax.swing.JFrame {


    public QuanLyJFrame() {
        initComponents();
        unit();
        pnlThemSach.setVisible(false);
    }
    
    void unit(){
        Image us = Toolkit.getDefaultToolkit().createImage("src\\Icons\\logo.png");
        this.setIconImage(us);
        setLocationRelativeTo(null);
        setTitle("Quản lý sách");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tbaCongCu = new javax.swing.JToolBar();
        btnThemSach = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnDangXuat = new javax.swing.JButton();
        pnlTrangThai = new javax.swing.JPanel();
        lblDongHo = new javax.swing.JLabel();
        lblTrangThai = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        pnlThemSach = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        pnlThongKe = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSachMat = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtTongSachMat = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSachMat1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txtTongSachMat1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSachMat2 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txtTongSachMat2 = new javax.swing.JTextField();
        pnl = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tbaCongCu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbaCongCu.setRollover(true);
        tbaCongCu.setMargin(new java.awt.Insets(0, 15, 0, 15));

        btnThemSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Add.png"))); // NOI18N
        btnThemSach.setText("Thêm Sách");
        btnThemSach.setFocusable(false);
        btnThemSach.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThemSach.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnThemSach.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThemSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSachActionPerformed(evt);
            }
        });
        tbaCongCu.add(btnThemSach);

        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Statistics.png"))); // NOI18N
        btnThongKe.setText("Thông kê");
        btnThongKe.setFocusable(false);
        btnThongKe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThongKe.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnThongKe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });
        tbaCongCu.add(btnThongKe);
        tbaCongCu.add(jSeparator2);

        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Exit.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbaCongCu.add(btnDangXuat);

        pnlTrangThai.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Alarm.png"))); // NOI18N
        lblDongHo.setText("09:07:47 AM");

        lblTrangThai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User.png"))); // NOI18N
        lblTrangThai.setText("Tên nhân viên");

        javax.swing.GroupLayout pnlTrangThaiLayout = new javax.swing.GroupLayout(pnlTrangThai);
        pnlTrangThai.setLayout(pnlTrangThaiLayout);
        pnlTrangThaiLayout.setHorizontalGroup(
            pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTrangThaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTrangThai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDongHo)
                .addContainerGap())
        );
        pnlTrangThaiLayout.setVerticalGroup(
            pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblDongHo)
                .addComponent(lblTrangThai))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(69, 139, 0));
        jLabel1.setText("THÊM SÁCH MỚI");

        jLabel2.setText("Mã sách:");

        jLabel3.setText("Tên sách:");

        jLabel5.setText("Thể loại:");

        jLabel6.setText("Số lượng:");

        jLabel7.setText("Nhà xuất bản;");

        jLabel8.setText("Năm xuất bản:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Hình");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Accept.png"))); // NOI18N
        btnThem.setText("Thêm");

        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete.png"))); // NOI18N
        btnHuy.setText("Hủy");

        javax.swing.GroupLayout pnlThemSachLayout = new javax.swing.GroupLayout(pnlThemSach);
        pnlThemSach.setLayout(pnlThemSachLayout);
        pnlThemSachLayout.setHorizontalGroup(
            pnlThemSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThemSachLayout.createSequentialGroup()
                .addGroup(pnlThemSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlThemSachLayout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel1))
                    .addGroup(pnlThemSachLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(btnThem)
                        .addGap(90, 90, 90)
                        .addComponent(btnHuy)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlThemSachLayout.createSequentialGroup()
                .addGap(0, 73, Short.MAX_VALUE)
                .addGroup(pnlThemSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlThemSachLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlThemSachLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(26, 26, 26)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlThemSachLayout.createSequentialGroup()
                        .addGroup(pnlThemSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGroup(pnlThemSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlThemSachLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlThemSachLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(pnlThemSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnlThemSachLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        pnlThemSachLayout.setVerticalGroup(
            pnlThemSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThemSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(pnlThemSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlThemSachLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(pnlThemSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem)
                            .addComponent(btnHuy))
                        .addGap(28, 28, 28))
                    .addGroup(pnlThemSachLayout.createSequentialGroup()
                        .addGroup(pnlThemSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlThemSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(17, 17, 17)
                        .addGroup(pnlThemSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(pnlThemSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(pnlThemSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(pnlThemSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.setForeground(new java.awt.Color(39, 139, 0));

        tblSachMat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Sách", "Tên Sách", "Số lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSachMat);

        jLabel10.setText("Tổng:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txtTongSachMat, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(txtTongSachMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("SÁCH MẤT", jPanel1);

        tblSachMat1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Sách", "Tên Sách", "Số lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblSachMat1);

        jLabel11.setText("Tổng:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txtTongSachMat1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(txtTongSachMat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 737, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("SÁCH HỎNG", jPanel3);

        tblSachMat2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Sách", "Tên Sách", "Số lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblSachMat2);

        jLabel12.setText("Tổng:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txtTongSachMat2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(txtTongSachMat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 737, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("SÁCH TRỄ HẠN", jPanel4);

        javax.swing.GroupLayout pnlThongKeLayout = new javax.swing.GroupLayout(pnlThongKe);
        pnlThongKe.setLayout(pnlThongKeLayout);
        pnlThongKeLayout.setHorizontalGroup(
            pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        pnlThongKeLayout.setVerticalGroup(
            pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 255, 102));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/fpt.png"))); // NOI18N
        jLabel17.setText("ĐỂ TẠM VÌ CHƯA CÓ LOGO");

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel17)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(pnlThemSach, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pnlThongKe, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pnl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(pnlThemSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(pnlThemSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane1)
                    .addComponent(tbaCongCu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                    .addComponent(pnlTrangThai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbaCongCu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1)
                .addGap(0, 0, 0)
                .addComponent(pnlTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSachActionPerformed
        pnlThemSach.setVisible(true);
        pnl.setVisible(false);
        pnlThongKe.setVisible(false);
    }//GEN-LAST:event_btnThemSachActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pnl.setVisible(true);
        pnlThemSach.setVisible(false);
        pnlThongKe.setVisible(false);
        
    }//GEN-LAST:event_formWindowOpened

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        pnlThongKe.setVisible(true);
        pnl.setVisible(false);
    }//GEN-LAST:event_btnThongKeActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemSach;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JPanel pnl;
    private javax.swing.JPanel pnlThemSach;
    private javax.swing.JPanel pnlThongKe;
    private javax.swing.JPanel pnlTrangThai;
    private javax.swing.JToolBar tbaCongCu;
    private javax.swing.JTable tblSachMat;
    private javax.swing.JTable tblSachMat1;
    private javax.swing.JTable tblSachMat2;
    private javax.swing.JTextField txtTongSachMat;
    private javax.swing.JTextField txtTongSachMat1;
    private javax.swing.JTextField txtTongSachMat2;
    // End of variables declaration//GEN-END:variables
}
