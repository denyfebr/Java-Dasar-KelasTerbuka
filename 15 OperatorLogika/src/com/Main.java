/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        // Operator logika --> operasi yang bisa kita lakukan kepada tipe data boolean
        // AND, OR, XOR, NOT/Negasi
        
        boolean a,b,c;
        
        // AND / Dan (&&)
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a+" && "+b+" = "+c);
        a = false;
        b = true;
        c = (a && b);
        System.out.println(a+" && "+b+" = "+c);
        a = true;
        b = false;
        c = (a && b);
        System.out.println(a+" && "+b+" = "+c);
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a+" && "+b+" = "+c);
        
        // OR / Atau (||)
        a = true;
        b = true;
        c = (a || b);
        System.out.println(a+" || "+b+" = "+c);
        a = false;
        b = true;
        c = (a || b);
        System.out.println(a+" || "+b+" = "+c);
        a = true;
        b = false;
        c = (a || b);
        System.out.println(a+" || "+b+" = "+c);
        a = false;
        b = false;
        c = (a || b);
        System.out.println(a+" || "+b+" = "+c);
        
        // XOR / Exclusive Or (^)
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a+" ^ "+b+" = "+c);
        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a+" ^ "+b+" = "+c);
        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a+" ^ "+b+" = "+c);
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a+" ^ "+b+" = "+c);
        
        // NOT / Negasi (!)
        a = true;        
        c = !a;
        System.out.println("!"+a+" = "+c);
    }
}
