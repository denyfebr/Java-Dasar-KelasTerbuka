/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        
        // y = (x + 2) * x
              
        System.out.println("hasil = "+hitung(5));
        System.out.println("hasil = "+hitung(20));
        System.out.println("hasil = "+hitung(40));
        
    }
    
    private static int hitung(int input){
        
        //return (input+2)*input;
        return input*input;
    }
}
