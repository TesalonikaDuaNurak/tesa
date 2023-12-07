/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Keuangan;

/**
 *
 * @author march
 */
public class EntKaryawan {
    String NIK, Nama, JK, jabatan;
    
    void dataNIK(String NIK)
    {
        this.NIK = NIK;
    }
    
    void dataNama(String Nama)
    {
        this.Nama = Nama;
    }
    void dataJenis_Kelamin(String JK)
    {
        this.JK = JK;
    }
    public String getJabatan()
    {
        return jabatan;
    }
    
    void setJabatan(String jabatan)
    {
        this.jabatan = jabatan;
    }
}
