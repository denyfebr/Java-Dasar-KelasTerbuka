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
        // while condition
        
        int a=0;
        
        Scanner inputUser;
        inputUser = new Scanner(System.in);
        
        System.out.print("masukkan batas loop = ");
        
        a = inputUser.nextInt();
        int i=1;
        while (i<=a) {
            System.out.println("nilai ke-"+i);
            i++;
        }
    }
    
}
