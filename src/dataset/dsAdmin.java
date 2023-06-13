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
public class dsAdmin {
    
    private ArrayList<Integer> id_admin;
    private ArrayList<String> nama_pengguna;
    private ArrayList<String> password;
    private ArrayList<String> nama_lengkap;
    private ArrayList<String> alamat;
    private ArrayList<String> email;
    private ArrayList<String> telepon;
    
    public dsAdmin() {
        id_admin = new ArrayList<Integer>();
        nama_pengguna = new ArrayList<String>();
        password = new ArrayList<String>();
        nama_lengkap = new ArrayList<String>();
        alamat = new ArrayList<String>();
        email = new ArrayList<String>();
        telepon = new ArrayList<String>();
    }
    
    public void Id_Admin(int isi){
        this.id_admin.add(isi);
    }
    public ArrayList<Integer> getId_Admin(){
        return this.id_admin;
    }
    
    public void Nama_Pengguna(String isi){
        this.nama_pengguna.add(isi);
    }
    public ArrayList<String> getNama_Pengguna(){
        return this.nama_pengguna;
    }
    
    public void Password(String isi){
    this.password.add(isi);
    }
    public ArrayList<String> getPassword(){
    return this.password;
    }
     
    public void Nama_Lengkap(String isi){
        this.nama_lengkap.add(isi);
    }
    public ArrayList<String> getNama_Lengkap(){
        return this.nama_lengkap;
    }
    
    public void Alamat(String isi){
        this.alamat.add(isi);
    }
    public ArrayList<String> getAlamat(){
        return this.alamat;
    }
    
    public void Email(String isi){
    this.email.add(isi);
    }
    public ArrayList<String> getEmaill(){
        return this.email;
    }
    
    public void Telepon(String isi){
        this.telepon.add(isi);
    }
    public ArrayList<String> getTelepon(){
        return this.telepon;
    }
    
    
    public void Admin(int id_admin, String nama_pengguna, String password, 
            String nama_lengkap, String alamat, String email, String telepon){
        this.id_admin.add(id_admin);
        this.nama_pengguna.add(nama_pengguna);
        this.password.add(password);
        this.nama_lengkap.add(nama_lengkap);
        this.alamat.add(alamat);
        this.email.add(email);
        this.telepon.add(telepon);
    }
}
