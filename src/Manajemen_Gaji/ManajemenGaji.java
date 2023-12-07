/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manajemen_Gaji;

import java.util.ArrayList;

/**
 *
 * @author march
 */
public class ManajemenGaji {
    private ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();
    public void tambahKaryawan(Karyawan karyawan) {
        daftarKaryawan.add(karyawan);
    }

    public void tampilkanDaftarKaryawan() {
        System.out.println("Daftar Karyawan:");
        for (Karyawan karyawan : daftarKaryawan) {
            System.out.println("Nama: " + karyawan.getNama());
            System.out.println("Jam Kerja: " + karyawan.getJamKerja());
            System.out.println("Tarif Per Jam: " + karyawan.getTarifPerJam());
            System.out.println("Gaji: " + karyawan.hitungGaji());
            System.out.println();
        }
    }
}
