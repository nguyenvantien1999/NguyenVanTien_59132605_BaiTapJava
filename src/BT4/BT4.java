/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT4;

/**
 *
 * @author admin
 */
public class BT4 {
    public static void main(String[] args) {
        XeNoiThanh xeNoi = new XeNoiThanh("001", "Tiến", "N1-150", 1500, 5, 50);
        XeNoiThanh xeNoi1 = new XeNoiThanh("002", "Tốt", "N1-150", 3500, 1, 50);
        XeNoiThanh xeNoi2 = new XeNoiThanh("003", "Tài", "N2-4651", 7000, 10, 70);
        
        XeNgoaiThanh xeNgoai = new XeNgoaiThanh("cam Ranh", 5, "004", "Nghĩa", "N1-555", 20000);
        XeNgoaiThanh xeNgoai1 = new XeNgoaiThanh("HCM", 20, "005", "Hưng", "N2-12345", 90000);
        XeNgoaiThanh xeNgoai2 = new XeNgoaiThanh("Vạn Giã", 10, "005", "Tuấn", "V1-12345", 50000);
        
        var qlXe = new QuanLyChuyenXe();
        qlXe.themChuyenXe(xeNoi);
        qlXe.themChuyenXe(xeNoi1);
        qlXe.themChuyenXe(xeNoi2);
        
        qlXe.themChuyenXe(xeNgoai);
        qlXe.themChuyenXe(xeNgoai1);
        qlXe.themChuyenXe(xeNgoai2);
        qlXe.inListChuyenXe();
        
        System.out.println("Tổng doanh thu xe nội thành: "+qlXe.tinhDoanhThuNoiThanh());
        System.out.println("Tổng doanh thu xe ngoai thành: "+qlXe.tinhDoanhThuNgoaiThanh());
        System.out.println("Tổng số doanh thu: "+qlXe.tongDoanhThu());
    }
}
