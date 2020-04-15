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
public class GiaoVien extends CaNhan  {

    static int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    String MonDay;
    String ToBoMon;

    public GiaoVien(String MonDay, String ToBoMon, String HoTen, int Tuoi, String DiaChi, String Sdt) {
        super(HoTen, Tuoi, DiaChi, Sdt);
        this.MonDay = MonDay;
        this.ToBoMon = ToBoMon;
    }

    public void setMonDay(String MonDay) {
        this.MonDay = MonDay;
    }

    public void setToBoMon(String ToBoMon) {
        this.ToBoMon = ToBoMon;
    }
   
    
  

    @Override
    public String HienThiTT() {
        return super.HienThiTT()+ //To change body of generated methods, choose Tools | Templates.
        "MonDay:"+MonDay+"\n"+
        "ToBoMon:"+ToBoMon+"\n";
                
    }

    void add(GiaoVien GV) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}