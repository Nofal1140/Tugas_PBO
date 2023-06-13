/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m_andre_naufal_2110010052;

/**
 *
 * @author ASUS
 */
public class Merek {
    private int id_merek;
    private String nama_merek;
    
    // Constructor
    public Merek(int id_merek, String nama_merek) {
        this.id_merek = id_merek;
        this.nama_merek = nama_merek;
    }
    
    // Getter untuk id_merek
    public int getIdMerek() {
        return id_merek;
    }
    
    // Setter untuk id_merek
    public void setIdMerek(int id_merek) {
        this.id_merek = id_merek;
    }
    
    // Getter untuk nama_merek
    public String getNamaMerek() {
        return nama_merek;
    }
    
    // Setter untuk nama_merek
    public void setNamaMerek(String nama_merek) {
        this.nama_merek = nama_merek;
    }
    
    // Main method untuk menguji class Merek
    public static void main(String[] args) {
        // Membuat objek Merek
        Merek merek = new Merek(1, "Nama Merek");
        
        // Mengakses atribut id_merek dan nama_merek
        int id = merek.getIdMerek();
        String nama = merek.getNamaMerek();
        
        // Menampilkan atribut id_merek dan nama_merek
        System.out.println("ID Merek: " + id);
        System.out.println("Nama Merek: " + nama);
        
        // Mengubah nilai atribut id_merek dan nama_merek
        merek.setIdMerek(2);
        merek.setNamaMerek("Nama Merek Baru");
        
        // Mengakses atribut id_merek dan nama_merek setelah diubah
        id = merek.getIdMerek();
        nama = merek.getNamaMerek();
        
        // Menampilkan atribut id_merek dan nama_merek yang telah diubah
        System.out.println("ID Merek (Setelah Diubah): " + id);
        System.out.println("Nama Merek (Setelah Diubah): " + nama);
    }
}