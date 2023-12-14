/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gym.form;

import com.gym.dao.ChiTietDungCuDAO;
import com.gym.dao.ChiTietGoiTapDAO;
import com.gym.dao.DonHangDAO;
import com.gym.dao.DungCuDAO;
import com.gym.dao.GoiTapDAO;
import com.gym.dao.KhachHangDAO;
import com.gym.dao.ThongKeDAO_Procedure;
import com.gym.util.MsgBox;
import com.gym.dao.NhanVienDAO;
import com.gym.entity.ChiTietDungCu;
import com.gym.entity.ChiTietGoiTap;
import com.gym.entity.DonHang;
import com.gym.entity.DungCu;
import com.gym.entity.GoiTap;
import com.gym.entity.KhachHang;
import com.gym.entity.NhanVien;
import com.gym.util.Auth;
import com.gym.util.XDate;
import com.gym.util.XImage;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author RAVEN
 */
public class ThongKeDoanhThu extends javax.swing.JPanel {

    /**
     * Creates new form Form_1
     */
    public ThongKeDoanhThu() {
        initComponents();

        fillTableGoiTap();

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
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDoanhThu = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtSoHoaDon = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtSoSanPhamBan = new javax.swing.JLabel();
        lblTu = new javax.swing.JLabel();
        lblDen = new javax.swing.JLabel();
        txtNgayFrom = new javax.swing.JTextField();
        txtNgayTo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThongKe = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        cboSanPham = new javax.swing.JComboBox<>();
        lblError = new javax.swing.JLabel();
        btnXuatBaoCao = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("THỐNG KÊ DOANH THU");

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DOANH THU");

        txtDoanhThu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDoanhThu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDoanhThu.setText("12.000.00 VNĐ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SỐ HÓA ĐƠN");

        txtSoHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSoHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSoHoaDon.setText("25");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSoHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtSoHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SỐ SẢN PHẨM BÁN");

        txtSoSanPhamBan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSoSanPhamBan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSoSanPhamBan.setText("150");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
            .addComponent(txtSoSanPhamBan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtSoSanPhamBan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        lblTu.setText("TỪ:");

        lblDen.setText("ĐẾN");

        txtNgayFrom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNgayFromKeyReleased(evt);
            }
        });

        txtNgayTo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNgayToKeyReleased(evt);
            }
        });

        tblThongKe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MÃ ĐH", "SỐ LƯỢNG", "THÀNH TIỀN", "NGÀY TẠO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblThongKe);

        jLabel8.setText("LOẠI SẢN PHẨM:");

        cboSanPham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gói tập", "Thuê PT", "Dụng cụ", " " }));
        cboSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSanPhamActionPerformed(evt);
            }
        });

        btnXuatBaoCao.setText("Xuất báo cáo");
        btnXuatBaoCao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatBaoCaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNgayFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblDen)
                                .addGap(14, 14, 14)
                                .addComponent(txtNgayTo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(7, 7, 7)
                                .addComponent(cboSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1036, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblError, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnXuatBaoCao)))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNgayTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDen)
                            .addComponent(txtNgayFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXuatBaoCao)
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void updateData() {
        init();
    }

    private boolean nhapDungNgayFrom = false;
    private boolean nhapDungNgayTo = false;

    DecimalFormat decimalFormat = new DecimalFormat("#,###");


    private void txtNgayFromKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNgayFromKeyReleased
        try {
            if (txtNgayFrom.getText().isEmpty() && txtNgayTo.getText().isEmpty()) {
                nhapDungNgayFrom = false;
                nhapDungNgayTo = false;
                if (cboSanPham.getSelectedIndex() == 0) {
                    fillTableGoiTap(); // Show all rows if both date fields are empty
                } else if (cboSanPham.getSelectedIndex() == 1) {
                    fillTableThuePT();
                } else if (cboSanPham.getSelectedIndex() == 2) {
                    fillTableDungCu();
                }
                lblError.setText(""); // Reset error label
            } else if (XDate.toDate(txtNgayFrom.getText(), "dd-MM-yyyy") != null) {
                nhapDungNgayFrom = true;
                if (cboSanPham.getSelectedIndex() == 0) {
                    fillTableGoiTap(); // Call fillTableGoiTap when txtNgayFrom is completed
                } else if (cboSanPham.getSelectedIndex() == 1) {
                    fillTableThuePT();
                } else if (cboSanPham.getSelectedIndex() == 2) {
                    fillTableDungCu();
                }
                lblError.setText(""); // Reset error label
            } else {
                lblError.setText("Vui lòng nhập đúng định dạng dd-MM-YYYY");
                lblError.setForeground(Color.RED);
            }
        } catch (Exception e) {
            lblError.setText("Vui lòng nhập đúng định dạng dd-MM-YYYY");
            lblError.setForeground(Color.RED);
        }
    }//GEN-LAST:event_txtNgayFromKeyReleased

    private void txtNgayToKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNgayToKeyReleased
        try {
            if (txtNgayFrom.getText().isEmpty() && txtNgayTo.getText().isEmpty()) {
                nhapDungNgayFrom = false;
                nhapDungNgayTo = false;
                if (cboSanPham.getSelectedIndex() == 0) {
                    fillTableGoiTap(); // Show all rows if both date fields are empty
                } else if (cboSanPham.getSelectedIndex() == 1) {
                    fillTableThuePT();
                } else if (cboSanPham.getSelectedIndex() == 2) {
                    fillTableDungCu();
                }
                lblError.setText(""); // Reset error label
            } else if (XDate.toDate(txtNgayTo.getText(), "dd-MM-yyyy") != null) {
                nhapDungNgayTo = true;
                if (cboSanPham.getSelectedIndex() == 0) {
                    fillTableGoiTap(); // Call fillTableGoiTap when txtNgayFrom is completed
                } else if (cboSanPham.getSelectedIndex() == 1) {
                    fillTableThuePT();
                } else if (cboSanPham.getSelectedIndex() == 2) {
                    fillTableDungCu();
                }
                lblError.setText(""); // Reset error label
            } else {
                lblError.setText("Vui lòng nhập đúng định dạng dd-MM-YYYY");
                lblError.setForeground(Color.RED);
            }
        } catch (Exception e) {
            lblError.setText("Vui lòng nhập đúng định dạng dd-MM-YYYY");
            lblError.setForeground(Color.RED);
        }
    }//GEN-LAST:event_txtNgayToKeyReleased

    private void cboSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSanPhamActionPerformed
        init();
    }//GEN-LAST:event_cboSanPhamActionPerformed

    private void btnXuatBaoCaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatBaoCaoActionPerformed
        exportExcel();
    }//GEN-LAST:event_btnXuatBaoCaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnXuatBaoCao;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> cboSanPham;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDen;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblTu;
    private javax.swing.JTable tblThongKe;
    private javax.swing.JLabel txtDoanhThu;
    private javax.swing.JTextField txtNgayFrom;
    private javax.swing.JTextField txtNgayTo;
    private javax.swing.JLabel txtSoHoaDon;
    private javax.swing.JLabel txtSoSanPhamBan;
    // End of variables declaration//GEN-END:variables

    ThongKeDAO_Procedure tkdao = new ThongKeDAO_Procedure();

    void init() {
        if (cboSanPham.getSelectedIndex() == 0) {
            fillTableGoiTap();

            //Tính tổng doanh thu set lên label;
        } else if (cboSanPham.getSelectedIndex() == 1) {
            fillTableThuePT();
        } else if (cboSanPham.getSelectedIndex() == 2) {
            fillTableDungCu();
        }
//        else if(cboSanPham.getSelectedIndex()==3){
//            fillTableTatCa();
//        }
    }

    void fillTableGoiTap() {
        DefaultTableModel model = (DefaultTableModel) tblThongKe.getModel();
        model.setRowCount(0);
        try {
            String keyword = (String) cboSanPham.getSelectedItem();

            if (nhapDungNgayFrom == true && nhapDungNgayTo == true) {
                List<Object[]> list1 = tkdao.thongKeGT(XDate.toDate(txtNgayFrom.getText(), "dd-MM-yyyy"), XDate.toDate(txtNgayTo.getText(), "dd-MM-yyyy")); //đọc dữ liệu từ CSDL
                for (Object[] rows : list1) {
                    model.addRow(rows); //thêm từng hàng vào JTable
                }
            } else {
                List<Object[]> list = tkdao.thongKeGT_TatCa(); //đọc dữ liệu từ CSDL
                for (Object[] rows : list) {
                    model.addRow(rows); //thêm từng hàng vào JTable
                }
            }

            updateStatus();
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
            System.out.println(e);
        }

        //Tính tổng số hóa đơn
        int hoaDon = 0;
        if (tblThongKe.getRowCount() == 0) {
            hoaDon = 0;
            txtSoHoaDon.setText(String.valueOf(hoaDon));
            return;
        } else {
            hoaDon = tblThongKe.getRowCount();
            txtSoHoaDon.setText(String.valueOf(hoaDon));
        }
    }

    void fillTableThuePT() {
        DefaultTableModel model = (DefaultTableModel) tblThongKe.getModel();
        model.setRowCount(0);
        try {
            String keyword = (String) cboSanPham.getSelectedItem();

            if (nhapDungNgayFrom == true && nhapDungNgayTo == true) {
                List<Object[]> list1 = tkdao.thongKeThuePT(XDate.toDate(txtNgayFrom.getText(), "dd-MM-yyyy"), XDate.toDate(txtNgayTo.getText(), "dd-MM-yyyy")); //đọc dữ liệu từ CSDL
                for (Object[] rows : list1) {
                    model.addRow(rows); //thêm từng hàng vào JTable
                }
            } else {
                List<Object[]> list = tkdao.thongKeThuePT_TatCa(); //đọc dữ liệu từ CSDL
                for (Object[] rows : list) {
                    model.addRow(rows); //thêm từng hàng vào JTable
                }
            }

            updateStatus();
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
            System.out.println(e);
        }

        //Tính tổng số hóa đơn
        int hoaDon = 0;
        if (tblThongKe.getRowCount() == 0) {
            hoaDon = 0;
            txtSoHoaDon.setText(String.valueOf(hoaDon));
            return;
        } else {
            hoaDon = tblThongKe.getRowCount();
            txtSoHoaDon.setText(String.valueOf(hoaDon));
        }
    }

    void fillTableDungCu() {
        DefaultTableModel model = (DefaultTableModel) tblThongKe.getModel();
        model.setRowCount(0);
        try {
            String keyword = (String) cboSanPham.getSelectedItem();

            if (nhapDungNgayFrom == true && nhapDungNgayTo == true) {
                List<Object[]> list1 = tkdao.thongKeDungCu(XDate.toDate(txtNgayFrom.getText(), "dd-MM-yyyy"), XDate.toDate(txtNgayTo.getText(), "dd-MM-yyyy")); //đọc dữ liệu từ CSDL
                for (Object[] rows : list1) {
                    model.addRow(rows); //thêm từng hàng vào JTable
                }
            } else {
                List<Object[]> list = tkdao.thongKeDungCu_TatCa(); //đọc dữ liệu từ CSDL
                for (Object[] rows : list) {
                    model.addRow(rows); //thêm từng hàng vào JTable
                }
            }

            //Tính tổng số hóa đơn
            int hoaDon = 0;
            if (tblThongKe.getRowCount() == 0) {
                hoaDon = 0;
                txtSoHoaDon.setText(String.valueOf(hoaDon));
                return;
            } else {
                hoaDon = tblThongKe.getRowCount();
                txtSoHoaDon.setText(String.valueOf(hoaDon));
            }

            updateStatus();
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
            System.out.println(e);
        }
    }

    void updateStatus() {
        double doanhThu = 0;
        for (int i = 0; i < tblThongKe.getRowCount(); i++) {
            doanhThu += (double) tblThongKe.getValueAt(i, 2);
        }

        String convert = decimalFormat.format(doanhThu);

        txtDoanhThu.setText(convert + " VNĐ");

        //Tính tổng số sp bán
        int sanPham = 0;
        for (int i = 0; i < tblThongKe.getRowCount(); i++) {
            sanPham += (int) tblThongKe.getValueAt(i, 1);
        }
        txtSoSanPhamBan.setText(String.valueOf(sanPham));
    }

    void exportExcel() {
        String chon = (String) cboSanPham.getSelectedItem();
        double doanhThu = 0;
        for (int i = 0; i < tblThongKe.getRowCount(); i++) {
            doanhThu += (double) tblThongKe.getValueAt(i, 2);
        }
        
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Doanh thu");
            String convert = decimalFormat.format(doanhThu);

            // Tạo dòng "Báo cáo thống kê doanh thu của " + chon
            Row reportRow = sheet.createRow(0);
            Cell reportCell = reportRow.createCell(0);
            reportCell.setCellValue("Báo cáo thống kê doanh thu của " + chon);

            // Tạo định dạng cho dòng "Báo cáo thống kê doanh thu của " + chon
            CellStyle headerCellStyle = workbook.createCellStyle();
            Font headerFont = workbook.createFont();
            headerFont.setBold(true);
            headerFont.setFontHeightInPoints((short) 14);
            headerCellStyle.setFont(headerFont);
            headerCellStyle.setAlignment(HorizontalAlignment.CENTER);
            reportCell.setCellStyle(headerCellStyle);

            JTableHeader header = tblThongKe.getTableHeader();
            Row headerRow = sheet.createRow(1);
            for (int i = 0; i < header.getColumnModel().getColumnCount(); i++) {
                headerRow.createCell(i).setCellValue(header.getColumnModel().getColumn(i).getHeaderValue().toString());
            }

            for (int row = 0; row < tblThongKe.getRowCount(); row++) {
                Row excelRow = sheet.createRow(row + 2);
                for (int col = 0; col < tblThongKe.getColumnCount(); col++) {
                    Object value = tblThongKe.getValueAt(row, col);
                    Cell cell = excelRow.createCell(col);
                    if (value != null) {
                        if (value instanceof String) {
                            cell.setCellValue((String) value);
                        } else if (value instanceof Double) {
                            cell.setCellValue((Double) value);
                        } else if (value instanceof Integer) {
                            cell.setCellValue((Integer) value);
                        } else {
                            cell.setCellValue(value.toString());
                        }
                    }
                    // Căn giữa dữ liệu trong ô Cell
                    CellStyle cellStyle = workbook.createCellStyle();
                    cellStyle.setAlignment(HorizontalAlignment.CENTER);
                    cell.setCellStyle(cellStyle);
                }
            }

            // Tạo border cho bảng và tự động giãn cột theo nội dung
            for (int i = 0; i <= tblThongKe.getRowCount() + 1; i++) {
                Row row = sheet.getRow(i);
                if (row != null) {
                    for (int j = 0; j < tblThongKe.getColumnCount(); j++) {
                        Cell cell = row.getCell(j);
                        if (cell != null) {
                            CellStyle style = workbook.createCellStyle();
                            style.setBorderBottom(BorderStyle.THIN);
                            style.setBorderTop(BorderStyle.THIN);
                            style.setBorderLeft(BorderStyle.THIN);
                            style.setBorderRight(BorderStyle.THIN);
                            cell.setCellStyle(style);
                            sheet.autoSizeColumn(j); // Tự động giãn cột theo nội dung
                        }
                    }
                }
            }

            // Tạo dòng "TỔNG DOANH THU: " và chèn giá trị tổng vào cột thứ 3
            Row totalRow = sheet.createRow(tblThongKe.getRowCount() + 2);
            totalRow.createCell(0).setCellValue("TỔNG DOANH THU: " + convert);

            FileOutputStream outputStream = new FileOutputStream("Báo cáo thống kê doanh thu " + chon + ".xlsx");
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();

            JOptionPane.showMessageDialog(null, "Xuất báo cáo thành công!");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Xuất báo cáo thất bại!");
        }
    }
    }

