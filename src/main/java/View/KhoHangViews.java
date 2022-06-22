
package View;

import IO.IOSanPham;
import KhoHang.DiaNhac;
import KhoHang.DiaPhim;
import KhoHang.Sach;
import KhoHang.SanPham;
import DoanhThu.SuKien;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class KhoHangViews extends javax.swing.JFrame {
    
    private ArrayList<SanPham> list;
    private ArrayList<SuKien> list_SuKien;
    DefaultTableModel model;
    int key =0;
    
    IOSanPham io = new IOSanPham();
    /**
     * Creates new form KhoHangViews
     */
    public KhoHangViews() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        list = io.docSP(); //list = new ArrayList<> (); 
        list_SuKien = new ArrayList<> ();
        model = (DefaultTableModel)jTable1.getModel();
//        panelShow();
        TFTenTacGia.setVisible(true);
        TFNhaXuatBan.setVisible(true);
        TFTheLoaiSach.setVisible(true);
        TFNamPhatHanhSach.setVisible(true);
        
        TFTenCaSi.setVisible(false);
        TFTheLoaiDN.setVisible(false);
        TFNamPhatHanhDN.setVisible(false);
        
        
        TFDaoDien.setVisible(false);
        TFDienVien.setVisible(false);        
        TFNamSanXuatDP.setVisible(false);        
        TFTheLoaiDP.setVisible(false);
        
    }
