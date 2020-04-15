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
public class QLDS implements IQLDS{
     ArrayList <CaNhan> DS = new ArrayList<>();

    @Override
    public int Them(CaNhan p) {
          DS.add(p);
         return 1;
    }

    @Override
    public int Xoa(String ten) {
         DS.removeIf( i -> i.getHoTen().equals(ten) );
         boolean DSRemoved = false;
         if(DSRemoved) return 1;
         return 0;
         
    }

    @Override
    public void inDS() {
       for (int i = 0; i < DS.size(); i++){
            System.out.println(DS.get(i).HienThiTT());
    }
    }
    
}
