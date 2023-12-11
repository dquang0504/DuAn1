/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gym.form;

import com.gym.dao.GoiTapDAO;
import com.gym.util.MsgBox;
import com.gym.dao.NhanVienDAO;
import com.gym.entity.GoiTap;
import com.gym.entity.NhanVien;
import com.gym.util.Auth;
import com.gym.util.XDate;
import com.gym.util.XImage;
import java.io.File;
import java.util.Comparator;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RAVEN
 */
public class QuanLyGoiTap extends javax.swing.JPanel {

    GoiTapDAO dao = new GoiTapDAO();

    /**
     * Creates new form Form_1
     */
    public QuanLyGoiTap() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTenGoi = new javax.swing.JTextField();
        txtMaGT = new javax.swing.JTextField();
        txtThoiHan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        txtGia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGoiTap = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 204, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(153, 153, 255)), "Thông tin gói tập", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Mã gói tập:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Tên gói:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Thời hạn:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Mô tả:");

        txtTenGoi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(255, 153, 255), new java.awt.Color(153, 153, 255)));

        txtMaGT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(255, 153, 255), new java.awt.Color(153, 153, 255)));

        txtThoiHan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(255, 153, 255), new java.awt.Color(153, 153, 255)));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Giá:");

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        txtMoTa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(255, 153, 255), new java.awt.Color(153, 153, 255)));
        jScrollPane2.setViewportView(txtMoTa);

        txtGia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(255, 153, 255), new java.awt.Color(153, 153, 255)));

        jLabel5.setText("ngày");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaGT, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtThoiHan, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenGoi, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(310, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMaGT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTenGoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtThoiHan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 1270, 290));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(102, 204, 255), new java.awt.Color(204, 204, 255)));

        tblGoiTap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã GT", "Tên Gói", "Giá", "Thời hạn", "Mô Tả"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGoiTap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGoiTapMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGoiTap);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 1260, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gym/icon/search.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, 30, 30));

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 430, 410, 30));

        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel1.add(btnFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        btnPrev.setText("<<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, -1, -1));

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel1.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, -1, -1));

        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        jPanel1.add(btnLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, -1, -1));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel1.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 144, -1));

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 144, -1));

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 144, -1));

        btnClear.setText("Làm mới");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 144, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("QUẢN LÝ GÓI TẬP");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 330, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblGoiTapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGoiTapMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblGoiTap.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblGoiTapMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();
        tblGoiTap.clearSelection();
        txtGia.setText("");
        txtThoiHan.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        List<GoiTap> list = dao.selectAll();
        for (GoiTap gt : list) {
            if (gt.getMaGT().equals(txtMaGT.getText())) {
                MsgBox.alert(this, "Mã gói tập không được trùng!\nMã bị trùng: " + txtMaGT.getText());
                return;
            }
        }
        if(validateForm()){
            insert();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if(validateForm()){
            update();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        timKiem();
    }//GEN-LAST:event_txtSearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblGoiTap;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaGT;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTenGoi;
    private javax.swing.JTextField txtThoiHan;
    // End of variables declaration//GEN-END:variables

    private int row = -1;

    private void init() {
        this.fillTable();
        this.row = -1;
        this.updateStatus();
        txtMaGT.setText(tuTaoMaGTMoi());
    }

    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblGoiTap.getModel();
        model.setRowCount(0);
        try {
            String keyword = txtSearch.getText();
            List<GoiTap> list = dao.selectByKeyword(keyword);
            for (GoiTap gt : list) {
                Object[] row = {
                    gt.getMaGT(),
                    gt.getTenGoi(),
                    gt.getGia(),
                    gt.getThoiHan(),
                    gt.getMoTa()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
            System.out.println(e);
        }
    }

    GoiTap getForm() {
        GoiTap gt = new GoiTap();
        gt.setMaGT(txtMaGT.getText());
        gt.setTenGoi(txtTenGoi.getText());
        gt.setGia(Double.parseDouble(txtGia.getText()));
        gt.setThoiHan(Integer.parseInt(txtThoiHan.getText()));
        gt.setMoTa(txtMoTa.getText());
        return gt;
    }

    void setForm(GoiTap gt) {
        txtMaGT.setText(gt.getMaGT());
        txtTenGoi.setText(gt.getTenGoi());
        txtGia.setText(String.valueOf(gt.getGia()));
        txtThoiHan.setText(String.valueOf(gt.getThoiHan()));
        txtMoTa.setText(gt.getMoTa());
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblGoiTap.getRowCount() - 1);

        //Trạng thái form
        txtMaGT.setEnabled(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);
        //Trạng thái điều hướng
        btnFirst.setEnabled(edit && !first);
        btnPrev.setEnabled(edit);
        btnNext.setEnabled(edit);
        btnLast.setEnabled(edit && !last);
    }

    void clearForm() {
        GoiTap gt = new GoiTap();
        this.setForm(gt);
        this.row = -1;
        updateStatus();
        txtMaGT.setText(tuTaoMaGTMoi());
    }

    void edit() {
        String magt = (String) tblGoiTap.getValueAt(this.row, 0);
        GoiTap gt = dao.selectById(magt);
        this.setForm(gt);
        this.updateStatus();
    }

    void insert() {
        GoiTap gt = getForm();
        try {
            gt.setMaGT(tuTaoMaGTMoi());
            dao.insert(gt);
            this.fillTable();
            this.clearForm();
            MsgBox.alert(this, "Thêm mới thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm mới thất bại!");
            System.out.println(e);
        }
    }

    void update() {
        GoiTap gt = getForm();
        try {
            dao.update(gt);
            this.fillTable();
            this.clearForm();
            MsgBox.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại!");
            System.out.println(e);
        }
    }

    void delete() {
        String magt = txtMaGT.getText();
        if (MsgBox.confirm(this, "Bạn có thực sự muốn xóa gói tập này ?")) {
            try {
                dao.delete(magt);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Xóa gói tập thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Xóa gói tập thất bại");
                System.out.println(e);
            }
        }
    }
    
    void first() {
        this.row = 0;
        tblGoiTap.setRowSelectionInterval(row, row);
        this.edit();
        System.out.println(row);
    }

    void next() {
        if (this.row < tblGoiTap.getRowCount() - 1) {
            this.row++;
            this.edit();
            tblGoiTap.setRowSelectionInterval(row, row);
        } else {
            this.row = 0;
            this.edit();
            tblGoiTap.setRowSelectionInterval(row, row);
        }
        System.out.println(row);
    }

    void prev() {
        if (this.row > 0) {
            this.row--;
            this.edit();
            tblGoiTap.setRowSelectionInterval(row, row);
        } else {
            this.row = tblGoiTap.getRowCount() - 1;
            this.edit();
            tblGoiTap.setRowSelectionInterval(row, row);
        }
        System.out.println(row);
    }

    void last() {
        this.row = tblGoiTap.getRowCount() - 1;
        this.edit();
        tblGoiTap.setRowSelectionInterval(row, row);
        System.out.println(row);
    }

    void timKiem() {
        this.fillTable();
        this.clearForm();
        this.row = -1;
        updateStatus();
    }
    
    String regexMaGT = "^GT[1-9]\\d*$";      //Bắt đầu bằng GT và 3 chữ số theo sau
    String regexTenGoi = "^[^0-9]{1,50}$";   //Không có số và giới hạn ký tự tới 50
    String regexGiaGoi = "^[0-9]+(\\.[0-9]+)?$";      //Bắt buộc là số
    String regexThoiHan = "^[0-9]+$";  //Bắt buộc là số
    
    boolean validateForm(){
        if (txtMaGT.getText().isEmpty()) {
            MsgBox.alert(this, "Mã gói tập không được trống!");
            return false;
        }
        else if(!txtMaGT.getText().matches(regexMaGT)){
            MsgBox.alert(this, "Mã gói tập không đúng định dạng!\nĐịnh dạng yêu cầu: GTXXX");
            return false;
        }
        
        if (txtTenGoi.getText().isEmpty()) {
            MsgBox.alert(this, "Tên gói không được trống!");
            return false;
        }
        else if (!txtTenGoi.getText().matches(regexTenGoi)) {
            MsgBox.alert(this, "Tên gói không đúng định dạng!\nTên gói không được là số và dưới 50 ký tự");
            return false;
        }
        
        if (txtGia.getText().isEmpty()) {
            MsgBox.alert(this, "Gía gói không được trống!");
            return false;
        }
        else if (!txtGia.getText().matches(regexGiaGoi)) {
            MsgBox.alert(this, "Giá gói không đúng định dạng!\nGiá gói phải là số");
            return false;
        }
        if (txtThoiHan.getText().isEmpty()) {
            MsgBox.alert(this, "Thời hạn không được trống!");
            return false;
        }
        else if (!txtThoiHan.getText().matches(regexThoiHan)) {
            MsgBox.alert(this, "Thời hạn không đúng định dạng!\nThời hạn chỉ được là số");
            return false;
        }
        return true;
    }
    
    private String tuTaoMaGTMoi() {
        String userInput = txtMaGT.getText().trim(); // Lấy giá trị đã nhập trong txtMaGT

        // Nếu người dùng đã nhập mã gói tập, và mã đó thỏa mãn điều kiện, trả về giá trị người dùng nhập vào
        if (!userInput.isEmpty() && userInput.matches(regexMaGT)) {
            return userInput;
        }

        List<GoiTap> listGoiTap = dao.selectGetMaGT(); // Lấy danh sách mã gói tập từ CSDL

        // Nếu danh sách rỗng hoặc không có mã gói tập nào tồn tại, trả về GT0
        if (listGoiTap.isEmpty()) {
            return "GT0";
        }

        // Tìm mã gói tập lớn nhất
        String lastId = listGoiTap.stream()
                .map(GoiTap::getMaGT)
                .max(Comparator.comparing(s -> Integer.parseInt(s.substring(2))))
                .orElse("GT0");

        // Lấy số từ mã gói tập cuối cùng và tăng giá trị lên 1
        int nextNumber = Integer.parseInt(lastId.substring(2)) + 1;

        // Tạo mã gói tập mới dựa trên số đã tăng, loại bỏ số 0 ở đầu nếu cần
        String nextGoiTapId;
        if (nextNumber < 10) {
            nextGoiTapId = "GT" + nextNumber;
        } else {
            nextGoiTapId = "GT" + String.valueOf(nextNumber);
        }

        return nextGoiTapId;
    }
}
