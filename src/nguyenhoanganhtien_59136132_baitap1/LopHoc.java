/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenhoanganhtien_59136132_baitap1;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class LopHoc {
   ArrayList<HocSinh> DSHS = new ArrayList<>();
   ArrayList<GiaoVien> DSGV = new ArrayList<>();
   ArrayList<QLDS> QLDS = new ArrayList<>();

    LopHoc(GiaoVien gvcn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
public int ThemHocSinh(HocSinh hs){        
        DSHS.add(hs);
        return HocSinh.size();
    }
   
   public int ThemGVGD(GiaoVien GV){
        DSGV.add(GV);
        return GiaoVien.size();
    }
      public void inDSHS(ArrayList<CaNhan> HS){
        for (int i = 0; i< DSHS.size(); i++)
        {
            System.out.println(DSHS.get(i).HienThiTT());
        }
       
    }
    public void inDSGVGD(ArrayList<CaNhan> GV){
           for (int i = 0; i< DSGV.size(); i++)
        {
            System.out.println(DSGV.get(i).HienThiTT());
        }
      
    }

}
