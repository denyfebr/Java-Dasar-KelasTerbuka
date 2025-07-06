/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arrayintro;

import java.util.Arrays;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        // tipedata[] nama = {komponen-komponen}
        
        // assignment
        System.out.println("Assignment Array");
        int[] arrayInteger = {1,2,3,4};
        
        arrayInteger[0]=9;
        
        System.out.println(arrayInteger);
        System.out.println(Arrays.toString(arrayInteger));
        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);
        
        // Deklarasi
        // tipedata[] nama = new int[jumlahArray];
        System.out.println("Deklarasi Array");
        float[] arrayFloat = new float[5];
        
        arrayFloat[3] = 11.6f;
        
        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);
        System.out.println(arrayFloat[4]);
        
        System.out.println(Arrays.toString(arrayFloat));
    }
}
