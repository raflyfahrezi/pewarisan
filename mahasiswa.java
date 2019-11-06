/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raflyfahrezi;

/**
 *
 * @author Farhan R
 */
public class mahasiswa extends manusia{
    private String nim;

    String getNim() { //fungsi buat ngambil nilai nim
        return nim;
    }

    void setNim(String nim) { //prosedur dengan parameter buat masukin nilai nim
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    void result(){
        System.out.println("NIM    : " + nim);
        System.out.println("Nama   : " + nama); //variabel dari class manusia tinggal tulis gausa inisialisasi objek lagi
        System.out.println("Umur   : " + umur); //variabel dari class manusia tinggal tulis gausa inisialisasi objek lagi
        System.out.println("Alamat : " + alamat); //variabel dari class manusia tinggal tulis gausa inisialisasi objek lagi
    }   
}
