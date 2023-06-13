/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m_andre_naufal_2110010052;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Pembelian {
    private int idPembelian;
    private int idPelanggan;
    private int idKirim;
    private Date tanggalPembelian;
    private double harga;
    private String alamat;
    private String telepon;

    // Constructor
    public Pembelian(int idPembelian, int idPelanggan, int idKirim, Date tanggalPembelian,
                     double harga, String alamat, String telepon) {
        this.idPembelian = idPembelian;
        this.idPelanggan = idPelanggan;
        this.idKirim = idKirim;
        this.tanggalPembelian = tanggalPembelian;
        this.harga = harga;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    // Getter dan Setter
    public int getIdPembelian() {
        return idPembelian;
    }

    public void setIdPembelian(int idPembelian) {
        this.idPembelian = idPembelian;
    }

    public int getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(int idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public int getIdKirim() {
        return idKirim;
    }

    public void setIdKirim(int idKirim) {
        this.idKirim = idKirim;
    }

    public Date getTanggalPembelian() {
        return tanggalPembelian;
    }

    public void setTanggalPembelian(Date tanggalPembelian) {
        this.tanggalPembelian = tanggalPembelian;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
}
