/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arrayforeach;
import java.util.Arrays;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        int[] arrayAngka = {11,12,13,14,15,16,17,18,19,20};
        //System.out.println(Arrays.toString(arrayAngka));
        
        // looping standar
        System.out.println("Looping standard:");
        for(int i=0;i<arrayAngka.length;i++){
            System.out.println("index ke-"+i+" = "+arrayAngka[i]);
        }
        System.out.println("-------------");
        // looping untuk collection
        System.out.println("Looping dengan dor each");
        int urutan=0;
        for(int angka : arrayAngka){
            System.out.println("index ke-"+urutan+" = "+angka);
            urutan++;
        }
    }
}
