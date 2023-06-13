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
public class dsPelanggan {
    private ArrayList<Integer> idPelanggan;
    private ArrayList<String> email;
    private ArrayList<String> password;
    private ArrayList<String> namaLengkap;
    private ArrayList<String> alamat;
    private ArrayList<String> telepon;
    
    public dsPelanggan() {
        idPelanggan = new ArrayList<Integer>();
        email = new ArrayList<String>();
        password = new ArrayList<String>();
        namaLengkap = new ArrayList<String>();
        alamat = new ArrayList<String>();
        telepon = new ArrayList<String>();
    }
    
    public void IdPelanggan(int isi){
        this.idPelanggan.add(isi);
    }
    public ArrayList<Integer> getIdPelanggan(){
        return this.idPelanggan;
    }
    
    public void Email(String isi){
        this.email.add(isi);
    }
    public ArrayList<String> getEmail(){
        return this.email;
    }
    
    public void Password(String isi){
    this.password.add(isi);
    }
    public ArrayList<String> getPassword(){
    return this.password;
    }
     
    public void NamaLengkap(String isi){
        this.namaLengkap.add(isi);
    }
    public ArrayList<String> getNamaLengkap(){
        return this.namaLengkap;
    }
    
    public void Alamat(String isi){
        this.alamat.add(isi);
    }
    public ArrayList<String> getAlamat(){
        return this.alamat;
    }
    
    public void Telepon(String isi){
        this.telepon.add(isi);
    }
    public ArrayList<String> getTelepon(){
        return this.telepon;
    }
    
    
    public void Pelanggan(int idPelanggan, String email, String password, 
            String namaLengkap, String alamat, String telepon){
        this.idPelanggan.add(idPelanggan);
        this.email.add(email);
        this.password.add(password);
        this.namaLengkap.add(namaLengkap);
        this.alamat.add(alamat);
        this.telepon.add(telepon);
    }
}