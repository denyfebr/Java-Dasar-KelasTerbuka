/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tutorial;
import java.util.*;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ternary operator
                
        int input,x;
        
        Scanner inputUser = new Scanner(System.in);
        System.out.print("masukkan nilai: ");
        input = inputUser.nextInt();
        
        // variable x = ekspresi ? statement_true : statement_false
        x = (input==10) ? (input*input) : (input*0);
        
        System.out.println("hasil = "+x);
    }    
}
