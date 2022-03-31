/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pewarisan4_Overriding;

/**
 *
 * @author WINDOWS 10
 */
public class Persegipanjang extends BangunDatar {
    float panjang, lebar;
    
    @Override
    public void luas(){
        float luas=panjang*lebar;
        System.out.println("Luas persegi panjang = "+ luas);
    }
    @Override
    public void keliling(){
        float keliling=2*(panjang+lebar);
        System.out.println("Keliling persegi panjang = "+ keliling);
    }
}
