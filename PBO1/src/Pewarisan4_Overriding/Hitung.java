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
public class Hitung {
 
    public static void main(String[]args){
        BangunDatar bangundatar=new BangunDatar();
        
        Persegi p=new Persegi();
        p.sisi=8;
        
        Persegipanjang pp=new Persegipanjang();
        pp.lebar=11;
        pp.panjang=23;
        
        bangundatar.luas();
        bangundatar.keliling();
        
        p.luas();
        p.keliling();
        
        pp.luas();
        pp.keliling();
    }
}
