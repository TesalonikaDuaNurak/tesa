/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manajemen_Gaji;

/**
 *
 * @author march
 */
public class Login1 {
    private String username, password;
    public String nama;

    public Login1() 
    {
        nama = "Pandalazy";
        username = "Panda";
        password = "141100";
    }
    
    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    boolean CekLogin(String username, String password)
    {
        if(username.equals(getUsername()) && password.equals(getPassword()))
        {
            return true;
        }
        return false;
    }
    
}
