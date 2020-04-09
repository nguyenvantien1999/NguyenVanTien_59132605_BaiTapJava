/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author admin
 */
public class NhanVien {
    String ten;
    int tuoi;
    String diaChi;
    double tienLuong;
    int tongGioLam;
    
    public NhanVien() {
    }
    
    public NhanVien(String ten, int tuoi, String diaChi, double tienLuong,
            int tongGioLam){
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongGioLam = tongGioLam;
    }
    
//  Setter
    public void setTen(String ten){
        this.ten = ten;
    }
    public void setTuoi(int tuoi){
        this.tuoi = tuoi;
    }
    public void setDiaChi(String diaChi){
        this.diaChi = diaChi;
    }
    public void setTienLuong(double tienLuong){
        this.tienLuong = tienLuong;
    }
    public void setTongGioLam(int tongGioLam){
        this.tongGioLam = tongGioLam;
    }
    
//  Getter
    public String getTen(){
        return ten;
    }
    public int getTuoi(){
        return tuoi;
    }
    public String getDiaChi(){
        return diaChi;
    }
    public double getTienLuong(){
        return tienLuong;
    }
    public int getTongGioLam(){
        return tongGioLam;
    }
        
    public String getThongTin(){
        return "Tên Nhân Viên: "+this.ten+
                "\nTuổi: "+this.tuoi+
                "\nĐịa chỉ: "+this.diaChi+
                "\nTiền lương: "+this.tienLuong+
                "\nTổng giờ làm: "+this.tongGioLam+
                "\nTiền thưởng: "+this.tinhThuong();      
    }
    double tinhThuong(){
        if(this.tongGioLam >= 200)
            return this.tienLuong * 20/100;
        else if(this.tongGioLam >= 100 && this.tongGioLam < 200)
            return this.tienLuong * 10/100;
        else 
            return 0;
    }

}
