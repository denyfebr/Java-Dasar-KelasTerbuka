/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inputaritmatika;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        int panjang,lebar,luas,tinggi,volume;
        // Membuat perhitungan luas persegi panjang
        // luas = panjang*lebar
        System.out.println("MENGHITUNG LUAS");
        System.out.print("panjang = ");
        panjang = userInput.nextInt();
        System.out.print("lebar = ");
        lebar = userInput.nextInt();
        
        luas = panjang * lebar;
        System.out.println("luas = "+luas);
        
        System.out.println("MENGHITUNG VOLUME");
        System.out.print("tinggi = ");
        tinggi = userInput.nextInt();        
        volume = luas*tinggi;
        System.out.println("volume = "+volume);
        
    }
}
