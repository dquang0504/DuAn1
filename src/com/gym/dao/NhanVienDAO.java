/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gym.dao;

import com.gym.db.DBHelper;
import com.gym.entity.NhanVien;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 84934
 */
public class NhanVienDAO extends GymSoftwareDAO<NhanVien, String> {

    final String INSERT_SQL = "INSERT into NhanVien(MaNV,HoTen,MatKhau,NgaySinh,SDT,Email,VaiTro,GioiTinh,TrangThai,Hinh)values(?,?,?,?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE NhanVien SET HoTen = ?,NgaySinh = ?,SDT = ?,Email = ?,VaiTro = ?,GioiTinh = ?, TrangThai = ?,Hinh = ? where MaNV=?";
    final String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV=?";
    final String SELECT_ALL_SQL = "SELECT * FROM NhanVien";
    final String SELECT_BY_ID_SQL = "SELECT * FROM NhanVien where MaNV=?";
    final String SELECT_MANV = "SELECT MaNV from NhanVien";
    final String SELECT_EMAIL_FROM_MANV = "SELECT Email from NhanVien where MaNV = ?";

    @Override
    public void insert(NhanVien entity) {
        DBHelper.update(INSERT_SQL, 
                entity.getMaNV(), 
                entity.getHoten(),
                entity.getMatKhau(),
                entity.getNgaySinh(),
                entity.getDienThoai(),
                entity.getEmail(), 
                entity.isVaiTro(), 
                entity.isGioiTinh(), 
                entity.isTrangThai(),
                entity.getHinh());
    }

    @Override
    public void update(NhanVien entity) {
        DBHelper.update(UPDATE_SQL, 
                entity.getHoten(),
                entity.getNgaySinh(), 
                entity.getDienThoai(),
                entity.getEmail(), 
                entity.isVaiTro(), 
                entity.isGioiTinh(),  
                entity.isTrangThai(),
                entity.getHinh(), 
                entity.getMaNV());
    }

    @Override
    public void delete(String id) {
        DBHelper.update(DELETE_SQL, id);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<NhanVien>();
        try {
            ResultSet rs = (ResultSet) DBHelper.query(sql, args);
            while (rs.next()) {
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getString("MaNV"));
                entity.setHoten(rs.getString("HoTen"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setNgaySinh(rs.getDate("NgaySinh"));
                entity.setDienThoai(rs.getString("SDT"));
                entity.setEmail(rs.getString("Email"));

                entity.setVaiTro(rs.getBoolean("VaiTro"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                entity.setTrangThai(rs.getBoolean("TrangThai"));
                entity.setHinh(rs.getString("Hinh"));

                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public NhanVien selectById(String id) {
        List<NhanVien> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NhanVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }
    
    public List<NhanVien> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM NhanVien WHERE HoTen like ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }
    

    private List<NhanVien> selectBySql_getMaNV(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<NhanVien>();
        try {
            ResultSet rs = (ResultSet) DBHelper.query(sql, args);
            while (rs.next()) {
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getString("MaNV"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<NhanVien> selectGetMaNV(){
        return this.selectBySql_getMaNV(SELECT_MANV);
    }
    
    

}
