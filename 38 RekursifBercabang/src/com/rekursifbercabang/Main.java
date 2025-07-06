/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rekursifbercabang;
import java.util.Scanner;
import java.lang.String;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner inputUser = new Scanner(System.in);
        int nilai,nilai_fibonacci;    
        System.out.print("masukkan nilai n = ");
        nilai = inputUser.nextInt();
        
        nilai_fibonacci=fibonacci(nilai, "atas");
        System.out.println("nilai fibonacci ke -"+nilai+" adalah "+nilai_fibonacci);
        
    }
    
    private static int fibonacci(int nilai, String daun){
        System.out.println("daun "+daun);
        System.out.println("fibonacci ke - "+nilai);
        
        if(nilai==1||nilai==0){
            return nilai;
        }else{
            nilai = fibonacci(nilai-1,"kiri")+fibonacci(nilai-2,"kanan");
            return nilai;
        }
    }
}
