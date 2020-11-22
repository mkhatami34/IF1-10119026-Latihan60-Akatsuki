/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan60.akatsuki;

/**
 *
 * @author Asus
 */
public class Anggota extends Akatsuki {
    private String karakter;
    private String ciri;

    public Anggota(String nama, String asal) {
        super(nama, asal);
       
    }

   public void Anggota(){
        
       
   }
    
    public String getKarakter() {
        return karakter;
    }
    
    public void setKarakter(String karakter) {
        this.karakter = karakter;
    }
    
    public String getCiri() {
        return ciri;
    }
    
    public void setCiri(String ciri) {
        this.ciri = ciri;
    }
    
    public void tampilAnggota() {
        System.out.println("Nama\t\t: " + super.getNama());
        System.out.println("Asal Desa\t: " + super.getAsal());
        System.out.println("Karakter anggota: " + getKarakter());
        System.out.println("Ciri-ciri\t: " + getCiri());
        System.out.println();
    }    
}
