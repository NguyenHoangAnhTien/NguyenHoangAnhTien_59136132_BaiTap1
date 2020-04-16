/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenhoanganhtien_59136132_baitap1;

/**
 *
 * @author PC
 */
public class BT1Main {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        LopHoc lophoc = new LopHoc();
        HocSinh hocSinh1 = new HocSinh("59CNTT3", "Xem Phim", "Nguyễn Hoàng Anh Tiến", 19, "Ninh Hòa", "0123456789");
        GiaoVien giaoVien1 = new GiaoVien("Tâm Lí học đại cương", "XML", "Nguyễn Văn Minh", 36, "Nha Trang", "012323456");
        
        lophoc.ThemHocSinh(hocSinh1);
        lophoc.ThemGVGD(giaoVien1);
        lophoc.inDSHS();
        lophoc.inDSGVGD();
    }
    
}

