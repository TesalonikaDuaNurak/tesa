/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manajemen_Gaji;

/**
 *
 * @author march
 */
public class Karyawan {
    private String nama;
    private int jamKerja;
    private double tarifPerJam;

    public Karyawan(String nama, int jamKerja, double tarifPerJam) {
        this.nama = nama;
        this.jamKerja = jamKerja;
        this.tarifPerJam = tarifPerJam;
    }
    public String getNama() {
        return nama;
    }
    public int getJamKerja() {
        return jamKerja;
    }
    public double getTarifPerJam() {
        return tarifPerJam;
    }
    public double hitungGaji() {
        return jamKerja * tarifPerJam;
    }
}
