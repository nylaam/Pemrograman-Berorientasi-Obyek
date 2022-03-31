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
public class No1 {  
    int a;
    Scanner scan = new Scanner(System.in);
    
    public void GanjilGenap (){
    System.out.print("Masukkan sebuah bilangan : ");
    a = scan.nextInt();
    
    if (a % 2 == 0) {
      System.out.print("Bilangan " + a + " adalah genap.\n");
    } else {
      System.out.print("Bilangan " + a + " adalah ganjil.\n");
    }
  }
}
