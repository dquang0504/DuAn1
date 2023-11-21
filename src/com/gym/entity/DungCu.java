/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gym.entity;

/**
 *
 * @author ADMIN
 */
public class DungCu {

    /**
     * @return the hinh
     */
    public String getHinh() {
        return hinh;
    }

    /**
     * @param hinh the hinh to set
     */
    public void setHinh(String hinh) {
        this.hinh = hinh;
    }
    private String madc,tendc;
    private double gia;
    private int sl;
    private String hinh;

    public String getMadc() {
        return madc;
    }

    public void setMadc(String madc) {
        this.madc = madc;
    }

    public String getTendc() {
        return tendc;
    }

    public void setTendc(String tendc) {
        this.tendc = tendc;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    
}
