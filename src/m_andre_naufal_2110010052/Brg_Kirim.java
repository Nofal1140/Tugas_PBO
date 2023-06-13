/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m_andre_naufal_2110010052;

/**
 *
 * @author ASUS
 */
public class Brg_Kirim {
    private int Id_kirim;
    private String nama_kota;
    private double harga;

    // Constructor
    public Brg_Kirim(int Id_kirim, String nama_kota, double harga) {
        this.Id_kirim = Id_kirim;
        this.nama_kota = nama_kota;
        this.harga = harga;
    }

    // Getter for Id_kirim
    public int getId_kirim() {
        return Id_kirim;
    }

    // Setter for Id_kirim
    public void setId_kirim(int Id_kirim) {
        this.Id_kirim = Id_kirim;
    }

    // Getter for nama_kota
    public String getNama_kota() {
        return nama_kota;
    }

    // Setter for nama_kota
    public void setNama_kota(String nama_kota) {
        this.nama_kota = nama_kota;
    }

    // Getter for harga
    public double getHarga() {
        return harga;
    }

    // Setter for harga
    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Main method for testing
    public static void main(String[] args) {
        Brg_Kirim brg_kirim = new Brg_Kirim(1, "Jakarta", 100.0);
        System.out.println("Id_kirim: " + brg_kirim.getId_kirim());
        System.out.println("Nama kota: " + brg_kirim.getNama_kota());
        System.out.println("Harga: " + brg_kirim.getHarga());
    }
}
