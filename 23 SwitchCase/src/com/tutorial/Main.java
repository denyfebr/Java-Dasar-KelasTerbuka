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
        // switch case
        String input;
        
        Scanner inputUser = new Scanner(System.in);        
        
        System.out.print("panggil nama: ");
        input = inputUser.next();
        // expresinya berupa satuan (int, long, byte, short), String, Enum
                
        switch (input) {
            case "otong":
                System.out.println("saya otong dan hadir boss");
                break;
            case "ucup":
                System.out.println("saya ucup dan hadir boss");
                break;
            case "mario":
                System.out.println("saya ucup dan hadir boss");
                break;
            default:
                System.out.println(input+" tidak hadir boss!!");
        }
        
        System.out.println("selesai program");
        
        
    }
}
