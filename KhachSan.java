/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ungdungquanlikhachsan;

/**
 *
 * @author KINHTHANH
 */
public class KhachSan {
    private Nguoi thongTinCaNhan;
    private int soNgayThue;
    private String loaiPhong;

    public KhachSan(Nguoi thongTinCaNhan, int soNgayThue, String loaiPhong) {
        this.thongTinCaNhan = thongTinCaNhan;
        this.soNgayThue = soNgayThue;
        this.loaiPhong = loaiPhong;
    }

    public Nguoi getThongTinCaNhan() {
        return thongTinCaNhan;
    }

    public void setThongTinCaNhan(Nguoi thongTinCaNhan) {
        this.thongTinCaNhan = thongTinCaNhan;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    @Override
    public String toString() {
        return "KhachSan{" + "thongTinCaNhan=" + thongTinCaNhan + ", soNgayThue=" + soNgayThue + ", loaiPhong=" + loaiPhong + '}';
    }
    
}
