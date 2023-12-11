/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gym.dao;

import com.gym.db.DBHelper;
import com.gym.entity.DungCu;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 84934
 */
public class DungCuDAO extends GymSoftwareDAO<DungCu, String> {

    final String INSERT_SQL = "INSERT into DungCu(MaDC,TenDungCu,Gia,MoTa,Hinh)values(?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE DungCu SET TenDungCu = ?,Gia= ?,MoTa= ? , Hinh = ? where MaDC=?";
    final String DELETE_SQL = "DELETE FROM DungCu WHERE MaDC=?";
    final String SELECT_ALL_SQL = "SELECT * FROM DungCu";
    final String SELECT_MADC = "SELECT MaDC from DungCu";
    final String SELECT_BY_ID_SQL = "SELECT * FROM DungCu where MaDC=?";

    @Override
    public void insert(DungCu entity) {
        DBHelper.update(INSERT_SQL,
                entity.getMadc(),
                entity.getTendc(),
                entity.getGia(),
                entity.getMota(),
                entity.getHinh()
        );
    }

    @Override
    public void update(DungCu entity) {
        DBHelper.update(UPDATE_SQL,
                entity.getTendc(),
                entity.getGia(),
                entity.getMota(),
                entity.getHinh(),
                entity.getMadc()
        );
    }

    @Override
    public void delete(String id) {
        DBHelper.update(DELETE_SQL, id);
    }

    @Override
    protected List<DungCu> selectBySql(String sql, Object... args) {
        List<DungCu> list = new ArrayList<DungCu>();
        try {
            ResultSet rs = (ResultSet) DBHelper.query(sql, args);
            while (rs.next()) {
                DungCu entity = new DungCu();
                entity.setMadc(rs.getString("MaDC"));
                entity.setTendc(rs.getString("TenDungCu"));
                entity.setGia(rs.getDouble("Gia"));
                entity.setMota(rs.getString("MoTa"));
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
    public DungCu selectById(String id) {
        List<DungCu> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<DungCu> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    public List<DungCu> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM DungCu WHERE TenDungCu like ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }
    
    private List<DungCu> selectBySql_getMaDC(String sql, Object... args) {
        List<DungCu> list = new ArrayList<DungCu>();
        try {
            ResultSet rs = (ResultSet) DBHelper.query(sql, args);
            while (rs.next()) {
                DungCu entity = new DungCu();
                entity.setMadc(rs.getString("MaDC"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<DungCu> selectGetMaDC(){
        return this.selectBySql_getMaDC(SELECT_MADC);
    }

}
