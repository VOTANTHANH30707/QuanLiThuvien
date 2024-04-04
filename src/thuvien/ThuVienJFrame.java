/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package thuvien;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import thuvien.DAO.DocGiaDAO;
import thuvien.entity.DocGia;
import thuvien.utils.DateHelper;
import thuvien.utils.MsgBox;
import thuvien.utils.XDate;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import thuvien.utils.CONNECT_SQL1;
import thuvien.utils.XImage;

/**
 *
 * @author DIEUMY
 */
public class ThuVienJFrame extends javax.swing.JFrame {

    public ThuVienJFrame() {
        initComponents();
        unit();
    }
    DocGiaDAO dao = new DocGiaDAO();
    Connection conn = null;
    JFileChooser jf = new JFileChooser();
    String imageName = "";

    void unit() {
        conn = CONNECT_SQL1.getConnection("sa", "songlong", "QLThuVien_SOF102");
        Image us = Toolkit.getDefaultToolkit().createImage("src\\Icons\\logo.png");
        this.setIconImage(us);
        setLocationRelativeTo(null);
        setTitle("TÊN THƯ VIỆN");
    }

    void chonAnh() {
        if (jf.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = jf.getSelectedFile();
            XImage.save(file);
            ImageIcon icon = XImage.read(file.getName());
            lblAnh.setIcon(icon);
            lblAnh.setToolTipText(file.getName());
            file = new File(imageName);
        }
    }

