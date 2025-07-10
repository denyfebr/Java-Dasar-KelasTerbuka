/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arraydeeper;
import java.util.Arrays;
/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        int[] arrayAngka1 = {1,2,3,4,5};
        int[] arrayAngka2 = new int[5];
        
        System.out.println("Array 1 --> "+Arrays.toString(arrayAngka1));
        System.out.println(arrayAngka1);
        System.out.println("Array 2 --> "+Arrays.toString(arrayAngka2));
        System.out.println(arrayAngka2);
        System.out.println("------------------");
        arrayAngka2=arrayAngka1;
       System.out.println("Array 1 --> "+Arrays.toString(arrayAngka1));
        System.out.println(arrayAngka1);
        System.out.println("Array 2 --> "+Arrays.toString(arrayAngka2));
        System.out.println(arrayAngka2);
        System.out.println("------------------");
        arrayAngka1[0] = 100;
        arrayAngka1[3] = 400;
        System.out.println("Array 1 --> "+Arrays.toString(arrayAngka1));
        System.out.println("Array 2 --> "+Arrays.toString(arrayAngka2));
        System.out.println("------------------");
        ubahArray(arrayAngka2);
        System.out.println("Array 1 --> "+Arrays.toString(arrayAngka1));
        System.out.println("Array 2 --> "+Arrays.toString(arrayAngka2));
        System.out.println("------------------");
    }
    
    // method yang argumentnya adalah reference, pass by reference
    // bukan pass by value
    private static void ubahArray(int[] dataArray){
        
        dataArray[0]=125;
      
    }
}
