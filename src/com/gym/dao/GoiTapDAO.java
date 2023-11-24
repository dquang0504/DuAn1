/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gym.dao;

import com.gym.db.DBHelper;
import com.gym.entity.GoiTap;
import com.gym.entity.NhanVien;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class GoiTapDAO extends GymSoftwareDAO<GoiTap, String>{

    String INSERT_SQL = "insert into GoiTap(MaGT,TenGoi,Gia,ThoiHan,MoTa) values (?,?,?,?,?)";
    String UPDATE_SQL = "update GoiTap set TenGoi = ?, Gia = ?, ThoiHan = ?, MoTa = ? where MaGT = ?";
    String DELETE_SQL = "delete GoiTap where MaGT = ?";
    String SELECT_ALL_SQL = "select * from GoiTap";
    String SELECT_BY_ID_SQL = "select * from GoiTap where MaGT = ?";
    
    @Override
    public void insert(GoiTap entity) {
        DBHelper.update(INSERT_SQL, 
                entity.getMaGT(),
                entity.getTenGoi(),
                entity.getGia(),
                entity.getThoiHan(),
                entity.getMoTa());
    }

    @Override
    public void update(GoiTap entity) {
        DBHelper.update(UPDATE_SQL, 
                entity.getTenGoi(),
                entity.getGia(),
                entity.getThoiHan(),
                entity.getMoTa(),
                entity.getMaGT());
    }

    @Override
    public void delete(String id) {
        DBHelper.update(DELETE_SQL, id);
    }

    @Override
    public GoiTap selectById(String id) {
        List<GoiTap> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<GoiTap> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<GoiTap> selectBySql(String sql, Object... args) {
        List<GoiTap> list = new ArrayList<GoiTap>();
        try {
            ResultSet rs = (ResultSet) DBHelper.query(sql, args);
            while (rs.next()) {
                GoiTap entity = new GoiTap();
                entity.setMaGT(rs.getString("MaGT"));
                entity.setTenGoi(rs.getString("TenGoi"));
                entity.setGia(rs.getDouble("Gia"));
                entity.setThoiHan(rs.getInt("ThoiHan"));
                entity.setMoTa(rs.getString("MoTa"));
                
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<GoiTap> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM GoiTap WHERE TenGoi like ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }
}
