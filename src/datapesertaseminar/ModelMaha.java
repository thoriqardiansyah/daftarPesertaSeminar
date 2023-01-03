/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datamahasiswa;

/**
 *
 * @author M.Thoriq
 */
public class ModelMaha {
    private String email;
    private String nama;
    private String alamat;
    private boolean jeniskel;
    
    public boolean isJeniskel() {
        return jeniskel;
    }
    
    public void setJeniskel(boolean jeniskel) {
        this.jeniskel = jeniskel;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public void setAlamat(String kelas) {
        this.alamat = alamat;
    }
    
    public String getEmail() {
        return email;
    }
    
//    public void setNpm(String npm) {
//        this.npm = npm;
//    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public ModelMaha(String email, String nama, String alamat, boolean jeniskel) {
        this.email = email;
        this.nama = nama;
        this.alamat = alamat;
        this.jeniskel = jeniskel;
    }
}
