/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bu.Aulia;

/**
 *
 * @author WINDOWS 10
 */
public class HelloTelkom {
    public void tampil(){
        System.out.println("Hello");
        System.out.println("Selamat Belajar di program Java");
    }
}
    class wujudObjek {
        public static void main (String[] args){
            HelloTelkom ht = new HelloTelkom();
            ht.tampil();
        }
    }