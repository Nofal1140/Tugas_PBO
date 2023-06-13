/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m_andre_naufal_2110010052;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class M_Andre_Naufal_2110010052 {

    /**
     * @param args the command line arguments
     */
    
    // M_Andre_Naufal_2110010052.java
    public static void main(String[] args) {
        
// TODO code application logic here

        Pelanggan pelanggan1 = new Pelanggan(1, "pelanggan1@example.com", "password123", "Rahmat", "Jl. Contoh 123", "08123456789");
        
        Produk produk1 = new Produk(1, "Produk 1", 100.0, 1, 0.5, 10);
        
        Date tanggalPembelian = new Date();
        Pembelian pembelian = new Pembelian(1, 1, 1, tanggalPembelian, 100.0, "Alamat Pengiriman", "987654321");
        
        Brg_Kirim brg_kirim = new Brg_Kirim(1, "Jakarta", 100.0);
        
        Kategori kategori = new Kategori(1, "Kategori 1");
        
        Merek merek = new Merek(1, "Nama Merek");
        
        Admin admin = new Admin(1, "admin123", "adminpass", "Admin Name", "Admin Address", "admin@example.com", "9876543210");
        
        System.out.println("Data Pelanggan:");
        System.out.println("ID Pelanggan: " + pelanggan1.getIdPelanggan());
        System.out.println("Email: " + pelanggan1.getEmail());
        System.out.println("Password: " + pelanggan1.getPassword());
        System.out.println("Nama Lengkap: " + pelanggan1.getNamaLengkap());
        System.out.println("Alamat: " + pelanggan1.getAlamat());
        System.out.println("Telepon: " + pelanggan1.getTelepon());
        
        System.out.println();
        
        System.out.println("Data Produk:");
        System.out.println("ID Produk: " + produk1.getIdProduk());
        System.out.println("Nama Produk: " + produk1.getNamaProduk());
        System.out.println("Harga Produk: " + produk1.getHargaProduk());
        System.out.println("ID Merek: " + produk1.getIdMerek());
        System.out.println("Berat: " + produk1.getBerat());
        System.out.println("Stok Jumlah: " + produk1.getStokJumlah());
        
        System.out.println();
        
        System.out.println("ID Pembelian: " + pembelian.getIdPembelian());
        System.out.println("Tanggal Pembelian: " + pembelian.getTanggalPembelian());
        System.out.println("Harga: " + pembelian.getHarga());
        System.out.println("Alamat: " + pembelian.getAlamat());
        System.out.println("Telepon: " + pembelian.getTelepon());
        
        System.out.println();
        
        System.out.println("ID Kirim: " + brg_kirim.getId_kirim());
        System.out.println("Nama Kota: " + brg_kirim.getNama_kota());
        System.out.println("Harga: " + brg_kirim.getHarga());
        
        System.out.println();
        
        System.out.println("ID Kategori: " + kategori.getId_kategori());
        System.out.println("Nama Kategori: " + kategori.getNama_kategori());
        
        System.out.println();
        
        System.out.println("ID Merek (Setelah Diubah): " + merek.getIdMerek());
        System.out.println("Nama Merek (Setelah Diubah): " + merek.getNamaMerek());
        
        System.out.println();
        
        System.out.println("ID Admin (Setelah Diubah): " + admin.getId_admin());
        System.out.println("Nama Pengguna (Setelah Diubah): " + admin.getNama_pengguna());
        System.out.println("Password (Setelah Diubah): " + admin.getPassword());
    }
}