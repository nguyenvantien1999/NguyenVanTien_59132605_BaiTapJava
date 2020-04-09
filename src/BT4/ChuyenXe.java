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
public abstract class ChuyenXe {
    public String maSoChuyen, hoTenTaiXe, soXe;
    double doanhThu;

    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }
    
//    setter
    public void setMaSoChuyen(String maSoChuyen){
        this.maSoChuyen = maSoChuyen;
    }
    public void setHoTenTaiXe(String hoTenTaiXe){
        this.hoTenTaiXe = hoTenTaiXe;
    }
    public void setSoXe(String soXe){
        this.soXe = soXe;
    }
    public void setDoanhThu(double doanhThu){
        this.doanhThu = doanhThu;
    }
    
//    getter
    public String getMaSoChuyen(){
        return maSoChuyen;
    }
    public String getHoTenTaiXe(){
        return hoTenTaiXe;
    }
    public String getSoXe(){
        return soXe;
    }
    public double getDoanhThu(){
        return doanhThu;
    }
    
    public abstract void inThongTinChuyenXe();
}
