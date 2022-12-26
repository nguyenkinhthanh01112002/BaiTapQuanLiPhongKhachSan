/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ungdungquanlikhachsan;

import java.util.Scanner;

/**
 *
 * @author KINHTHANH
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLiKhachSan quanLiKhachSan = new QuanLiKhachSan();
        while(true)
        {
            System.out.println("............UNG DUNG QUAN LI KHACH SAN...............");
            System.out.println("1.Them khach hang vao danh muc can quan li");
            System.out.println("2.Hien thi thong tin cua khach hang");
            System.out.println("3.Xoa khach hang theo so CMND");
            System.out.println("4.Hien thi so tien thue phong theo so CMND");
            System.out.println("0.Thoat");
            String button = scanner.nextLine();
            switch(button)
            {
                case "1" ->                 {
                    System.out.print("nhap vao ten cua khach hang: ");
                    String hoTen = scanner.nextLine();
                    System.out.print("nhap vao so tuoi cua khach hang: ");
                    int tuoi = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("nhap vao so CMND cua khach hang: ");
                    String soCMND = scanner.nextLine();                  
                    System.out.print("nhap vao so ngay thue: ");
                    //scanner.nextLine();
                    int soNgayThue = scanner.nextInt();
                    //System.out.println(""+soCMND);
                    scanner.nextLine();
                    System.out.print("nhap vao loai phong(chi duoc nhap A,B hoac C: ");
                    String loaiPhong = scanner.nextLine();
                    Nguoi thongTinCaNhan = new Nguoi(hoTen, tuoi, soCMND);
                    KhachSan khachSan = new KhachSan(thongTinCaNhan, soNgayThue, loaiPhong);
                    quanLiKhachSan.addCcustomers(khachSan);
                    break;
                }
                case "2" ->                 {
                    System.out.println("Hien thi thong tin cua khach hang:");;
                    quanLiKhachSan.showCustomers();
                }
                case "3" ->                 {
                    System.out.print("nhap vao so chung minh nhan dan can xoa: ");
                    String soCMCanXoa = scanner.nextLine();
                    quanLiKhachSan.removeCustomers(soCMCanXoa);
                    System.out.println("-----------THONG TIN KHACH HANG SAU KHI XOA------------ ");
                    quanLiKhachSan.showCustomers();
                }
                case "4" ->                 {
                    System.out.print("nhap vao so CM can nhap: ");
                    String soCMCanNhap = scanner.nextLine();
                    System.out.println(quanLiKhachSan.hienThiThongTinTheoCMND(soCMCanNhap));
                    System.out.println("SO TIEN CUA QUY KHACH CAN PHAI TRA = "+quanLiKhachSan.tinhTienPhong(soCMCanNhap)+"$");
                }
                case "0" -> {
                    return;
                }
                default -> {
                    System.out.println("du lieu khong hop le");
                    continue;
                }
            }
        } 
                    
    }
    
}
