/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gym.dao;

import com.gym.db.DBHelper;
import com.gym.entity.KhachHang;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 84934
 */
public class KhachHangDAO extends GymSoftwareDAO<KhachHang, String> {

    final String INSERT_SQL = "INSERT into KhachHang(MaKH,HoTen,SDT,Email,GioiTinh)values(?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE KhachHang SET HoTen = ?,SDT=?,Email=?,GioiTinh=? where MaKH=?";
    final String DELETE_SQL = "DELETE FROM KhachHang WHERE MaKH=?";
    final String SELECT_ALL_SQL = "SELECT * FROM KhachHang";
    final String SELECT_MAKH = "SELECT MaKH from KhachHang";
    final String SELECT_BY_ID_SQL = "SELECT * FROM KhachHang where MaKH=?";

    @Override
    public void insert(KhachHang entity) {
        DBHelper.update(INSERT_SQL,
                entity.getMaKH(),
                entity.getTenKH(),
                entity.getSdt(),
                entity.getEmail(),
                entity.isGioiTinh()
        );
    }

    @Override
    public void update(KhachHang entity) {
        DBHelper.update(UPDATE_SQL,
                entity.getTenKH(),
                entity.getSdt(),
                entity.getEmail(),
                entity.isGioiTinh(),
                entity.getMaKH()
        );
    }

    @Override
    public void delete(String id) {
        DBHelper.update(DELETE_SQL, id);
    }

    @Override
    protected List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<KhachHang>();
        try {
            ResultSet rs = (ResultSet) DBHelper.query(sql, args);
            while (rs.next()) {
                KhachHang entity = new KhachHang();
                entity.setMaKH(rs.getString("MaKH"));
                entity.setTenKH(rs.getString("HoTen"));
                entity.setSdt(rs.getString("SDT"));
                entity.setEmail(rs.getString("Email"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public KhachHang selectById(String id) {
        List<KhachHang> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<KhachHang> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    public List<KhachHang> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM KhachHang WHERE HoTen like ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }
    
    private List<KhachHang> selectBySql_getMaKH(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<KhachHang>();
        try {
            ResultSet rs = (ResultSet) DBHelper.query(sql, args);
            while (rs.next()) {
                KhachHang entity = new KhachHang();
                entity.setMaKH(rs.getString("MaKH"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<KhachHang> selectGetMaKH(){
        return this.selectBySql_getMaKH(SELECT_MAKH);
    }

}
