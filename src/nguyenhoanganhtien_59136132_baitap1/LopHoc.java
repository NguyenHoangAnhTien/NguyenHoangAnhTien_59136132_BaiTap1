/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenhoanganhtien_59136132_baitap1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class LopHoc {
   ArrayList<HocSinh> DSHS = new ArrayList<>();
   ArrayList<GiaoVien> DSGV = new ArrayList<>();
   

   
   
   
public int ThemHocSinh(HocSinh hs){        
        DSHS.add(hs);
        return 0;
    }
   
   public int ThemGVGD(GiaoVien GV){
        DSGV.add(GV);
        return 0;
    }
       public int inDSHS() {
        int t = 0;
        System.out.println("Danh sách học sinh:");
        for(HocSinh hs: DSHS) {
            System.out.println(hs.HienThiTT());
            t = t + 1;
        }
        return t;
    }
    public int inDSGVGD() {
        int t = 0;
        System.out.println("Danh sách giáo viên giảng dạy:");
        for(GiaoVien giaoVien: DSGV) {
            System.out.println(giaoVien.HienThiTT());
            t = t + 1;
        }
        return t;

}
}
