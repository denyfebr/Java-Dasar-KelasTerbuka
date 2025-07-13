/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arraylatihan;

import java.util.Arrays;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        
        // penjumlahan antara dua buah array
        int[] arrayAngka1 = {2,3,5,1,4,7,8,6,8,9};
        int[] arrayAngka2 = {0,4,3,2,1,5,9,8,7,4};
        int[] arrayHasil = new int[arrayAngka1.length+arrayAngka2.length];
        
        // menambah 2 buah array
        System.out.println("\nMenambahkan dua buah array\n============");
       
        printArray(arrayAngka1,"Array 1");
        printArray(arrayAngka2,"Array 2");
        
        System.out.println("-------------");
        
        printArray(tambahArray(arrayAngka1, arrayAngka2),"Array hasil setelah ditambahkan");
        
        // menggabungkan dua buah array
        printArray(gabungArray(arrayAngka1, arrayAngka2),"Array hasil setelah digabungkan");
                
        // tugas sort kebailk
        arrayHasil = gabungArray(arrayAngka1, arrayAngka2);
        arrayHasil = reverseSort(arrayHasil);        
        printArray(arrayHasil, "Array sort descending");
        
    }
    
    private static int[] tambahArray(int[] arrayInt1, int[] arrayInt2){
        int[] arrayHasil = new int[arrayInt1.length];
        
        for(int i=0;i<arrayInt1.length;i++){
            arrayHasil[i]=arrayInt1[i]+arrayInt2[i];
        }        
        return arrayHasil;
    }
    
    private static int[] gabungArray(int[] arrayInt1, int[] arrayInt2){         
        int lengthArray = arrayInt1.length+arrayInt2.length;
        int[] arrayHasil = new int[lengthArray];
        
        for(int i=0;i<arrayInt1.length;i++){
            arrayHasil[i]=arrayInt1[i];
        } 
        
        for(int i=0;i<arrayInt2.length;i++){
            arrayHasil[i+arrayInt1.length]=arrayInt2[i];
        }        
        return arrayHasil;
    }
    
    private static int[] reverseSort(int[] arrayInt){
        int[] hasilArray = new int[arrayInt.length];
        Arrays.sort(arrayInt);
        printArray(arrayInt, "Array sort ascending");
        int index_arr=0;
        for(int i=arrayInt.length-1;i>=0;i--){
            hasilArray[index_arr]=arrayInt[i];
            index_arr++;
        }        
        return hasilArray;
    }
    
    private static void printArray(int[] dataArray, String message){
        System.out.println(message+" = "+Arrays.toString(dataArray));
    }
}
