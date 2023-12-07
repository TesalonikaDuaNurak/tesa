/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SI;

/**
 *
 * @author march
 */
public class Hitung extends Data{ 
    String NamaR;
    private int Harga;
    int  Jumlah, Total;
    
    void dataNama(String NamaR)
    {
        this.NamaR = NamaR;
    }
    public int getHarga()
    {
        return Harga;
    }
    public void setHarga(int Harga)
    {
        this.Harga = Harga;
    }
    
    public Hitung(){
        this.Harga = 25000;
        this.Jumlah = Jumlah;
        this.Total = Total;
    }
     public int Total()
     {
         Total = (Harga * Jumlah);
         return Total;
     }
  
}
