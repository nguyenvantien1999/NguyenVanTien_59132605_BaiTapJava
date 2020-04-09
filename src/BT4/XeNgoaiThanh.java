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
public class XeNgoaiThanh extends ChuyenXe{
    String noiDen;
    double soNgayDi;

    public XeNgoaiThanh(String noiDen, double soNgayDi, String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    @Override
    public void inThongTinChuyenXe() {
        System.out.println("Mã số chuyến: "+this.maSoChuyen+
                "\nHọ và tên tài xế: "+this.hoTenTaiXe+
                "\nSố xe: "+this.soXe+
                "\nNơi đến: "+this.noiDen+
                "\nSố ngày đi: "+this.soNgayDi+
                "\nDoanh thu: "+this.doanhThu);
    }
     
}
