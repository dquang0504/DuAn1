/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gym.dao;
import com.gym.db.DBHelper;
import com.gym.entity.ChiTietDungCu;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ChiTietDungCuDAO extends GymSoftwareDAO<ChiTietDungCu, String>{
    
    final String INSERT_SQL = "INSERT INTO ChiTietDungCu(MaDC,MaDH,MaKH,SoLuong,Gia) values (?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE ChiTietDungCu SET MaDC = ?,MaDH = ?,MaKH = ?, SoLuong=?, Gia = ? where MaCTDC=?";
    final String DELETE_SQL = "DELETE FROM ChiTietDungCu WHERE MaCTDC=?";
    final String DELETE_MADC_SQL = "DELETE FROM ChiTietDungCu WHERE MaDC=?";
    final String DELETE_MADH_DC_SQL = "DELETE FROM ChiTietDungCu WHERE MaDH = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM ChiTietDungCu";
    final String SELECT_BY_ID_SQL = "SELECT * FROM ChiTietDungCu where MaCTDC=?";
    final String SELECT_BY_MaDH_SQL = "SELECT * FROM ChiTietDungCu where MaDH=?";
    final String SELECT_ORDER_CTDC = "SELECT MaDC, MaKH ,MaDH, SUM(SoLuong) AS SoLuong, SUM(Gia) AS Gia\n" +
"FROM ChiTietDungCu where MaDH like ?\n" +
"GROUP BY MaDH, MaDC, MaKH\n" +
"order by Gia";

    @Override
    public void insert(ChiTietDungCu entity) {
        DBHelper.update(INSERT_SQL,
                entity.getMadc(),
                entity.getMadh(),
                entity.getMakh(),
                entity.getSl(),
                entity.getGia()
        );
    }

    @Override
    public void update(ChiTietDungCu entity) {
        DBHelper.update(UPDATE_SQL,
                entity.getMadc(),
                entity.getMadh(),
                entity.getMakh(),
                entity.getSl(),
                entity.getGia(),
                entity.getMactdc()
        );
    }

    @Override
    public void delete(String id) {
        DBHelper.update(DELETE_SQL, id);
    }
    
    public void deleteMaDC(String id){
        DBHelper.update(DELETE_MADC_SQL, id);
    }
    
    public void deleteMaDH_CTDC(int id) {
        DBHelper.update(DELETE_MADH_DC_SQL, id);
    }
    
    @Override
    public ChiTietDungCu selectById(String id) {
        List<ChiTietDungCu> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    public ChiTietDungCu selectByMaDH_CTDC(String madh) {
        List<ChiTietDungCu> list = this.selectBySql(SELECT_BY_MaDH_SQL,madh);
        if (list.isEmpty()) {
            return null;
        }
        return (ChiTietDungCu) list;
    }

    @Override
    public List<ChiTietDungCu> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<ChiTietDungCu> selectBySql(String sql, Object... args) {
        List<ChiTietDungCu> list = new ArrayList<ChiTietDungCu>();
        try {
            ResultSet rs = (ResultSet) DBHelper.query(sql, args);
            while (rs.next()) {
                ChiTietDungCu entity = new ChiTietDungCu();
//                entity.setMactgt(rs.getInt("MaCTGT"));
                entity.setMadc(rs.getString("MaDC"));
                entity.setMadh(rs.getInt("MaDH"));
                entity.setMakh(rs.getString("MaKH"));
                entity.setSl(rs.getInt("SoLuong"));
                entity.setGia(rs.getDouble("Gia"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            System.out.println("lỗi ở đây");
            throw new RuntimeException(e);

        }
    }
    
    public List<ChiTietDungCu> selectByKeyword_CTDC(String keyword) {
        String sql = "SELECT * FROM ChiTietDungCu WHERE MaCTDC like ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }
    
    public List<ChiTietDungCu> selectByMaDHTest_CTDC(int keyword) {
        String sql = "SELECT * FROM ChiTietDungCu WHERE MaDH like ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }
    
    public List<ChiTietDungCu> selectByMaDH_CTDC(int keyword) {
        
        return this.selectBySql(SELECT_ORDER_CTDC, "%" + keyword + "%");
    }
    
}
