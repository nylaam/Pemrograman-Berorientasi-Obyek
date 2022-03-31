/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class untukobjek {
    public static void main(String[] args){
        Segitiga s = new Segitiga();
        Scanner scan = new Scanner (System.in);
        System.out.println("Masukkan nilai alas :");
        int alas=scan.nextInt();
        s.luasSegitiga(alas, alas);
        
        
    }
}
