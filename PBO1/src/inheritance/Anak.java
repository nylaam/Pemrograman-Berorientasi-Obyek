/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author WINDOWS 10
 */
public class Anak extends Ayah {
    double nilaimax= 100;
    String nama="Nayla";
    int age = 15;
    
    public void Cetak(){
        System.out.println("Anak ini memiliki sifat "+super.Sifat);
        System.out.println("yang bernama "+nama);
        System.out.println("berumur "+age+" tahun");
        System.out.println("dengan tinggi badan "+super.TB);
        super.hobbi();
    }
}
