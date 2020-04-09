/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

import BT1.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class QuanLyNhanVien implements IQuanLy{
    
    ArrayList<NhanVien> listNhanVien = new ArrayList<>();
    
    @Override
    public void them(NhanVien nv) {
        listNhanVien.add(nv);
    }

    @Override
    public void inDS() {
        for (int i = 0; i < listNhanVien.size(); i++) {
            System.out.println("Nhân viên số: "+(i+1));
            System.out.println(listNhanVien.get(i).getThongTin());
            System.out.println("----------------------");
        }
        
    }
    
}
