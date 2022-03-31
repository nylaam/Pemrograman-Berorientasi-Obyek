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
public class objek_modifier1 {

    public static void main(String[] args) {
        Modifier1 j = new Modifier1();
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai panjang :");
        int Lebar = scan.nextInt();
        System.out.print("Masukkan nilai Lebar :");
        int panjang = scan.nextInt();
        j.setPanjang(panjang);
        j.setLuas(Lebar);
        System.out.println("Nilai Luas Persegi Panjang " + Lebar * panjang);
    }
}
