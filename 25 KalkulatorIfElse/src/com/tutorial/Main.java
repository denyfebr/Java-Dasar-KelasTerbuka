/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        
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
        if(operator=='+'){
            // penjumlahan
            hasil = a+b;
            System.out.println("hasil = "+hasil);
        }else if(operator=='-'){
            // pengurangan
            hasil = a-b;
            System.out.println("hasil = "+hasil);
        }else if(operator=='*'){
            // perkalian
            hasil = a*b;
            System.out.println("hasil = "+hasil);
        }else if(operator=='/'){
            // pembagian
            if(b!=0){
                hasil = a/b;
                System.out.println("hasil = "+hasil);
            }else{
                System.out.println("tidak bisa dibagi 0");
            }            
        }else{
            // operator not found
            System.out.println("operator not found");
        }
    }
}