    public void insert() {
        //vo thanh
        String Ho = null;
        String Ten = null;
        int viTriCuoi = txtHoTen.getText().lastIndexOf(' ');
        if (viTriCuoi != -1) {
            Ho = txtHoTen.getText().substring(0, viTriCuoi);
            Ten = txtHoTen.getText().substring(viTriCuoi + 1);
        }
        try {
            String sql = "insert into DOCGIA values(?,?,?,?,?,?,?)";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, txtMaDG.getText());
            st.setString(2, Ho);
            st.setString(3, Ten);
            st.setString(4, txtCCCD.getText());
            st.setString(5, txtEmail.getText());
            st.setString(6, txtDiaChi.getText());
            st.setDate(7, (Date) DateHelper.toDate(txtNgayCap.getText()));
            st.setDate(8, (Date) DateHelper.toDate(txtHSD.getText()));
            st.setString(9, imageName);
            st.executeUpdate();
            MsgBox.alert(this, "Them Thanh Cong");
            st.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
//    public void insert() throws SQLException {
//
//        String hoDG = null, tenDG = null;
//
//        int lastIndex = txtHoTen.getText().lastIndexOf(' ');
//        if (lastIndex != -1) {
//            // Sử dụng phương thức substring() để lấy phần của chuỗi từ vị trí cuối cùng đến hết
//            tenDG = txtHoTen.getText().substring(lastIndex + 1);
//            hoDG = txtHoTen.getText().substring(0, lastIndex);
//        }
//        String insertSQL = " insert into DOCGIA values\n"
//                
//                + "  ('" + txtMaDG.getText() + "',N'" + hoDG + "',N'" + tenDG + "',"
//                + "'" + txtCCCD.getText() + "','" + txtEmail.getText() + "',N'" + txtDiaChi.getText() + "',"
//                + "'" + txtNgayCap.getText() + "','" + txtHSD.getText() + "','" + imageName + "');";
//        Statement st = conn.createStatement();
//        int soDong = st.executeUpdate(insertSQL);
//        if (soDong > 0) {
//            chonAnh();
//            JOptionPane.showMessageDialog(this, "Đã thêm thành công!");
//        } else {
//            JOptionPane.showMessageDialog(this, "Đã thêm thất bại");
//        }
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbaCongCu = new javax.swing.JToolBar();
        btnDocGia = new javax.swing.JButton();
        btnLePhi = new javax.swing.JButton();
        btnTaoThe = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnDangXuat = new javax.swing.JButton();
        pnlTrangThai = new javax.swing.JPanel();
        lblDongHo = new javax.swing.JLabel();
        lblTrangThai = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        pnl = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        pnlDocGia = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSachMuon = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        btnLapPhieuTra = new javax.swing.JButton();
        btnLapPM = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        lblHinh2 = new javax.swing.JLabel();
        pnlLePhi = new javax.swing.JPanel();
        txtNgayCap1 = new javax.swing.JTextField();
        lblMaThe = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtNgayHetHan = new javax.swing.JTextField();
        txtLePhi = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtGiaHan = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        lblMaDG = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        lblHovaTeb = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        lblCCCD = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        lblNgayCap = new javax.swing.JLabel();
        lblHSD = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        lblHinh1 = new javax.swing.JLabel();
        pnlTaoThe = new javax.swing.JPanel();
        pnlTaoThe1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        txtMaDG = new javax.swing.JTextField();
        txtCCCD = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtNgayCap = new javax.swing.JTextField();
        txtHSD = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pnlAnh = new javax.swing.JPanel();
        lblAnh = new javax.swing.JLabel();
        btnTaoThe1 = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtDiaChi = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        pnlPhieuMuon = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblThongTinSach = new javax.swing.JTable();
        btnCancelsach = new javax.swing.JButton();
        btnOksach = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtSearch1 = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        btnOkPhieu = new javax.swing.JButton();
        btnCancelPhieu = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        pnlPhieuTraPhat = new javax.swing.JPanel();
        pnlPTra4 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        txtMaPhieuTra5 = new javax.swing.JTextField();
        txtMaPhieuMuon4 = new javax.swing.JTextField();
        txtMasach5 = new javax.swing.JTextField();
        txtTenSach4 = new javax.swing.JTextField();
        txtNgayMuon4 = new javax.swing.JTextField();
        txtNgayTra4 = new javax.swing.JTextField();
        lblCanhBaoQuaHan = new javax.swing.JLabel();
        btnLapPhieuPhat4 = new javax.swing.JButton();
        btnTraSach4 = new javax.swing.JButton();
        tbnCancelPhat1 = new javax.swing.JButton();
        pnlPPhat = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtMaphieuphat = new javax.swing.JTextField();
        txtMaphieutra2 = new javax.swing.JTextField();
        txtMasach2 = new javax.swing.JTextField();
        txtNgayPhat = new javax.swing.JTextField();
        cboLyDo = new javax.swing.JComboBox<>();
        txtPhi = new javax.swing.JTextField();
        txtMaNhanVien = new javax.swing.JTextField();
        tbnCancelPhat = new javax.swing.JButton();
        btnOkphat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tbaCongCu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbaCongCu.setRollover(true);
        tbaCongCu.setMargin(new java.awt.Insets(0, 15, 0, 15));

        btnDocGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User group.png"))); // NOI18N
        btnDocGia.setText("  Đọc giả  ");
        btnDocGia.setFocusable(false);
        btnDocGia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDocGia.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnDocGia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocGiaActionPerformed(evt);
            }
        });
        tbaCongCu.add(btnDocGia);

        btnLePhi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Money.png"))); // NOI18N
        btnLePhi.setText("   Lệ phí    ");
        btnLePhi.setFocusable(false);
        btnLePhi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLePhi.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnLePhi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLePhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLePhiActionPerformed(evt);
            }
        });
        tbaCongCu.add(btnLePhi);

        btnTaoThe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Clipboard.png"))); // NOI18N
        btnTaoThe.setText("Tạo thẻ TV");
        btnTaoThe.setFocusable(false);
        btnTaoThe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTaoThe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTaoThe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoTheActionPerformed(evt);
            }
        });
        tbaCongCu.add(btnTaoThe);
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
                .addContainerGap(302, Short.MAX_VALUE))
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel17)
                .addContainerGap(227, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(69, 139, 0))); // NOI18N

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Search.png"))); // NOI18N
        jButton6.setText("Tìm");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField6)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sách đã mượn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(69, 139, 0))); // NOI18N

        tblSachMuon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã PM", "Mã Sách", "Tên Sách", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSachMuon);

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Còn hạn");
        jCheckBox1.setEnabled(false);

        jCheckBox2.setText("Hết hạn");
        jCheckBox2.setEnabled(false);

        btnLapPhieuTra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Notes.png"))); // NOI18N
        btnLapPhieuTra.setText("Lập phiếu trả");
        btnLapPhieuTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLapPhieuTraActionPerformed(evt);
            }
        });

        btnLapPM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Remove from basket.png"))); // NOI18N
        btnLapPM.setText("Lập phiếu mượn");
        btnLapPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLapPMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnLapPhieuTra)
                .addGap(31, 31, 31)
                .addComponent(btnLapPM)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox2)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLapPhieuTra)
                    .addComponent(btnLapPM))
                .addGap(81, 81, 81))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin đọc giả", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(69, 139, 0))); // NOI18N

        jLabel18.setText("Mã đọc giả:");

        jLabel51.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(69, 139, 0));
        jLabel51.setText("DG123456");

        jLabel52.setText("Họ và tên:");

        jLabel53.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(69, 139, 0));
        jLabel53.setText("DG123456");

        jLabel54.setText("CCCD:");

        jLabel55.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(69, 139, 0));
        jLabel55.setText("DG123456");

        jLabel56.setText("Địa chỉ:");

        jLabel57.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(69, 139, 0));
        jLabel57.setText("DG123456");

        jLabel58.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(69, 139, 0));
        jLabel58.setText("DG123456");

        jLabel59.setText("Email:");

        jLabel60.setText("Ngày cấp:");

        jLabel61.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(69, 139, 0));
        jLabel61.setText("DG123456");

        jLabel62.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(69, 139, 0));
        jLabel62.setText("DG123456");

        jLabel63.setText("Giá trị đến:");

        lblHinh2.setText("Hình");
        lblHinh2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(jLabel59)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(jLabel56)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(jLabel54)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel60)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(lblHinh2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel63)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel51)
                    .addComponent(jLabel52)
                    .addComponent(jLabel53))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jLabel55))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jLabel57))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jLabel58))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(jLabel61)
                    .addComponent(jLabel63)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHinh2, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlDocGiaLayout = new javax.swing.GroupLayout(pnlDocGia);
        pnlDocGia.setLayout(pnlDocGiaLayout);
        pnlDocGiaLayout.setHorizontalGroup(
            pnlDocGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDocGiaLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnlDocGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDocGiaLayout.setVerticalGroup(
            pnlDocGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDocGiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDocGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDocGiaLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        lblMaThe.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblMaThe.setForeground(new java.awt.Color(39, 139, 0));
        lblMaThe.setText("jLabel6");

        jLabel20.setText("Mã thẻ:");

        jLabel21.setText("Ngày cấp:");

        jLabel22.setText("Ngày hết hạn:");

        jLabel23.setText("Lệ phí:");

        jLabel24.setText("Gia hạn đến ngày:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(69, 139, 0))); // NOI18N

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Search.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch)
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearch)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Accept.png"))); // NOI18N
        btnThem.setText("Gia hạn");

        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete.png"))); // NOI18N
        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin đọc giả", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(69, 139, 0))); // NOI18N

        jLabel16.setText("Mã đọc giả:");

        lblMaDG.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblMaDG.setForeground(new java.awt.Color(69, 139, 0));
        lblMaDG.setText("DG123456");

        jLabel39.setText("Họ và tên:");

        lblHovaTeb.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblHovaTeb.setForeground(new java.awt.Color(69, 139, 0));
        lblHovaTeb.setText("DG123456");

        jLabel41.setText("CCCD:");

        lblCCCD.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblCCCD.setForeground(new java.awt.Color(69, 139, 0));
        lblCCCD.setText("DG123456");

        lblEmail.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(69, 139, 0));
        lblEmail.setText("DG123456");

        jLabel46.setText("Email:");

        jLabel47.setText("Ngày cấp:");

        lblNgayCap.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblNgayCap.setForeground(new java.awt.Color(69, 139, 0));
        lblNgayCap.setText("DG123456");

        lblHSD.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblHSD.setForeground(new java.awt.Color(69, 139, 0));
        lblHSD.setText("DG123456");

        jLabel50.setText("Giá trị đến:");

        lblHinh1.setText("Hình");
        lblHinh1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel46)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel47))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNgayCap, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel12Layout.createSequentialGroup()
                                                .addGap(115, 115, 115)
                                                .addComponent(jLabel50)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblHSD, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMaDG, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHovaTeb, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(lblHinh1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lblMaDG)
                    .addComponent(jLabel39)
                    .addComponent(lblHovaTeb))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(lblCCCD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(lblEmail))
                .addGap(19, 19, 19)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgayCap)
                    .addComponent(jLabel47)
                    .addComponent(jLabel50)
                    .addComponent(lblHSD, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblHinh1, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout pnlLePhiLayout = new javax.swing.GroupLayout(pnlLePhi);
        pnlLePhi.setLayout(pnlLePhiLayout);
        pnlLePhiLayout.setHorizontalGroup(
            pnlLePhiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLePhiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLePhiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLePhiLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHuy))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLePhiLayout.createSequentialGroup()
                        .addGroup(pnlLePhiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(pnlLePhiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtLePhi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgayHetHan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgayCap1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGiaHan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaThe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLePhiLayout.setVerticalGroup(
            pnlLePhiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLePhiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLePhiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlLePhiLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(pnlLePhiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(lblMaThe))
                        .addGap(25, 25, 25)
                        .addGroup(pnlLePhiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtNgayCap1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(pnlLePhiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txtNgayHetHan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(pnlLePhiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtLePhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(pnlLePhiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txtGiaHan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(pnlLePhiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem)
                            .addComponent(btnHuy))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnlTaoThe1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin thẻ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(69, 167, 0))); // NOI18N

        jLabel1.setText("Mã đọc giả:");

        jLabel2.setText("Họ Tên");

        jLabel3.setText("CCCD:");

        jLabel5.setText("Email:");

        jLabel6.setText("Ngày cấp:");

        jLabel7.setText("Hạn sử dụng:");

        txtCCCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCCCDActionPerformed(evt);
            }
        });

        jLabel8.setText("SDT:");

        pnlAnh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAnhMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlAnhLayout = new javax.swing.GroupLayout(pnlAnh);
        pnlAnh.setLayout(pnlAnhLayout);
        pnlAnhLayout.setHorizontalGroup(
            pnlAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAnh, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
        );
        pnlAnhLayout.setVerticalGroup(
            pnlAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAnh, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        );

        btnTaoThe1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Add.png"))); // NOI18N
        btnTaoThe1.setText("Tạo thẻ");
        btnTaoThe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoThe1ActionPerformed(evt);
            }
        });

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete.png"))); // NOI18N
        btnCancel.setText("Cancel");

        jLabel25.setText("Địa Chỉ");

        javax.swing.GroupLayout pnlTaoThe1Layout = new javax.swing.GroupLayout(pnlTaoThe1);
        pnlTaoThe1.setLayout(pnlTaoThe1Layout);
        pnlTaoThe1Layout.setHorizontalGroup(
            pnlTaoThe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTaoThe1Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(pnlTaoThe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlTaoThe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTaoThe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTaoThe1Layout.createSequentialGroup()
                        .addComponent(btnCancel)
                        .addGap(113, 113, 113)
                        .addComponent(btnTaoThe1))
                    .addComponent(txtMaDG, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHSD, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTaoThe1Layout.createSequentialGroup()
                        .addGroup(pnlTaoThe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayCap, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addComponent(pnlAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(107, 107, 107))
        );
        pnlTaoThe1Layout.setVerticalGroup(
            pnlTaoThe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTaoThe1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlTaoThe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTaoThe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTaoThe1Layout.createSequentialGroup()
                        .addGroup(pnlTaoThe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlTaoThe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlTaoThe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlTaoThe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlTaoThe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlTaoThe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgayCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(pnlTaoThe1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pnlAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTaoThe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTaoThe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTaoThe1)
                    .addComponent(btnCancel)))
        );

        javax.swing.GroupLayout pnlTaoTheLayout = new javax.swing.GroupLayout(pnlTaoThe);
        pnlTaoThe.setLayout(pnlTaoTheLayout);
        pnlTaoTheLayout.setHorizontalGroup(
            pnlTaoTheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTaoTheLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(pnlTaoThe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        pnlTaoTheLayout.setVerticalGroup(
            pnlTaoTheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTaoTheLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(pnlTaoThe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin sách", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(69, 167, 0))); // NOI18N

        tblThongTinSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên sách", "Mã sách", "Số lượng", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblThongTinSach);

        btnCancelsach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete.png"))); // NOI18N
        btnCancelsach.setText("Cancel");
        btnCancelsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelsachActionPerformed(evt);
            }
        });

        btnOksach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Accept.png"))); // NOI18N
        btnOksach.setText("Ok");
        btnOksach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOksachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnCancelsach)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOksach, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelsach, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOksach, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(69, 167, 0))); // NOI18N

        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Search.png"))); // NOI18N
        btnTim.setText("Tìm");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(btnTim)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTim))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin phiếu mượn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(69, 167, 0))); // NOI18N

        jLabel9.setText("Mã phiếu:");

        jLabel10.setText("Mã đọc giả:");

        jLabel11.setText("Mã sách:");

        jLabel12.setText("Tên sách:");

        jLabel13.setText("Giá sách:");

        jLabel14.setText("Ngày mượn:");

        jLabel15.setText("Trả hạn:");

        btnOkPhieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Accept.png"))); // NOI18N
        btnOkPhieu.setText("Ok");
        btnOkPhieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkPhieuActionPerformed(evt);
            }
        });

        btnCancelPhieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete.png"))); // NOI18N
        btnCancelPhieu.setText("Cancel");
        btnCancelPhieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelPhieuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField10)
                            .addComponent(jTextField11)
                            .addComponent(jTextField12)
                            .addComponent(jTextField13)
                            .addComponent(jTextField14)
                            .addComponent(jTextField15)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnCancelPhieu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOkPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOkPhieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelPhieu))
                .addContainerGap())
        );

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(39, 169, 0));
        jLabel19.setText("PHIẾU MƯỢN");

        javax.swing.GroupLayout pnlPhieuMuonLayout = new javax.swing.GroupLayout(pnlPhieuMuon);
        pnlPhieuMuon.setLayout(pnlPhieuMuonLayout);
        pnlPhieuMuonLayout.setHorizontalGroup(
            pnlPhieuMuonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPhieuMuonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPhieuMuonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlPhieuMuonLayout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPhieuMuonLayout.setVerticalGroup(
            pnlPhieuMuonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPhieuMuonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addGroup(pnlPhieuMuonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlPhieuMuonLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlPTra4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Phiếu trả", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(69, 167, 0))); // NOI18N

        jLabel85.setText("Mã phiếu trả:");

        jLabel86.setText("Mã phiếu mượn: ");

        jLabel87.setText("Mã sách: ");

        jLabel88.setText("Tên sách:");

        jLabel89.setText("Ngày mượn:");

        jLabel90.setText("Ngày trả: ");

        lblCanhBaoQuaHan.setText("Cảnh báo quá hạn nộp!!!");

        btnLapPhieuPhat4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Problem.png"))); // NOI18N
        btnLapPhieuPhat4.setText("Lập phiếu phạt");

        btnTraSach4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Refresh.png"))); // NOI18N
        btnTraSach4.setText("Trả sách");

        tbnCancelPhat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete.png"))); // NOI18N
        tbnCancelPhat1.setText("Cancel");
        tbnCancelPhat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnCancelPhat1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPTra4Layout = new javax.swing.GroupLayout(pnlPTra4);
        pnlPTra4.setLayout(pnlPTra4Layout);
        pnlPTra4Layout.setHorizontalGroup(
            pnlPTra4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPTra4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnTraSach4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btnLapPhieuPhat4)
                .addGap(25, 25, 25))
            .addGroup(pnlPTra4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPTra4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPTra4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPTra4Layout.createSequentialGroup()
                        .addComponent(lblCanhBaoQuaHan)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtMaPhieuTra5)
                    .addComponent(txtMaPhieuMuon4)
                    .addComponent(txtMasach5)
                    .addComponent(txtTenSach4)
                    .addComponent(txtNgayMuon4)
                    .addComponent(txtNgayTra4))
                .addContainerGap())
            .addGroup(pnlPTra4Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(tbnCancelPhat1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPTra4Layout.setVerticalGroup(
            pnlPTra4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPTra4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPTra4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(txtMaPhieuTra5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPTra4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(txtMaPhieuMuon4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPTra4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(txtMasach5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPTra4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(txtTenSach4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPTra4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89)
                    .addComponent(txtNgayMuon4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPTra4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(txtNgayTra4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCanhBaoQuaHan)
                .addGap(18, 18, 18)
                .addGroup(pnlPTra4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTraSach4)
                    .addComponent(btnLapPhieuPhat4))
                .addGap(18, 18, 18)
                .addComponent(tbnCancelPhat1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pnlPPhat.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Phiếu phạt", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(69, 167, 0))); // NOI18N

        jLabel31.setText("Mã phiếu phạt:");

        jLabel32.setText("Mã phiếu trả:");

        jLabel33.setText("Mã sách:");

        jLabel34.setText("Ngày phạt:");

        jLabel35.setText("Lý do phạt: ");

        jLabel36.setText("Phí phạt:");

        jLabel37.setText("Mã nhân viên: ");

        cboLyDo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tbnCancelPhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete.png"))); // NOI18N
        tbnCancelPhat.setText("Cancel");
        tbnCancelPhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnCancelPhatActionPerformed(evt);
            }
        });

        btnOkphat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Accept.png"))); // NOI18N
        btnOkphat.setText("Ok");
        btnOkphat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkphatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPPhatLayout = new javax.swing.GroupLayout(pnlPPhat);
        pnlPPhat.setLayout(pnlPPhatLayout);
        pnlPPhatLayout.setHorizontalGroup(
            pnlPPhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPPhatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPPhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPPhatLayout.createSequentialGroup()
                        .addGroup(pnlPPhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPPhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaphieuphat)
                            .addComponent(txtMaphieutra2)
                            .addComponent(txtMasach2)
                            .addComponent(txtNgayPhat)
                            .addComponent(cboLyDo, 0, 276, Short.MAX_VALUE)
                            .addComponent(txtPhi)
                            .addComponent(txtMaNhanVien)))
                    .addGroup(pnlPPhatLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(tbnCancelPhat)
                        .addGap(59, 59, 59)
                        .addComponent(btnOkphat, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlPPhatLayout.setVerticalGroup(
            pnlPPhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPPhatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPPhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtMaphieuphat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPPhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtMaphieutra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPPhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtMasach2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPPhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(txtNgayPhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPPhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(cboLyDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPPhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txtPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPPhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPPhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnCancelPhat)
                    .addComponent(btnOkphat))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout pnlPhieuTraPhatLayout = new javax.swing.GroupLayout(pnlPhieuTraPhat);
        pnlPhieuTraPhat.setLayout(pnlPhieuTraPhatLayout);
        pnlPhieuTraPhatLayout.setHorizontalGroup(
            pnlPhieuTraPhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPhieuTraPhatLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(pnlPTra4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlPPhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        pnlPhieuTraPhatLayout.setVerticalGroup(
            pnlPhieuTraPhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPhieuTraPhatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPhieuTraPhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPTra4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPPhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLayeredPane1.setLayer(pnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pnlDocGia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pnlLePhi, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pnlTaoThe, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pnlPhieuMuon, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pnlPhieuTraPhat, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlDocGia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlLePhi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlTaoThe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlPhieuMuon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlPhieuTraPhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlDocGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlLePhi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlTaoThe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlPhieuMuon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlPhieuTraPhat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane1)
                    .addComponent(tbaCongCu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
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

    private void btnDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocGiaActionPerformed
        pnl.setVisible(false);
        pnlDocGia.setVisible(true);
        pnlLePhi.setVisible(false);
        pnlPhieuMuon.setVisible(false);
        pnlTaoThe.setVisible(false);
        pnlPhieuTraPhat.setVisible(false);
    }//GEN-LAST:event_btnDocGiaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pnl.setVisible(true);
        pnlDocGia.setVisible(false);
        pnlLePhi.setVisible(false);
        pnlPhieuMuon.setVisible(false);
        pnlTaoThe.setVisible(false);
        pnlPhieuTraPhat.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnLePhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLePhiActionPerformed
        pnl.setVisible(false);
        pnlDocGia.setVisible(false);
        pnlLePhi.setVisible(true);
        pnlPhieuMuon.setVisible(false);
        pnlTaoThe.setVisible(false);
        pnlPhieuTraPhat.setVisible(false);
    }//GEN-LAST:event_btnLePhiActionPerformed

    private void btnTaoTheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoTheActionPerformed
        pnl.setVisible(false);
        pnlDocGia.setVisible(false);
        pnlLePhi.setVisible(false);
        pnlPhieuMuon.setVisible(false);
        pnlTaoThe.setVisible(true);
        pnlPhieuTraPhat.setVisible(false);
    }//GEN-LAST:event_btnTaoTheActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnCancelsachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelsachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelsachActionPerformed

    private void btnOksachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOksachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOksachActionPerformed

    private void btnOkPhieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkPhieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOkPhieuActionPerformed

    private void btnCancelPhieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelPhieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelPhieuActionPerformed

    private void btnLapPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLapPMActionPerformed
        pnl.setVisible(false);
        pnlDocGia.setVisible(false);
        pnlLePhi.setVisible(false);
        pnlPhieuMuon.setVisible(true);
        pnlTaoThe.setVisible(false);
        pnlPhieuTraPhat.setVisible(false);

    }//GEN-LAST:event_btnLapPMActionPerformed

    private void btnLapPhieuTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLapPhieuTraActionPerformed
        pnl.setVisible(false);
        pnlDocGia.setVisible(false);
        pnlLePhi.setVisible(false);
        pnlPhieuMuon.setVisible(false);
        pnlTaoThe.setVisible(false);
        pnlPhieuTraPhat.setVisible(true);
    }//GEN-LAST:event_btnLapPhieuTraActionPerformed

    private void tbnCancelPhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCancelPhatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbnCancelPhatActionPerformed

    private void btnOkphatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkphatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOkphatActionPerformed

    private void tbnCancelPhat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCancelPhat1ActionPerformed
        pnl.setVisible(false);
        pnlDocGia.setVisible(true);
        pnlLePhi.setVisible(false);
        pnlPhieuMuon.setVisible(false);
        pnlTaoThe.setVisible(false);
        pnlPhieuTraPhat.setVisible(false);
    }//GEN-LAST:event_tbnCancelPhat1ActionPerformed

    private void btnTaoThe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoThe1ActionPerformed
        // TODO add your handling code here:
        this.insert();
    }//GEN-LAST:event_btnTaoThe1ActionPerformed

    private void txtCCCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCCCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCCCDActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btnSearchActionPerformed

    private void lblAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnhMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.chonAnh();
        }
    }//GEN-LAST:event_lblAnhMouseClicked

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
            java.util.logging.Logger.getLogger(ThuVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThuVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThuVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThuVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThuVienJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCancelPhieu;
    private javax.swing.JButton btnCancelsach;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDocGia;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLapPM;
    private javax.swing.JButton btnLapPhieuPhat4;
    private javax.swing.JButton btnLapPhieuTra;
    private javax.swing.JButton btnLePhi;
    private javax.swing.JButton btnOkPhieu;
    private javax.swing.JButton btnOkphat;
    private javax.swing.JButton btnOksach;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnTaoThe;
    private javax.swing.JButton btnTaoThe1;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnTraSach4;
    private javax.swing.JComboBox<String> cboLyDo;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblAnh;
    private javax.swing.JLabel lblCCCD;
    private javax.swing.JLabel lblCanhBaoQuaHan;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHSD;
    private javax.swing.JLabel lblHinh1;
    private javax.swing.JLabel lblHinh2;
    private javax.swing.JLabel lblHovaTeb;
    private javax.swing.JLabel lblMaDG;
    private javax.swing.JLabel lblMaThe;
    private javax.swing.JLabel lblNgayCap;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JPanel pnl;
    private javax.swing.JPanel pnlAnh;
    private javax.swing.JPanel pnlDocGia;
    private javax.swing.JPanel pnlLePhi;
    private javax.swing.JPanel pnlPPhat;
    private javax.swing.JPanel pnlPTra4;
    private javax.swing.JPanel pnlPhieuMuon;
    private javax.swing.JPanel pnlPhieuTraPhat;
    private javax.swing.JPanel pnlTaoThe;
    private javax.swing.JPanel pnlTaoThe1;
    private javax.swing.JPanel pnlTrangThai;
    private javax.swing.JToolBar tbaCongCu;
    private javax.swing.JTable tblSachMuon;
    private javax.swing.JTable tblThongTinSach;
    private javax.swing.JButton tbnCancelPhat;
    private javax.swing.JButton tbnCancelPhat1;
    private javax.swing.JTextField txtCCCD;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGiaHan;
    private javax.swing.JTextField txtHSD;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtLePhi;
    private javax.swing.JTextField txtMaDG;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtMaPhieuMuon4;
    private javax.swing.JTextField txtMaPhieuTra5;
    private javax.swing.JTextField txtMaphieuphat;
    private javax.swing.JTextField txtMaphieutra2;
    private javax.swing.JTextField txtMasach2;
    private javax.swing.JTextField txtMasach5;
    private javax.swing.JTextField txtNgayCap;
    private javax.swing.JTextField txtNgayCap1;
    private javax.swing.JTextField txtNgayHetHan;
    private javax.swing.JTextField txtNgayMuon4;
    private javax.swing.JTextField txtNgayPhat;
    private javax.swing.JTextField txtNgayTra4;
    private javax.swing.JTextField txtPhi;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSearch1;
    private javax.swing.JTextField txtTenSach4;
    // End of variables declaration//GEN-END:variables

}
