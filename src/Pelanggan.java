/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Pelanggan {
    private int idPelanggan;
    private String email;
    private String password;
    private String namaLengkap;
    private String alamat;
    private String telepon;
    
    // Constructor
    public Pelanggan(int idPelanggan, String email, String password, String namaLengkap, String alamat, String telepon) {
        this.idPelanggan = idPelanggan;
        this.email = email;
        this.password = password;
        this.namaLengkap = namaLengkap;
        this.alamat = alamat;
        this.telepon = telepon;
    }
    
    // Getter dan Setter untuk setiap atribut
    public int getIdPelanggan() {
        return idPelanggan;
    }
    
    public void setIdPelanggan(int idPelanggan) {
        this.idPelanggan = idPelanggan;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getNamaLengkap() {
        return namaLengkap;
    }
    
    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
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