/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m_andre_naufal_2110010052;

/**
 *
 * @author ASUS
 */
public class Produk {
    private int idProduk;
    private String namaProduk;
    private double hargaProduk;
    private int idMerek;
    private double berat;
    private int stokJumlah;

    // Constructor
    public Produk(int idProduk, String namaProduk, double hargaProduk, int idMerek, double berat, int stokJumlah) {
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
        this.idMerek = idMerek;
        this.berat = berat;
        this.stokJumlah = stokJumlah;
    }

    // Getter dan Setter
    public int getIdProduk() {
        return idProduk;
    }

    public void setIdProduk(int idProduk) {
        this.idProduk = idProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public double getHargaProduk() {
        return hargaProduk;
    }

    public void setHargaProduk(double hargaProduk) {
        this.hargaProduk = hargaProduk;
    }

    public int getIdMerek() {
        return idMerek;
    }

    public void setIdMerek(int idMerek) {
        this.idMerek = idMerek;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public int getStokJumlah() {
        return stokJumlah;
    }

    public void setStokJumlah(int stokJumlah) {
        this.stokJumlah = stokJumlah;
    }
}
