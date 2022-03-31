/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO2;

/**
 *
 * @author WINDOWS 10
 */
public class objekLat3 {
    public static void main (String[] args){
        //TODO code application logic here
        Latihan3 siswa=new Latihan3();
        siswa.setName("Nayla Nur Amalia");
        siswa.setAge(15);
        siswa.setAddress("Malang");
        
        System.out.println("Identitas: "+siswa.getName()+ " alamat "+siswa.getAddress()+ " berumur "+siswa.getAge()+ " tahun");
    }
}
