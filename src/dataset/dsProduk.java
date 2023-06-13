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
public class dsProduk {
    private ArrayList<Integer> idProduk;
    private ArrayList<String> namaProduk;
    private ArrayList<Integer> hargaProduk;
    private ArrayList<Integer> idMerek;
    private ArrayList<Integer> berat;
     private ArrayList<Integer> jumlah;
    
    public dsProduk() {
        idProduk = new ArrayList<Integer>();
        namaProduk = new ArrayList<String>();
        hargaProduk = new ArrayList<Integer>();
        idMerek = new ArrayList<Integer>();
        berat = new ArrayList<Integer>();
        jumlah = new ArrayList<Integer>();
    }
    
    public void IdProduk(int isi){
        this.idProduk.add(isi);
    }
    public ArrayList<Integer> getIdProduk(){
        return this.idProduk;
    }
    
    public void NamaProduk(String isi){
        this.namaProduk.add(isi);
    }
    public ArrayList<String> getNamaProduk(){
        return this.namaProduk;
    }
    
    public void HargaProduk(int isi){
        this.hargaProduk.add(isi);
    }
    public ArrayList<Integer> getHargaProduk(){
        return this.hargaProduk;
    }
    
    public void IdMerek(int isi){
        this.idMerek.add(isi);
    }
    public ArrayList<Integer> getIdMerek(){
        return this.idMerek;
    }
    
    public void Berat(int isi){
        this.berat.add(isi);
    }
    public ArrayList<Integer> getBerat(){
        return this.berat;
    }
    
        public void Juamlah(int isi){
        this.jumlah.add(isi);
    }
    public ArrayList<Integer> getJuamlah(){
        return this.jumlah;
    }
    
    public void Produk(int idProduk, String namaProduk, int hargaProduk, int idMerek, 
            int berat, int jumlah){
        this.idProduk.add(idProduk);
        this.namaProduk.add(namaProduk);
        this.hargaProduk.add(hargaProduk);
        this.idMerek.add(idMerek);
        this.berat.add(berat);
        this.jumlah.add(jumlah);
        
    }
}
