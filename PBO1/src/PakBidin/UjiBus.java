/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PakBidin;

/**
 *
 * @author WINDOWS 10
 */
public class UjiBus {
        public static void main(String[] args) {
        ModulPBO2 busMini=new ModulPBO2();
        busMini.penumpang=5;
        busMini.maxpenumpang=5;
        busMini.cetak();
        
        busMini.penumpang=busMini.penumpang+5;
        busMini.cetak();
        
        busMini.penumpang=busMini.penumpang-2;
        busMini.cetak();
        
        
        busMini.penumpang=busMini.penumpang+8;
        busMini.cetak();
    }
}
