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
public class dsBrg_Kirim {
    
    private ArrayList<Integer> id_kirim;
    private ArrayList<String> nama_kota;
    private ArrayList<Integer> harga;
    
    public dsBrg_Kirim() {
        id_kirim = new ArrayList<Integer>();
        nama_kota = new ArrayList<String>();
        harga = new ArrayList<Integer>();
    }
    
    public void Id_Kirim(int isi){
        this.id_kirim.add(isi);
    }
    public ArrayList<Integer> getId_Kirim(){
        return this.id_kirim;
    }
    
    public void Nama_Kota(String isi){
        this.nama_kota.add(isi);
    }
    public ArrayList<String> getNama_Kota(){
        return this.nama_kota;
    }
    
    public void Harga(int isi){
        this.harga.add(isi);
    }
    public ArrayList<Integer> getHarga(){
        return this.harga;
    }
    
    public void Brg_kirim(int id_kirim, String nama_kota, int harga){
        this.id_kirim.add(id_kirim);
        this.nama_kota.add(nama_kota);
        this.harga.add(harga);
    }
}