/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        // Operasi Aritmetika
        
        int variable1 = 12;
        int variable2 = 5;
        
        int hasil;
        
        // 1. penjumlahan
        hasil = variable1+variable2;
        System.out.println(variable1+ " + "+ variable2 +" = "+hasil);
        
        // 2. pengurangan
        hasil = variable1-variable2;
        System.out.printf("%d - %d = %d\n",variable1,variable2,hasil);
        
        // 3. perkalian
        hasil = variable1*variable2;
        System.out.printf("%d * %d = %d\n",variable1,variable2,hasil);
        
        // 4. pembagian
        hasil = variable1/variable2;
        System.out.printf("%d / %d = %d\n",variable1,variable2,hasil);
        
        float a = 6;
        float b = 5;
        float hasilFloat = a/b;
        System.out.printf("%f / %f = %f\n",a,b,hasilFloat);
        
        // 5. modulus
        hasil = variable1%variable2;
        System.out.printf("%d %% %d = %d\n",variable1,variable2,hasil);
    }
}