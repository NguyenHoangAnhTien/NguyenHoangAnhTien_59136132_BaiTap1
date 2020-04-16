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
public abstract class CaNhan {
    private String HoTen;
    private int Tuoi;
    private String DiaChi;
    private String Sdt;

    public CaNhan(String HoTen, int Tuoi, String DiaChi, String Sdt) {
        this.HoTen = HoTen;
        this.Tuoi = Tuoi;
        this.DiaChi = DiaChi;
        this.Sdt = Sdt;
    }

    public String getHoTen() {
        return HoTen;
    }
    
    public int getTuoi() {
        return Tuoi;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }
    public String HienThiTT()
    {
       return"Họ tên:"+HoTen+"\n"+
             "Tuổi:"  +Tuoi +"\n" +
             "DịaChỉ" +DiaChi+"\n"+
             "Sdt"    +Sdt   +"\n" ;
      
    }
}
    
