/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumPBO;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class no2 {
    public static void main(String[] args) {
        double c,r,f,k; //variabel
   Scanner input = new Scanner(System.in);
        System.out.print("Masukan bilangan suhu = ");
          c = input.nextInt(); //suhu celcius
          r = c*4/5; //suhu reamur
          f = (c*9/5)+32; //suhu fahrenheit
          k = c+273.15; //suhu kelvin
        System.out.println("  ");
        System.out.println("Celsius = " +c +" celcius");   
        System.out.println("Reamur = "+r +" reamur");     
        System.out.println("Fahrenheit = "+f +" fahrenheit"); 
        System.out.println("Kelvin = "+k +" kelvin");
    }
}
