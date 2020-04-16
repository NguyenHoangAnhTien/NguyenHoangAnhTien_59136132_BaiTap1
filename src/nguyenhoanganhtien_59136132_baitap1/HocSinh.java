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
public class HocSinh extends CaNhan{

    private String Lop;
    private String NangKhieu;


    public HocSinh(String Lop, String NangKhieu, String HoTen, int Tuoi, String DiaChi, String Sdt) {
        super(HoTen, Tuoi, DiaChi, Sdt);
        this.Lop = Lop;
        this.NangKhieu = NangKhieu;
    }
    
    @Override
    public String HienThiTT() {
        return super.HienThiTT() + //To change body of generated methods, choose Tools | Templates.
        "Lop:"+Lop+"\n"+
        "NangKhieu:"+NangKhieu+"\n";        
    }
    
}
