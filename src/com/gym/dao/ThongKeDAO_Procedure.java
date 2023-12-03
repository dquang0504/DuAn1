/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gym.dao;

import com.gym.db.DBHelper;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ThongKeDAO_Procedure {

    List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = DBHelper.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Object[]> giamGT(String magt, Integer madh) {
        String sql = "{CALL sp_ReduceQuantityAndUpdateDetails(?,?)}";
        String[] cols = {"MaGT", "MaDH", "SoLuong", "ThoiHan", "Gia", "NgayDK", "NgayKT"};
        return this.getListOfArray(sql, cols, magt, madh);
    }

    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String CONNECTION_URL = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyPhongGym;user=sa;password=12345;encrypt=true;trustServerCertificate=true";

    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }

    public void giamSL(String magt, Integer madh) {

        try ( Connection connection = DriverManager.getConnection(CONNECTION_URL);  
            CallableStatement statement = connection.prepareCall("{CALL sp_ReduceQuantityAndUpdateDetails(?,?)}")) {

            statement.setString(1, magt);
            statement.setInt(2, madh);
            statement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void tangSL(String magt, Integer madh) {

        try ( Connection connection = DriverManager.getConnection(CONNECTION_URL);  
            CallableStatement statement = connection.prepareCall("{CALL sp_IncreaseQuantityAndUpdateDetails(?,?)}")) {

            statement.setString(1, magt);
            statement.setInt(2, madh);
            statement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public List<Object[]> thongKeGT_TatCa() {
        String sql = "{CALL sp_ThongKeGoiTap()}";
        String[] cols = {"MaDH", "SoLuong", "ThanhTien", "NgayTao"};
        return this.getListOfArray(sql, cols);
    }
    
    public List<Object[]> thongKeGT(Date dayFrom, Date dayTo) {
        String sql = "{CALL sp_ThongKeGoiTap(?,?)}";
        String[] cols = {"MaDH", "SoLuong", "ThanhTien", "NgayTao"};
        return this.getListOfArray(sql, cols, dayFrom, dayTo);
    }
    
    public List<Object[]> thongKeThuePT_TatCa() {
        String sql = "{CALL sp_ThongKeThuePT()}";
        String[] cols = {"MaDH", "SoLuong", "ThanhTien", "NgayTao"};
        return this.getListOfArray(sql, cols);
    }
    
    public List<Object[]> thongKeThuePT(Date dayFrom, Date dayTo) {
        String sql = "{CALL sp_ThongKeThuePT(?,?)}";
        String[] cols = {"MaDH", "SoLuong", "ThanhTien", "NgayTao"};
        return this.getListOfArray(sql, cols, dayFrom, dayTo);
    }
    
}
