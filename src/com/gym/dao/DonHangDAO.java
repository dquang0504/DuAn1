/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gym.dao;

import com.gym.db.DBHelper;
import com.gym.entity.DonHang;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 84934
 */
public class DonHangDAO extends GymSoftwareDAO<DonHang, String> {
    final String INSERT_DH = "INSERT INTO DonHang(MaNV,NgayTao,TrangThai,TongTien,TienNhan,TienThua) values (?,?,?,?,?,?)";
    final String INSERT_SQL = "INSERT into DonHang(MaNV,MaKH,NgayTao,TrangThai,TongTien,TienNhan,TienThua)values(?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE DonHang SET MaNV = ?,MaKH = ?, NgayTao = ?,TrangThai = ?,TongTien = ?, TienNhan = ?, TienThua = ? where MaDH=?";
    final String DELETE_SQL = "DELETE FROM DonHang WHERE MaDH=?";
    final String SELECT_ALL_SQL = "SELECT * FROM DonHang";
    final String SELECT_BY_ID_SQL = "SELECT * FROM DonHang where MaDH=?";

    @Override
    public void insert(DonHang entity) {
        DBHelper.update(INSERT_SQL,
                entity.getManv(),
                entity.getMakh(),
                entity.getNgayTao(),
                entity.isTrangThai(),
                entity.getTongTien(),
                entity.getTienNhan(),
                entity.getTienThua()
        );
    }
    
    public void createDH(DonHang entity){
        DBHelper.update(INSERT_DH,
                entity.getManv(),
                entity.getNgayTao(),
                entity.isTrangThai(),
                entity.getTongTien(),
                entity.getTienNhan(),
                entity.getTienThua()
        );
    }

    @Override
    public void update(DonHang entity) {
        DBHelper.update(UPDATE_SQL,
                entity.getManv(),
                entity.getMakh(),
                entity.getNgayTao(),
                entity.isTrangThai(),
                entity.getTongTien(),
                entity.getTienNhan(),
                entity.getTienThua(),
                entity.getMadh()
        );
    }

    @Override
    public void delete(String id) {
        DBHelper.update(DELETE_SQL, id);
    }

    @Override
    protected List<DonHang> selectBySql(String sql, Object... args) {
        List<DonHang> list = new ArrayList<DonHang>();
        try {
            ResultSet rs = (ResultSet) DBHelper.query(sql, args);
            while (rs.next()) {
                DonHang entity = new DonHang();
                entity.setMadh(rs.getInt("MaDH"));
                entity.setManv(rs.getString("MaNV"));
                entity.setMakh(rs.getString("MaKH"));
                entity.setNgayTao(rs.getTimestamp("NgayTao"));
                entity.setTrangThai(rs.getBoolean("TrangThai"));
                entity.setTongTien(rs.getDouble("TongTien"));
                entity.setTienNhan(rs.getDouble("TienNhan"));
                entity.setTienThua(rs.getDouble("TienThua"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DonHang selectById(String id) {
        List<DonHang> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<DonHang> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    public List<DonHang> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM DonHang WHERE MaDH like ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

}
