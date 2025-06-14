/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Unary = operasi yang dilakukan pada satu variable saja;
        
        // unary + dan -
        int angka = 1;
        System.out.printf("unary '-',%d menjadi %d\n",angka,-angka);
        System.out.printf("unary '+',%d menjadi %d\n",angka,+angka);
        
        // unary decrement dan increment
        int angka2 = 10;
        angka2++; // angka2 = angka2 + 1;
        angka2++;
        System.out.println("nilai dengan '++' = "+angka2);
        
        int angka3 = 10;
        angka3--; // angka2 = angka2 + 1;
        System.out.println("nilai dengan '--' = "+angka3);
        
        //Postfix dan prefix
        int a = 5;
        int b = 5;
//        a++;
//        System.out.println("a++ = "+a);
//        ++a;
//        System.out.println("++a = "+a );

        System.out.printf("nilai dengan ++a (prefix) = %d\n",++a);
        System.out.printf("nilai dengan b++ (postfix) = %d\n",b++);
        System.out.printf("nilai hasil dari postfix = %d\n",b);
        
        // unary boolean dengan ! untuk negasi
        
        boolean ucup = true;
        System.out.println("nilai boolean = "+ucup);
        System.out.println("nilai boolean = "+!ucup);
    }
    
}
