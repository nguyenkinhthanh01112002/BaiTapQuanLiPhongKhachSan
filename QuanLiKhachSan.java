/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ungdungquanlikhachsan;

import java.util.ArrayList;

/**
 *
 * @author KINHTHANH
 */
public class QuanLiKhachSan {
    private ArrayList<KhachSan> customers;
    public QuanLiKhachSan()
    {
        this.customers = new ArrayList<>();
    }
    public void addCcustomers(KhachSan khachSan){
        this.customers.add(khachSan);
    }
    public void removeCustomers(String soCMCanXoa)
    {
        boolean check = false;
        for(int i=0;i<this.customers.size();i++)
        {
            if(this.customers.get(i).getThongTinCaNhan().getSoCMND().equals(soCMCanXoa)==true)
            {
                this.customers.remove(i);
                check = true;
            }
        }
        if(check==false)
        {
            System.out.println("khong tim thay so chung minh vua nhap!!! ");
        }
    }
    public long tinhTienPhong(String soCMCanNhap)
    {
        long tongTien = 0;
        for(KhachSan o:customers)
        {
            if(o.getThongTinCaNhan().getSoCMND().equals(soCMCanNhap)==true)
            {
                if(null==o.getLoaiPhong())
                {
                   return o.getSoNgayThue()*100;
                }
                else switch (o.getLoaiPhong()) {
                    case "A":
                        tongTien =  o.getSoNgayThue()*500;
                        break;
                    case "B":
                        tongTien = o.getSoNgayThue()*300;
                        break;
                    default:
                        tongTien =  o.getSoNgayThue()*100;
                        break;
                }
            }
        }
        return tongTien;
    }
    public String hienThiThongTinTheoCMND(String soCMCanNhap)
    {
        for(KhachSan o:customers)
        {
            if(o.getThongTinCaNhan().getSoCMND().equals(soCMCanNhap)==true)
            {
                return o.toString();
            }
        }
        return null;
    }
    public void showCustomers()
    {
        for(KhachSan o:customers)
        {
            System.out.println(o.toString());
        }
    }
}
