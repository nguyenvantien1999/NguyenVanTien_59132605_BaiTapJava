/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

/**
 *
 * @author admin
 */
public class BT3 {
    public static void main(String[] args) {
        SinhVienIT svIt = new SinhVienIT("Tiến", "Công nghệ phần mềm", 8, 9, 10);
        SinhVienBiz svBiz = new SinhVienBiz("Tốt", "Quản trị Kinh Doanh", 10, 9.5);
        svIt.xuat();
        System.out.println("-----------------------");
        svBiz.xuat();
        
    }
}
