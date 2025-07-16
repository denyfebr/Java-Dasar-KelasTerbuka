/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arraymultidimensi;
import java.util.Arrays;
/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("belajar array multidimensi");
        
        // cara membuat array 2 dimensi dengan assignment
        
        int[][] array_2D = {
            {1,2},
            {3,4}
        };
        System.out.println(Arrays.toString(array_2D));
        printArray2DDeepToString(array_2D);
        printArray2DOneLoop(array_2D);
        
        // cara membuat array 2 dimensi dengan deklarasi
        
        int[][] arrayAngka = new int[5][4];
        printArray2DDeepToString(arrayAngka);
        System.out.println(arrayAngka.length);
        printArray2DOneLoop(arrayAngka);
        printArray2DTwoLoop(arrayAngka);
        System.out.println("");
        printArray2DForEach(arrayAngka);
        
        System.out.println("Pembuktian");
        int[][] array_2D_2 = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15}       
        };
        printArray2DForEach(array_2D_2);
        
        System.out.println("Array ragged");
        
        int[][] array_ragged = {
            {1,2,3},
            {4,5,6,7},
            {8}
        };
        
        printArray2DForEach(array_ragged);
    }
    
    private static void printArray2DDeepToString(int[][] dataArrray){
        System.out.println(Arrays.deepToString(dataArrray));
    }
    
    private static void printArray2DOneLoop(int[][] dataArrray){
        for(int i=0; i<dataArrray.length;i++){
            System.out.println(Arrays.toString(dataArrray[i]));            
        }
    }
    
    private static void printArray2DTwoLoop(int[][] dataArrray){
        for(int i=0; i<dataArrray.length;i++){
           System.out.print("[");
           for(int j=0; j<dataArrray[i].length;j++){
               System.out.print(dataArrray[i][j]+",");               
           }
           System.out.print("]");
           System.out.println("");
        }
    }
    
    private static void printArray2DForEach(int[][] dataArrray){
       for(int[] baris:dataArrray){
           System.out.print("[");
           for(int kolom:baris){
               System.out.print(kolom+",");
           }
           System.out.print("]");
           System.out.println("");
       }
    }
}