//    private void panelShow(){
//        if (RBtnSach.isSelected()){
//            PanelLoai.removeAll();
//            PanelLoai.setLayout(new BorderLayout());
//            PanelLoai.add(new SachKhoHang());
//            PanelLoai.validate();
//            PanelLoai.repaint();
//        }
//        if (RBtnDiaNhac.isSelected()){
//            PanelLoai.removeAll();
////            PanelLoai.setLayout(new BorderLayout());
//            PanelLoai.add(new SachKhoHang());
//            PanelLoai.validate();
//            PanelLoai.repaint();
//        }
//        if (RBtnDiaPhim.isSelected()){
//            PanelLoai.removeAll();
//            PanelLoai.setLayout(new BorderLayout());
//            PanelLoai.add(new DiaPhimKhoHang());
//            PanelLoai.validate();
//            PanelLoai.repaint();
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGrLoai = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox<>();
        tieudekhohang = new javax.swing.JLabel();
        LabelTen = new javax.swing.JLabel();
        LabelGiaNhap = new javax.swing.JLabel();
        TFTen = new javax.swing.JTextField();
        LabelGiaBan = new javax.swing.JLabel();
        LabelSoLuongNhap1 = new javax.swing.JLabel();
        TFGiaNhap = new javax.swing.JTextField();
        TFSoLuongNhap = new javax.swing.JTextField();
        TFGiaBan = new javax.swing.JTextField();
        LabelTheLoai = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtnInsert = new javax.swing.JButton();
        BtnClear = new javax.swing.JButton();
        BtnBack = new javax.swing.JButton();
        RBtnDiaPhim = new javax.swing.JRadioButton();
        RBtnSach = new javax.swing.JRadioButton();
        RBtnDiaNhac = new javax.swing.JRadioButton();
        PanelLoai = new javax.swing.JPanel();
        TFTenTacGia = new javax.swing.JTextField();
        TFNhaXuatBan = new javax.swing.JTextField();
        TFTenCaSi = new javax.swing.JTextField();
        TFTheLoaiDN = new javax.swing.JTextField();
        TFDaoDien = new javax.swing.JTextField();
        TFDienVien = new javax.swing.JTextField();
        TFTheLoaiSach = new javax.swing.JTextField();
        TFNamPhatHanhDN = new javax.swing.JTextField();
        TFTheLoaiDP = new javax.swing.JTextField();
        TFNamPhatHanhSach = new javax.swing.JTextField();
        TFNamSanXuatDP = new javax.swing.JTextField();
        BtnFull = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(778, 582));

        tieudekhohang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tieudekhohang.setText("THÔNG TIN SẢN PHẨM");

        LabelTen.setText("Tên ");

        LabelGiaNhap.setText("Giá Nhập");

        TFTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFTenActionPerformed(evt);
            }
        });

        LabelGiaBan.setText("Giá Bán");

        LabelSoLuongNhap1.setText("Số lượng ");

        TFGiaNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFGiaNhapActionPerformed(evt);
            }
        });

        TFSoLuongNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFSoLuongNhapActionPerformed(evt);
            }
        });

        TFGiaBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFGiaBanActionPerformed(evt);
            }
        });

        LabelTheLoai.setText("Thể Loại");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên", "Giá Nhập", "Giá Bán", "Số lượng", "Thể loại"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        BtnInsert.setText("INSERT");
        BtnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInsertActionPerformed(evt);
            }
        });

        BtnClear.setText("Clear");
        BtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearActionPerformed(evt);
            }
        });

        BtnBack.setText("Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        BtnGrLoai.add(RBtnDiaPhim);
        RBtnDiaPhim.setText("DiaPhim");
        RBtnDiaPhim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtnDiaPhimActionPerformed(evt);
            }
        });

        BtnGrLoai.add(RBtnSach);
        RBtnSach.setSelected(true);
        RBtnSach.setText("Sách");
        RBtnSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtnSachActionPerformed(evt);
            }
        });

        BtnGrLoai.add(RBtnDiaNhac);
        RBtnDiaNhac.setText("DiaNhac");
        RBtnDiaNhac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtnDiaNhacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLoaiLayout = new javax.swing.GroupLayout(PanelLoai);
        PanelLoai.setLayout(PanelLoaiLayout);
        PanelLoaiLayout.setHorizontalGroup(
            PanelLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
        );
        PanelLoaiLayout.setVerticalGroup(
            PanelLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        TFTenTacGia.setText("TênTácGiả");
        TFTenTacGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFTenTacGiaActionPerformed(evt);
            }
        });

        TFNhaXuatBan.setText("NhaXuatBan");

        TFTenCaSi.setText("Tên Ca Sĩ");

        TFTheLoaiDN.setText("Thể Loại");

        TFDaoDien.setText("Đạo Diễn");
        TFDaoDien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFDaoDienActionPerformed(evt);
            }
        });

        TFDienVien.setText("Diễn Viên");

        TFTheLoaiSach.setText("Thể Loại");

        TFNamPhatHanhDN.setText("NamPhatHanh");

        TFTheLoaiDP.setText("Thể loại");

        TFNamPhatHanhSach.setText("NamPhatHanh");

        TFNamSanXuatDP.setText("NamSanXuat");

        BtnFull.setText("Full");
        BtnFull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFullActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(BtnInsert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnClear)
                        .addGap(18, 18, 18)
                        .addComponent(BtnFull))
                    .addComponent(BtnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(PanelLoai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(LabelGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TFGiaNhap))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(LabelTen, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TFTen))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(LabelGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TFGiaBan))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(LabelSoLuongNhap1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TFSoLuongNhap))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(TFTenTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(TFNhaXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(LabelTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                                    .addComponent(RBtnSach, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(TFNamPhatHanhSach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                    .addComponent(TFTheLoaiSach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(TFTheLoaiDN, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(TFDienVien, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(RBtnDiaNhac)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(RBtnDiaPhim))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(TFTenCaSi, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(TFDaoDien, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(TFNamPhatHanhDN, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(TFTheLoaiDP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(TFNamSanXuatDP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(tieudekhohang)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tieudekhohang)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TFTen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelTen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelSoLuongNhap1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFSoLuongNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RBtnSach)
                            .addComponent(RBtnDiaNhac)
                            .addComponent(RBtnDiaPhim))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFTenTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFTenCaSi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFDaoDien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFNhaXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFTheLoaiDN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFDienVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFTheLoaiSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFNamPhatHanhDN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFTheLoaiDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFNamPhatHanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFNamSanXuatDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(PanelLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnClear)
                    .addComponent(BtnInsert)
                    .addComponent(BtnFull))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFTenActionPerformed

    private void TFGiaNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFGiaNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFGiaNhapActionPerformed

    private void TFSoLuongNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFSoLuongNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFSoLuongNhapActionPerformed

    private void TFGiaBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFGiaBanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFGiaBanActionPerformed

    private void BtnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInsertActionPerformed
        // TODO add your handling code here:

        SanPham sp =null;
        for (int i =0; i <list.size();i++){
            if(list.get(i).getTensanpham().equals(TFTen.getText())){
                sp = list.get(i);
//              list.add(sp);
                key = 1;
                break;
            }
        }
        if (key ==0){
//            sp = new SanPham(TFTen.getText(),Integer. parseInt(TFGiaNhap.getText()),Integer. parseInt(TFGiaBan.getText()));
            if(RBtnSach.isSelected()){
                sp = new Sach();
                sp.setTensanpham(TFTen.getText());
                sp.setGianhap(Integer. parseInt(TFGiaNhap.getText()));
                sp.setGiaban(Integer. parseInt(TFGiaBan.getText()));
                ((Sach)sp).setTentacgia(TFTenTacGia.getText());
                ((Sach)sp).setNhaxuatban(TFNhaXuatBan.getText());
                ((Sach)sp).setTheloai(TFTheLoaiSach.getText());
                ((Sach)sp).setNamphathanh(Integer. parseInt(TFNamPhatHanhSach.getText()));               
            }
            else if (RBtnDiaNhac.isSelected()){
                sp = new DiaNhac();
                sp.setTensanpham(TFTen.getText());
                sp.setGianhap(Integer. parseInt(TFGiaNhap.getText()));
                sp.setGiaban(Integer. parseInt(TFGiaBan.getText()));
                ((DiaNhac)sp).setTencasi(TFTenCaSi.getText());
                ((DiaNhac)sp).setTheloai(TFTheLoaiDN.getText());
                ((DiaNhac)sp).setNamphathanh(Integer. parseInt(TFNamPhatHanhDN.getText()));
            }
            else if (RBtnDiaPhim.isSelected()){
                sp = new DiaPhim();
                sp.setTensanpham(TFTen.getText());
                sp.setGianhap(Integer. parseInt(TFGiaNhap.getText()));
                sp.setGiaban(Integer. parseInt(TFGiaBan.getText()));
                ((DiaPhim)sp).setDaodien(TFDaoDien.getText());
                ((DiaPhim)sp).setDienvien(TFDienVien.getText());
                ((DiaPhim)sp).setTheloai(TFTheLoaiDP.getText());
                ((DiaPhim)sp).setNamsanxuat(Integer. parseInt(TFNamSanXuatDP.getText())); 
            }
            list.add(sp);
            System.out.print(list);
        }
        key =0;
        Date ngay = new Date();
        SuKien sk = new SuKien(sp,ngay,"mua",Integer. parseInt(TFSoLuongNhap.getText()));
        sk.isRealSK();
        list_SuKien.add(sk);
        showResult(); /// Bảng hiện thêm hàng do hàm showResult này còn danh sách list vẫn chỉ có các sản phẩm ko cùng tên
        io.ghiSP(list);
        io.ghiSK(list_SuKien);
        
    }//GEN-LAST:event_BtnInsertActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        // TODO add your handling code here:
        JFrame MainViews = new MainViews();
        this.setVisible(false);
        MainViews.setVisible(true);
        
    }//GEN-LAST:event_BtnBackActionPerformed

    private void RBtnSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtnSachActionPerformed
//        PanelLoai.removeAll();
//        PanelLoai.setLayout(new BorderLayout());
//        PanelLoai.add(new SachKhoHang());
//        PanelLoai.validate();
//        PanelLoai.repaint();
        TFTenTacGia.setVisible(true);
        TFNhaXuatBan.setVisible(true);
        TFTheLoaiSach.setVisible(true);
        TFNamPhatHanhSach.setVisible(true);
        
        TFTenCaSi.setVisible(false);
        TFTheLoaiDN.setVisible(false);
        TFNamPhatHanhDN.setVisible(false);
        
        
        TFDaoDien.setVisible(false);
        TFDienVien.setVisible(false);
        TFTheLoaiDP.setVisible(false);        
        TFNamSanXuatDP.setVisible(false);        
        
        
    }//GEN-LAST:event_RBtnSachActionPerformed

    private void RBtnDiaNhacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtnDiaNhacActionPerformed
        // TODO add your handling code here:
//        PanelLoai.removeAll();
//        PanelLoai.setLayout(new BorderLayout());
//        PanelLoai.add(new DiaNhacKhoHang());
//        PanelLoai.validate();
//        PanelLoai.repaint();
        TFTenTacGia.setVisible(false);
        TFNhaXuatBan.setVisible(false);
        TFTheLoaiSach.setVisible(false);
        TFNamPhatHanhSach.setVisible(false);
        
        TFTenCaSi.setVisible(true);
        TFTheLoaiDN.setVisible(true);
        TFNamPhatHanhDN.setVisible(true);
        
        
        TFDaoDien.setVisible(false);
        TFDienVien.setVisible(false);        
        TFNamSanXuatDP.setVisible(false);        
        TFTheLoaiDP.setVisible(false);
    }//GEN-LAST:event_RBtnDiaNhacActionPerformed

    private void RBtnDiaPhimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtnDiaPhimActionPerformed
        // TODO add your handling code here:
//        PanelLoai.removeAll();
//        PanelLoai.setLayout(new BorderLayout());
//        PanelLoai.add(new DiaPhimKhoHang());
//        PanelLoai.validate();
//        PanelLoai.repaint();
        TFTenTacGia.setVisible(false);
        TFNhaXuatBan.setVisible(false);
        TFTheLoaiSach.setVisible(false);
        TFNamPhatHanhSach.setVisible(false);
        
        TFTenCaSi.setVisible(false);
        TFTheLoaiDN.setVisible(false);
        TFNamPhatHanhDN.setVisible(false);
        
        
        TFDaoDien.setVisible(true);
        TFDienVien.setVisible(true);        
        TFNamSanXuatDP.setVisible(true);        
        TFTheLoaiDP.setVisible(true);
    }//GEN-LAST:event_RBtnDiaPhimActionPerformed

    private void TFTenTacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFTenTacGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFTenTacGiaActionPerformed

    private void TFDaoDienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFDaoDienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFDaoDienActionPerformed

    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnClearActionPerformed

    private void BtnFullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFullActionPerformed
        // TODO add your handling code here:
        model.setRowCount(0);
        showResult();
    }//GEN-LAST:event_BtnFullActionPerformed
    
    
    
    private void showResult() { 
//        SanPham sp = list.get(list.size()-1);
        for (int i = 0; i<list.size();i++ ){
            
            SanPham sp = list.get(i);
            model.addRow(new Object[]{
                sp.getTensanpham(), sp.getGianhap(),sp.getGiaban(),sp.soluong,sp.getClass().getName()
            });
        }
//        model.addRow(new Object[]{
//            sp.getTensanpham(), sp.getGianhap(),sp.getGiaban(),sp.soluong,sp.getClass().getName()
//        });        
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnClear;
    private javax.swing.JButton BtnFull;
    private javax.swing.ButtonGroup BtnGrLoai;
    private javax.swing.JButton BtnInsert;
    private javax.swing.JLabel LabelGiaBan;
    private javax.swing.JLabel LabelGiaNhap;
    private javax.swing.JLabel LabelSoLuongNhap1;
    private javax.swing.JLabel LabelTen;
    private javax.swing.JLabel LabelTheLoai;
    private javax.swing.JPanel PanelLoai;
    private javax.swing.JRadioButton RBtnDiaNhac;
    private javax.swing.JRadioButton RBtnDiaPhim;
    private javax.swing.JRadioButton RBtnSach;
    private javax.swing.JTextField TFDaoDien;
    private javax.swing.JTextField TFDienVien;
    private javax.swing.JTextField TFGiaBan;
    private javax.swing.JTextField TFGiaNhap;
    private javax.swing.JTextField TFNamPhatHanhDN;
    private javax.swing.JTextField TFNamPhatHanhSach;
    private javax.swing.JTextField TFNamSanXuatDP;
    private javax.swing.JTextField TFNhaXuatBan;
    private javax.swing.JTextField TFSoLuongNhap;
    private javax.swing.JTextField TFTen;
    private javax.swing.JTextField TFTenCaSi;
    private javax.swing.JTextField TFTenTacGia;
    private javax.swing.JTextField TFTheLoaiDN;
    private javax.swing.JTextField TFTheLoaiDP;
    private javax.swing.JTextField TFTheLoaiSach;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel tieudekhohang;
    // End of variables declaration//GEN-END:variables

    
}
