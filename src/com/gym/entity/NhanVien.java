/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gym.entity;

import java.util.Date;

/**
 *
 * @author 84934
 */
public class NhanVien {

    /**
     * @return the trangThai
     */
    public boolean isTrangThai() {
        return trangThai;
    }

    /**
     * @param trangThai the trangThai to set
     */
    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    private String maNV;
    private String hoten;
    private String matKhau;
    private Date ngaySinh = new Date();
    private String dienThoai;
    private String Email;
    private boolean vaiTro;
    private boolean GioiTinh;
    private boolean trangThai;
    private String Hinh;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoten, String matKhau, Date ngaySinh, String dienThoai, String Email, boolean vaiTro, boolean GioiTinh, String Hinh) {
        this.maNV = maNV;
        this.hoten = hoten;
        this.matKhau = matKhau;
        this.ngaySinh = ngaySinh;
        this.dienThoai = dienThoai;
        this.Email = Email;
        this.vaiTro = vaiTro;
        this.GioiTinh = GioiTinh;
        this.Hinh = Hinh;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public boolean isVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

}
