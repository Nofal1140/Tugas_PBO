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
public class dsKategori {
    
    private ArrayList<Integer> id_kategori;
    private ArrayList<String> nama_kategori;
    
    public dsKategori() {
        id_kategori = new ArrayList<Integer>();
        nama_kategori = new ArrayList<String>();
    }
    
    public void Id_Kategori(int isi){
        this.id_kategori.add(isi);
    }
    public ArrayList<Integer> getId_Kategori(){
        return this.id_kategori;
    }
    
    public void Nama_Kategori(String isi){
        this.nama_kategori.add(isi);
    }
    public ArrayList<String> getNama_Kategori(){
        return this.nama_kategori;
    }
    
    public void Kategori(int id_kategori, String nama_kategori){
        this.id_kategori.add(id_kategori);
        this.nama_kategori.add(nama_kategori);
    }
}