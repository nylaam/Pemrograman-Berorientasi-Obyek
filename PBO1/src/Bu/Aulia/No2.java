/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bu.Aulia;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class No2 {
    static int lebar;
    static int panjang;
    static int volume;
    static int tinggi;
    private static Scanner x;
    
    public void VolumeLimas  (String[] args){
        x = new Scanner (System.in);
        System.out.println("Masukan Panjang Limas :");
        panjang = x.nextInt();
        
        System.out.println("Masukan Lebar Limas  :");
        lebar = x.nextInt();
        
        System.out.println("Masukan Tinggi Limas  :");
        tinggi = x.nextInt();
        
       volume = (((panjang*lebar)*1/2)*tinggi)*1/3;
       System.out.println("Hasil Volume Limas : " + volume +" cm3");
}
}