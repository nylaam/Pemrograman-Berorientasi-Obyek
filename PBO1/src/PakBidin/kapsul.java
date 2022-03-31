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
public class kapsul {
    public static void main(String[] args) {
        studentRecord dt = new studentRecord(15);
        dt.setName("Rapano", "Malang", 16);
        System.out.println(dt.getName());
        
        
    }
}
class studentRecord{
    private int umur;
    public studentRecord(int age){
        this.umur=age;
    }
    private String name;
    private String alamat;
    public void setName (String temp, String ala, int age){
        this.name=temp;
        this.alamat=ala;
        this.umur=age;
    }
    public String getName(){
        return this.name +" alamat "+this.alamat +" umur "+ this.umur;
    }
}
