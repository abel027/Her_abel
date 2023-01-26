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
public class Hutang {
    
    private String kode_transaksi;
    private String tgl_transaksi;
    private String pembeli;
    private int total_beli;
    private Double diskon;
    private int total_hutang;

    public void setKode_transaksi(String kode_transaksi) {
        this.kode_transaksi = kode_transaksi;
    }

    public void setTgl_transaksi(String tgl_transaksi) {
        this.tgl_transaksi = tgl_transaksi;
    }

    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }

    public void setTotal_beli(int total_beli) {
        this.total_beli = total_beli;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    public void setTotal_hutang(int total_hutang) {
        this.total_hutang = total_hutang;
    }

    public Hutang() {
    }

    public Hutang(String kode_transaksi, String tgl_transaksi, String pembeli, int total_beli, double diskon, int total_hutang) {
        this.kode_transaksi = kode_transaksi;
        this.tgl_transaksi = tgl_transaksi;
        this.pembeli = pembeli;
        this.total_beli = total_beli;
        this.diskon = diskon;
        this.total_hutang = total_hutang;
    }

    public String getKode_transaksi() {
        return kode_transaksi;
    }

    public String getTgl_transaksi() {
        return tgl_transaksi;
    }

    public String getPembeli() {
        return pembeli;
    }

    public int getTotal_beli() {
        return total_beli;
    }

    public Double getDiskon() {
        double diskon =  0.02;
        return diskon;
    }

   public Object getTotal_hutang() {
        if(total_beli > 100000){
            double diskon =  0.02;
            total_hutang = (int) (total_beli - diskon);
        } else {
            double diskon = 0;
        }
        return total_hutang;
    }

   
}
