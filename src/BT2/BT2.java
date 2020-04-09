/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

import BT1.NhanVien;

/**
 *
 * @author admin
 */
public class BT2 {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien("Tiến",20,"Vạn Giã", 1000, 200);
        NhanVien nv1 = new NhanVien("Tốt",21,"Vạn Bình", 1500, 150);
        NhanVien nv2 = new NhanVien("Tân",50,"Nha Trang", 2000, 90);
        NhanVien nv3 = new NhanVien("Nhuận",49,"Vạn Giã", 1000, 150);
        NhanVien nv4 = new NhanVien("Tâm",18,"Vạn Bình", 1500, 250);
        var qlnv = new QuanLyNhanVien();
        qlnv.them(nv);
        qlnv.them(nv1);
        qlnv.them(nv2);
        qlnv.them(nv3);
        qlnv.them(nv4);
        qlnv.inDS();
    }
}
