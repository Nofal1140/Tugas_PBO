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
public class dsMerek {
    
    private ArrayList<Integer> id_merek;
    private ArrayList<String> nama_merek;
    
    public dsMerek() {
        id_merek = new ArrayList<Integer>();
        nama_merek= new ArrayList<String>();
    }
    
    public void Id_Merek(int isi){
        this.id_merek.add(isi);
    }
    public ArrayList<Integer> getId_Merek(){
        return this.id_merek;
    }
    
    public void Nama_Merek(String isi){
        this.nama_merek.add(isi);
    }
    public ArrayList<String> getNama_Merek(){
        return this.nama_merek;
    }
    
    public void Merek(int id_merek, String nama_merek){
        this.id_merek.add(id_merek);
        this.nama_merek.add(nama_merek);
    }
    
}
