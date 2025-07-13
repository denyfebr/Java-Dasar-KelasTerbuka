/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arrayoperasi;
import java.util.Arrays;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
                
        int[] arrayAngka1 = {1,2,3,4,5};
        
        // merubah array menjadi string
        System.out.println("\nMerubah array menjadi string\n============");
        printArray(arrayAngka1);
        
        // mengcopy array
        System.out.println("\nMengcopy array\n============");
        int[] arrayAngka2 = new int[5];                
        printArray(arrayAngka1);
        printArray(arrayAngka2);
        
        System.out.println("\nMengcopy array dengan loop\n============");
        for(int i=0;i<arrayAngka1.length;i++){
            arrayAngka2[i]=arrayAngka1[i];
        }
        printArray(arrayAngka1);
        printArray(arrayAngka2);
        
        arrayAngka2[0]=100;
        System.out.println("<><><><><>");
        printArray(arrayAngka1);
        printArray(arrayAngka2);
        
        System.out.println("\nMengcopy array dengan copyOf\n============");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1, 5);
        printArray(arrayAngka1);
        printArray(arrayAngka2);
        printArray(arrayAngka3);
        
        System.out.println("\nMengcopy array dengan copyOfRange\n============");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 2, 5);
        printArray(arrayAngka1);
        printArray(arrayAngka4);
        
        System.out.println("\nFill array\n============");
        int[] arrayAngka5 = new int[10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5, 5);
        printArray(arrayAngka5);
        
        System.out.println("\nKomparasi array\n============");
        System.out.println("komparasi 2 Array dengan equals()");
        int[] arrayAngka6 = {1,2,3,40,5};
        int[] arrayAngka7 = {1,2,3,92,5};
        printArray(arrayAngka6);
        printArray(arrayAngka7);
        System.out.println(Arrays.equals(arrayAngka6, arrayAngka7));
        boolean hasil_komparasi = Arrays.equals(arrayAngka6, arrayAngka7);
        if(hasil_komparasi){
            System.out.println("sama\n");
        }else{
            System.out.println("beda\n");
        }
        
        System.out.println("mengecek array mana yg lebih besar");
        System.out.println(Arrays.compare(arrayAngka6, arrayAngka7));
        int hasilKomparasi = Arrays.compare(arrayAngka6, arrayAngka7);
        if(hasilKomparasi==0){
            System.out.println("Hasil seri\n");
        }else{
            if(hasilKomparasi==-1){
                System.out.println("Array ke-2 lebih besar\n");
            }
            else{
                System.out.println("Array ke-1 lebih besar\n");
            }
        }
        
        System.out.println("mengecek mana index yg beda");
        System.out.println(Arrays.mismatch(arrayAngka6, arrayAngka7)+"\n");
        
        System.out.println("\nSort dan Search array\n============");
        int[] arrayAngka8={1,6,4,5,3,5,2,6};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);
        int angka_cari=5;
        int posisi_temu = Arrays.binarySearch(arrayAngka8, angka_cari);
        System.out.println("angka "+angka_cari+" ada di index = "+posisi_temu);
               
    }
    
    private static void printArray(int[] dataArray){
        System.out.println("array = "+Arrays.toString(dataArray));
    }
}
