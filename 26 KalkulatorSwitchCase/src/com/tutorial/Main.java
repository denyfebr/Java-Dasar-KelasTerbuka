/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tutorial;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // operator switch case
        
        // a operator b 
        Scanner inputUser;
        float a,b,hasil;
        char operator;
        
        inputUser = new Scanner(System.in);
        
        System.out.print("nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("operator: ");
        operator = inputUser.next().charAt(0);
        System.out.print("nilai b = ");
        b = inputUser.nextFloat();
        
        System.out.println("input user: "+a+" "+operator+" "+b);
        
        // operator tersedia * / + -
        switch (operator) {
            case '+':
                // penjumlahan
                hasil = a+b;
                System.out.println("hasil = "+hasil);
                break;
            case '-':
                // pengurangan
                hasil = a-b;
                System.out.println("hasil = "+hasil);
                break;
            case '*':
                // perkalian
                hasil = a*b;
                System.out.println("hasil = "+hasil);
                break;
            case '/':
                // pembagian
                if(b!=0){
                    hasil = a/b;
                    System.out.println("hasil = "+hasil);
                }else{
                    System.out.println("tidak bisa dibagi 0");
                }   break;
            default:
                // operator not found
                System.out.println("operator not found");
                break;
        }
    }
    
}
