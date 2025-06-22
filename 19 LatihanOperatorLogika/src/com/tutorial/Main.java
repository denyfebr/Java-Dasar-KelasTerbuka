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
        
        Scanner inputUser = new Scanner(System.in);
        
        // sebuah program sederhana untuk menebak sebuah angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;
        
        System.out.print("Masukkan nilai tebakan: ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("nilai tebakan anda = "+nilaiTebakan);
        
        // operasi logika
        statusTebakan = nilaiBenar==nilaiTebakan;
        
        System.out.println("tebakan anda = "+statusTebakan);
        
        // operasi aljabar boolean (and/or)
        statusTebakan = (nilaiTebakan>4)&&(nilaiTebakan<9);
        System.out.println("tebakan anda di antara 4 dan 9 = "+statusTebakan);
    }
}
