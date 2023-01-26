/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Her_abel.model;

/**
 *
 * @author User
 */
public class Buku {
    private String kode_buku;
    private String judul_buku;
    private String pengarang;
    private String penerbit;
    
    public Buku(){
    }

    public Buku(String kode_buku, String judul_buku, String pengarang, String penerbit) {
        this.kode_buku = kode_buku;
        this.judul_buku = judul_buku;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
    }

    public String getKode_buku() {
        return kode_buku;
    }

    public void setKode_buku(String kode_buku) {
        this.kode_buku = kode_buku;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
}
