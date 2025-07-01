/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tutorial;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // menjumlahkan angka dengan rentang
        
        int nilaiAwal, nilaiAkhir, total;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("masukkan nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("masukkan nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();
        
        total = 0;
        while (nilaiAwal<=nilaiAkhir) {            
            total += nilaiAwal;            
            System.out.println("ditambah "+nilaiAwal+" menjadi = "+total);
            nilaiAwal++;
        }
        
        
    }
    
}
