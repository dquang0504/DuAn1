
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gym.dao;

import com.gym.db.DBHelper;
import com.gym.entity.ChiTietGoiTap;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 84934
 */
public class ChiTietGoiTapDAO extends GymSoftwareDAO<ChiTietGoiTap, String> {

    final String INSERT_SQL = "INSERT INTO ChiTietGoiTap(MaKH,MaGT,MaDH,NgayDK,NgayKT,SoLuong,Gia) values (?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE ChiTietGoiTap SET MaKH = ?,MaGT = ?,MaDH = ?,NgayDK = ?,NgayKT = ?, SoLuong=?,Gia = ? where MaCTGT=?";
    final String updateSLQuery = "UPDATE ChiTietGoiTap SET SoLuong = SoLuong - ?, "
            + "Gia = Gia - ?,"
            + "NgayKT = DATEADD(DAY, -ThoiHan * ?, NgayKT) "
            + "WHERE MaGT = ?";
    final String update_dung = "UPDATE ChiTietGoiTap SET SoLuong = SoLuong + ?, Gia = Gia + ?, NgayKT = DATEADD(DAY, ?, NgayKT) where Magt = ?";
    final String update_NgayKT = "UPDATE ChiTietGoiTap SET NgayKT = (SELECT MAX(NgayKT) FROM ChiTietGoiTap) where MaGT = ?";
    final String update_NgayKT_LonHon = "UPDATE ChiTietGoiTap SET NgayKT = DATEADD(DAY, ?, NgayKT) where MaGT = ?";
    final String updateGT_theoSL = "UPDATE ChiTietGoiTap SET SoLuong = SoLuong - ?, Gia = Gia - ?, NgayKT = DATEADD(DAY, ?, NgayKT) where MaGT = ?";
    final String DELETE_SQL = "DELETE FROM ChiTietGoiTap WHERE MaCTGT=?";
    final String DELETE_MAGT_SQL = "DELETE FROM ChiTietGoiTap WHERE MaGT=?";
    final String DELETE_MADH_GT_SQL = "DELETE FROM ChiTietGoiTap WHERE MaDH = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM ChiTietGoiTap";
    final String SELECT_BY_ID_SQL = "SELECT * FROM ChiTietGoiTap where MaCTGT=?";
    final String SELECT_BY_MaDH_SQL = "SELECT * FROM ChiTietGoiTap where MaDH=?";

    final String SELECT_BY_MADH_GET_TENGOI = "select TenGoi from ChiTietGoiTap ctgt inner join GoiTap gt\n"
            + "on ctgt.MaGT = gt.MaGT\n"
            + "where MaDH = ?";

    @Override

    public void insert(ChiTietGoiTap entity) {
        DBHelper.update(INSERT_SQL,
                entity.getMakh(),
                entity.getMagt(),
                entity.getMadh(),
                entity.getNgaydk(),
                entity.getNgaykt(),
                entity.getSoluong(),
                entity.getGia()
        );
    }

    @Override
    public void update(ChiTietGoiTap entity) {
        DBHelper.update(UPDATE_SQL,
                entity.getMakh(),
                entity.getMagt(),
                entity.getMadh(),
                entity.getNgaydk(),
                entity.getNgaykt(),
                entity.getSoluong(),
                entity.getGia(),
                entity.getMactgt()
        );
    }

    public void updateDung(int input, int thoiHan, String magt, double giaTang) {
        DBHelper.update(update_dung,
                input,
                giaTang,
                thoiHan,
                magt
        );
    }

    public void updateNgayKT(String magt) {
        DBHelper.update(update_NgayKT,
                magt
        );
    }
    
    public void updateNgayKT_LonHon(String magt,int thoiHan) {
        DBHelper.update(update_NgayKT_LonHon,
                thoiHan,
                magt
        );
    }

    public void updateSoLuongGia(int input, int thoiHan, String magt, double giaGiam) {
        DBHelper.update(updateGT_theoSL,
                input,
                giaGiam,
                thoiHan,
                magt
        );
    }

    @Override
    public void delete(String id) {
        DBHelper.update(DELETE_SQL, id);
    }

    public void deleteMaGT(String id) {
        DBHelper.update(DELETE_MAGT_SQL, id);
    }

    public void deleteMaDH_CTGT(int id) {
        DBHelper.update(DELETE_MADH_GT_SQL, id);
    }

    @Override
    protected List<ChiTietGoiTap> selectBySql(String sql, Object... args) {
        List<ChiTietGoiTap> list = new ArrayList<ChiTietGoiTap>();
        try {
            ResultSet rs = (ResultSet) DBHelper.query(sql, args);
            while (rs.next()) {
                ChiTietGoiTap entity = new ChiTietGoiTap();
//                entity.setMactgt(rs.getInt("MaCTGT"));
                entity.setMakh(rs.getString("MaKH"));
                entity.setMagt(rs.getString("MaGT"));
                entity.setMadh(rs.getInt("MaDH"));
                entity.setNgaydk(rs.getDate("NgayDK"));
                entity.setNgaykt(rs.getDate("NgayKT"));
                entity.setSoluong(rs.getInt("SoLuong"));
                entity.setGia(rs.getDouble("Gia"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException(e);

        }
    }

    @Override
    public ChiTietGoiTap selectById(String id) {
        List<ChiTietGoiTap> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public ChiTietGoiTap selectByMaDH_CTGT(String madh) {
        List<ChiTietGoiTap> list = this.selectBySql(SELECT_BY_MaDH_SQL, madh);
        if (list.isEmpty()) {
            return null;
        }
        return (ChiTietGoiTap) list;
    }

    @Override
    public List<ChiTietGoiTap> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    public List<ChiTietGoiTap> selectByKeyword_CTGT(String keyword) {
        String sql = "SELECT * FROM ChiTietGoiTap WHERE MaCTGT like ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

    public List<ChiTietGoiTap> selectByMaDH_CTGT(int keyword) {
        String sql = "SELECT * FROM ChiTietGoiTap WHERE MaDH like ? order by NgayKT asc";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

    
    
    public ArrayList<String> findMaGTsLargerThanNgayKT(String magt) {
        ArrayList<String> resultList = new ArrayList<>();
        try {
            String sql = "SELECT MaGT FROM ChiTietGoiTap WHERE MaGT != ? AND NgayKT > (SELECT NgayKT FROM ChiTietGoiTap WHERE MaGT = ?)";
            ResultSet rs = DBHelper.query(sql, magt, magt);
            while (rs.next()) {
                resultList.add(rs.getString("MaGT"));
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultList;
    }

    public void updateNgayKT(String magt, int thoiHan) {
        try {
            String sql = "UPDATE ChiTietGoiTap SET NgayKT = DATEADD(DAY, ?, NgayKT) WHERE MaGT IN (SELECT MaGT FROM ChiTietGoiTap WHERE MaGT != ? AND NgayKT > (SELECT NgayKT FROM ChiTietGoiTap WHERE MaGT = ?))";
            DBHelper.update(sql, thoiHan, magt, magt);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
