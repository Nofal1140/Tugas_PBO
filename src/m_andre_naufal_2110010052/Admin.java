/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m_andre_naufal_2110010052;

/**
 *
 * @author ASUS
 */
public class Admin {
    private int id_admin;
    private String nama_pengguna;
    private String password;
    private String nama_lengkap;
    private String alamat;
    private String email;
    private String telepon;

    // Konstruktor
    public Admin(int id_admin, String nama_pengguna, String password, String nama_lengkap,
        String alamat, String email, String telepon) {
        this.id_admin = id_admin;
        this.nama_pengguna = nama_pengguna;
        this.password = password;
        this.nama_lengkap = nama_lengkap;
        this.alamat = alamat;
        this.email = email;
        this.telepon = telepon;
    }

    // Getter dan Setter untuk setiap atribut
    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    public String getNama_pengguna() {
        return nama_pengguna;
    }

    public void setNama_pengguna(String nama_pengguna) {
        this.nama_pengguna = nama_pengguna;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama_lengkap() {
        return nama_lengkap;
    }

    public void setNama_lengkap(String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
}
