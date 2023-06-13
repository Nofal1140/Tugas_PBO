/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class dsPembelian {
    private ArrayList<Integer> idPembelian;
    private ArrayList<Integer> idPelanggan;
    private ArrayList<Integer> idKirim;
    private ArrayList<String> tanggalPembelian;
    private ArrayList<Integer> harga;
    private ArrayList<String> alamat;
    private ArrayList<String> telepon;
    
    public dsPembelian() {
        idPembelian = new ArrayList<Integer>();
        idPelanggan = new ArrayList<Integer>();
        idKirim = new ArrayList<Integer>();
        tanggalPembelian = new ArrayList<String>();
        harga = new ArrayList<Integer>();
        alamat = new ArrayList<String>();
        telepon = new ArrayList<String>();
    }
    
    public void IdPembelian(int isi){
        this.idPembelian.add(isi);
    }
    public ArrayList<Integer> getIdPembelian(){
        return this.idPelanggan;
    }
    
     public void IdPelanggan(int isi){
        this.idPelanggan.add(isi);
    }
    public ArrayList<Integer> getIdPelanggan(){
        return this.idPelanggan;
    }
    
    public void IdKirim(int isi){
        this.idKirim.add(isi);
    }
    public ArrayList<Integer> getIdKirim(){
        return this.idKirim;
    }
    
    public void TanggalPembelian(String isi){
        this.tanggalPembelian.add(isi);
    }
    public ArrayList<String> getTanggalPembelian(){
        return this.tanggalPembelian;
    }
    
    public void Harga(int isi){
        this.harga.add(isi);
    }
    public ArrayList<Integer> getHarga(){
        return this.harga;
    }
    
    public void Alamat(String isi){
        this.alamat.add(isi);
    }
    public ArrayList<String> getAlamat(){
        return this.alamat;
    }
    
        public void Telepon(String isi){
        this.telepon.add(isi);
    }
    public ArrayList<String> getTelepon(){
        return this.telepon;
    }
    
    public void Pembelian(int idPembelian, int idPelanggan, int idKirim, String tanggalPembelian, 
            int harga, String alamat, String telepon){
        this.idPembelian.add(idPembelian);
        this.idPelanggan.add(idPelanggan);
        this.idKirim.add(idKirim);
        this.tanggalPembelian.add(tanggalPembelian);
        this.harga.add(harga);
        this.alamat.add(alamat);
        this.telepon.add(telepon);
    }
}
