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
        int panjang,lebar;
        
        Scanner userInput = new Scanner(System.in);
                
        System.out.print("panjang = ");
        panjang=userInput.nextInt();
        System.out.print("lebar = ");
        lebar=userInput.nextInt();
        
        gambar(panjang, lebar);
        tampilanKelilingLuas(panjang, lebar);        
    }
    
    private static void gambar(int panjang, int lebar){
        for(int i=0; i<lebar; i++){
            for(int j=0; j<panjang; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    
    private static void tampilanKelilingLuas(int panjang, int lebar){
        System.out.println("luas = "+luas(panjang, lebar));
        System.out.println("keliling = "+keliling(panjang, lebar));
    }
    
    private static int luas(int panjang, int lebar){        
        System.out.println("menghitung luas dengan panjang "+panjang+" dan lebar "+lebar);
        return panjang*lebar;
    }
    
    private static int keliling(int panjang, int lebar){
        System.out.println("menghitung keliling dengan panjang "+panjang+" dan lebar "+lebar);
        return (panjang+lebar)*2;
    }
}
