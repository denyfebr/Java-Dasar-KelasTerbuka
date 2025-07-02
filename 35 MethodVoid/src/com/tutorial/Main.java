/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tutorial;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // void itu artinya hampa
        System.out.println(simpel());
        fungsiVoid("apapun");
        selamatPagi("emak");
        selamatPagi("abah");
    }
    
    private static void selamatPagi(String nama){
        System.out.println("selamat pagi "+nama);
    }
    
    // fungsi/method tanpa kembalian
    private static void fungsiVoid(String input){
        System.out.println(input);
    }
    
    // ini adalah fungsi/method dengan kembalian
    // sehingga menggunakan return untuk 
    // mengembalikan nilainya
    private static float simpel(){
        return 10.0f;
    }
    
}
