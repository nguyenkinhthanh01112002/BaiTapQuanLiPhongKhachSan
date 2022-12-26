/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ungdungquanlikhachsan;

/**
 *
 * @author KINHTHANH
 */
public class Nguoi {
    private String hoTen;
    private int tuoi;
    private String soCMND;

    public Nguoi(String hoTen, int tuoi, String soCMND) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.soCMND = soCMND;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    @Override
    public String toString() {
        return "{" + "hoTen=" + hoTen + ", tuoi=" + tuoi + ", soCMND=" + soCMND + '}';
    }
    
}
