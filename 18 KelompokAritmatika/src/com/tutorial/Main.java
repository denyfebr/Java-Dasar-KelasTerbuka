/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        
        // Kesimpulannya perkalian atau pembagian akan dilakukan terlebih dahulu
        // Jika dilakukan perkalian dan pembagian maka operasi dari kiri ke kanan
        
//        int hasil = 5*10/2;
//        System.out.println(hasil);
//        
//        hasil = 5+2-10;
//        System.out.println(hasil);
//        
//        // menggunakan pengelompokan dengan operasi ()
//        hasil = 5*(2+10);
//        System.out.println(hasil);
        
        Scanner userInput = new Scanner(System.in);
        // perhitungan persamaan kuadrat
        System.out.println("MENGHITUNG PERSAMAAN KUADRAT");
        int m,x,c;
        System.out.print("nilai x = ");
        x = userInput.nextInt();
        
        System.out.print("gradien m = ");
        m = userInput.nextInt();
        
        System.out.print("bias c = ");
        c = userInput.nextInt();
        
        int y = (m*x*x)+c;
        System.out.println("nilai y = "+y);
        
    }
}
