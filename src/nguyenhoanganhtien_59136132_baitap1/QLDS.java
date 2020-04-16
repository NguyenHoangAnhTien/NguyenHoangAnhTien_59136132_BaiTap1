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
public class QLDS implements IQLDS{
    private final List<CaNhan> CaNhan = new ArrayList<>();

    @Override
    public int them(CaNhan p) {
        CaNhan.add(p);
        return 0;
    }

    @Override
    public int xoa(String ten) {
        for(CaNhan caNhan: CaNhan) {
            if(caNhan.getHoTen().equals(ten)) {
                CaNhan.remove(caNhan);
            }
        }
        return 0;
    }

    @Override
    public void inDS() {
        for(CaNhan caNhan: CaNhan) {
           caNhan.HienThiTT();
       }
    }

}
