/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT4;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class QuanLyChuyenXe{
    
    ArrayList<ChuyenXe> listChuyenXe = new ArrayList<>();
    
    public void themChuyenXe(ChuyenXe cx){
        listChuyenXe.add(cx);
    }
      
    public void inListChuyenXe(){
        for(int i = 0; i < listChuyenXe.size(); i++){
            System.out.println("Chuyến xe số: "+(i+1));
            listChuyenXe.get(i).inThongTinChuyenXe();
            System.out.println("-------------------------");
        }
    }
    
    public double tinhDoanhThuNoiThanh(){
        double doanhThu = 0;
        for(int i = 0; i < listChuyenXe.size(); i++){
            if(listChuyenXe.get(i) instanceof XeNoiThanh)
                doanhThu += listChuyenXe.get(i).getDoanhThu();
        }
        return doanhThu;
    }
    
    public double tinhDoanhThuNgoaiThanh(){
        double doanhThu = 0;
        for(int i = 0; i < listChuyenXe.size(); i++){
            if(listChuyenXe.get(i) instanceof XeNgoaiThanh)
                doanhThu += listChuyenXe.get(i).getDoanhThu();
        }
        return doanhThu;
    }
    
    public double tongDoanhThu(){
        double doanhThu = 0;
        for(int i = 0; i < listChuyenXe.size(); i++){
            doanhThu += listChuyenXe.get(i).getDoanhThu();
        }
        return doanhThu;
    }
}
