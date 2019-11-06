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
import java.util.Scanner;

public class mainclass {
    public static void main(String[] args) {
        mahasiswa mahasiswa_objek = new mahasiswa();
        Scanner inputan_string = new Scanner(System.in);
        Scanner inputan_int = new Scanner(System.in);
        
        System.out.println("Mahasiswa");
        System.out.print("NIM               : ");
        String nim = inputan_string.nextLine();
        mahasiswa_objek.setNim(nim);
        
        System.out.print("Masukan Nama Anda : ");
        String nama = inputan_string.nextLine();
        mahasiswa_objek.setNama(nama);

        System.out.print("Masukan Umur Anda : ");
        int umur = inputan_int.nextInt();
        mahasiswa_objek.setUmur(umur);
        
        System.out.print("Masukan Alamat Anda : ");
        String alamat = inputan_string.nextLine();
        mahasiswa_objek.setAlamat(alamat);
        
        System.out.println("NIM    : " + mahasiswa_objek.getNim());
        System.out.println("Nama   : " + mahasiswa_objek.getNama()); //variabel dari class manusia diambil dari class mahasiswa
        System.out.println("Umur   : " + mahasiswa_objek.getUmur()); //variabel dari class manusia diambil dari class mahasiswa
        System.out.println("Alamat : " + mahasiswa_objek.getAlamat()); //variabel dari class manusia diambil dari class mahasiswa
    }
}
