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
        Scanner userInput = new Scanner(System.in);
        System.out.print("masukkan nilai = ");
        int nilai = userInput.nextInt();
        System.out.println("anda memasukkan nilai = "+nilai);
        
        printNilai(nilai);
        int jumlah = jumlahNilai(nilai);
        System.out.println("jumlah = "+jumlah);
        
        int faktorial = hitungFaktorial(nilai);
        System.out.println("faktorial = "+faktorial);
    }
    
    // fungsi rekursif sederhana
    
    private static int hitungFaktorial(int parameter){
        System.out.println("parameter = "+parameter);
        if(parameter==1){
            return parameter;
        }
        
        return parameter * hitungFaktorial(parameter-1);
    }    
    
    private static int jumlahNilai(int parameter){
        System.out.println("parameter = "+parameter);
        if(parameter==0){
            return parameter;
        }
        
        return parameter + jumlahNilai(parameter-1);
    }    
    
    private static void printNilai(int parameter){
        System.out.println("nilai = "+parameter);
        
        if(parameter==0){
            return;
        }
        
        parameter--;
        
        printNilai(parameter);
    }
}
