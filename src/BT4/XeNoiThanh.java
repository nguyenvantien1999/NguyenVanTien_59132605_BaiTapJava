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
public class XeNoiThanh extends ChuyenXe{

    int soTuyen;
    double soKm;
     
    public XeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, int soTuyen, double soKm) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }
    
    @Override
    public void inThongTinChuyenXe() {
        System.out.println("Mã số chuyến: "+this.maSoChuyen+
                "\nHọ và tên tài xế: "+this.hoTenTaiXe+
                "\nSố xe: "+this.soXe+
                "\nSố tuyến: "+this.soTuyen+
                "\nSố km đi được: "+this.soKm+
                "\nDoanh thu: "+this.doanhThu);
    }
    
}
