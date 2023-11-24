/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gym.entity;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class DonHang {

    /**
     * @return the madh
     */
    public int getMadh() {
        return madh;
    }

    /**
     * @param madh the madh to set
     */
    public void setMadh(int madh) {
        this.madh = madh;
    }

    /**
     * @return the ngayTao
     */
    public Date getNgayTao() {
        return ngayTao;
    }

    /**
     * @param ngayTao the ngayTao to set
     */
    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    /**
     * @return the tienNhan
     */
    public double getTienNhan() {
        return tienNhan;
    }

    /**
     * @param tienNhan the tienNhan to set
     */
    public void setTienNhan(double tienNhan) {
        this.tienNhan = tienNhan;
    }

    /**
     * @return the tienThua
     */
    public double getTienThua() {
        return tienThua;
    }

    /**
     * @param tienThua the tienThua to set
     */
    public void setTienThua(double tienThua) {
        this.tienThua = tienThua;
    }
    private String manv,makh;
    private boolean trangThai = false;
    private double tongTien;
    private Date ngayTao = new Date();
    private double tienNhan,tienThua;
    private int madh;

    

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public double getTongTien() {
        return tongTien ;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
    
}
