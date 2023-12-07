/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manajemen_Gaji;

import java.util.Scanner;

/**
 *
 * @author march
 */
public class Main {
    public static void main(String[] args) {
        ManajemenGaji manajemenGaji = new ManajemenGaji();
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah karyawan yang akan diinput: ");
        int jumlahKaryawan = input.nextInt();

        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.print("Masukkan Nama Karyawan: ");
            String nama = input.next();
            System.out.print("Masukkan Jam Kerja: ");
            int jamKerja = input.nextInt();
            System.out.print("Masukkan Tarif Per Jam: ");
            double tarifPerJam = input.nextDouble();

            Karyawan karyawan = new Karyawan(nama, jamKerja, tarifPerJam);
            manajemenGaji.tambahKaryawan(karyawan);
        }

        manajemenGaji.tampilkanDaftarKaryawan();
    }
}
