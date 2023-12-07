/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SI;

/**
 *
 * @author march
 */
public class List implements Info {
    String Nama, Deskripsi, Kota;
    
    public void dataKota(String Kota){ 
        this.Kota = Kota;
    }
    
    void dataNama(String Nama){
    this.Nama = Nama;
    }
    void dataDeskripsi(String Deskripsi){ 
        this.Deskripsi = Deskripsi;
    }
     public void getInfo() {
         System.out.println("List Wisata");
        System.out.println("----------------------");
        System.out.println(" Nama : " + Nama);
        System.out.println(" Kota: " + Kota);
        System.out.println(" Deskripsi: " + Deskripsi);
    }
}
